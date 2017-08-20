package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.modify response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-15 17:39:52
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

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifyTime( ) {
		return this.modifyTime;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId( ) {
		return this.publicId;
	}

}
