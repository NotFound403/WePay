package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险理赔案件材料上传确认
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneClaimAttachmentConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5764577328416247689L;

	/**
	 * 理赔申请报案号，通过理赔申请【alipay.ins.scene.claim.apply】接口的返回字段claim_report_no获取
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 上传的文件名清单列表，即alipay.ins.scene.claim.attachment.upload  接口中的attachment_name  用逗号(,)隔离
	 */
	@ApiListField("upload_files")
	@ApiField("string")
	private List<String> uploadFiles;

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

	/**
	 * <p>Getter for the field <code>uploadFiles</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUploadFiles() {
		return this.uploadFiles;
	}
	/**
	 * <p>Setter for the field <code>uploadFiles</code>.</p>
	 *
	 * @param uploadFiles a {@link java.util.List} object.
	 */
	public void setUploadFiles(List<String> uploadFiles) {
		this.uploadFiles = uploadFiles;
	}

}
