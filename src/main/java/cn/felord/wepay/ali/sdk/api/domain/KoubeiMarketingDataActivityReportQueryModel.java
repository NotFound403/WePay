package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑商户营销报表查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataActivityReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6189976336688425974L;

	/**
	 * 查询报表数据的业务日期列表，精确到天，格式为yyyymmdd，支持列表格式，数据按天返回
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * <p>Getter for the field <code>bizDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizDate() {
		return this.bizDate;
	}
	/**
	 * <p>Setter for the field <code>bizDate</code>.</p>
	 *
	 * @param bizDate a {@link java.lang.String} object.
	 */
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
