package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取汽车金融核身使用的ID
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCreditAutofinanceVidGetModel extends AlipayObject {

	private static final long serialVersionUID = 1631861811377696841L;

	/**
	 * 机构编号
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 支付宝账号数字ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 当前安装的支付宝钱包版本号
	 */
	@ApiField("version")
	private String version;

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
