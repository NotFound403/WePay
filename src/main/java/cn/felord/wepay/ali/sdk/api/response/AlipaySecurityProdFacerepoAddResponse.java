package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facerepo.add response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFacerepoAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5719884461547852261L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 对此次插入人脸库分组的人脸id标识
	 */
	@ApiField("face_id")
	private String faceId;

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
	 * <p>Setter for the field <code>faceId</code>.</p>
	 *
	 * @param faceId a {@link java.lang.String} object.
	 */
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}
	/**
	 * <p>Getter for the field <code>faceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFaceId( ) {
		return this.faceId;
	}

}
