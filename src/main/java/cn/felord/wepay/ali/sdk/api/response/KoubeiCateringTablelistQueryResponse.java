package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.TableInfoResult;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.tablelist.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCateringTablelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6559943647249717596L;

	/** 
	 * 返回tablelistresult列表
	 */
	@ApiField("tableinfo_result")
	private TableInfoResult tableinfoResult;

	/**
	 * <p>Setter for the field <code>tableinfoResult</code>.</p>
	 *
	 * @param tableinfoResult a {@link cn.felord.wepay.ali.sdk.api.domain.TableInfoResult} object.
	 */
	public void setTableinfoResult(TableInfoResult tableinfoResult) {
		this.tableinfoResult = tableinfoResult;
	}
	/**
	 * <p>Getter for the field <code>tableinfoResult</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TableInfoResult} object.
	 */
	public TableInfoResult getTableinfoResult( ) {
		return this.tableinfoResult;
	}

}
