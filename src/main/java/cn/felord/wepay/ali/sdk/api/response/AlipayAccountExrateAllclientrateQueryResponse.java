package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ExClientRateVO;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.allclientrate.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAccountExrateAllclientrateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5286254311124767553L;

	/** 
	 * 汇率信息列表
	 */
	@ApiListField("client_rate_list")
	@ApiField("ex_client_rate_v_o")
	private List<ExClientRateVO> clientRateList;

	/**
	 * <p>Setter for the field <code>clientRateList</code>.</p>
	 *
	 * @param clientRateList a {@link java.util.List} object.
	 */
	public void setClientRateList(List<ExClientRateVO> clientRateList) {
		this.clientRateList = clientRateList;
	}
	/**
	 * <p>Getter for the field <code>clientRateList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ExClientRateVO> getClientRateList( ) {
		return this.clientRateList;
	}

}
