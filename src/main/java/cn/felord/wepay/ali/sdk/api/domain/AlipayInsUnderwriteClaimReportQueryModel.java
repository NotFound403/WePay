package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 理赔案件信息查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsUnderwriteClaimReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6392318249467745951L;

	/**
	 * 理赔申请报案号，通过理赔申请【alipay.ins.scene.claim.apply】接口的返回字段claim_report_no获取
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * <p>Getter for the field <code>claimReportNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	/**
	 * <p>Setter for the field <code>claimReportNo</code>.</p>
	 *
	 * @param claimReportNo a {@link java.lang.String} object.
	 */
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

}
