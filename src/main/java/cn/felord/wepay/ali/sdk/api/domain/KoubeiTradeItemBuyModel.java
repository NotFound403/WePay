package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取购特车scheme
 *
 * @author auto create
 * @version $Id : $Id
 */
public class KoubeiTradeItemBuyModel extends AlipayObject {

    private static final long serialVersionUID = 5168932762123652339L;

    /**
     * 预定用户的联系号码。要求合法的手机号码或者座机；该字段仅用于商品预定，商品预定场景为必填字段。如：0579-XXXXXXX；1526XXXXXXX
     */
    @ApiField("buyer_phone_number")
    private String buyerPhoneNumber;

    /**
     * 预定的买家用户名称；该字段仅用于商品预定，商品预定场景下为必填字段
     */
    @ApiField("buyer_user_name")
    private String buyerUserName;

    /**
     * 若无现价则此值传商品原价，交易创建将根据此价格进行售卖。
     * 传入的价格最多可有两位小数，最大值不可超过5000，超过则会报错。
     */
    @ApiField("current_price")
    private String currentPrice;

    /**
     * 额外描述信息，比如预定时间信息，需要以“字段1：描述1；字段2：描述2；....“方式传入。标点符号限制集如下,不能传下列标点之外的标点符号：..！.{},:()"[]，。!！,/&gt;"{},:"，\?\？。!！\[\]]=+_@#$%*
     */
    @ApiField("ext_info")
    private String extInfo;

    /**
     * 商品ID
     */
    @ApiField("item_id")
    private String itemId;

    /**
     * 原价，传入的价格最多可有两位小数，超过则会报错
     */
    @ApiField("original_price")
    private String originalPrice;

    /**
     * 外部业务流水编号,推荐:yyyymmddhhmmssSSS99999999(年月日时分秒+8位随机码)，开发者可根据该编号与口碑订单一一对应。本订单创建行为的流水ID,用于平台做幂等控制
     */
    @ApiField("out_biz_no")
    private String outBizNo;

    /**
     * 商户pid
     */
    @ApiField("partner_id")
    private String partnerId;

    /**
     * 购买数量，最大传入20，否则下单页会报错
     */
    @ApiField("quantity")
    private Long quantity;

    /**
     * 预定结束时间；该字段仅用于商品预定，商品预定场景下为非必填字段。
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @ApiField("reserve_end_time")
    private String reserveEndTime;

    /**
     * 预定开始时间；该字段仅用于商品预定，商品预定场景下为必填字段
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @ApiField("reserve_start_time")
    private String reserveStartTime;

    /**
     * 店铺ID，用于后续统计商家各门店的售卖，需传入口碑店铺id，取值规则见FAQ常见问题 <a href="https://doc.open.alipay.com/docs/doc.htm?&docType=1&articleId=105746">参考文档</a>。
     */
    @ApiField("shop_id")
    private String shopId;

    /**
     * <p>Getter for the field <code>buyerPhoneNumber</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBuyerPhoneNumber() {
        return this.buyerPhoneNumber;
    }

    /**
     * <p>Setter for the field <code>buyerPhoneNumber</code>.</p>
     *
     * @param buyerPhoneNumber a {@link java.lang.String} object.
     */
    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.buyerPhoneNumber = buyerPhoneNumber;
    }

    /**
     * <p>Getter for the field <code>buyerUserName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBuyerUserName() {
        return this.buyerUserName;
    }

    /**
     * <p>Setter for the field <code>buyerUserName</code>.</p>
     *
     * @param buyerUserName a {@link java.lang.String} object.
     */
    public void setBuyerUserName(String buyerUserName) {
        this.buyerUserName = buyerUserName;
    }

    /**
     * <p>Getter for the field <code>currentPrice</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCurrentPrice() {
        return this.currentPrice;
    }

    /**
     * <p>Setter for the field <code>currentPrice</code>.</p>
     *
     * @param currentPrice a {@link java.lang.String} object.
     */
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * <p>Getter for the field <code>extInfo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * <p>Setter for the field <code>extInfo</code>.</p>
     *
     * @param extInfo a {@link java.lang.String} object.
     */
    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    /**
     * <p>Getter for the field <code>itemId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p>Setter for the field <code>itemId</code>.</p>
     *
     * @param itemId a {@link java.lang.String} object.
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>Getter for the field <code>originalPrice</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * <p>Setter for the field <code>originalPrice</code>.</p>
     *
     * @param originalPrice a {@link java.lang.String} object.
     */
    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * <p>Getter for the field <code>outBizNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutBizNo() {
        return this.outBizNo;
    }

    /**
     * <p>Setter for the field <code>outBizNo</code>.</p>
     *
     * @param outBizNo a {@link java.lang.String} object.
     */
    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    /**
     * <p>Getter for the field <code>partnerId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPartnerId() {
        return this.partnerId;
    }

    /**
     * <p>Setter for the field <code>partnerId</code>.</p>
     *
     * @param partnerId a {@link java.lang.String} object.
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * <p>Getter for the field <code>quantity</code>.</p>
     *
     * @return a {@link java.lang.Long} object.
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * <p>Setter for the field <code>quantity</code>.</p>
     *
     * @param quantity a {@link java.lang.Long} object.
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>Getter for the field <code>reserveEndTime</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReserveEndTime() {
        return this.reserveEndTime;
    }

    /**
     * <p>Setter for the field <code>reserveEndTime</code>.</p>
     *
     * @param reserveEndTime a {@link java.lang.String} object.
     */
    public void setReserveEndTime(String reserveEndTime) {
        this.reserveEndTime = reserveEndTime;
    }

    /**
     * <p>Getter for the field <code>reserveStartTime</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReserveStartTime() {
        return this.reserveStartTime;
    }

    /**
     * <p>Setter for the field <code>reserveStartTime</code>.</p>
     *
     * @param reserveStartTime a {@link java.lang.String} object.
     */
    public void setReserveStartTime(String reserveStartTime) {
        this.reserveStartTime = reserveStartTime;
    }

    /**
     * <p>Getter for the field <code>shopId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * <p>Setter for the field <code>shopId</code>.</p>
     *
     * @param shopId a {@link java.lang.String} object.
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

}
