package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 推荐菜数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ItemDiagnoseDetail extends AlipayObject {

	private static final long serialVersionUID = 3652773737756623655L;

	/**
	 * 菜品的热度等级	菜品热度等级（0/0.5/1/1.5/2/2.5/3/3.5/4/4.5/5）该字段是对热度值做离散化，方便用户用图像化表达热度
	 */
	@ApiField("hot_grade")
	private Long hotGrade;

	/**
	 * 菜品的热度值	保留两位小数，热度值在0~100分之间
	 */
	@ApiField("hot_value")
	private Long hotValue;

	/**
	 * 菜品诊断：001-明星菜品；002潜力菜品；003其他菜品。
	 */
	@ApiField("item_diagnose")
	private String itemDiagnose;

	/**
	 * 诊断描述  明星菜品：销量和复购多指标表现强劲，可力推该菜品；潜力菜品：高复购销量适中，可适当增加此类菜品推荐；其他菜品：除明星菜品和潜力菜品外的其他菜品。
	 */
	@ApiField("item_diagnose_desc")
	private String itemDiagnoseDesc;

	/**
	 * 外部商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 菜品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单位分
	 */
	@ApiField("item_price")
	private Long itemPrice;

	/**
	 * 近90天消费的支付宝用户数
	 */
	@ApiField("rec_ninety_consume_uid_cnt")
	private Long recNinetyConsumeUidCnt;

	/**
	 * 近90天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_ninety_rebuy_uid_cnt")
	private Long recNinetyRebuyUidCnt;

	/**
	 * 近7天的销售金额
	 */
	@ApiField("rec_seven_sale_amt")
	private Long recSevenSaleAmt;

	/**
	 * 近7天销售个数
	 */
	@ApiField("rec_seven_sale_cnt")
	private Long recSevenSaleCnt;

	/**
	 * 近60天消费的支付
	 */
	@ApiField("rec_sixty_consume_uid_cnt")
	private Long recSixtyConsumeUidCnt;

	/**
	 * 近60天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_sixty_rebuy_uid_cnt")
	private Long recSixtyRebuyUidCnt;

	/**
	 * 近30天消费的支付宝用户数
	 */
	@ApiField("rec_thirty_consume_uid_cnt")
	private String recThirtyConsumeUidCnt;

	/**
	 * 近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("rec_thirty_rebuy_uid_cnt")
	private Long recThirtyRebuyUidCnt;

	/**
	 * 近30天销售金额，单位分
	 */
	@ApiField("rec_thirty_sale_amt")
	private Long recThirtySaleAmt;

	/**
	 * 近30天销售个数
	 */
	@ApiField("rec_thirty_sale_cnt")
	private Long recThirtySaleCnt;

	/**
	 * 报表数据生成日期 yyyyMMdd格式	保留最近30天数据
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * <p>Getter for the field <code>hotGrade</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getHotGrade() {
		return this.hotGrade;
	}
	/**
	 * <p>Setter for the field <code>hotGrade</code>.</p>
	 *
	 * @param hotGrade a {@link java.lang.Long} object.
	 */
	public void setHotGrade(Long hotGrade) {
		this.hotGrade = hotGrade;
	}

	/**
	 * <p>Getter for the field <code>hotValue</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getHotValue() {
		return this.hotValue;
	}
	/**
	 * <p>Setter for the field <code>hotValue</code>.</p>
	 *
	 * @param hotValue a {@link java.lang.Long} object.
	 */
	public void setHotValue(Long hotValue) {
		this.hotValue = hotValue;
	}

	/**
	 * <p>Getter for the field <code>itemDiagnose</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemDiagnose() {
		return this.itemDiagnose;
	}
	/**
	 * <p>Setter for the field <code>itemDiagnose</code>.</p>
	 *
	 * @param itemDiagnose a {@link java.lang.String} object.
	 */
	public void setItemDiagnose(String itemDiagnose) {
		this.itemDiagnose = itemDiagnose;
	}

	/**
	 * <p>Getter for the field <code>itemDiagnoseDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemDiagnoseDesc() {
		return this.itemDiagnoseDesc;
	}
	/**
	 * <p>Setter for the field <code>itemDiagnoseDesc</code>.</p>
	 *
	 * @param itemDiagnoseDesc a {@link java.lang.String} object.
	 */
	public void setItemDiagnoseDesc(String itemDiagnoseDesc) {
		this.itemDiagnoseDesc = itemDiagnoseDesc;
	}

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * <p>Getter for the field <code>itemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemName() {
		return this.itemName;
	}
	/**
	 * <p>Setter for the field <code>itemName</code>.</p>
	 *
	 * @param itemName a {@link java.lang.String} object.
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * <p>Getter for the field <code>itemPrice</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getItemPrice() {
		return this.itemPrice;
	}
	/**
	 * <p>Setter for the field <code>itemPrice</code>.</p>
	 *
	 * @param itemPrice a {@link java.lang.Long} object.
	 */
	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * <p>Getter for the field <code>recNinetyConsumeUidCnt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecNinetyConsumeUidCnt() {
		return this.recNinetyConsumeUidCnt;
	}
	/**
	 * <p>Setter for the field <code>recNinetyConsumeUidCnt</code>.</p>
	 *
	 * @param recNinetyConsumeUidCnt a {@link java.lang.Long} object.
	 */
	public void setRecNinetyConsumeUidCnt(Long recNinetyConsumeUidCnt) {
		this.recNinetyConsumeUidCnt = recNinetyConsumeUidCnt;
	}

	/**
	 * <p>Getter for the field <code>recNinetyRebuyUidCnt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecNinetyRebuyUidCnt() {
		return this.recNinetyRebuyUidCnt;
	}
	/**
	 * <p>Setter for the field <code>recNinetyRebuyUidCnt</code>.</p>
	 *
	 * @param recNinetyRebuyUidCnt a {@link java.lang.Long} object.
	 */
	public void setRecNinetyRebuyUidCnt(Long recNinetyRebuyUidCnt) {
		this.recNinetyRebuyUidCnt = recNinetyRebuyUidCnt;
	}

	/**
	 * <p>Getter for the field <code>recSevenSaleAmt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecSevenSaleAmt() {
		return this.recSevenSaleAmt;
	}
	/**
	 * <p>Setter for the field <code>recSevenSaleAmt</code>.</p>
	 *
	 * @param recSevenSaleAmt a {@link java.lang.Long} object.
	 */
	public void setRecSevenSaleAmt(Long recSevenSaleAmt) {
		this.recSevenSaleAmt = recSevenSaleAmt;
	}

	/**
	 * <p>Getter for the field <code>recSevenSaleCnt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecSevenSaleCnt() {
		return this.recSevenSaleCnt;
	}
	/**
	 * <p>Setter for the field <code>recSevenSaleCnt</code>.</p>
	 *
	 * @param recSevenSaleCnt a {@link java.lang.Long} object.
	 */
	public void setRecSevenSaleCnt(Long recSevenSaleCnt) {
		this.recSevenSaleCnt = recSevenSaleCnt;
	}

	/**
	 * <p>Getter for the field <code>recSixtyConsumeUidCnt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecSixtyConsumeUidCnt() {
		return this.recSixtyConsumeUidCnt;
	}
	/**
	 * <p>Setter for the field <code>recSixtyConsumeUidCnt</code>.</p>
	 *
	 * @param recSixtyConsumeUidCnt a {@link java.lang.Long} object.
	 */
	public void setRecSixtyConsumeUidCnt(Long recSixtyConsumeUidCnt) {
		this.recSixtyConsumeUidCnt = recSixtyConsumeUidCnt;
	}

	/**
	 * <p>Getter for the field <code>recSixtyRebuyUidCnt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecSixtyRebuyUidCnt() {
		return this.recSixtyRebuyUidCnt;
	}
	/**
	 * <p>Setter for the field <code>recSixtyRebuyUidCnt</code>.</p>
	 *
	 * @param recSixtyRebuyUidCnt a {@link java.lang.Long} object.
	 */
	public void setRecSixtyRebuyUidCnt(Long recSixtyRebuyUidCnt) {
		this.recSixtyRebuyUidCnt = recSixtyRebuyUidCnt;
	}

	/**
	 * <p>Getter for the field <code>recThirtyConsumeUidCnt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecThirtyConsumeUidCnt() {
		return this.recThirtyConsumeUidCnt;
	}
	/**
	 * <p>Setter for the field <code>recThirtyConsumeUidCnt</code>.</p>
	 *
	 * @param recThirtyConsumeUidCnt a {@link java.lang.String} object.
	 */
	public void setRecThirtyConsumeUidCnt(String recThirtyConsumeUidCnt) {
		this.recThirtyConsumeUidCnt = recThirtyConsumeUidCnt;
	}

	/**
	 * <p>Getter for the field <code>recThirtyRebuyUidCnt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecThirtyRebuyUidCnt() {
		return this.recThirtyRebuyUidCnt;
	}
	/**
	 * <p>Setter for the field <code>recThirtyRebuyUidCnt</code>.</p>
	 *
	 * @param recThirtyRebuyUidCnt a {@link java.lang.Long} object.
	 */
	public void setRecThirtyRebuyUidCnt(Long recThirtyRebuyUidCnt) {
		this.recThirtyRebuyUidCnt = recThirtyRebuyUidCnt;
	}

	/**
	 * <p>Getter for the field <code>recThirtySaleAmt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecThirtySaleAmt() {
		return this.recThirtySaleAmt;
	}
	/**
	 * <p>Setter for the field <code>recThirtySaleAmt</code>.</p>
	 *
	 * @param recThirtySaleAmt a {@link java.lang.Long} object.
	 */
	public void setRecThirtySaleAmt(Long recThirtySaleAmt) {
		this.recThirtySaleAmt = recThirtySaleAmt;
	}

	/**
	 * <p>Getter for the field <code>recThirtySaleCnt</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecThirtySaleCnt() {
		return this.recThirtySaleCnt;
	}
	/**
	 * <p>Setter for the field <code>recThirtySaleCnt</code>.</p>
	 *
	 * @param recThirtySaleCnt a {@link java.lang.Long} object.
	 */
	public void setRecThirtySaleCnt(Long recThirtySaleCnt) {
		this.recThirtySaleCnt = recThirtySaleCnt;
	}

	/**
	 * <p>Getter for the field <code>reportDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReportDate() {
		return this.reportDate;
	}
	/**
	 * <p>Setter for the field <code>reportDate</code>.</p>
	 *
	 * @param reportDate a {@link java.lang.String} object.
	 */
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
