package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员报表批量查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataMemberReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8382591498584691528L;

	/**
	 * 查询报表数据的业务日期，精确到天，格式为yyyymmdd，数据按天返回
	 */
	@ApiField("biz_date")
	private String bizDate;

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

}
