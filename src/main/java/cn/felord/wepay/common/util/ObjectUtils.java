package cn.felord.wepay.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.felord.wepay.common.exception.PayException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/18  14:59
 */
public class ObjectUtils {
    /**
     * The constant DEFAULT_CHARSET.
     */
    public static final String DEFAULT_CHARSET = "UTF-8";
    /**
     * The constant MD5.
     */
    public static final String MD5 = "md5";
    private static final Logger log = LoggerFactory.getLogger(ObjectUtils.class);
    private static final String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private static final byte[] AES_KEY = {65, 55, 70, 56, 102, 51, 118, 52, 68, 48, 111, 106, 57, 42, 12, 17};

    private ObjectUtils() {
    }


    /**
     * Bean to sorted tree map without null map.
     * <p>
     * 实体 Bean 转为按照ACCSII排序后的TreeMap 并排除空值 ""值
     *
     * @param <T> the type parameter
     * @param t   the t
     * @return the map
     */
    public static <T> Map<String, Object> paramsSorter(T t) {
//    1.8JDK 可采用注释部分的lambda表达式    Map<String, Object> map = new TreeMap<>(String::compareTo);
        Map<String, Object> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(t.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性 排序过滤掉secretKey
                if (!"class".equals(key) && !"secretKey".equals(key)) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(t);
//                    排除空值
                    if (value != null && !"".equals(value)) {
                        map.put(key, value);
                    }
                }
            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            log.debug("获取实体bean信息异常", e);
        }
        log.info(String.format("\u53c2\u6570\u5217\u8868\uff1a %s", map));
        return map;
    }

    /**
     * Params sorter map.
     *
     * @param m   the m
     * @return the map
     * @param <M> a M object.
     */
    public static <M extends Map<String, Object>> Map<String, Object> paramsSorter(M m) {
//    1.8JDK 可采用注释部分的lambda表达式    Map<String, Object> map = new TreeMap<>(String::compareTo);
        Map<String, Object> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Set<Map.Entry<String, Object>> entrySet = m.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            String k = entry.getKey();
            Object v = entry.getValue();
//            排序过滤掉secretKey
            if (v != null && !"secretKey".equals(k)) {
                map.put(k, v);
            }
        }
        return map;
    }

    /**
     * Signature generator.
     * <p>
     * 签名生成器
     *
     * @param sortedMap   the sorted map
     * @param encryptType 加密类型
     * @param charset     the charset
     * @param key         the key
     * @return the string
     * @throws cn.felord.wepay.common.exception.PayException the pay exception
     */
    public static String signatureGenerator(Map<String, Object> sortedMap, String encryptType, String charset, String key) throws PayException {
        String origin = getParamStr(sortedMap, key);
        if ((MD5).equalsIgnoreCase(encryptType)) {
            return md5Encrypt(origin, charset);
        }
        throw new PayException("only MD5 is supported");

    }

    private static String getParamStr(Map<String, Object> sortedMap, String key) {
        Set<Map.Entry<String, Object>> entrySet = sortedMap.entrySet();
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Object> entry : entrySet) {
            String k = entry.getKey();
            Object v = entry.getValue();
            stringBuilder.append(k).append("=").append(v).append("&");
        }
        stringBuilder.append("key").append("=").append(key);
        return stringBuilder.toString();
    }

    /**
     * Once str generator string.
     * <p>
     * 随机字符串生成器
     *
     * @return the string
     */
    public static String onceStrGenerator() {
        return RandomStringUtils.randomAlphanumeric(37).substring(0, 31);
    }

    /**
     * 加密
     *
     * @param original 原字符
     * @return string string
     */
    @Deprecated
    public static String encrypt(String original) {
        return doEncrypt(original);
    }

    private static String doEncrypt(String original) {
        String cipherText = null;
        try {

            SecretKeySpec skeySpec = new SecretKeySpec(AES_KEY, "AES");
            Cipher cipher = Cipher.getInstance("AES");//创建密码器
            cipher.init(1, skeySpec);// 初始化
            byte[] encrypted = cipher.doFinal(original.getBytes(DEFAULT_CHARSET));//加密

            //字节转换成十六进制的字符串
            cipherText = byteArrayToHexString(encrypted).toUpperCase();
        } catch (Exception e) {
            log.debug("AES encrypt error：", e);
        }
        return cipherText;
    }

    private static String doDecrypt(String original) {
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(AES_KEY, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, skeySpec);
            byte[] encrypted1 = hex2byte(original);
            byte[] bytes = cipher.doFinal(encrypted1);
            return new String(bytes, DEFAULT_CHARSET);
        } catch (Exception e) {
            log.debug("AES decrypt error：", e);
        }
        return null;
    }

    /**
     * Map to xml string.
     *
     * @param map the map
     * @return the string
     */
    public static String mapToXML(Map<String, Object> map) {

        StringBuilder xml = new StringBuilder("<xml>");
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            String k = entry.getKey();
            Object v = entry.getValue();
            if (v != null && !"".equals(v)) {
                xml.append("<").append(k).append(">").append(v).append("</").append(k).append(">");
            }
        }
        xml.append("</xml>");
        return xml.toString();
    }

    /**
     * Map to json string.
     * <p>
     * bean 转json字符串
     *
     * @param <T> the type parameter
     * @param t   the t
     * @return the string
     */
    public static <T> String beanToJson(T t) {
        ObjectMapper mapper = new ObjectMapper();
        // 过滤空值
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            String json = mapper.writeValueAsString(t);
            if (!"{}".equals(json))
                return json;
        } catch (JsonProcessingException e) {
            log.debug("bean can't  convert to JSON ", e);
        }
        return null;
    }

    /**
     * Xml to map map.
     *
     * @param xml the xml
     * @return the map
     */
    public static Map<String, Object> xmlToMap(String xml) {
        Map<String, Object> map = new HashMap<>();
        try {
            Document document = DocumentHelper.parseText(xml);
            Element rootElement = document.getRootElement();
            Iterator iterator = rootElement.elementIterator();
            while (iterator.hasNext()) {
                Element childElement = (Element) iterator.next();
                map.put(childElement.getName(), childElement.getText());
            }
        } catch (DocumentException e) {
            log.debug("XML can't convert to map", e);
        }
        return map;
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuilder resultSb = new StringBuilder();
        for (byte a : b) {
            resultSb.append(byteToHexString(a));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    private static byte[] hex2byte(String hex) {
        byte[] b = null;
        if (hex != null && hex.length() % 2 != 1) {
            int l = hex.length();
            b = new byte[l / 2];
            for (int i = 0; i != l / 2; i++) {
                b[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
            }
        }
        return b;
    }

    /**
     * Md5 encode.
     *
     * @param origin  the origin
     * @param charset the charset
     * @return the string
     */
    private static String md5Encrypt(String origin, String charset) {
        String encode = charset == null || "".equals(charset) ? DEFAULT_CHARSET : charset;
        try {
            byte[] bytes = origin.getBytes(encode);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] b = md.digest(bytes);
            return byteArrayToHexString(b).toUpperCase();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            log.debug("MD5 encrypt encode algorithm ", e);
        }
        return null;
    }


    /**
     * 签名验证.
     *
     * @param m           the m
     * @param encryptType the encrypt type
     * @param secretKey   the secret key
     * @throws cn.felord.wepay.common.exception.PayException the pay exception
     * @param <M> a M object.
     */
    public static <M extends Map<String, Object>> void verifySignature(M m, String encryptType, String secretKey) throws PayException {
        String originSign = (String) m.remove("sign");
        String sign = signatureGenerator(ObjectUtils.paramsSorter(m), encryptType, DEFAULT_CHARSET, secretKey);
        if (!originSign.equals(sign)) {
            throw new PayException("signature verification failed");
        }
    }


    /**
     * 参数值检测.
     *
     * @param <T>        the type parameter
     * @param t          the t
     * @param fieldNames the field names
     * @throws cn.felord.wepay.common.exception.PayException the pay exception
     */
    public static <T> void checkParams(T t, List<String> fieldNames) throws PayException {
        Set<String> fieldNameSet = new HashSet<>(fieldNames);

        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(t.getClass());

            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {

                String key = property.getName();

                if (fieldNameSet.contains(key)) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(t);
                    if (value == null || "".equals(value)) {
                        throw new PayException(t.getClass().getName() + "  field [" + key + "] is null");
                    }
                }
            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            log.debug("bean can be resolved ", e);
        }
    }

    /**
     * 解密
     *
     * @param original 密文
     * @return String string
     */
    @Deprecated
    public static String decrypt(String original) {
        return doDecrypt(original);
    }
}
