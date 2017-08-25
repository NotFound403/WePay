package cn.felord.wepay.ali.sdk.api.internal.util.json;

/**
 * <p>BufferErrorListener class.</p>
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class BufferErrorListener implements JSONErrorListener {

    protected StringBuffer buffer;
    private String input;
    
    /**
     * <p>Constructor for BufferErrorListener.</p>
     *
     * @param buffer a {@link java.lang.StringBuffer} object.
     */
    public BufferErrorListener(StringBuffer buffer) {
        this.buffer = buffer;
    }
    
    /**
     * <p>Constructor for BufferErrorListener.</p>
     */
    public BufferErrorListener() {
        this(new StringBuffer());
    }
    
    /** {@inheritDoc} */
    public void start(String input) {
        this.input = input;
        buffer.setLength(0);
    }

    /** {@inheritDoc} */
    public void error(String type, int col) {
        buffer.append("expected ");
        buffer.append(type);
        buffer.append(" at column ");
        buffer.append(col);
        buffer.append("\n");
        buffer.append(input);
        buffer.append("\n");
        indent(col-1, buffer);
        buffer.append("^");
    }

    private void indent(int n, StringBuffer ret) {
        for (int i = 0; i< n; ++i) {
            ret.append(' ');
        }
    }

    /**
     * <p>end.</p>
     */
    public void end() {
    }
}
