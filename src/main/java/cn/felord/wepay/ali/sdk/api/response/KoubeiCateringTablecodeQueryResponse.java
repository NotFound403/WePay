package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.tablecode.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCateringTablecodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4333923252118338244L;

	/** 
	 * 返回值为shop_code表示只返回了门店码 返回值为table_code表示返回了桌码跟门店码
	 */
	@ApiField("code_flag")
	private String codeFlag;

	/** 
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 桌码
	 */
	@ApiField("table_num")
	private String tableNum;

	/**
	 * <p>Setter for the field <code>codeFlag</code>.</p>
	 *
	 * @param codeFlag a {@link java.lang.String} object.
	 */
	public void setCodeFlag(String codeFlag) {
		this.codeFlag = codeFlag;
	}
	/**
	 * <p>Getter for the field <code>codeFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeFlag( ) {
		return this.codeFlag;
	}

	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId( ) {
		return this.shopId;
	}

	/**
	 * <p>Setter for the field <code>tableNum</code>.</p>
	 *
	 * @param tableNum a {@link java.lang.String} object.
	 */
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	/**
	 * <p>Getter for the field <code>tableNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTableNum( ) {
		return this.tableNum;
	}

}
