package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据用户已经在支付宝绑定过的医保卡为医疗行业提供收单支付服务。同时支持自费支付服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceMedicalInstcardCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 7685286558952748412L;

	/**
	 * 业务单据号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 对交易或者商品的描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部下单时间。 格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/**
	 * 支付行业：
医院：HOSPITAL
药店：STORE
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 外部机构业务上是否允许这笔单订单使用医保支付
允许使用：T
不允许使用：F
	 */
	@ApiField("is_insurance")
	private String isInsurance;

	/**
	 * 医保机构的编号
	 */
	@ApiField("medical_card_inst_id")
	private String medicalCardInstId;

	/**
	 * 医疗机构名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 医疗机构编码(医保局分配)
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 商户订单号，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 患者证件号码
	 */
	@ApiField("patient_card_no")
	private String patientCardNo;

	/**
	 * 患者证件号码
	 */
	@ApiField("patient_card_type")
	private String patientCardType;

	/**
	 * 患者手机号
	 */
	@ApiField("patient_mobile")
	private String patientMobile;

	/**
	 * 患者姓名
患者姓名&患者证件和医保卡信息全部匹配才能使用医保，否则认为套保嫌疑不允许医保只能自费
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 如果需要医保支付这个字段必传。业务报文，报文中可包含多条业务数据
	 */
	@ApiField("request_content")
	private String requestContent;

	/**
	 * 支付场景，取值：REGISTRATION(挂号)
TREATMENT(诊间)
HOSPITALIZATION(住院)
COMMON(非医院类)
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 卖家支付宝用户ID，如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 业务流水号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，不能小于0，精确到小数点后2位。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * <p>Getter for the field <code>billNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillNo() {
		return this.billNo;
	}
	/**
	 * <p>Setter for the field <code>billNo</code>.</p>
	 *
	 * @param billNo a {@link java.lang.String} object.
	 */
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	/**
	 * <p>Getter for the field <code>body</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBody() {
		return this.body;
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
	 * <p>Getter for the field <code>buyerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerId() {
		return this.buyerId;
	}
	/**
	 * <p>Setter for the field <code>buyerId</code>.</p>
	 *
	 * @param buyerId a {@link java.lang.String} object.
	 */
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendParams() {
		return this.extendParams;
	}
	/**
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link java.lang.String} object.
	 */
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	/**
	 * <p>Getter for the field <code>gmtOutCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtOutCreate() {
		return this.gmtOutCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtOutCreate</code>.</p>
	 *
	 * @param gmtOutCreate a {@link java.util.Date} object.
	 */
	public void setGmtOutCreate(Date gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}

	/**
	 * <p>Getter for the field <code>industry</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIndustry() {
		return this.industry;
	}
	/**
	 * <p>Setter for the field <code>industry</code>.</p>
	 *
	 * @param industry a {@link java.lang.String} object.
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * <p>Getter for the field <code>isInsurance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsInsurance() {
		return this.isInsurance;
	}
	/**
	 * <p>Setter for the field <code>isInsurance</code>.</p>
	 *
	 * @param isInsurance a {@link java.lang.String} object.
	 */
	public void setIsInsurance(String isInsurance) {
		this.isInsurance = isInsurance;
	}

	/**
	 * <p>Getter for the field <code>medicalCardInstId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMedicalCardInstId() {
		return this.medicalCardInstId;
	}
	/**
	 * <p>Setter for the field <code>medicalCardInstId</code>.</p>
	 *
	 * @param medicalCardInstId a {@link java.lang.String} object.
	 */
	public void setMedicalCardInstId(String medicalCardInstId) {
		this.medicalCardInstId = medicalCardInstId;
	}

	/**
	 * <p>Getter for the field <code>orgName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgName() {
		return this.orgName;
	}
	/**
	 * <p>Setter for the field <code>orgName</code>.</p>
	 *
	 * @param orgName a {@link java.lang.String} object.
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * <p>Getter for the field <code>orgNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgNo() {
		return this.orgNo;
	}
	/**
	 * <p>Setter for the field <code>orgNo</code>.</p>
	 *
	 * @param orgNo a {@link java.lang.String} object.
	 */
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	/**
	 * <p>Getter for the field <code>patientCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPatientCardNo() {
		return this.patientCardNo;
	}
	/**
	 * <p>Setter for the field <code>patientCardNo</code>.</p>
	 *
	 * @param patientCardNo a {@link java.lang.String} object.
	 */
	public void setPatientCardNo(String patientCardNo) {
		this.patientCardNo = patientCardNo;
	}

	/**
	 * <p>Getter for the field <code>patientCardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPatientCardType() {
		return this.patientCardType;
	}
	/**
	 * <p>Setter for the field <code>patientCardType</code>.</p>
	 *
	 * @param patientCardType a {@link java.lang.String} object.
	 */
	public void setPatientCardType(String patientCardType) {
		this.patientCardType = patientCardType;
	}

	/**
	 * <p>Getter for the field <code>patientMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPatientMobile() {
		return this.patientMobile;
	}
	/**
	 * <p>Setter for the field <code>patientMobile</code>.</p>
	 *
	 * @param patientMobile a {@link java.lang.String} object.
	 */
	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}

	/**
	 * <p>Getter for the field <code>patientName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPatientName() {
		return this.patientName;
	}
	/**
	 * <p>Setter for the field <code>patientName</code>.</p>
	 *
	 * @param patientName a {@link java.lang.String} object.
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * <p>Getter for the field <code>requestContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestContent() {
		return this.requestContent;
	}
	/**
	 * <p>Setter for the field <code>requestContent</code>.</p>
	 *
	 * @param requestContent a {@link java.lang.String} object.
	 */
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	/**
	 * <p>Getter for the field <code>scene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScene() {
		return this.scene;
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
	 * <p>Getter for the field <code>sellerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerId() {
		return this.sellerId;
	}
	/**
	 * <p>Setter for the field <code>sellerId</code>.</p>
	 *
	 * @param sellerId a {@link java.lang.String} object.
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * <p>Getter for the field <code>serialNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSerialNo() {
		return this.serialNo;
	}
	/**
	 * <p>Setter for the field <code>serialNo</code>.</p>
	 *
	 * @param serialNo a {@link java.lang.String} object.
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
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
	 * <p>Getter for the field <code>timeoutExpress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	/**
	 * <p>Setter for the field <code>timeoutExpress</code>.</p>
	 *
	 * @param timeoutExpress a {@link java.lang.String} object.
	 */
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount() {
		return this.totalAmount;
	}
	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
