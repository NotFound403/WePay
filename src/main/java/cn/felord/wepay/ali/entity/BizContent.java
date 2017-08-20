package cn.felord.wepay.ali.entity;

import cn.felord.wepay.common.pay.Params;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-17
 * Time: 上午12:01
 */


public class BizContent implements Params {
    //    商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复 必选
    private String out_trade_no;
    //    支付场景 条码支付，取值：bar_code 声波支付，取值：wave_code 必选
    private String scene;
    //    支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准 必选
    private String auth_code;
    //     	可选 	32 	销售产品码  	可选 	32 	销售产品码
    private String product_code;
    //    必选 	256 	订单标题
    private String subject;
    //    可选 	28 	买家的支付宝用户id，如果为空，会从传入了码值信息中获取买家ID
    private String buyer_id;
    //    可选 	28 	如果该值为空，则默认为商户签约账号对应的支付宝用户ID
    private String seller_id;
    /*订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
    如果同时传入【可打折金额】和【不可打折金额】，该参数可以不用传入；
    如果同时传入了【可打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】*/
    private String total_amount;
    /*参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
    如果该值未传入，但传入了【订单总金额】和【不可打折金额】，则该值默认为【订单总金额】-【不可打折金额】 */
    private String discountable_amount;
    //    可选 	128 	订单描述
    private String body;
    //    订单包含的商品列表信息，Json格式，其它说明详见商品明细说明
    private GoodsDetail goods_detail;
    //    可选 	28 	商户操作员编号
    private String operator_id;
    //    可选 	32 	商户门店编号
    private String store_id;
    //    可选 	32 	商户机具终端编号
    private String terminal_id;
    //    可选 		业务扩展参数
    private ExtendParams extend_params;
    /*可选 	6 	该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m */
    private String timeout_express;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getDiscountable_amount() {
        return discountable_amount;
    }

    public void setDiscountable_amount(String discountable_amount) {
        this.discountable_amount = discountable_amount;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public GoodsDetail getGoods_detail() {
        return goods_detail;
    }

    public void setGoods_detail(GoodsDetail goods_detail) {
        this.goods_detail = goods_detail;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    public ExtendParams getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(ExtendParams extend_params) {
        this.extend_params = extend_params;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }


}
