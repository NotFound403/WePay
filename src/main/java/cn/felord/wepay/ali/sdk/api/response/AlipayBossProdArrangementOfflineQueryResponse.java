package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.arrangement.offline.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayBossProdArrangementOfflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8325792975561516418L;

	/** 
	 * 商户的签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * <p>Setter for the field <code>signStatus</code>.</p>
	 *
	 * @param signStatus a {@link java.lang.String} object.
	 */
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	/**
	 * <p>Getter for the field <code>signStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
