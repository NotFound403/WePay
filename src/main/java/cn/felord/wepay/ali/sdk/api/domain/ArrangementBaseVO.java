package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约基本信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ArrangementBaseVO extends AlipayObject {

	private static final long serialVersionUID = 5783161318852116625L;

	/**
	 * 应用id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 签约机构编码
	 */
	@ApiField("arrangement_institution_code")
	private String arrangementInstitutionCode;

	/**
	 * 合约名称
	 */
	@ApiField("arrangement_name")
	private String arrangementName;

	/**
	 * 合约编号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 合约类型
	 */
	@ApiField("arrangement_type")
	private String arrangementType;

	/**
	 * 合约版
	 */
	@ApiField("arrangement_version")
	private String arrangementVersion;

	/**
	 * 签约渠道来源
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 合约失效时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 到期时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 预计合约失效时间
	 */
	@ApiField("gmt_invalid_due")
	private String gmtInvalidDue;

	/**
	 * 合约签署时间
	 */
	@ApiField("gmt_sign")
	private Date gmtSign;

	/**
	 * 预计合约生效时间
	 */
	@ApiField("gmt_vald_due")
	private String gmtValdDue;

	/**
	 * 合约版本时间
	 */
	@ApiField("gmt_vrsn")
	private Date gmtVrsn;

	/**
	 * 参与者角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 外标类型
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 修改人类型
	 */
	@ApiField("moder_type")
	private String moderType;

	/**
	 * 签约产品外标
	 */
	@ApiField("pd_mark")
	private String pdMark;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * ps(产品销售)编码
	 */
	@ApiField("ps_code")
	private String psCode;

	/**
	 * ps(产品销售)id
	 */
	@ApiField("ps_id")
	private String psId;

	/**
	 * 产品销售名称
	 */
	@ApiField("ps_name")
	private String psName;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 签约模板产品编码
	 */
	@ApiField("template_prod_code")
	private String templateProdCode;

	/**
	 * 签约模板产品版本
	 */
	@ApiField("template_prod_version")
	private String templateProdVersion;

	/**
	 * <p>Getter for the field <code>appId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppId() {
		return this.appId;
	}
	/**
	 * <p>Setter for the field <code>appId</code>.</p>
	 *
	 * @param appId a {@link java.lang.String} object.
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * <p>Getter for the field <code>arrangementInstitutionCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArrangementInstitutionCode() {
		return this.arrangementInstitutionCode;
	}
	/**
	 * <p>Setter for the field <code>arrangementInstitutionCode</code>.</p>
	 *
	 * @param arrangementInstitutionCode a {@link java.lang.String} object.
	 */
	public void setArrangementInstitutionCode(String arrangementInstitutionCode) {
		this.arrangementInstitutionCode = arrangementInstitutionCode;
	}

	/**
	 * <p>Getter for the field <code>arrangementName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArrangementName() {
		return this.arrangementName;
	}
	/**
	 * <p>Setter for the field <code>arrangementName</code>.</p>
	 *
	 * @param arrangementName a {@link java.lang.String} object.
	 */
	public void setArrangementName(String arrangementName) {
		this.arrangementName = arrangementName;
	}

	/**
	 * <p>Getter for the field <code>arrangementNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArrangementNo() {
		return this.arrangementNo;
	}
	/**
	 * <p>Setter for the field <code>arrangementNo</code>.</p>
	 *
	 * @param arrangementNo a {@link java.lang.String} object.
	 */
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	/**
	 * <p>Getter for the field <code>arrangementType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArrangementType() {
		return this.arrangementType;
	}
	/**
	 * <p>Setter for the field <code>arrangementType</code>.</p>
	 *
	 * @param arrangementType a {@link java.lang.String} object.
	 */
	public void setArrangementType(String arrangementType) {
		this.arrangementType = arrangementType;
	}

	/**
	 * <p>Getter for the field <code>arrangementVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArrangementVersion() {
		return this.arrangementVersion;
	}
	/**
	 * <p>Setter for the field <code>arrangementVersion</code>.</p>
	 *
	 * @param arrangementVersion a {@link java.lang.String} object.
	 */
	public void setArrangementVersion(String arrangementVersion) {
		this.arrangementVersion = arrangementVersion;
	}

	/**
	 * <p>Getter for the field <code>channelCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelCode() {
		return this.channelCode;
	}
	/**
	 * <p>Setter for the field <code>channelCode</code>.</p>
	 *
	 * @param channelCode a {@link java.lang.String} object.
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>gmtExpired</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	/**
	 * <p>Setter for the field <code>gmtExpired</code>.</p>
	 *
	 * @param gmtExpired a {@link java.util.Date} object.
	 */
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	/**
	 * <p>Getter for the field <code>gmtInvalidDue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtInvalidDue() {
		return this.gmtInvalidDue;
	}
	/**
	 * <p>Setter for the field <code>gmtInvalidDue</code>.</p>
	 *
	 * @param gmtInvalidDue a {@link java.lang.String} object.
	 */
	public void setGmtInvalidDue(String gmtInvalidDue) {
		this.gmtInvalidDue = gmtInvalidDue;
	}

	/**
	 * <p>Getter for the field <code>gmtSign</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtSign() {
		return this.gmtSign;
	}
	/**
	 * <p>Setter for the field <code>gmtSign</code>.</p>
	 *
	 * @param gmtSign a {@link java.util.Date} object.
	 */
	public void setGmtSign(Date gmtSign) {
		this.gmtSign = gmtSign;
	}

	/**
	 * <p>Getter for the field <code>gmtValdDue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtValdDue() {
		return this.gmtValdDue;
	}
	/**
	 * <p>Setter for the field <code>gmtValdDue</code>.</p>
	 *
	 * @param gmtValdDue a {@link java.lang.String} object.
	 */
	public void setGmtValdDue(String gmtValdDue) {
		this.gmtValdDue = gmtValdDue;
	}

	/**
	 * <p>Getter for the field <code>gmtVrsn</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtVrsn() {
		return this.gmtVrsn;
	}
	/**
	 * <p>Setter for the field <code>gmtVrsn</code>.</p>
	 *
	 * @param gmtVrsn a {@link java.util.Date} object.
	 */
	public void setGmtVrsn(Date gmtVrsn) {
		this.gmtVrsn = gmtVrsn;
	}

	/**
	 * <p>Getter for the field <code>ipRoleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpRoleId() {
		return this.ipRoleId;
	}
	/**
	 * <p>Setter for the field <code>ipRoleId</code>.</p>
	 *
	 * @param ipRoleId a {@link java.lang.String} object.
	 */
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	/**
	 * <p>Getter for the field <code>lastModer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLastModer() {
		return this.lastModer;
	}
	/**
	 * <p>Setter for the field <code>lastModer</code>.</p>
	 *
	 * @param lastModer a {@link java.lang.String} object.
	 */
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	/**
	 * <p>Getter for the field <code>markType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarkType() {
		return this.markType;
	}
	/**
	 * <p>Setter for the field <code>markType</code>.</p>
	 *
	 * @param markType a {@link java.lang.String} object.
	 */
	public void setMarkType(String markType) {
		this.markType = markType;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>moderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModerType() {
		return this.moderType;
	}
	/**
	 * <p>Setter for the field <code>moderType</code>.</p>
	 *
	 * @param moderType a {@link java.lang.String} object.
	 */
	public void setModerType(String moderType) {
		this.moderType = moderType;
	}

	/**
	 * <p>Getter for the field <code>pdMark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPdMark() {
		return this.pdMark;
	}
	/**
	 * <p>Setter for the field <code>pdMark</code>.</p>
	 *
	 * @param pdMark a {@link java.lang.String} object.
	 */
	public void setPdMark(String pdMark) {
		this.pdMark = pdMark;
	}

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * <p>Getter for the field <code>prodName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdName() {
		return this.prodName;
	}
	/**
	 * <p>Setter for the field <code>prodName</code>.</p>
	 *
	 * @param prodName a {@link java.lang.String} object.
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * <p>Getter for the field <code>prodVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdVersion() {
		return this.prodVersion;
	}
	/**
	 * <p>Setter for the field <code>prodVersion</code>.</p>
	 *
	 * @param prodVersion a {@link java.lang.String} object.
	 */
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	/**
	 * <p>Getter for the field <code>psCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPsCode() {
		return this.psCode;
	}
	/**
	 * <p>Setter for the field <code>psCode</code>.</p>
	 *
	 * @param psCode a {@link java.lang.String} object.
	 */
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	/**
	 * <p>Getter for the field <code>psId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPsId() {
		return this.psId;
	}
	/**
	 * <p>Setter for the field <code>psId</code>.</p>
	 *
	 * @param psId a {@link java.lang.String} object.
	 */
	public void setPsId(String psId) {
		this.psId = psId;
	}

	/**
	 * <p>Getter for the field <code>psName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPsName() {
		return this.psName;
	}
	/**
	 * <p>Setter for the field <code>psName</code>.</p>
	 *
	 * @param psName a {@link java.lang.String} object.
	 */
	public void setPsName(String psName) {
		this.psName = psName;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>templateProdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateProdCode() {
		return this.templateProdCode;
	}
	/**
	 * <p>Setter for the field <code>templateProdCode</code>.</p>
	 *
	 * @param templateProdCode a {@link java.lang.String} object.
	 */
	public void setTemplateProdCode(String templateProdCode) {
		this.templateProdCode = templateProdCode;
	}

	/**
	 * <p>Getter for the field <code>templateProdVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateProdVersion() {
		return this.templateProdVersion;
	}
	/**
	 * <p>Setter for the field <code>templateProdVersion</code>.</p>
	 *
	 * @param templateProdVersion a {@link java.lang.String} object.
	 */
	public void setTemplateProdVersion(String templateProdVersion) {
		this.templateProdVersion = templateProdVersion;
	}

}
