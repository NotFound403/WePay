package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.data.put response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 3584427939968423959L;

	/** 
	 * 数据版本
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * <p>Setter for the field <code>dataVersion</code>.</p>
	 *
	 * @param dataVersion a {@link java.lang.String} object.
	 */
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}
	/**
	 * <p>Getter for the field <code>dataVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataVersion( ) {
		return this.dataVersion;
	}

}
