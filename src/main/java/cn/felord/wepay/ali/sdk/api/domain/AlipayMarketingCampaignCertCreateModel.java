package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动凭证创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCertCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2163637168298311465L;

	/**
	 * 凭证批次名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 拓展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 凭证有效次数，数值(最大为10000)
	 */
	@ApiField("valid_count")
	private String validCount;

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
	 * <p>Getter for the field <code>extendInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendInfo() {
		return this.extendInfo;
	}
	/**
	 * <p>Setter for the field <code>extendInfo</code>.</p>
	 *
	 * @param extendInfo a {@link java.lang.String} object.
	 */
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
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
	 * <p>Getter for the field <code>validCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValidCount() {
		return this.validCount;
	}
	/**
	 * <p>Setter for the field <code>validCount</code>.</p>
	 *
	 * @param validCount a {@link java.lang.String} object.
	 */
	public void setValidCount(String validCount) {
		this.validCount = validCount;
	}

}
