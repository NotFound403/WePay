package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发券授权
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingToolPrizesendAuthModel extends AlipayObject {

	private static final long serialVersionUID = 5894915935152873973L;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 外部流水号，保证业务幂等性
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 发奖用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>prizeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeId() {
		return this.prizeId;
	}
	/**
	 * <p>Setter for the field <code>prizeId</code>.</p>
	 *
	 * @param prizeId a {@link java.lang.String} object.
	 */
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	/**
	 * <p>Getter for the field <code>reqId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReqId() {
		return this.reqId;
	}
	/**
	 * <p>Setter for the field <code>reqId</code>.</p>
	 *
	 * @param reqId a {@link java.lang.String} object.
	 */
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
