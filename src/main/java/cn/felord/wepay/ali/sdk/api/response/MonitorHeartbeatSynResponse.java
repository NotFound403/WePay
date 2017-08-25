package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: monitor.heartbeat.syn response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MonitorHeartbeatSynResponse extends AlipayResponse {

	private static final long serialVersionUID = 2467778491863639936L;

	/** 
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid( ) {
		return this.pid;
	}

}
