package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.oauth.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMemberDataOauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7823468629875777577L;

	/** 
	 * 扩展信息, 目前保留未用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/** 
	 * 商户id
	 */
	@ApiField("operator_partner_id")
	private String operatorPartnerId;

	/** 
	 * 操作人身份，PROVIDER:服务商,PROVIDER_STAFF:服务商员工,MER:商户,MER_STAFF:商户员工,SALES:阿里销售小二
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo( ) {
		return this.extInfo;
	}

	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId( ) {
		return this.operatorId;
	}

	/**
	 * <p>Setter for the field <code>operatorPartnerId</code>.</p>
	 *
	 * @param operatorPartnerId a {@link java.lang.String} object.
	 */
	public void setOperatorPartnerId(String operatorPartnerId) {
		this.operatorPartnerId = operatorPartnerId;
	}
	/**
	 * <p>Getter for the field <code>operatorPartnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorPartnerId( ) {
		return this.operatorPartnerId;
	}

	/**
	 * <p>Setter for the field <code>operatorType</code>.</p>
	 *
	 * @param operatorType a {@link java.lang.String} object.
	 */
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	/**
	 * <p>Getter for the field <code>operatorType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorType( ) {
		return this.operatorType;
	}

}
