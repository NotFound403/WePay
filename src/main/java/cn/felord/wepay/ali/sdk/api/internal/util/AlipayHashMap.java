package cn.felord.wepay.ali.sdk.api.internal.util;

import cn.felord.wepay.ali.sdk.api.AlipayConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/**
 * 纯字符串字典结构。
 *
 * @author carver.gu
 * @version $Id: $Id
 */
public class AlipayHashMap extends HashMap<String, String> {

    private static final long serialVersionUID = -1277791390393392630L;

    /**
     * Instantiates a new Alipay hash map.
     */
    public AlipayHashMap() {
        super();
    }

    /**
     * Instantiates a new Alipay hash map.
     *
     * @param m the m
     */
    public AlipayHashMap(Map<? extends String, ? extends String> m) {
        super(m);
    }

    /**
     * {@inheritDoc}
     *
     * Put string.
     */
    public String put(String key, Object value) {
        String strValue;

        if (value == null) {
            strValue = null;
        } else if (value instanceof String) {
            strValue = (String) value;
        } else if (value instanceof Integer) {
            strValue = value.toString();
        } else if (value instanceof Long) {
            strValue = value.toString();
        } else if (value instanceof Float) {
            strValue = value.toString();
        } else if (value instanceof Double) {
            strValue = value.toString();
        } else if (value instanceof Boolean) {
            strValue = value.toString();
        } else if (value instanceof Date) {
            DateFormat format = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
            format.setTimeZone(TimeZone.getTimeZone(AlipayConstants.DATE_TIMEZONE));
            strValue = format.format((Date) value);
        } else {
            strValue = value.toString();
        }

        return this.put(key, strValue);
    }

    /**
     * <p>put.</p>
     *
     * @param key a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public String put(String key, String value) {
        if (StringUtils.areNotEmpty(key, value)) {
            return super.put(key, value);
        } else {
            return null;
        }
    }

}
