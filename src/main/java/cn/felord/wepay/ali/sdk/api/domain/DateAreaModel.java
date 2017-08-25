package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 优惠立减活动子时间段模型足戒用
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DateAreaModel extends AlipayObject {

	private static final long serialVersionUID = 7632551387486212731L;

	/**
	 * 开始时间
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * <p>Getter for the field <code>beginDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBeginDate() {
		return this.beginDate;
	}
	/**
	 * <p>Setter for the field <code>beginDate</code>.</p>
	 *
	 * @param beginDate a {@link java.lang.String} object.
	 */
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * <p>Getter for the field <code>endDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndDate() {
		return this.endDate;
	}
	/**
	 * <p>Setter for the field <code>endDate</code>.</p>
	 *
	 * @param endDate a {@link java.lang.String} object.
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
