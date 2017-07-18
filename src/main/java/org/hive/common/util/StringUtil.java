package org.hive.common.util;

import org.apache.commons.lang3.RandomStringUtils;
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
    public static String onceStrGenerator() {
        return RandomStringUtils.randomAlphanumeric(37).substring(0, 31);
    }

    /**
     * Encrypt based des string.
     *
     * @param data       the data
     * @param privateKey 必须大于8位
     * @return the string
     * @throws RequiredParamException the required param exception
     */
    public static String encryptBasedDes(String data, String privateKey) throws RequiredParamException {

        String encryptedData;
        try {
            if (privateKey != null) {
                byte[] bytes = privateKey.getBytes("UTF-8");
                SecureRandom sr = new SecureRandom();
                DESKeySpec deskey = new DESKeySpec(bytes);

                SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
                SecretKey key = keyFactory.generateSecret(deskey);

                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(1, key, sr);

                encryptedData = new BASE64Encoder().encode(cipher.doFinal(data.getBytes()));
            } else {
                throw new RequiredParamException("required param is null length less than 8");
            }
        } catch (Exception e) {
            throw new RuntimeException("加密错误，错误信息：", e);
        }
        return encryptedData;
    }

    /**
     * Decrypt based des string.
     *
     * @param cryptData  the crypt data
     * @param privateKey the private key  必须大于8位
     * @return the string
     * @throws RequiredParamException the required param exception
     */
    public static String decryptBasedDes(String cryptData, String privateKey) throws RequiredParamException {
        String decryptedData;
        try {
            if (privateKey != null) {
                byte[] bytes = privateKey.getBytes("UTF-8");
                SecureRandom sr = new SecureRandom();
                DESKeySpec desKeySpec = new DESKeySpec(bytes);

                SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
                SecretKey key = keyFactory.generateSecret(desKeySpec);

                Cipher cipher = Cipher.getInstance("DES");
                cipher.init(2, key, sr);

                decryptedData = new String(cipher.doFinal(new BASE64Decoder().decodeBuffer(cryptData)));
            } else {
                throw new RequiredParamException("required param is null or length less than 8");
            }

        } catch (Exception e) {
            throw new RuntimeException("解密错误，错误信息：", e);
        }
        return decryptedData;
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
