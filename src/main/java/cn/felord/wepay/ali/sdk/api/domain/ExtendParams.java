package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2017-06-06 18:11:24
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

	public String getHbFqNum() {
		return this.hbFqNum;
	}
	public void setHbFqNum(String hbFqNum) {
		this.hbFqNum = hbFqNum;
	}

	public String getHbFqSellerPercent() {
		return this.hbFqSellerPercent;
	}
	public void setHbFqSellerPercent(String hbFqSellerPercent) {
		this.hbFqSellerPercent = hbFqSellerPercent;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
