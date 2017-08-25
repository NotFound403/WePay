package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 支付宝脱机交易
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineTrade extends AlipayObject {

	private static final long serialVersionUID = 4459493244813461832L;

	/**
	 * 交易实际发生时间
	 */
	@ApiField("actual_order_time")
	private Date actualOrderTime;

	/**
	 * 交易金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易扩展信息,json格式字符串。
	 */
	@ApiField("order_biz_context")
	private String orderBizContext;

	/**
	 * 支付宝外部交易号，唯一表示一笔商户支付宝交易。商户必须保证唯一。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 原始脱机操作记录
	 */
	@ApiListField("records")
	@ApiField("string")
	private List<String> records;

	/**
	 * 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_login_name")
	private String sellerLoginName;

	/**
	 * 脱机交易标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>actualOrderTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getActualOrderTime() {
		return this.actualOrderTime;
	}
	/**
	 * <p>Setter for the field <code>actualOrderTime</code>.</p>
	 *
	 * @param actualOrderTime a {@link java.util.Date} object.
	 */
	public void setActualOrderTime(Date actualOrderTime) {
		this.actualOrderTime = actualOrderTime;
	}

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>orderBizContext</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderBizContext() {
		return this.orderBizContext;
	}
	/**
	 * <p>Setter for the field <code>orderBizContext</code>.</p>
	 *
	 * @param orderBizContext a {@link java.lang.String} object.
	 */
	public void setOrderBizContext(String orderBizContext) {
		this.orderBizContext = orderBizContext;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	/**
	 * <p>Getter for the field <code>records</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getRecords() {
		return this.records;
	}
	/**
	 * <p>Setter for the field <code>records</code>.</p>
	 *
	 * @param records a {@link java.util.List} object.
	 */
	public void setRecords(List<String> records) {
		this.records = records;
	}

	/**
	 * <p>Getter for the field <code>sellerLoginName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerLoginName() {
		return this.sellerLoginName;
	}
	/**
	 * <p>Setter for the field <code>sellerLoginName</code>.</p>
	 *
	 * @param sellerLoginName a {@link java.lang.String} object.
	 */
	public void setSellerLoginName(String sellerLoginName) {
		this.sellerLoginName = sellerLoginName;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
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
