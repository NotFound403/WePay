package org.hive.weChat.entity;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 微信支付请求参数封装实体
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  14:14
 */


public class PayRequestParams {

    // 随机字符串，不长于32位。必传
    private String nonceStr;
    // 签名 重要
    private String sign;
    // 商品描述 格式 APP名称-实际商品名称 必传
    private String body;
    // 附加数据  该字段主要用于商户携带订单的自定义数据  具体业务中使用 非必传
    private String attach;
    // 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一  必传
    private String outTradeNo;
    // 货币类型 人民币为CNY
    private String feeType;
    // 总金额 订单总金额，单位为分  重要
    private int totalFee;
    // 用户端实际IP  必传
    private String spbillCreateIp;
    // 交易类型  必传
    private String tradeType;
    // 终端设备号(门店号或收银设备ID)，默认请传"WEB"
    private String deviceInfo;
    // 商品详情
    private String detail;
    // 交易起始时间 格式yyyyMMddHHmmss
    private String timeStart;
    // 交易结束时间
    private String timeExpire;
    // 订单优惠标记
    private String goodsTag;
    // 指定支付方式
    private String limitPay;
    // 场景信息  JSON 格式
    private String sceneInfo;
}
