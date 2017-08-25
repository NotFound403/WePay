package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 更新卡积分
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingToolPointsUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8852369665725245518L;

	/**
	 * 活动集点帐户ID, 开发者通过查询集点活动详情获取
	 */
	@ApiField("activity_account")
	private String activityAccount;

	/**
	 * 业务流水号，集点交易类型为
DEPOSIT, 传入支付交易号;
CANCEL／COMMIT, 传入冻结集点的集点流水号;
CONSUME／FREEZE, 不允许传入biz_no;
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 交易备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部流水号, 由开发者提供, 用于控制业务幂等
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 门店ID，集点交易类型为DEPOSIT时填写
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 集点交易数量，必须为正整数字符串
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 集点交易类型，目前支持:
DEPOSIT，增加集点
FREEZE，冻结集点
COMMIT，提交冻结集点
CANCEL，取消冻结集点
CONSUME, 消费集点
	 */
	@ApiField("trans_type")
	private String transType;

	/**
	 * 用户ID, 开发者通过用户信息授权产品获取
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>activityAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityAccount() {
		return this.activityAccount;
	}
	/**
	 * <p>Setter for the field <code>activityAccount</code>.</p>
	 *
	 * @param activityAccount a {@link java.lang.String} object.
	 */
	public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
	}

	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo() {
		return this.bizNo;
	}
	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
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
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>transAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransAmount() {
		return this.transAmount;
	}
	/**
	 * <p>Setter for the field <code>transAmount</code>.</p>
	 *
	 * @param transAmount a {@link java.lang.String} object.
	 */
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	/**
	 * <p>Getter for the field <code>transType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransType() {
		return this.transType;
	}
	/**
	 * <p>Setter for the field <code>transType</code>.</p>
	 *
	 * @param transType a {@link java.lang.String} object.
	 */
	public void setTransType(String transType) {
		this.transType = transType;
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
