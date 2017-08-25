package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 操作广告接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingAdvertisingOperateModel extends AlipayObject {

	private static final long serialVersionUID = 2495497211243786944L;

	/**
	 * 广告ID，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 操作类型，目前包括上线和下线，分别传入：online(ONLINE)和offline(OFFLINE)
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * <p>Getter for the field <code>adId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdId() {
		return this.adId;
	}
	/**
	 * <p>Setter for the field <code>adId</code>.</p>
	 *
	 * @param adId a {@link java.lang.String} object.
	 */
	public void setAdId(String adId) {
		this.adId = adId;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
