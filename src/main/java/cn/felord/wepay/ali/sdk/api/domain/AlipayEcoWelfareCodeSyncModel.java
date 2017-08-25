package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 福利平台用户订单外部核销接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoWelfareCodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1785514137921225219L;

	/**
	 * 支付宝账户USERID，和福利账户ID而选一，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 条码码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 条码可使用超时时间
格式为yyyy-MM-dd HH:mm:ss 
备注：超时时间不允许比启动时间小
	 */
	@ApiField("code_expire_date")
	private String codeExpireDate;

	/**
	 * 条码数量
	 */
	@ApiField("code_num")
	private Long codeNum;

	/**
	 * 条码图片url
	 */
	@ApiField("code_pic_url")
	private String codePicUrl;

	/**
	 * 条码可使用开发时间
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("code_start_date")
	private String codeStartDate;

	/**
	 * 条码状态
CREATE	创建
NOT_USED	没有使用
USED	已经被使用
INVALID	码无效
EXPIRED	码过期
DISABLED	码冻结
NOT_EXIST	码不存在
	 */
	@ApiField("code_status")
	private String codeStatus;

	/**
	 * 条码状态变更时间
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("code_status_date")
	private String codeStatusDate;

	/**
	 * 条码业务类型
商品品类码：goods
用户商品条码：barcode
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 扩展属性
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * ISV代码，唯一确定ISV身份由福利平台分配
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 核销门店详细信息
	 */
	@ApiField("store_info")
	private WelfareEcoStoreInfo storeInfo;

	/**
	 * 同步数据时间 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("sync_date")
	private String syncDate;

	/**
	 * 福利平台订单对应的用户ID，和支付宝用户ID而选一
	 */
	@ApiField("welfare_user_id")
	private String welfareUserId;

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
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>codeExpireDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeExpireDate() {
		return this.codeExpireDate;
	}
	/**
	 * <p>Setter for the field <code>codeExpireDate</code>.</p>
	 *
	 * @param codeExpireDate a {@link java.lang.String} object.
	 */
	public void setCodeExpireDate(String codeExpireDate) {
		this.codeExpireDate = codeExpireDate;
	}

	/**
	 * <p>Getter for the field <code>codeNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCodeNum() {
		return this.codeNum;
	}
	/**
	 * <p>Setter for the field <code>codeNum</code>.</p>
	 *
	 * @param codeNum a {@link java.lang.Long} object.
	 */
	public void setCodeNum(Long codeNum) {
		this.codeNum = codeNum;
	}

	/**
	 * <p>Getter for the field <code>codePicUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodePicUrl() {
		return this.codePicUrl;
	}
	/**
	 * <p>Setter for the field <code>codePicUrl</code>.</p>
	 *
	 * @param codePicUrl a {@link java.lang.String} object.
	 */
	public void setCodePicUrl(String codePicUrl) {
		this.codePicUrl = codePicUrl;
	}

	/**
	 * <p>Getter for the field <code>codeStartDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeStartDate() {
		return this.codeStartDate;
	}
	/**
	 * <p>Setter for the field <code>codeStartDate</code>.</p>
	 *
	 * @param codeStartDate a {@link java.lang.String} object.
	 */
	public void setCodeStartDate(String codeStartDate) {
		this.codeStartDate = codeStartDate;
	}

	/**
	 * <p>Getter for the field <code>codeStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeStatus() {
		return this.codeStatus;
	}
	/**
	 * <p>Setter for the field <code>codeStatus</code>.</p>
	 *
	 * @param codeStatus a {@link java.lang.String} object.
	 */
	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	/**
	 * <p>Getter for the field <code>codeStatusDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeStatusDate() {
		return this.codeStatusDate;
	}
	/**
	 * <p>Setter for the field <code>codeStatusDate</code>.</p>
	 *
	 * @param codeStatusDate a {@link java.lang.String} object.
	 */
	public void setCodeStatusDate(String codeStatusDate) {
		this.codeStatusDate = codeStatusDate;
	}

	/**
	 * <p>Getter for the field <code>codeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeType() {
		return this.codeType;
	}
	/**
	 * <p>Setter for the field <code>codeType</code>.</p>
	 *
	 * @param codeType a {@link java.lang.String} object.
	 */
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendParams() {
		return this.extendParams;
	}
	/**
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link java.lang.String} object.
	 */
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	/**
	 * <p>Getter for the field <code>isvCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvCode() {
		return this.isvCode;
	}
	/**
	 * <p>Setter for the field <code>isvCode</code>.</p>
	 *
	 * @param isvCode a {@link java.lang.String} object.
	 */
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	/**
	 * <p>Getter for the field <code>storeInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.WelfareEcoStoreInfo} object.
	 */
	public WelfareEcoStoreInfo getStoreInfo() {
		return this.storeInfo;
	}
	/**
	 * <p>Setter for the field <code>storeInfo</code>.</p>
	 *
	 * @param storeInfo a {@link cn.felord.wepay.ali.sdk.api.domain.WelfareEcoStoreInfo} object.
	 */
	public void setStoreInfo(WelfareEcoStoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}

	/**
	 * <p>Getter for the field <code>syncDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSyncDate() {
		return this.syncDate;
	}
	/**
	 * <p>Setter for the field <code>syncDate</code>.</p>
	 *
	 * @param syncDate a {@link java.lang.String} object.
	 */
	public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}

	/**
	 * <p>Getter for the field <code>welfareUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWelfareUserId() {
		return this.welfareUserId;
	}
	/**
	 * <p>Setter for the field <code>welfareUserId</code>.</p>
	 *
	 * @param welfareUserId a {@link java.lang.String} object.
	 */
	public void setWelfareUserId(String welfareUserId) {
		this.welfareUserId = welfareUserId;
	}

}
