package org.hive.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.exception.SignatureException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/18  14:59
 */


public class StringUtil {
    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private static final byte[] DES_KEY = {17, 36, -128, 41, 0, 59, -13, 6};

    /**
     * Signature generator.
     * <p>
     * 签名生成器
     *
     * @param sortedMap the sorted map
     * @param charset   the charset
     * @param key       the key
     * @return the string
     * @throws SignatureException the signature exception
     */
    public static String signatureGenerator(Map<String, Object> sortedMap, String charset, String key) throws SignatureException {
        if (sortedMap != null && !sortedMap.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            Set<String> set = sortedMap.keySet();
            for (String s : set) {
                stringBuffer.append(s).append("=").append(sortedMap.get(s)).append("&");
            }
            stringBuffer.append("key").append("=").append(key);
            String origin = stringBuffer.toString();
            return MD5Encrypt(origin, charset);
        }
        throw new SignatureException("sortedMap is invalid");
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
     * Encrypt based des string.
     *
     * @param data the data
     * @return the string
     */
    public static String encryptBasedDes(String data) {
        String encryptedData;
        try {
            SecureRandom sr = new SecureRandom();
            DESKeySpec deskey = new DESKeySpec(DES_KEY);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyFactory.generateSecret(deskey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, key, sr);
            encryptedData = new BASE64Encoder().encode(cipher.doFinal(data.getBytes()));
        } catch (Exception e) {
            throw new RuntimeException("加密错误，错误信息：", e);
        }
        return encryptedData;
    }

    /**
     * Decrypt based des string.
     *
     * @param cryptData the crypt data
     * @return the string
     */
    public static String decryptBasedDes(String cryptData) {
        String decryptedData;
        try {
            SecureRandom sr = new SecureRandom();
            DESKeySpec desKeySpec = new DESKeySpec(DES_KEY);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyFactory.generateSecret(desKeySpec);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, key, sr);
            decryptedData = new String(cipher.doFinal(new BASE64Decoder().decodeBuffer(cryptData)));
        } catch (Exception e) {
            throw new RuntimeException("解密错误，错误信息：", e);
        }
        return decryptedData;
    }

    /**
     * Map to xml string.
     *
     * @param <String> the type parameter
     * @param <V>      the type parameter
     * @param map      the map
     * @return the string
     * @throws RequiredParamException the required param exception
     */
    public static <String, V> java.lang.String mapToXML(Map<String, V> map) throws RequiredParamException {
        if (map != null && !map.isEmpty()) {
            StringBuffer xml = new StringBuffer("<xml>");
            for (String k : map.keySet()) {
                V v = map.get(k);
                if (v != null) {
                    xml.append("<").append(k).append(">").append(map.get(k)).append("</").append(k).append(">");
                }
            }
            xml.append("</xml>");
            if (xml.length() != 11) {
                return xml.toString();
            }
        }
        throw new RequiredParamException("map is invalid");
    }

    /**
     * Map to json string.
     * <p>
     * Collection 转json字符串
     *
     * @param <T> the type parameter
     * @param t   the t
     * @return the string
     */
    public static <T extends Collection> String collectionToJson(T t) {
        ObjectMapper mapper = new ObjectMapper();
        // 过滤空值
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Map to json string.
     *
     * Map 转json字符串
     *
     * @param <T> the type parameter
     * @param t   the t
     * @return the string
     */
    public static <T extends Map> String mapToJson(T t) {
        ObjectMapper mapper = new ObjectMapper();
        // 过滤空值
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

     public static Map<String, String> XMLToMap(String xml) {
         Map<String, String> map=new HashMap<>();
         try {
             Document document = DocumentHelper.parseText(xml);
             Element rootElement = document.getRootElement();
             Iterator iterator= rootElement.elementIterator();
             while (iterator.hasNext()){
                 Element childElement= (Element) iterator.next();
                 map.put(childElement.getName(),childElement.getText());
             }
         } catch (DocumentException e) {
             e.printStackTrace();
         }
         return map;
    }

    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
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

    /**
     * Md5 encode.
     *
     * @param origin  the origin
     * @param charset the charset
     * @return the string
     */
    private static String MD5Encrypt(String origin, String charset) {
        if (charset == null || "".equals(charset)) {
            charset = "UTF-8";
        }
        try {
            byte bytes[] = origin.getBytes(charset);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte b[] = md.digest(bytes);
            return byteArrayToHexString(b).toUpperCase();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
