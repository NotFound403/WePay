package cn.felord.wepay.ali.sdk.api.internal.util.json;

/**
 * <p>JSONValidatingWriter class.</p>
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class JSONValidatingWriter extends JSONWriter {

    private JSONValidator validator;
    
    /**
     * <p>Constructor for JSONValidatingWriter.</p>
     *
     * @param validator a {@link cn.felord.wepay.ali.sdk.api.internal.util.json.JSONValidator} object.
     * @param emitClassName a boolean.
     */
    public JSONValidatingWriter(JSONValidator validator, boolean emitClassName) {
        super(emitClassName);
        this.validator = validator;
    }
    
    /**
     * <p>Constructor for JSONValidatingWriter.</p>
     *
     * @param validator a {@link cn.felord.wepay.ali.sdk.api.internal.util.json.JSONValidator} object.
     */
    public JSONValidatingWriter(JSONValidator validator) {
        this.validator = validator;
    }
    
    /**
     * <p>Constructor for JSONValidatingWriter.</p>
     *
     * @param listener a {@link cn.felord.wepay.ali.sdk.api.internal.util.json.JSONErrorListener} object.
     * @param emitClassName a boolean.
     */
    public JSONValidatingWriter(JSONErrorListener listener, boolean emitClassName) {
        this(new JSONValidator(listener), emitClassName);
    }
    
    /**
     * <p>Constructor for JSONValidatingWriter.</p>
     *
     * @param listener a {@link cn.felord.wepay.ali.sdk.api.internal.util.json.JSONErrorListener} object.
     */
    public JSONValidatingWriter(JSONErrorListener listener) {
        this(new JSONValidator(listener));
    }
    
    /**
     * <p>Constructor for JSONValidatingWriter.</p>
     */
    public JSONValidatingWriter() {
        this(new StdoutStreamErrorListener());
    }
    
    /**
     * <p>Constructor for JSONValidatingWriter.</p>
     *
     * @param emitClassName a boolean.
     */
    public JSONValidatingWriter(boolean emitClassName) {
        this(new StdoutStreamErrorListener(), emitClassName);
    }
    
    private String validate(String text) {
        validator.validate(text);
        return text;
    }

    /** {@inheritDoc} */
    public String write(Object object) {
        return validate(super.write(object));
    }

    /**
     * <p>write.</p>
     *
     * @param n a long.
     * @return a {@link java.lang.String} object.
     */
    public String write(long n) {
        return validate(super.write(n));
    }

    /**
     * <p>write.</p>
     *
     * @param d a double.
     * @return a {@link java.lang.String} object.
     */
    public String write(double d) {
        return validate(super.write(d));
    }

    /**
     * <p>write.</p>
     *
     * @param c a char.
     * @return a {@link java.lang.String} object.
     */
    public String write(char c) {
        return validate(super.write(c));
    }

    /**
     * <p>write.</p>
     *
     * @param b a boolean.
     * @return a {@link java.lang.String} object.
     */
    public String write(boolean b) {
        return validate(super.write(b));
    }
}
