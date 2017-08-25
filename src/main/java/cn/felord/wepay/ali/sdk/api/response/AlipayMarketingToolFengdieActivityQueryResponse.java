package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.FengdieActivity;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingToolFengdieActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7762498611679337394L;

	/** 
	 * H5应用详情
	 */
	@ApiField("activity")
	private FengdieActivity activity;

	/**
	 * <p>Setter for the field <code>activity</code>.</p>
	 *
	 * @param activity a {@link cn.felord.wepay.ali.sdk.api.domain.FengdieActivity} object.
	 */
	public void setActivity(FengdieActivity activity) {
		this.activity = activity;
	}
	/**
	 * <p>Getter for the field <code>activity</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.FengdieActivity} object.
	 */
	public FengdieActivity getActivity( ) {
		return this.activity;
	}

}
