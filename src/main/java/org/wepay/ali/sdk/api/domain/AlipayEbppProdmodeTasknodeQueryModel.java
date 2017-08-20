package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 审批任务节点状态API
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:17:03
 */
public class AlipayEbppProdmodeTasknodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5795531886686862636L;

	/**
	 * 任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
