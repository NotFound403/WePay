package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 到位服务物流信息的扩展字段，包含服务的开始时间和结束时间信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OrderLogisticsExtInfo extends AlipayObject {

	private static final long serialVersionUID = 6743952121844868448L;

	/**
	 * 服务结束时间，格式为yyyy-MM-dd HH:mm（到分）
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 服务开始时间，格式为yyyy-MM-dd HH:mm（到分）
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>gmtStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtStart() {
		return this.gmtStart;
	}
	/**
	 * <p>Setter for the field <code>gmtStart</code>.</p>
	 *
	 * @param gmtStart a {@link java.lang.String} object.
	 */
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

}
