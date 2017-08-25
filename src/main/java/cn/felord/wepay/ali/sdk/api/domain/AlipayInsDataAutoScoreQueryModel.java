package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车险分查询
 *
 * @author auto create
 * @version $Id : $Id
 */
public class AlipayInsDataAutoScoreQueryModel extends AlipayObject {

    private static final long serialVersionUID = 8285316946255718893L;

    /**
     * 投保地区码，参考《城市列表（含区县）v0307.xlsx》
     */
    @ApiField("area_id")
    private String areaId;

    /**
     * 业务单号，唯一标识一次业务操作，与业务操作绑定。例如：A用户投保时进行车险分查询，然后发现输错了证件号码，用户修改证件号码进行二次查询，此时业务单号不用发生变化，但是UUID需要重新生成，标识【同一次业务操作，但不同的一次请求】
     */
    @ApiField("biz_no")
    private String bizNo;

    /**
     * 业务类型参考如下
     * UNDERWRITING：核保
     * PRICING：定价
     * PROMOTION：优惠
     * CLAIM：理赔
     * CUSTOMER_SERVICE：客服
     */
    @ApiField("biz_type")
    private String bizType;

    /**
     * 车架号
     */
    @ApiField("car_frame_no")
    private String carFrameNo;

    /**
     * 车牌号，新车车牌号为空，旧车车牌号需符合行业标准
     */
    @ApiField("car_no")
    private String carNo;

    /**
     * 姓名，须与证件上名称一致
     */
    @ApiField("cert_name")
    private String certName;

    /**
     * 证件号码
     */
    @ApiField("cert_no")
    private String certNo;

    /**
     * 投保支持证件类型参考：
     * IDENTITY_CARD：身份证
     * 备注：目前仅支持身份证类型
     */
    @ApiField("cert_type")
    private String certType;

    /**
     * 扩展信息，标准JSON格式
     */
    @ApiField("ext_info")
    private String extInfo;

    /**
     * 人员角色 优先级为 车主  被保人  投保人
     * CAR_OWNER：车主
     * INSURED：被保险人
     * APPLICANT：投保人
     */
    @ApiField("role_type")
    private String roleType;

    /**
     * 请求发起时通过程序生成标准UUID，每一次请求都需要变化。JAVA：UUID.randomUUID().toString()
     */
    @ApiField("uuid")
    private String uuid;

    /**
     * <p>Getter for the field <code>areaId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAreaId() {
        return this.areaId;
    }

    /**
     * <p>Setter for the field <code>areaId</code>.</p>
     *
     * @param areaId a {@link java.lang.String} object.
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * <p>Getter for the field <code>bizNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBizNo() {
        return this.bizNo;
    }

    /**
     * <p>Setter for the field <code>bizNo</code>.</p>
     *
     * @param bizNo a {@link java.lang.String} object.
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    /**
     * <p>Getter for the field <code>bizType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * <p>Setter for the field <code>bizType</code>.</p>
     *
     * @param bizType a {@link java.lang.String} object.
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * <p>Getter for the field <code>carFrameNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCarFrameNo() {
        return this.carFrameNo;
    }

    /**
     * <p>Setter for the field <code>carFrameNo</code>.</p>
     *
     * @param carFrameNo a {@link java.lang.String} object.
     */
    public void setCarFrameNo(String carFrameNo) {
        this.carFrameNo = carFrameNo;
    }

    /**
     * <p>Getter for the field <code>carNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCarNo() {
        return this.carNo;
    }

    /**
     * <p>Setter for the field <code>carNo</code>.</p>
     *
     * @param carNo a {@link java.lang.String} object.
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * <p>Getter for the field <code>certName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * <p>Setter for the field <code>certName</code>.</p>
     *
     * @param certName a {@link java.lang.String} object.
     */
    public void setCertName(String certName) {
        this.certName = certName;
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
     * <p>Getter for the field <code>roleType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * <p>Setter for the field <code>roleType</code>.</p>
     *
     * @param roleType a {@link java.lang.String} object.
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * <p>Getter for the field <code>uuid</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * <p>Setter for the field <code>uuid</code>.</p>
     *
     * @param uuid a {@link java.lang.String} object.
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
