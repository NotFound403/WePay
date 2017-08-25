package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 审批任务节点状态API
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppProdmodeTasknodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5795531886686862636L;

	/**
	 * 任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * <p>Getter for the field <code>taskId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaskId() {
		return this.taskId;
	}
	/**
	 * <p>Setter for the field <code>taskId</code>.</p>
	 *
	 * @param taskId a {@link java.lang.String} object.
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
