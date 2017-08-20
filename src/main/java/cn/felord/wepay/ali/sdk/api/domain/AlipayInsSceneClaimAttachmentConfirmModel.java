package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险理赔案件材料上传确认
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:40
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

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public List<String> getUploadFiles() {
		return this.uploadFiles;
	}
	public void setUploadFiles(List<String> uploadFiles) {
		this.uploadFiles = uploadFiles;
	}

}
