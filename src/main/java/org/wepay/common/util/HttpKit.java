package org.wepay.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

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
    private static final Log log = LogFactory.getLog(HttpKit.class);

    private HttpKit() {
    }

    /**
     * Http post string.
     *
     * @param url   the url
     * @param param the param 问号后的一串  或者其他格式 json  或者xml  对应的contentType
     * @return the string
     */
    public static String httpPost(String url, String param) {
        //post请求返回结果
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost method = new HttpPost(url);
            if (null != param) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(param, "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/x-www-form-urlencoded");
                method.setEntity(entity);
            }
            HttpResponse result = httpClient.execute(method);
            /*请求发送成功，并得到响应**/
            StatusLine statusLine = result.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (statusCode == 200) {
                /*读取服务器返回过来的json字符串数据**/
                return EntityUtils.toString(result.getEntity());
            }
        } catch (IOException e) {
            log.debug("网络请求IO异常", e);
        }
        return null;
    }

    /**
     * 腾讯回调请求中解析的参数.
     *
     * @param request the request
     * @return the string
     */
    public static Map<String, String> resolveRequestData(HttpServletRequest request) {
        StringBuilder requestData = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                requestData.append(str);
            }
        } catch (IOException e) {
            log.debug("支付回调参数解析异常：", e);
        }
        return ObjectUtils.xmlToMap(requestData.toString());
    }
}