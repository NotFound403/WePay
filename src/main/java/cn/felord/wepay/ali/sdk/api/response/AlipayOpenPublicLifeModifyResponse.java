package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.modify response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5874884245576343944L;

	/** 
	 * 修改时间。
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/** 
	 * 生活号id，用于表示此生活号唯一性
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * <p>Setter for the field <code>modifyTime</code>.</p>
	 *
	 * @param modifyTime a {@link java.lang.String} object.
	 */
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * <p>Getter for the field <code>modifyTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModifyTime( ) {
		return this.modifyTime;
	}

	/**
	 * <p>Setter for the field <code>publicId</code>.</p>
	 *
	 * @param publicId a {@link java.lang.String} object.
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	/**
	 * <p>Getter for the field <code>publicId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicId( ) {
		return this.publicId;
	}

}
