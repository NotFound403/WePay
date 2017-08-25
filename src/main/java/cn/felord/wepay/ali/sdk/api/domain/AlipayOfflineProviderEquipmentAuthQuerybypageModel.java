package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 解绑查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderEquipmentAuthQuerybypageModel extends AlipayObject {

	private static final long serialVersionUID = 1268837894252818329L;

	/**
	 * 解绑起始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 机具类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 解绑截止时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息，传json格式的字符串，包含operator=操作人；operator_id =操作人ID
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 机具厂商PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 当前页，***注意页数从1开始***
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页容量：最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * <p>Getter for the field <code>beginTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBeginTime() {
		return this.beginTime;
	}
	/**
	 * <p>Setter for the field <code>beginTime</code>.</p>
	 *
	 * @param beginTime a {@link java.lang.String} object.
	 */
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * <p>Getter for the field <code>deviceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceType() {
		return this.deviceType;
	}
	/**
	 * <p>Setter for the field <code>deviceType</code>.</p>
	 *
	 * @param deviceType a {@link java.lang.String} object.
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.lang.String} object.
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
	 * <p>Getter for the field <code>merchantPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantPid() {
		return this.merchantPid;
	}
	/**
	 * <p>Setter for the field <code>merchantPid</code>.</p>
	 *
	 * @param merchantPid a {@link java.lang.String} object.
	 */
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	/**
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNum() {
		return this.pageNum;
	}
	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.String} object.
	 */
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
