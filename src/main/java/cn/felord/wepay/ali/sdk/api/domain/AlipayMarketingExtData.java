package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 扫码扩展模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingExtData extends AlipayObject {

	private static final long serialVersionUID = 3865635932536637285L;

	/**
	 * 复杂模型
	 */
	@ApiField("lbs_info")
	private AlipayMarketingIbsInfo lbsInfo;

	/**
	 * 外部uid
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * <p>Getter for the field <code>lbsInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayMarketingIbsInfo} object.
	 */
	public AlipayMarketingIbsInfo getLbsInfo() {
		return this.lbsInfo;
	}
	/**
	 * <p>Setter for the field <code>lbsInfo</code>.</p>
	 *
	 * @param lbsInfo a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayMarketingIbsInfo} object.
	 */
	public void setLbsInfo(AlipayMarketingIbsInfo lbsInfo) {
		this.lbsInfo = lbsInfo;
	}

	/**
	 * <p>Getter for the field <code>outUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutUserId() {
		return this.outUserId;
	}
	/**
	 * <p>Setter for the field <code>outUserId</code>.</p>
	 *
	 * @param outUserId a {@link java.lang.String} object.
	 */
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
