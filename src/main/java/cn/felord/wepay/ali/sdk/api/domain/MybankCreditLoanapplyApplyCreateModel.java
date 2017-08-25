package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 机构代客户申贷
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoanapplyApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5639335428729298698L;

	/**
	 * 客户的支付宝ID
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 申请金额，默认以元为单位，支持精确到小数点后2位，为了便于传输，调用方需要把double类型的金额转换为string类型
	 */
	@ApiField("apply_lmt")
	private String applyLmt;

	/**
	 * 业务编号，比如当使用一笔订单创建授信申请时，业务编号就是订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 授信申请的场景码，1表示普通客户申请，2表示订单申请，可扩展场景
	 */
	@ApiField("biz_scene_no")
	private String bizSceneNo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 客户的身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，01:身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 联系邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 会员的登录账号，比如支付宝登录账号，一般为手机号或邮箱
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 联系手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 客户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 运营产品码
	 */
	@ApiField("op_pd_code")
	private String opPdCode;

	/**
	 * 外部机构定义的客户编号
	 */
	@ApiField("out_mem_id")
	private String outMemId;

	/**
	 * 外部流水号,唯一标识客户的一笔贷款申请。格式：日期(8位)+序列号(8位）,序列号是数字，如00000001（必须是16位且符合该格式）。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * ALIPAY:支付宝
MYBANK:网商银行
TMALL：天猫
TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * <p>Getter for the field <code>alipayId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayId() {
		return this.alipayId;
	}
	/**
	 * <p>Setter for the field <code>alipayId</code>.</p>
	 *
	 * @param alipayId a {@link java.lang.String} object.
	 */
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	/**
	 * <p>Getter for the field <code>applyLmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyLmt() {
		return this.applyLmt;
	}
	/**
	 * <p>Setter for the field <code>applyLmt</code>.</p>
	 *
	 * @param applyLmt a {@link java.lang.String} object.
	 */
	public void setApplyLmt(String applyLmt) {
		this.applyLmt = applyLmt;
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
	 * <p>Getter for the field <code>bizSceneNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizSceneNo() {
		return this.bizSceneNo;
	}
	/**
	 * <p>Setter for the field <code>bizSceneNo</code>.</p>
	 *
	 * @param bizSceneNo a {@link java.lang.String} object.
	 */
	public void setBizSceneNo(String bizSceneNo) {
		this.bizSceneNo = bizSceneNo;
	}

	/**
	 * <p>Getter for the field <code>bizTag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizTag() {
		return this.bizTag;
	}
	/**
	 * <p>Setter for the field <code>bizTag</code>.</p>
	 *
	 * @param bizTag a {@link java.lang.String} object.
	 */
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
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
	 * <p>Getter for the field <code>loginId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginId() {
		return this.loginId;
	}
	/**
	 * <p>Setter for the field <code>loginId</code>.</p>
	 *
	 * @param loginId a {@link java.lang.String} object.
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
	 * <p>Getter for the field <code>opPdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpPdCode() {
		return this.opPdCode;
	}
	/**
	 * <p>Setter for the field <code>opPdCode</code>.</p>
	 *
	 * @param opPdCode a {@link java.lang.String} object.
	 */
	public void setOpPdCode(String opPdCode) {
		this.opPdCode = opPdCode;
	}

	/**
	 * <p>Getter for the field <code>outMemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutMemId() {
		return this.outMemId;
	}
	/**
	 * <p>Setter for the field <code>outMemId</code>.</p>
	 *
	 * @param outMemId a {@link java.lang.String} object.
	 */
	public void setOutMemId(String outMemId) {
		this.outMemId = outMemId;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * <p>Getter for the field <code>site</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSite() {
		return this.site;
	}
	/**
	 * <p>Setter for the field <code>site</code>.</p>
	 *
	 * @param site a {@link java.lang.String} object.
	 */
	public void setSite(String site) {
		this.site = site;
	}

}
