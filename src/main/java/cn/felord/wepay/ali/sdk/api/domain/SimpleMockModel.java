package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 简单的mock模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
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

	public Long getCountItems() {
		return this.countItems;
	}
	public void setCountItems(Long countItems) {
		this.countItems = countItems;
	}

	public Date getHappenTime() {
		return this.happenTime;
	}
	public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}

	public String getPriceNum() {
		return this.priceNum;
	}
	public void setPriceNum(String priceNum) {
		this.priceNum = priceNum;
	}

	public Boolean getRight() {
		return this.right;
	}
	public void setRight(Boolean right) {
		this.right = right;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
