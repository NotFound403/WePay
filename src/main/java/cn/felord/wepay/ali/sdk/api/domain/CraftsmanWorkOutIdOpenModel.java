package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部id和内部id的映射
 *
 * @author auto create
 * @since 1.0, 2017-01-13 16:32:38
 */
public class CraftsmanWorkOutIdOpenModel extends AlipayObject {

	private static final long serialVersionUID = 6238135118767846789L;

	/**
	 * 外部作品id，isv生成，isv的appId+out_work_id全局唯一
	 */
	@ApiField("out_work_id")
	private String outWorkId;

	/**
	 * 支付宝生成的作品id，全局唯一，用于修改删除作品
	 */
	@ApiField("work_id")
	private String workId;

	public String getOutWorkId() {
		return this.outWorkId;
	}
	public void setOutWorkId(String outWorkId) {
		this.outWorkId = outWorkId;
	}

	public String getWorkId() {
		return this.workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}

}
