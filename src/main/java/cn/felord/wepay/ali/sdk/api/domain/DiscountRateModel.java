package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 阶梯优惠折扣幅度模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DiscountRateModel extends AlipayObject {

	private static final long serialVersionUID = 3172192781539593246L;

	/**
	 * 折扣方式
	 */
	@ApiField("discount_dst_camp_prize_model")
	private DiscountDstCampPrizeModel discountDstCampPrizeModel;

	/**
	 * 交易金额下限必须为数字，大于0，最多2位小数，整数部分不能超过8位
	 */
	@ApiField("lower_trade_fee")
	private String lowerTradeFee;

	/**
	 * 奖品类型. 打折   满减   单笔减   阶梯优惠   抹零优惠    随机立减   订单金额减至 
     折扣方式
   REDUCE_TO_AMT("reduce_to_amt","优惠后价格")
   DISCOUNT("discount", "折扣方式"),
  REDUCE("reduce", "满立减"),
   SINGLE("single", "单笔减"),
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 满立减
	 */
	@ApiField("reduce_dst_camp_prize_model")
	private ReduceDstCampPrizeModel reduceDstCampPrizeModel;

	/**
	 * 优惠后价格 如果type选了reduce_to_amt 必填
	 */
	@ApiField("reduce_to_amt_dst_camp_prize_model")
	private ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel;

	/**
	 * 单笔减
	 */
	@ApiField("single_dst_camp_prize_model")
	private SingleDstCampPrizeModel singleDstCampPrizeModel;

	/**
	 * 交易金额上限必须为数字，大于0，最多2位小数，整数部分不能超过8位
	 */
	@ApiField("upper_trade_fee")
	private String upperTradeFee;

	/**
	 * <p>Getter for the field <code>discountDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.DiscountDstCampPrizeModel} object.
	 */
	public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel() {
		return this.discountDstCampPrizeModel;
	}
	/**
	 * <p>Setter for the field <code>discountDstCampPrizeModel</code>.</p>
	 *
	 * @param discountDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.DiscountDstCampPrizeModel} object.
	 */
	public void setDiscountDstCampPrizeModel(DiscountDstCampPrizeModel discountDstCampPrizeModel) {
		this.discountDstCampPrizeModel = discountDstCampPrizeModel;
	}

	/**
	 * <p>Getter for the field <code>lowerTradeFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLowerTradeFee() {
		return this.lowerTradeFee;
	}
	/**
	 * <p>Setter for the field <code>lowerTradeFee</code>.</p>
	 *
	 * @param lowerTradeFee a {@link java.lang.String} object.
	 */
	public void setLowerTradeFee(String lowerTradeFee) {
		this.lowerTradeFee = lowerTradeFee;
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

	/**
	 * <p>Getter for the field <code>reduceDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ReduceDstCampPrizeModel} object.
	 */
	public ReduceDstCampPrizeModel getReduceDstCampPrizeModel() {
		return this.reduceDstCampPrizeModel;
	}
	/**
	 * <p>Setter for the field <code>reduceDstCampPrizeModel</code>.</p>
	 *
	 * @param reduceDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.ReduceDstCampPrizeModel} object.
	 */
	public void setReduceDstCampPrizeModel(ReduceDstCampPrizeModel reduceDstCampPrizeModel) {
		this.reduceDstCampPrizeModel = reduceDstCampPrizeModel;
	}

	/**
	 * <p>Getter for the field <code>reduceToAmtDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ReduceToAmtDstCampPrizeModel} object.
	 */
	public ReduceToAmtDstCampPrizeModel getReduceToAmtDstCampPrizeModel() {
		return this.reduceToAmtDstCampPrizeModel;
	}
	/**
	 * <p>Setter for the field <code>reduceToAmtDstCampPrizeModel</code>.</p>
	 *
	 * @param reduceToAmtDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.ReduceToAmtDstCampPrizeModel} object.
	 */
	public void setReduceToAmtDstCampPrizeModel(ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel) {
		this.reduceToAmtDstCampPrizeModel = reduceToAmtDstCampPrizeModel;
	}

	/**
	 * <p>Getter for the field <code>singleDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.SingleDstCampPrizeModel} object.
	 */
	public SingleDstCampPrizeModel getSingleDstCampPrizeModel() {
		return this.singleDstCampPrizeModel;
	}
	/**
	 * <p>Setter for the field <code>singleDstCampPrizeModel</code>.</p>
	 *
	 * @param singleDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.SingleDstCampPrizeModel} object.
	 */
	public void setSingleDstCampPrizeModel(SingleDstCampPrizeModel singleDstCampPrizeModel) {
		this.singleDstCampPrizeModel = singleDstCampPrizeModel;
	}

	/**
	 * <p>Getter for the field <code>upperTradeFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUpperTradeFee() {
		return this.upperTradeFee;
	}
	/**
	 * <p>Setter for the field <code>upperTradeFee</code>.</p>
	 *
	 * @param upperTradeFee a {@link java.lang.String} object.
	 */
	public void setUpperTradeFee(String upperTradeFee) {
		this.upperTradeFee = upperTradeFee;
	}

}
