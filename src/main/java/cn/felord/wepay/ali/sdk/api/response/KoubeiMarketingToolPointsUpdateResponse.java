package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingToolPointsUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6755373636979162116L;

	/** 
	 * 集点变更流水号
	 */
	@ApiField("point_log_no")
	private String pointLogNo;

	/**
	 * <p>Setter for the field <code>pointLogNo</code>.</p>
	 *
	 * @param pointLogNo a {@link java.lang.String} object.
	 */
	public void setPointLogNo(String pointLogNo) {
		this.pointLogNo = pointLogNo;
	}
	/**
	 * <p>Getter for the field <code>pointLogNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPointLogNo( ) {
		return this.pointLogNo;
	}

}
