package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facerepo.search response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFacerepoSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4235639348648369141L;

	/** 
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 从入参指定的人脸库分组中搜索出来的相似度最高的人脸id
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
