package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 人脸1:N服务搜索接口
 *
 * @author auto create
 * @since 1.0, 2016-06-30 08:29:21
 */
public class AlipaySecurityProdFacerepoSearchModel extends AlipayObject {

	private static final long serialVersionUID = 2821647292729957755L;

	/**
	 * 商户的业务单据号，用于核对与问题排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 待搜索的人脸图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("face_str")
	private String faceStr;

	/**
	 * 人脸库分组,在指定的人脸库分组中搜索
	 */
	@ApiField("group_id")
	private String groupId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getFaceStr() {
		return this.faceStr;
	}
	public void setFaceStr(String faceStr) {
		this.faceStr = faceStr;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
