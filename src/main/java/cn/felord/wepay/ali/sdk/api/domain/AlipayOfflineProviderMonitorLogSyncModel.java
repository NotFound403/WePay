package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * ISV服务商监控数据回流
 *
 * @author auto create
 * @since 1.0, 2016-09-28 11:33:15
 */
public class AlipayOfflineProviderMonitorLogSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6183983664871829883L;

	/**
	 * 数据回流日志
	 */
	@ApiListField("logs")
	@ApiField("i_s_v_log_sync")
	private List<ISVLogSync> logs;

	public List<ISVLogSync> getLogs() {
		return this.logs;
	}
	public void setLogs(List<ISVLogSync> logs) {
		this.logs = logs;
	}

}
