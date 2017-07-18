package org.hive.common.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.hive.common.exception.SignatureException;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Set;

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
    public static String onceStrGenerator(){
      return   RandomStringUtils.randomAlphanumeric(37).substring(0,31);
    }


    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (byte a : b){
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
