package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险凭证批量创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsMarketingCertificateBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 5666921832525677498L;

	/**
	 * 批量创建凭证请求
	 */
	@ApiListField("ins_create_certificate_requests")
	@ApiField("ins_create_certificate_request")
	private List<InsCreateCertificateRequest> insCreateCertificateRequests;

	/**
	 * <p>Getter for the field <code>insCreateCertificateRequests</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsCreateCertificateRequest> getInsCreateCertificateRequests() {
		return this.insCreateCertificateRequests;
	}
	/**
	 * <p>Setter for the field <code>insCreateCertificateRequests</code>.</p>
	 *
	 * @param insCreateCertificateRequests a {@link java.util.List} object.
	 */
	public void setInsCreateCertificateRequests(List<InsCreateCertificateRequest> insCreateCertificateRequests) {
		this.insCreateCertificateRequests = insCreateCertificateRequests;
	}

}
