package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 简单的mock模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SimpleMockModel extends AlipayObject {

	private static final long serialVersionUID = 3376473252172446284L;

	/**
	 * 11
	 */
	@ApiField("count_items")
	private Long countItems;

	/**
	 * 111
	 */
	@ApiField("happen_time")
	private Date happenTime;

	/**
	 * 1.2f
	 */
	@ApiField("price_num")
	private String priceNum;

	/**
	 * false
	 */
	@ApiField("right")
	private Boolean right;

	/**
	 * trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>countItems</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCountItems() {
		return this.countItems;
	}
	/**
	 * <p>Setter for the field <code>countItems</code>.</p>
	 *
	 * @param countItems a {@link java.lang.Long} object.
	 */
	public void setCountItems(Long countItems) {
		this.countItems = countItems;
	}

	/**
	 * <p>Getter for the field <code>happenTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getHappenTime() {
		return this.happenTime;
	}
	/**
	 * <p>Setter for the field <code>happenTime</code>.</p>
	 *
	 * @param happenTime a {@link java.util.Date} object.
	 */
	public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}

	/**
	 * <p>Getter for the field <code>priceNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPriceNum() {
		return this.priceNum;
	}
	/**
	 * <p>Setter for the field <code>priceNum</code>.</p>
	 *
	 * @param priceNum a {@link java.lang.String} object.
	 */
	public void setPriceNum(String priceNum) {
		this.priceNum = priceNum;
	}

	/**
	 * <p>Getter for the field <code>right</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getRight() {
		return this.right;
	}
	/**
	 * <p>Setter for the field <code>right</code>.</p>
	 *
	 * @param right a {@link java.lang.Boolean} object.
	 */
	public void setRight(Boolean right) {
		this.right = right;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
