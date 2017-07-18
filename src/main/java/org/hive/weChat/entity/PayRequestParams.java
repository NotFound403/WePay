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
    private String nonce_str;
    // 签名 重要
    private String sign;
    // 商品描述 格式 APP名称-实际商品名称 必传
    private String body;
    // 附加数据  该字段主要用于商户携带订单的自定义数据  具体业务中使用 非必传
    private String attach;
    // 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一  必传
    private String out_trade_no;
    // 货币类型 人民币为CNY
    private String fee_type;
    // 总金额 订单总金额，单位为分  重要
    private int total_fee;
    // 用户端实际IP  必传
    private String spbill_create_ip;
    // 交易类型  必传
    private String trade_type;
    // 终端设备号(门店号或收银设备ID)，默认请传"WEB"
    private String device_info;
    // 商品详情
    private String detail;
    // 交易起始时间 格式yyyyMMddHHmmss
    private String time_start;
    // 交易结束时间
    private String time_expire;
    // 订单优惠标记
    private String goods_tag;
    // 指定支付方式
    private String limit_pay;
    // 场景信息  JSON 格式
    private String scene_info;
}
