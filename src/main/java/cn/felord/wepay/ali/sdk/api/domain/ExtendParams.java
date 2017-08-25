package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExtendParams extends AlipayObject {

	private static final long serialVersionUID = 3298626623726347391L;

	/**
	 * 使用花呗分期要进行的分期数
	 */
	@ApiField("hb_fq_num")
	private String hbFqNum;

	/**
	 * 使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%
	 */
	@ApiField("hb_fq_seller_percent")
	private String hbFqSellerPercent;

	/**
	 * 系统商编号
该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	/**
	 * <p>Getter for the field <code>hbFqNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHbFqNum() {
		return this.hbFqNum;
	}
	/**
	 * <p>Setter for the field <code>hbFqNum</code>.</p>
	 *
	 * @param hbFqNum a {@link java.lang.String} object.
	 */
	public void setHbFqNum(String hbFqNum) {
		this.hbFqNum = hbFqNum;
	}

	/**
	 * <p>Getter for the field <code>hbFqSellerPercent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHbFqSellerPercent() {
		return this.hbFqSellerPercent;
	}
	/**
	 * <p>Setter for the field <code>hbFqSellerPercent</code>.</p>
	 *
	 * @param hbFqSellerPercent a {@link java.lang.String} object.
	 */
	public void setHbFqSellerPercent(String hbFqSellerPercent) {
		this.hbFqSellerPercent = hbFqSellerPercent;
	}

	/**
	 * <p>Getter for the field <code>sysServiceProviderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	/**
	 * <p>Setter for the field <code>sysServiceProviderId</code>.</p>
	 *
	 * @param sysServiceProviderId a {@link java.lang.String} object.
	 */
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
