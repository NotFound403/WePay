package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 欺诈信息验证
 *
 * @author auto create
 * @version $Id : $Id
 */
public class ZhimaCreditAntifraudVerifyModel extends AlipayObject {

    private static final long serialVersionUID = 7519143975371581472L;

    /**
     * 地址信息。省+市+区/县+详细地址，其中 省+市+区/县可以为空，长度不超过256，不含",","/u0001"，"|","&amp;","^","\\"
     */
    @ApiField("address")
    private String address;

    /**
     * 银行卡号。中国大陆银行发布的银行卡:借记卡长度19位；信用卡长度16位；各位的取值位[0,9]的整数；不含虚拟卡
     */
    @ApiField("bank_card")
    private String bankCard;

    /**
     * 证件号
     */
    @ApiField("cert_no")
    private String certNo;

    /**
     * 证件类型。IDENTITY_CARD标识为身份证，目前仅支持身份证类型
     */
    @ApiField("cert_type")
    private String certType;

    /**
     * 电子邮箱。合法email，字母小写，特殊符号以半角形式出现
     */
    @ApiField("email")
    private String email;

    /**
     * 国际移动设备标志。15位长度数字
     */
    @ApiField("imei")
    private String imei;

    /**
     * ip地址。以"."分割的四段Ip，如 x.x.x.x，x为[0,255]之间的整数
     */
    @ApiField("ip")
    private String ip;

    /**
     * 物理地址。支持格式如下：xx:xx:xx:xx:xx:xx，xx-xx-xx-xx-xx-xx，xxxxxxxxxxxx，x取值范围[0,9]之间的整数及A，B，C，D，E，F
     */
    @ApiField("mac")
    private String mac;

    /**
     * 手机号码。中国大陆合法手机号，长度11位，不含国家代码
     */
    @ApiField("mobile")
    private String mobile;

    /**
     * 姓名，长度不超过64，姓名中不含",","/u0001"，"|","&amp;","^","\\"
     */
    @ApiField("name")
    private String name;

    /**
     * 产品码，标记商户接入的具体产品；直接使用每个接口入参中示例值即可
     */
    @ApiField("product_code")
    private String productCode;

    /**
     * 商户请求的唯一标志，长度64位以内字符串，仅限字母数字下划线组合。该标识作为业务调用的唯一标识，商户要保证其业务唯一性，使用相同transaction_id的查询，芝麻在一段时间内（一般为1天）返回首次查询结果，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
     */
    @ApiField("transaction_id")
    private String transactionId;

    /**
     * wifi的物理地址。支持格式如下：xx:xx:xx:xx:xx:xx，xx-xx-xx-xx-xx-xx，xxxxxxxxxxxx，x取值范围[0,9]之间的整数及A，B，C，D，E，F
     */
    @ApiField("wifimac")
    private String wifimac;

    /**
     * <p>Getter for the field <code>address</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * <p>Setter for the field <code>address</code>.</p>
     *
     * @param address a {@link java.lang.String} object.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>Getter for the field <code>bankCard</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBankCard() {
        return this.bankCard;
    }

    /**
     * <p>Setter for the field <code>bankCard</code>.</p>
     *
     * @param bankCard a {@link java.lang.String} object.
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    /**
     * <p>Getter for the field <code>certNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCertNo() {
        return this.certNo;
    }

    /**
     * <p>Setter for the field <code>certNo</code>.</p>
     *
     * @param certNo a {@link java.lang.String} object.
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * <p>Getter for the field <code>certType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * <p>Setter for the field <code>certType</code>.</p>
     *
     * @param certType a {@link java.lang.String} object.
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * <p>Getter for the field <code>email</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * <p>Setter for the field <code>email</code>.</p>
     *
     * @param email a {@link java.lang.String} object.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>Getter for the field <code>imei</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getImei() {
        return this.imei;
    }

    /**
     * <p>Setter for the field <code>imei</code>.</p>
     *
     * @param imei a {@link java.lang.String} object.
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * <p>Getter for the field <code>ip</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * <p>Setter for the field <code>ip</code>.</p>
     *
     * @param ip a {@link java.lang.String} object.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>Getter for the field <code>mac</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * <p>Setter for the field <code>mac</code>.</p>
     *
     * @param mac a {@link java.lang.String} object.
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * <p>Getter for the field <code>mobile</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * <p>Setter for the field <code>mobile</code>.</p>
     *
     * @param mobile a {@link java.lang.String} object.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() {
        return this.name;
    }

    /**
     * <p>Setter for the field <code>name</code>.</p>
     *
     * @param name a {@link java.lang.String} object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>Getter for the field <code>productCode</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>Setter for the field <code>productCode</code>.</p>
     *
     * @param productCode a {@link java.lang.String} object.
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>Getter for the field <code>transactionId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>Setter for the field <code>transactionId</code>.</p>
     *
     * @param transactionId a {@link java.lang.String} object.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>Getter for the field <code>wifimac</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getWifimac() {
        return this.wifimac;
    }

    /**
     * <p>Setter for the field <code>wifimac</code>.</p>
     *
     * @param wifimac a {@link java.lang.String} object.
     */
    public void setWifimac(String wifimac) {
        this.wifimac = wifimac;
    }

}
