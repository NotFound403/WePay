package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.DiscountDstCampPrizeModel;
import cn.felord.wepay.ali.sdk.api.domain.DstCampRuleModel;
import cn.felord.wepay.ali.sdk.api.domain.DateAreaModel;
import cn.felord.wepay.ali.sdk.api.domain.RandomDiscountDstCampPrizeModel;
import cn.felord.wepay.ali.sdk.api.domain.ReduceDstCampPrizeModel;
import cn.felord.wepay.ali.sdk.api.domain.ReduceToDiscountDstCampPrizeModel;
import cn.felord.wepay.ali.sdk.api.domain.ResetZeroDstCampPrizeModel;
import cn.felord.wepay.ali.sdk.api.domain.SingleDstCampPrizeModel;
import cn.felord.wepay.ali.sdk.api.domain.StagedDiscountDstCampPrizeModel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3663577262496558913L;

	/** 
	 * 活动唯一标示
	 */
	@ApiField("camp_code")
	private String campCode;

	/** 
	 * 用于账户立减优惠,渠道立减优惠活动时,在收银台页面显示给会员看,最多512个字符，汉字、英文字母、数字都算一个，本输入框支持简单的html符号。
	 */
	@ApiField("camp_desc")
	private String campDesc;

	/** 
	 * camp_id:活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/** 
	 * 活动slogan.活动Slogan会在前台显示，谨慎填写
	 */
	@ApiField("camp_slogan")
	private String campSlogan;

	/** 
	 * 活动状态，已经创建，暂停，上线，结束
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 折扣方式模型 如果类型选了discount,则这个模型必须输入
	 */
	@ApiField("discount_dst_camp_prize_model")
	private DiscountDstCampPrizeModel discountDstCampPrizeModel;

	/** 
	 * 立减规则模型
	 */
	@ApiField("dst_camp_rule_model")
	private DstCampRuleModel dstCampRuleModel;

	/** 
	 * 活动子时间，可以不传
	 */
	@ApiListField("dst_camp_sub_time_model_list")
	@ApiField("date_area_model")
	private List<DateAreaModel> dstCampSubTimeModelList;

	/** 
	 * 活动结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/** 
	 * 活动开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/** 
	 * 奖品类型. 打折   满减   单笔减   阶梯优惠   抹零优惠    随机立减   订单金额减至 
    折扣方式
     DISCOUNT("discount", "折扣方式"),
     REDUCE("reduce", "满立减"),
    SINGLE("single", "单笔减"),
     STAGED_DISCOUNT("staged_discount", "阶梯优惠"),
     RESET_ZERO_DISCOUNT("reset_zero_discount", "抹零优惠"),
   RANDOM_DISCOUNT("random", "随机立减");
    REDUCE_TO_DISCOUNT("reduce_to_discount","订单金额减至 ")
	 */
	@ApiField("prize_type")
	private String prizeType;

	/** 
	 * 随机立减模型如果类型选了random,则这个模型必须输入
	 */
	@ApiField("random_discount_dst_camp_prize_model")
	private RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel;

	/** 
	 * 满立减奖品模型 如果类型选了reduce,则这个模型必须输入
	 */
	@ApiField("reduce_dst_camp_prize_model")
	private ReduceDstCampPrizeModel reduceDstCampPrizeModel;

	/** 
	 * 订单金额减至模型如果类型选了reduce_to_discount,则这个模型必须输入
	 */
	@ApiField("reduce_to_discount_dst_camp_prize_model")
	private ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel;

	/** 
	 * 抹零优惠模型如果类型选了reset_zero_discount,则这个模型必须输入
	 */
	@ApiField("reset_zero_dst_camp_prize_model")
	private ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel;

	/** 
	 * 单笔减奖品模型如果类型选了single,则这个模型必须输入
	 */
	@ApiField("single_dst_camp_prize_model")
	private SingleDstCampPrizeModel singleDstCampPrizeModel;

	/** 
	 * 阶梯优惠如果类型选了staged_discount,则这个模型必须输入
	 */
	@ApiField("staged_discount_dst_camp_prize_model")
	private StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel;

	/**
	 * <p>Setter for the field <code>campCode</code>.</p>
	 *
	 * @param campCode a {@link java.lang.String} object.
	 */
	public void setCampCode(String campCode) {
		this.campCode = campCode;
	}
	/**
	 * <p>Getter for the field <code>campCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampCode( ) {
		return this.campCode;
	}

	/**
	 * <p>Setter for the field <code>campDesc</code>.</p>
	 *
	 * @param campDesc a {@link java.lang.String} object.
	 */
	public void setCampDesc(String campDesc) {
		this.campDesc = campDesc;
	}
	/**
	 * <p>Getter for the field <code>campDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampDesc( ) {
		return this.campDesc;
	}

	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}
	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId( ) {
		return this.campId;
	}

	/**
	 * <p>Setter for the field <code>campName</code>.</p>
	 *
	 * @param campName a {@link java.lang.String} object.
	 */
	public void setCampName(String campName) {
		this.campName = campName;
	}
	/**
	 * <p>Getter for the field <code>campName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampName( ) {
		return this.campName;
	}

	/**
	 * <p>Setter for the field <code>campSlogan</code>.</p>
	 *
	 * @param campSlogan a {@link java.lang.String} object.
	 */
	public void setCampSlogan(String campSlogan) {
		this.campSlogan = campSlogan;
	}
	/**
	 * <p>Getter for the field <code>campSlogan</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampSlogan( ) {
		return this.campSlogan;
	}

	/**
	 * <p>Setter for the field <code>campStatus</code>.</p>
	 *
	 * @param campStatus a {@link java.lang.String} object.
	 */
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	/**
	 * <p>Getter for the field <code>campStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampStatus( ) {
		return this.campStatus;
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
	 * <p>Getter for the field <code>discountDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.DiscountDstCampPrizeModel} object.
	 */
	public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel( ) {
		return this.discountDstCampPrizeModel;
	}

	/**
	 * <p>Setter for the field <code>dstCampRuleModel</code>.</p>
	 *
	 * @param dstCampRuleModel a {@link cn.felord.wepay.ali.sdk.api.domain.DstCampRuleModel} object.
	 */
	public void setDstCampRuleModel(DstCampRuleModel dstCampRuleModel) {
		this.dstCampRuleModel = dstCampRuleModel;
	}
	/**
	 * <p>Getter for the field <code>dstCampRuleModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.DstCampRuleModel} object.
	 */
	public DstCampRuleModel getDstCampRuleModel( ) {
		return this.dstCampRuleModel;
	}

	/**
	 * <p>Setter for the field <code>dstCampSubTimeModelList</code>.</p>
	 *
	 * @param dstCampSubTimeModelList a {@link java.util.List} object.
	 */
	public void setDstCampSubTimeModelList(List<DateAreaModel> dstCampSubTimeModelList) {
		this.dstCampSubTimeModelList = dstCampSubTimeModelList;
	}
	/**
	 * <p>Getter for the field <code>dstCampSubTimeModelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DateAreaModel> getDstCampSubTimeModelList( ) {
		return this.dstCampSubTimeModelList;
	}

	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd( ) {
		return this.gmtEnd;
	}

	/**
	 * <p>Setter for the field <code>gmtStart</code>.</p>
	 *
	 * @param gmtStart a {@link java.lang.String} object.
	 */
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}
	/**
	 * <p>Getter for the field <code>gmtStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtStart( ) {
		return this.gmtStart;
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
	 * <p>Getter for the field <code>prizeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeType( ) {
		return this.prizeType;
	}

	/**
	 * <p>Setter for the field <code>randomDiscountDstCampPrizeModel</code>.</p>
	 *
	 * @param randomDiscountDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.RandomDiscountDstCampPrizeModel} object.
	 */
	public void setRandomDiscountDstCampPrizeModel(RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel) {
		this.randomDiscountDstCampPrizeModel = randomDiscountDstCampPrizeModel;
	}
	/**
	 * <p>Getter for the field <code>randomDiscountDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.RandomDiscountDstCampPrizeModel} object.
	 */
	public RandomDiscountDstCampPrizeModel getRandomDiscountDstCampPrizeModel( ) {
		return this.randomDiscountDstCampPrizeModel;
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
	 * <p>Getter for the field <code>reduceDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ReduceDstCampPrizeModel} object.
	 */
	public ReduceDstCampPrizeModel getReduceDstCampPrizeModel( ) {
		return this.reduceDstCampPrizeModel;
	}

	/**
	 * <p>Setter for the field <code>reduceToDiscountDstCampPrizeModel</code>.</p>
	 *
	 * @param reduceToDiscountDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.ReduceToDiscountDstCampPrizeModel} object.
	 */
	public void setReduceToDiscountDstCampPrizeModel(ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel) {
		this.reduceToDiscountDstCampPrizeModel = reduceToDiscountDstCampPrizeModel;
	}
	/**
	 * <p>Getter for the field <code>reduceToDiscountDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ReduceToDiscountDstCampPrizeModel} object.
	 */
	public ReduceToDiscountDstCampPrizeModel getReduceToDiscountDstCampPrizeModel( ) {
		return this.reduceToDiscountDstCampPrizeModel;
	}

	/**
	 * <p>Setter for the field <code>resetZeroDstCampPrizeModel</code>.</p>
	 *
	 * @param resetZeroDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.ResetZeroDstCampPrizeModel} object.
	 */
	public void setResetZeroDstCampPrizeModel(ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel) {
		this.resetZeroDstCampPrizeModel = resetZeroDstCampPrizeModel;
	}
	/**
	 * <p>Getter for the field <code>resetZeroDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ResetZeroDstCampPrizeModel} object.
	 */
	public ResetZeroDstCampPrizeModel getResetZeroDstCampPrizeModel( ) {
		return this.resetZeroDstCampPrizeModel;
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
	 * <p>Getter for the field <code>singleDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.SingleDstCampPrizeModel} object.
	 */
	public SingleDstCampPrizeModel getSingleDstCampPrizeModel( ) {
		return this.singleDstCampPrizeModel;
	}

	/**
	 * <p>Setter for the field <code>stagedDiscountDstCampPrizeModel</code>.</p>
	 *
	 * @param stagedDiscountDstCampPrizeModel a {@link cn.felord.wepay.ali.sdk.api.domain.StagedDiscountDstCampPrizeModel} object.
	 */
	public void setStagedDiscountDstCampPrizeModel(StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel) {
		this.stagedDiscountDstCampPrizeModel = stagedDiscountDstCampPrizeModel;
	}
	/**
	 * <p>Getter for the field <code>stagedDiscountDstCampPrizeModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.StagedDiscountDstCampPrizeModel} object.
	 */
	public StagedDiscountDstCampPrizeModel getStagedDiscountDstCampPrizeModel( ) {
		return this.stagedDiscountDstCampPrizeModel;
	}

}
