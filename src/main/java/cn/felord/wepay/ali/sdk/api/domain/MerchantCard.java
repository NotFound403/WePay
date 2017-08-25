package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户卡信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MerchantCard extends AlipayObject {

	private static final long serialVersionUID = 6396357456366594123L;

	/**
	 * 资金卡余额，单位：元，精确到小数点后两位。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 支付宝业务卡号
说明：
1、开卡成功后返回该参数，需要保存留用；
2、开卡/更新/删卡/查询卡接口请求中不需要传该参数；
	 */
	@ApiField("biz_card_no")
	private String bizCardNo;

	/**
	 * 商户外部会员卡卡号
说明：
1、会员卡开卡接口，如果卡类型为外部会员卡，请求中则必须提供该参数；
2、更新、查询、删除等接口，请求中则不需要提供该参数值；
	 */
	@ApiField("external_card_no")
	private String externalCardNo;

	/**
	 * 会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）
	 */
	@ApiField("level")
	private String level;

	/**
	 * 商户动态码回传信息：
只用于当write_off_type核销类型为mdbarcode或mdqrcode时，商户调用卡更新接口回传动态码。
	 */
	@ApiField("mdcode_info")
	private MdCodeInfoDTO mdcodeInfo;

	/**
	 * 会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("open_date")
	private Date openDate;

	/**
	 * 会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）
	 */
	@ApiField("point")
	private String point;

	/**
	 * 会员卡更换不同的卡模板（该参数仅用在会员卡更新接口中）
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 会员卡有效期
	 */
	@ApiField("valid_date")
	private String validDate;

	/**
	 * <p>Getter for the field <code>balance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBalance() {
		return this.balance;
	}
	/**
	 * <p>Setter for the field <code>balance</code>.</p>
	 *
	 * @param balance a {@link java.lang.String} object.
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	/**
	 * <p>Getter for the field <code>bizCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizCardNo() {
		return this.bizCardNo;
	}
	/**
	 * <p>Setter for the field <code>bizCardNo</code>.</p>
	 *
	 * @param bizCardNo a {@link java.lang.String} object.
	 */
	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}

	/**
	 * <p>Getter for the field <code>externalCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalCardNo() {
		return this.externalCardNo;
	}
	/**
	 * <p>Setter for the field <code>externalCardNo</code>.</p>
	 *
	 * @param externalCardNo a {@link java.lang.String} object.
	 */
	public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}

	/**
	 * <p>Getter for the field <code>level</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevel() {
		return this.level;
	}
	/**
	 * <p>Setter for the field <code>level</code>.</p>
	 *
	 * @param level a {@link java.lang.String} object.
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * <p>Getter for the field <code>mdcodeInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MdCodeInfoDTO} object.
	 */
	public MdCodeInfoDTO getMdcodeInfo() {
		return this.mdcodeInfo;
	}
	/**
	 * <p>Setter for the field <code>mdcodeInfo</code>.</p>
	 *
	 * @param mdcodeInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MdCodeInfoDTO} object.
	 */
	public void setMdcodeInfo(MdCodeInfoDTO mdcodeInfo) {
		this.mdcodeInfo = mdcodeInfo;
	}

	/**
	 * <p>Getter for the field <code>openDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getOpenDate() {
		return this.openDate;
	}
	/**
	 * <p>Setter for the field <code>openDate</code>.</p>
	 *
	 * @param openDate a {@link java.util.Date} object.
	 */
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	/**
	 * <p>Getter for the field <code>point</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPoint() {
		return this.point;
	}
	/**
	 * <p>Setter for the field <code>point</code>.</p>
	 *
	 * @param point a {@link java.lang.String} object.
	 */
	public void setPoint(String point) {
		this.point = point;
	}

	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId() {
		return this.templateId;
	}
	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.String} object.
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * <p>Getter for the field <code>validDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValidDate() {
		return this.validDate;
	}
	/**
	 * <p>Setter for the field <code>validDate</code>.</p>
	 *
	 * @param validDate a {@link java.lang.String} object.
	 */
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
