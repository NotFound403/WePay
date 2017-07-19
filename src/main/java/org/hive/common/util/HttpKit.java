package org.hive.common.util;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 网络请求包
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/19  15:36
 */


public class HttpKit {
    private static final String POST_METHOD = "POST";
    private static final String GET_METHOD = "GET";

    /**
     * Http post string.
     *
     * @param url   the url
     * @param param the param 问号后的一串  或者其他格式 json  或者xml  对应的contentType
     * @return the string
     */
    public static String httpPost(String url, String param) {
        //post请求返回结果
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost method = new HttpPost(url);
        if (null != param) {
            //解决中文乱码问题
            StringEntity entity = new StringEntity(param, "utf-8");
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/x-www-form-urlencoded");
            method.setEntity(entity);
        }
        try {
            HttpResponse result = httpClient.execute(method);
            /**请求发送成功，并得到响应**/
            StatusLine statusLine = result.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (statusCode == 200) {
                /**读取服务器返回过来的json字符串数据**/
                return EntityUtils.toString(result.getEntity());
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return null;
    }

    /**
     * Do post string.
     *
     * @param requestUrl the request url
     * @param xml        the xml
     * @return the string
     */
    public static String doPost(String requestUrl, String xml) {
        return httpsRequest(requestUrl, POST_METHOD, xml);
    }

    /**
     * Do get string.
     *
     * @param requestUrl the request url
     * @param xml        the xml
     * @return the string
     */
    public static String doGet(String requestUrl, String xml) {
        return httpsRequest(requestUrl, GET_METHOD, xml);
    }

    //请求方法
    private static String httpsRequest(String requestUrl, String requestMethod, String xml) {
        try {

            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);
            conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            // 当outputStr不为null时向输出流写数据
            if (null != xml) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(xml.getBytes("UTF-8"));
                outputStream.close();
            }
            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            conn.disconnect();
            return buffer.toString();
        } catch (ConnectException ce) {
            System.out.println("连接超时：{}" + ce);
        } catch (Exception e) {
            System.out.println("https请求异常：{}" + e);
        }
        return null;
    }
}
