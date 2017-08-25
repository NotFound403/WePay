package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险查询用户的精简模型定义
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsQueryPerson extends AlipayObject {

	private static final long serialVersionUID = 1858734429945156315L;

	/**
	 * 证件号码;如果渠道账号字段（channel_user_id）没填则本字段为必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型;如果渠道账号字段没填则必填 （该字段和cert_no为配对字段）
100:居民身份证;102:护照;103:军官证;104:士兵证;105:港澳居民往来内地通行证;106:台湾同胞往来大陆通行证;109:警官证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则本字段为必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源:
1:支付宝账号;
2:淘宝账号;
如果证件类型字段没填则必填。
和channel_user_id 配对
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 保单用户搜索的类型:
1：按照投保人搜索
2：按照受益人搜索 
3：按照被保人搜索
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo() {
		return this.certNo;
	}
	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * <p>Getter for the field <code>certType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertType() {
		return this.certType;
	}
	/**
	 * <p>Setter for the field <code>certType</code>.</p>
	 *
	 * @param certType a {@link java.lang.String} object.
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}

	/**
	 * <p>Getter for the field <code>channelUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelUserId() {
		return this.channelUserId;
	}
	/**
	 * <p>Setter for the field <code>channelUserId</code>.</p>
	 *
	 * @param channelUserId a {@link java.lang.String} object.
	 */
	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

	/**
	 * <p>Getter for the field <code>channelUserSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelUserSource() {
		return this.channelUserSource;
	}
	/**
	 * <p>Setter for the field <code>channelUserSource</code>.</p>
	 *
	 * @param channelUserSource a {@link java.lang.String} object.
	 */
	public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
