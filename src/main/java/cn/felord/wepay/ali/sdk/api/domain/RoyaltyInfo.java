package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分账信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RoyaltyInfo extends AlipayObject {

	private static final long serialVersionUID = 5311544594284739228L;

	/**
	 * 分账明细的信息，可以描述多条分账指令，json数组。
	 */
	@ApiListField("royalty_detail_infos")
	@ApiField("royalty_detail_infos")
	private List<RoyaltyDetailInfos> royaltyDetailInfos;

	/**
	 * 分账类型
卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）。
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	/**
	 * <p>Getter for the field <code>royaltyDetailInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RoyaltyDetailInfos> getRoyaltyDetailInfos() {
		return this.royaltyDetailInfos;
	}
	/**
	 * <p>Setter for the field <code>royaltyDetailInfos</code>.</p>
	 *
	 * @param royaltyDetailInfos a {@link java.util.List} object.
	 */
	public void setRoyaltyDetailInfos(List<RoyaltyDetailInfos> royaltyDetailInfos) {
		this.royaltyDetailInfos = royaltyDetailInfos;
	}

	/**
	 * <p>Getter for the field <code>royaltyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoyaltyType() {
		return this.royaltyType;
	}
	/**
	 * <p>Setter for the field <code>royaltyType</code>.</p>
	 *
	 * @param royaltyType a {@link java.lang.String} object.
	 */
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

}
