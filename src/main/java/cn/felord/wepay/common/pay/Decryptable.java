package cn.felord.wepay.common.pay;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 解密接口
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/8/3  14:34
 */
public interface Decryptable {
    /**
     * <p>decrypt.</p>
     *
     * @param original a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    String decrypt(String original);
}
