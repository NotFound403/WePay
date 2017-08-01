package org.hive.common.exception;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 支付异常
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/19  17:13
 */


public class PayException extends Exception {
    private static final long serialVersionUID = -5439722412045261617L;

/*    private static final Map<String, String> statusMap = new HashMap<>();

    static {
        statusMap.put("NOAUTH", "商户无此接口权限,请商户前往申请此接口权限");
        statusMap.put("NOTENOUGH", "用户帐号余额不足，请用户充值或更换支付卡后再支付");
        statusMap.put("ORDERPAID", "商户订单已支付，无需更多操作");
        statusMap.put("ORDERCLOSED", "当前订单已关闭，请重新下单");
        statusMap.put("SYSTEMERROR", "系统异常，请用相同参数重新调用");
        statusMap.put("APPID_NOT_EXIST", "请检查APPID是否正确");
        statusMap.put("MCHID_NOT_EXIST", "请检查MCHID是否正确");
        statusMap.put("APPID_MCHID_NOT_MATCH", "appid和mch_id不匹配,请确认appid和mch_id是否匹配");
        statusMap.put("LACK_PARAMS", "请检查参数是否齐全");
        statusMap.put("OUT_TRADE_NO_USED", "请核实商户订单号是否重复提交");
        statusMap.put("SIGNERROR", "请检查签名参数和方法是否都符合签名算法要求");
        statusMap.put("XML_FORMAT_ERROR", "请检查XML参数格式是否正确");
        statusMap.put("REQUIRE_POST_METHOD", "请检查请求参数是否通过post方法提交");
        statusMap.put("POST_DATA_EMPTY", "请检查post数据是否为空");
        statusMap.put("NOT_UTF8", "请使用NOT_UTF8编码格式");
    }*/

    /**
     * Instantiates a new Pay exception.
     *
     * @param message the message
     */
    public PayException(String message) {

        super(message);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public PayException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param cause the cause
     */
    public PayException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public PayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
