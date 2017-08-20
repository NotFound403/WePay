package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取汽车金融核身使用的ID
 *
 * @author auto create
 * @since 1.0, 2016-10-17 16:44:36
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

	public String getOrgcode() {
		return this.orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
