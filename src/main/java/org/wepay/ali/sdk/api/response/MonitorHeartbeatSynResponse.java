package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: monitor.heartbeat.syn response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-06 22:21:41
 */
public class MonitorHeartbeatSynResponse extends AlipayResponse {

	private static final long serialVersionUID = 2467778491863639936L;

	/** 
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

}
