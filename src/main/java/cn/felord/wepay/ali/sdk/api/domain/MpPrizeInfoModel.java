package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销奖品模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MpPrizeInfoModel extends AlipayObject {

	private static final long serialVersionUID = 7574832491316618778L;

	/**
	 * 凭证id，通过alipay.marketing.campaign.cert.create 接口创建的凭证id，开发者可以根据此凭证处理自己的业务逻辑，如给用户发放自定义优惠券等；
	 */
	@ApiField("certlot_number")
	private String certlotNumber;

	/**
	 * 奖品频率对应的次数，最大999999，如frequency_type为‘D’，值为2，则表示每日的奖品最多可领取2次
	 */
	@ApiField("frequency_count")
	private String frequencyCount;

	/**
	 * 奖品中奖频率类型: D，每自然日；W，每自然周（从周一至周日）；M，每自然月
	 */
	@ApiField("frequency_type")
	private String frequencyType;

	/**
	 * 奖品结束时间，yyyy-mm-dd 00:00:00格式，大于奖品开始时间，必须在活动有效期内
	 */
	@ApiField("prize_end_time")
	private String prizeEndTime;

	/**
	 * 奖品id，值由支付宝生成；调用alipay.marketing.campaign.drawcamp.create创建活动时不需要传入； 调用alipay.marketing.campaign.drawcamp.query接口查询时会返回；调用alipay.marketing.campaign.drawcamp.update接口修改活动时，如果不填prize_id,则会用参数新增一个奖品，并覆盖之前的奖品，如开发者想保留或修改当前活动奖品信息，则在修改接口中此参数必传。
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 单个用户当前奖品允许领取的最大次数，最大999999，原则上活动领取次数与奖品领取次数保持一致，特殊情况如：中奖次数每人可中2次，但奖品只能每人领取一个，则中奖次数每人只能一次。该属性不支持修改，修改时透传处理
	 */
	@ApiField("prize_max_award_limit")
	private String prizeMaxAwardLimit;

	/**
	 * 奖品名称，开发者自定义
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品开始时间，yyyy-mm-dd 00:00:00格式，需在活动有效期内，不能晚于奖品结束时间
	 */
	@ApiField("prize_start_time")
	private String prizeStartTime;

	/**
	 * 奖品总数量，数值，最大999999
	 */
	@ApiField("prize_total")
	private String prizeTotal;

	/**
	 * 奖品类型，目前支持CAMP_CERT_PRIZE，凭证奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * <p>Getter for the field <code>certlotNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertlotNumber() {
		return this.certlotNumber;
	}
	/**
	 * <p>Setter for the field <code>certlotNumber</code>.</p>
	 *
	 * @param certlotNumber a {@link java.lang.String} object.
	 */
	public void setCertlotNumber(String certlotNumber) {
		this.certlotNumber = certlotNumber;
	}

	/**
	 * <p>Getter for the field <code>frequencyCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFrequencyCount() {
		return this.frequencyCount;
	}
	/**
	 * <p>Setter for the field <code>frequencyCount</code>.</p>
	 *
	 * @param frequencyCount a {@link java.lang.String} object.
	 */
	public void setFrequencyCount(String frequencyCount) {
		this.frequencyCount = frequencyCount;
	}

	/**
	 * <p>Getter for the field <code>frequencyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFrequencyType() {
		return this.frequencyType;
	}
	/**
	 * <p>Setter for the field <code>frequencyType</code>.</p>
	 *
	 * @param frequencyType a {@link java.lang.String} object.
	 */
	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	/**
	 * <p>Getter for the field <code>prizeEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeEndTime() {
		return this.prizeEndTime;
	}
	/**
	 * <p>Setter for the field <code>prizeEndTime</code>.</p>
	 *
	 * @param prizeEndTime a {@link java.lang.String} object.
	 */
	public void setPrizeEndTime(String prizeEndTime) {
		this.prizeEndTime = prizeEndTime;
	}

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
	 * <p>Getter for the field <code>prizeMaxAwardLimit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeMaxAwardLimit() {
		return this.prizeMaxAwardLimit;
	}
	/**
	 * <p>Setter for the field <code>prizeMaxAwardLimit</code>.</p>
	 *
	 * @param prizeMaxAwardLimit a {@link java.lang.String} object.
	 */
	public void setPrizeMaxAwardLimit(String prizeMaxAwardLimit) {
		this.prizeMaxAwardLimit = prizeMaxAwardLimit;
	}

	/**
	 * <p>Getter for the field <code>prizeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeName() {
		return this.prizeName;
	}
	/**
	 * <p>Setter for the field <code>prizeName</code>.</p>
	 *
	 * @param prizeName a {@link java.lang.String} object.
	 */
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	/**
	 * <p>Getter for the field <code>prizeStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeStartTime() {
		return this.prizeStartTime;
	}
	/**
	 * <p>Setter for the field <code>prizeStartTime</code>.</p>
	 *
	 * @param prizeStartTime a {@link java.lang.String} object.
	 */
	public void setPrizeStartTime(String prizeStartTime) {
		this.prizeStartTime = prizeStartTime;
	}

	/**
	 * <p>Getter for the field <code>prizeTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeTotal() {
		return this.prizeTotal;
	}
	/**
	 * <p>Setter for the field <code>prizeTotal</code>.</p>
	 *
	 * @param prizeTotal a {@link java.lang.String} object.
	 */
	public void setPrizeTotal(String prizeTotal) {
		this.prizeTotal = prizeTotal;
	}

	/**
	 * <p>Getter for the field <code>prizeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeType() {
		return this.prizeType;
	}
	/**
	 * <p>Setter for the field <code>prizeType</code>.</p>
	 *
	 * @param prizeType a {@link java.lang.String} object.
	 */
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
