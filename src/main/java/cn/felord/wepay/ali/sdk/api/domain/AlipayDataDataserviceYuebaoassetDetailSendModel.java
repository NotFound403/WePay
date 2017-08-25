package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 余额宝资产端数据录入
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceYuebaoassetDetailSendModel extends AlipayObject {

	private static final long serialVersionUID = 6267365913183522487L;

	/**
	 * 资产负债报表数据列表
	 */
	@ApiListField("alm_report_data")
	@ApiField("alm_report_data")
	private List<AlmReportData> almReportData;

	/**
	 * <p>Getter for the field <code>almReportData</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlmReportData> getAlmReportData() {
		return this.almReportData;
	}
	/**
	 * <p>Setter for the field <code>almReportData</code>.</p>
	 *
	 * @param almReportData a {@link java.util.List} object.
	 */
	public void setAlmReportData(List<AlmReportData> almReportData) {
		this.almReportData = almReportData;
	}

}
