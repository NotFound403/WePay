package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.DrawndnVo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.drawndnlist.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodDrawndnDrawndnlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5496269559429554778L;

	/** 
	 * 支用列表
	 */
	@ApiListField("drawndn_list")
	@ApiField("drawndn_vo")
	private List<DrawndnVo> drawndnList;

	/** 
	 * 唯一一次请求标示
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Setter for the field <code>drawndnList</code>.</p>
	 *
	 * @param drawndnList a {@link java.util.List} object.
	 */
	public void setDrawndnList(List<DrawndnVo> drawndnList) {
		this.drawndnList = drawndnList;
	}
	/**
	 * <p>Getter for the field <code>drawndnList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DrawndnVo> getDrawndnList( ) {
		return this.drawndnList;
	}

	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId( ) {
		return this.requestId;
	}

}
