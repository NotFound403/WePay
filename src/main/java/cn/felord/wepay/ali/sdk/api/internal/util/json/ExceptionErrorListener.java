package cn.felord.wepay.ali.sdk.api.internal.util.json;

/**
 * <p>ExceptionErrorListener class.</p>
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class ExceptionErrorListener extends BufferErrorListener {
    
    /** {@inheritDoc} */
    public void error(String type, int col) {
        super.error(type, col);
        throw new IllegalArgumentException(buffer.toString());
    }
}
