package cn.felord.wepay.ali.entity;

import cn.felord.wepay.common.pay.Params;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-17
 * Time: 上午12:01
 *
 * @author lenovo
 * @version $Id: $Id
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

    /**
     * <p>Getter for the field <code>out_trade_no</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOut_trade_no() {
        return out_trade_no;
    }

    /**
     * <p>Setter for the field <code>out_trade_no</code>.</p>
     *
     * @param out_trade_no a {@link java.lang.String} object.
     */
    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * <p>Getter for the field <code>scene</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getScene() {
        return scene;
    }

    /**
     * <p>Setter for the field <code>scene</code>.</p>
     *
     * @param scene a {@link java.lang.String} object.
     */
    public void setScene(String scene) {
        this.scene = scene;
    }

    /**
     * <p>Getter for the field <code>auth_code</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAuth_code() {
        return auth_code;
    }

    /**
     * <p>Setter for the field <code>auth_code</code>.</p>
     *
     * @param auth_code a {@link java.lang.String} object.
     */
    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    /**
     * <p>Getter for the field <code>product_code</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getProduct_code() {
        return product_code;
    }

    /**
     * <p>Setter for the field <code>product_code</code>.</p>
     *
     * @param product_code a {@link java.lang.String} object.
     */
    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    /**
     * <p>Getter for the field <code>subject</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>Setter for the field <code>subject</code>.</p>
     *
     * @param subject a {@link java.lang.String} object.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>Getter for the field <code>buyer_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBuyer_id() {
        return buyer_id;
    }

    /**
     * <p>Setter for the field <code>buyer_id</code>.</p>
     *
     * @param buyer_id a {@link java.lang.String} object.
     */
    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    /**
     * <p>Getter for the field <code>seller_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     * <p>Setter for the field <code>seller_id</code>.</p>
     *
     * @param seller_id a {@link java.lang.String} object.
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    /**
     * <p>Getter for the field <code>total_amount</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTotal_amount() {
        return total_amount;
    }

    /**
     * <p>Setter for the field <code>total_amount</code>.</p>
     *
     * @param total_amount a {@link java.lang.String} object.
     */
    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    /**
     * <p>Getter for the field <code>discountable_amount</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDiscountable_amount() {
        return discountable_amount;
    }

    /**
     * <p>Setter for the field <code>discountable_amount</code>.</p>
     *
     * @param discountable_amount a {@link java.lang.String} object.
     */
    public void setDiscountable_amount(String discountable_amount) {
        this.discountable_amount = discountable_amount;
    }

    /**
     * <p>Getter for the field <code>body</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>Setter for the field <code>body</code>.</p>
     *
     * @param body a {@link java.lang.String} object.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>Getter for the field <code>goods_detail</code>.</p>
     *
     * @return a {@link cn.felord.wepay.ali.entity.GoodsDetail} object.
     */
    public GoodsDetail getGoods_detail() {
        return goods_detail;
    }

    /**
     * <p>Setter for the field <code>goods_detail</code>.</p>
     *
     * @param goods_detail a {@link cn.felord.wepay.ali.entity.GoodsDetail} object.
     */
    public void setGoods_detail(GoodsDetail goods_detail) {
        this.goods_detail = goods_detail;
    }

    /**
     * <p>Getter for the field <code>operator_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOperator_id() {
        return operator_id;
    }

    /**
     * <p>Setter for the field <code>operator_id</code>.</p>
     *
     * @param operator_id a {@link java.lang.String} object.
     */
    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    /**
     * <p>Getter for the field <code>store_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStore_id() {
        return store_id;
    }

    /**
     * <p>Setter for the field <code>store_id</code>.</p>
     *
     * @param store_id a {@link java.lang.String} object.
     */
    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    /**
     * <p>Getter for the field <code>terminal_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminal_id() {
        return terminal_id;
    }

    /**
     * <p>Setter for the field <code>terminal_id</code>.</p>
     *
     * @param terminal_id a {@link java.lang.String} object.
     */
    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    /**
     * <p>Getter for the field <code>extend_params</code>.</p>
     *
     * @return a {@link cn.felord.wepay.ali.entity.ExtendParams} object.
     */
    public ExtendParams getExtend_params() {
        return extend_params;
    }

    /**
     * <p>Setter for the field <code>extend_params</code>.</p>
     *
     * @param extend_params a {@link cn.felord.wepay.ali.entity.ExtendParams} object.
     */
    public void setExtend_params(ExtendParams extend_params) {
        this.extend_params = extend_params;
    }

    /**
     * <p>Getter for the field <code>timeout_express</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTimeout_express() {
        return timeout_express;
    }

    /**
     * <p>Setter for the field <code>timeout_express</code>.</p>
     *
     * @param timeout_express a {@link java.lang.String} object.
     */
    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }


}
