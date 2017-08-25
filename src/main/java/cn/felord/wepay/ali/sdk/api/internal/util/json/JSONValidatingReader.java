package cn.felord.wepay.ali.sdk.api.internal.util.json;

/**
 * <p>JSONValidatingReader class.</p>
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class JSONValidatingReader extends JSONReader {
    /** Constant <code>INVALID</code> */
    public static final Object INVALID = new Object();
    private JSONValidator validator;
    
    /**
     * <p>Constructor for JSONValidatingReader.</p>
     *
     * @param validator a {@link cn.felord.wepay.ali.sdk.api.internal.util.json.JSONValidator} object.
     */
    public JSONValidatingReader(JSONValidator validator) {
        this.validator = validator;
    }
    
    /**
     * <p>Constructor for JSONValidatingReader.</p>
     *
     * @param listener a {@link cn.felord.wepay.ali.sdk.api.internal.util.json.JSONErrorListener} object.
     */
    public JSONValidatingReader(JSONErrorListener listener) {
        this(new JSONValidator(listener));
    }
    
    /**
     * <p>Constructor for JSONValidatingReader.</p>
     */
    public JSONValidatingReader() {
        this(new StdoutStreamErrorListener());
    }

    /** {@inheritDoc} */
    public Object read(String string) {
        if (!validator.validate(string)) return INVALID;
        return super.read(string);
    }
}
