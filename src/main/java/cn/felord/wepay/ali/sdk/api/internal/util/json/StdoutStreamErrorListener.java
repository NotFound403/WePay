package cn.felord.wepay.ali.sdk.api.internal.util.json;

/**
 * <p>StdoutStreamErrorListener class.</p>
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class StdoutStreamErrorListener extends BufferErrorListener {
    
    /**
     * <p>end.</p>
     */
    public void end() {
        System.out.print(buffer.toString());
    }
}
