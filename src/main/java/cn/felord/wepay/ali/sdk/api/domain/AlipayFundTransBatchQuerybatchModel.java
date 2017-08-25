package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建AA收款、江湖救急、活动收款等，调用此接口获取收款详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundTransBatchQuerybatchModel extends AlipayObject {

	private static final long serialVersionUID = 7641155317527166287L;

	/**
	 * 批次编号，创建批次时返回的批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * token，创建批次时和批次编号一起返回。注：在使用批次号查询批次信息时需要带上
	 */
	@ApiField("token")
	private String token;

	/**
	 * <p>Getter for the field <code>batchNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchNo() {
		return this.batchNo;
	}
	/**
	 * <p>Setter for the field <code>batchNo</code>.</p>
	 *
	 * @param batchNo a {@link java.lang.String} object.
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * <p>Getter for the field <code>token</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken() {
		return this.token;
	}
	/**
	 * <p>Setter for the field <code>token</code>.</p>
	 *
	 * @param token a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
