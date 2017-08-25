package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 提交贷款订单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCreditAutofinanceLoanApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2228719253935269641L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 征信结果回调地址
	 */
	@ApiField("backurl")
	private String backurl;

	/**
	 * 扩展参数信息，json格式，针对不同的业务平台有不同的参数，目前大搜车业务支持的参数有：firstpayamt 首付租金，firstpayprop 首付比例，lastpayamt 回购尾款，loantenor 贷款期数，monthpayamt 每月还款额度
	 */
	@ApiField("extparam")
	private String extparam;

	/**
	 * 外部平台宝贝ID
	 */
	@ApiField("itemid")
	private String itemid;

	/**
	 * 机构编码
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("outorderno")
	private String outorderno;

	/**
	 * 支付宝账号数字ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 核身VID
	 */
	@ApiField("verifyid")
	private String verifyid;

	/**
	 * 当前安装的支付宝钱包版本号
	 */
	@ApiField("version")
	private String version;

	/**
	 * <p>Getter for the field <code>area</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArea() {
		return this.area;
	}
	/**
	 * <p>Setter for the field <code>area</code>.</p>
	 *
	 * @param area a {@link java.lang.String} object.
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * <p>Getter for the field <code>backurl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBackurl() {
		return this.backurl;
	}
	/**
	 * <p>Setter for the field <code>backurl</code>.</p>
	 *
	 * @param backurl a {@link java.lang.String} object.
	 */
	public void setBackurl(String backurl) {
		this.backurl = backurl;
	}

	/**
	 * <p>Getter for the field <code>extparam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtparam() {
		return this.extparam;
	}
	/**
	 * <p>Setter for the field <code>extparam</code>.</p>
	 *
	 * @param extparam a {@link java.lang.String} object.
	 */
	public void setExtparam(String extparam) {
		this.extparam = extparam;
	}

	/**
	 * <p>Getter for the field <code>itemid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemid() {
		return this.itemid;
	}
	/**
	 * <p>Setter for the field <code>itemid</code>.</p>
	 *
	 * @param itemid a {@link java.lang.String} object.
	 */
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	/**
	 * <p>Getter for the field <code>orgcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgcode() {
		return this.orgcode;
	}
	/**
	 * <p>Setter for the field <code>orgcode</code>.</p>
	 *
	 * @param orgcode a {@link java.lang.String} object.
	 */
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	/**
	 * <p>Getter for the field <code>outorderno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutorderno() {
		return this.outorderno;
	}
	/**
	 * <p>Setter for the field <code>outorderno</code>.</p>
	 *
	 * @param outorderno a {@link java.lang.String} object.
	 */
	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

	/**
	 * <p>Getter for the field <code>uid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUid() {
		return this.uid;
	}
	/**
	 * <p>Setter for the field <code>uid</code>.</p>
	 *
	 * @param uid a {@link java.lang.String} object.
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * <p>Getter for the field <code>verifyid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyid() {
		return this.verifyid;
	}
	/**
	 * <p>Setter for the field <code>verifyid</code>.</p>
	 *
	 * @param verifyid a {@link java.lang.String} object.
	 */
	public void setVerifyid(String verifyid) {
		this.verifyid = verifyid;
	}

	/**
	 * <p>Getter for the field <code>version</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVersion() {
		return this.version;
	}
	/**
	 * <p>Setter for the field <code>version</code>.</p>
	 *
	 * @param version a {@link java.lang.String} object.
	 */
	public void setVersion(String version) {
		this.version = version;
	}

}
