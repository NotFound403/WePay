package cn.felord.wepay.ali.sdk.api.internal.util.json;

/**
 * <p>JSONErrorListener interface.</p>
 *
 * @author lenovo
 * @version $Id: $Id
 */
public interface JSONErrorListener {
    /**
     * <p>start.</p>
     *
     * @param text a {@link java.lang.String} object.
     */
    void start(String text);
    /**
     * <p>error.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param column a int.
     */
    void error(String message, int column);
    /**
     * <p>end.</p>
     */
    void end();
}
