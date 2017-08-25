package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingToolPointsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8378187381356373351L;

	/** 
	 * 可用集点
	 */
	@ApiField("available_points")
	private String availablePoints;

	/** 
	 * 冻结集点
	 */
	@ApiField("freezed_points")
	private String freezedPoints;

	/** 
	 * 累计集点
	 */
	@ApiField("total_points")
	private String totalPoints;

	/**
	 * <p>Setter for the field <code>availablePoints</code>.</p>
	 *
	 * @param availablePoints a {@link java.lang.String} object.
	 */
	public void setAvailablePoints(String availablePoints) {
		this.availablePoints = availablePoints;
	}
	/**
	 * <p>Getter for the field <code>availablePoints</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvailablePoints( ) {
		return this.availablePoints;
	}

	/**
	 * <p>Setter for the field <code>freezedPoints</code>.</p>
	 *
	 * @param freezedPoints a {@link java.lang.String} object.
	 */
	public void setFreezedPoints(String freezedPoints) {
		this.freezedPoints = freezedPoints;
	}
	/**
	 * <p>Getter for the field <code>freezedPoints</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFreezedPoints( ) {
		return this.freezedPoints;
	}

	/**
	 * <p>Setter for the field <code>totalPoints</code>.</p>
	 *
	 * @param totalPoints a {@link java.lang.String} object.
	 */
	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}
	/**
	 * <p>Getter for the field <code>totalPoints</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalPoints( ) {
		return this.totalPoints;
	}

}
