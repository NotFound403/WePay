package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 间连商户文件上传
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandIndirectAttachmentUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4898117511865647417L;

	/**
	 * 商户附件信息
	 */
	@ApiListField("attachment_info")
	@ApiField("attachment_info")
	private List<AttachmentInfo> attachmentInfo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * <p>Getter for the field <code>attachmentInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AttachmentInfo> getAttachmentInfo() {
		return this.attachmentInfo;
	}
	/**
	 * <p>Setter for the field <code>attachmentInfo</code>.</p>
	 *
	 * @param attachmentInfo a {@link java.util.List} object.
	 */
	public void setAttachmentInfo(List<AttachmentInfo> attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>subMerchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	/**
	 * <p>Setter for the field <code>subMerchantId</code>.</p>
	 *
	 * @param subMerchantId a {@link java.lang.String} object.
	 */
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
