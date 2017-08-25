package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 彩票赠送订单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LotteryPresent extends AlipayObject {

	private static final long serialVersionUID = 5155396389723389129L;

	/**
	 * 用户的支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 彩种名称
	 */
	@ApiField("lottery_type_name")
	private String lotteryTypeName;

	/**
	 * 赠送时间，格式yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("present_date")
	private String presentDate;

	/**
	 * 订单ID
	 */
	@ApiField("present_id")
	private Long presentId;

	/**
	 * 彩票注数
	 */
	@ApiField("stake_count")
	private Long stakeCount;

	/**
	 * 订单状态，含义如下：0-卖家资金未冻结;1-买家未领取;2-买家己领取;3-己创建彩票订单;4-彩票订单出票成功;5-资金己转交代理商;6-订单己过期，待退款;7-冻结资金己退款;8-订单取消。
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 订单状态描述，参见status描述。
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 赠言，不超过20个汉字
	 */
	@ApiField("sweety_words")
	private String sweetyWords;

	/**
	 * 中奖金额，单位：分，为0表示未中奖
	 */
	@ApiField("win_fee")
	private Long winFee;

	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	/**
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	/**
	 * <p>Getter for the field <code>lotteryTypeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLotteryTypeName() {
		return this.lotteryTypeName;
	}
	/**
	 * <p>Setter for the field <code>lotteryTypeName</code>.</p>
	 *
	 * @param lotteryTypeName a {@link java.lang.String} object.
	 */
	public void setLotteryTypeName(String lotteryTypeName) {
		this.lotteryTypeName = lotteryTypeName;
	}

	/**
	 * <p>Getter for the field <code>presentDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPresentDate() {
		return this.presentDate;
	}
	/**
	 * <p>Setter for the field <code>presentDate</code>.</p>
	 *
	 * @param presentDate a {@link java.lang.String} object.
	 */
	public void setPresentDate(String presentDate) {
		this.presentDate = presentDate;
	}

	/**
	 * <p>Getter for the field <code>presentId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPresentId() {
		return this.presentId;
	}
	/**
	 * <p>Setter for the field <code>presentId</code>.</p>
	 *
	 * @param presentId a {@link java.lang.Long} object.
	 */
	public void setPresentId(Long presentId) {
		this.presentId = presentId;
	}

	/**
	 * <p>Getter for the field <code>stakeCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getStakeCount() {
		return this.stakeCount;
	}
	/**
	 * <p>Setter for the field <code>stakeCount</code>.</p>
	 *
	 * @param stakeCount a {@link java.lang.Long} object.
	 */
	public void setStakeCount(Long stakeCount) {
		this.stakeCount = stakeCount;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.Long} object.
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>statusDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatusDesc() {
		return this.statusDesc;
	}
	/**
	 * <p>Setter for the field <code>statusDesc</code>.</p>
	 *
	 * @param statusDesc a {@link java.lang.String} object.
	 */
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	/**
	 * <p>Getter for the field <code>sweetyWords</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSweetyWords() {
		return this.sweetyWords;
	}
	/**
	 * <p>Setter for the field <code>sweetyWords</code>.</p>
	 *
	 * @param sweetyWords a {@link java.lang.String} object.
	 */
	public void setSweetyWords(String sweetyWords) {
		this.sweetyWords = sweetyWords;
	}

	/**
	 * <p>Getter for the field <code>winFee</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getWinFee() {
		return this.winFee;
	}
	/**
	 * <p>Setter for the field <code>winFee</code>.</p>
	 *
	 * @param winFee a {@link java.lang.Long} object.
	 */
	public void setWinFee(Long winFee) {
		this.winFee = winFee;
	}

}
