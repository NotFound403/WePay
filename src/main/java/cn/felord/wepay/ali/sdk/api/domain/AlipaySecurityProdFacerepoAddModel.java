package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 人脸1:N服务入库接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFacerepoAddModel extends AlipayObject {

	private static final long serialVersionUID = 1444351486253742636L;

	/**
	 * 商户的业务单据号，用于核对与问题排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 人脸图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("face_str")
	private String faceStr;

	/**
	 * 人脸库分组。每个商户可以使用多个人脸库分组，人脸搜索时会在指定的人脸库分组中搜索
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * <p>Getter for the field <code>bizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizId() {
		return this.bizId;
	}
	/**
	 * <p>Setter for the field <code>bizId</code>.</p>
	 *
	 * @param bizId a {@link java.lang.String} object.
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	/**
	 * <p>Getter for the field <code>faceStr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFaceStr() {
		return this.faceStr;
	}
	/**
	 * <p>Setter for the field <code>faceStr</code>.</p>
	 *
	 * @param faceStr a {@link java.lang.String} object.
	 */
	public void setFaceStr(String faceStr) {
		this.faceStr = faceStr;
	}

	/**
	 * <p>Getter for the field <code>groupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupId() {
		return this.groupId;
	}
	/**
	 * <p>Setter for the field <code>groupId</code>.</p>
	 *
	 * @param groupId a {@link java.lang.String} object.
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
