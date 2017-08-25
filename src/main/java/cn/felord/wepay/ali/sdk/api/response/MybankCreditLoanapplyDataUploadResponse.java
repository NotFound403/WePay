package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.data.upload response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoanapplyDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5326831698422376334L;

	/** 
	 * 数据在网商银行内部系统的唯一ID。由网商银行融资平台的系统生成，返回给外部机构。
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * <p>Setter for the field <code>dataId</code>.</p>
	 *
	 * @param dataId a {@link java.lang.String} object.
	 */
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	/**
	 * <p>Getter for the field <code>dataId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataId( ) {
		return this.dataId;
	}

}
