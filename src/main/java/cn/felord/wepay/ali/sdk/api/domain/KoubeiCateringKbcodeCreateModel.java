package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑码创建接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCateringKbcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8294338416113282743L;

	/**
	 * 口碑码绑定的门店或者桌号信息列表
	 */
	@ApiListField("bind_info_list")
	@ApiField("kb_code_bind_info_v_o")
	private List<KbCodeBindInfoVO> bindInfoList;

	/**
	 * 请求流水ID，用于幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 物料模板（可以不填，系统会根据码类型默认一个模板）
	 */
	@ApiField("stuff_template")
	private String stuffTemplate;

	/**
	 * 生成码的类型（桌码：TABLE_PASTER，门店码：DOOR_PASTER）
	 */
	@ApiField("stuff_type")
	private String stuffType;

	/**
	 * <p>Getter for the field <code>bindInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbCodeBindInfoVO> getBindInfoList() {
		return this.bindInfoList;
	}
	/**
	 * <p>Setter for the field <code>bindInfoList</code>.</p>
	 *
	 * @param bindInfoList a {@link java.util.List} object.
	 */
	public void setBindInfoList(List<KbCodeBindInfoVO> bindInfoList) {
		this.bindInfoList = bindInfoList;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * <p>Getter for the field <code>stuffTemplate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStuffTemplate() {
		return this.stuffTemplate;
	}
	/**
	 * <p>Setter for the field <code>stuffTemplate</code>.</p>
	 *
	 * @param stuffTemplate a {@link java.lang.String} object.
	 */
	public void setStuffTemplate(String stuffTemplate) {
		this.stuffTemplate = stuffTemplate;
	}

	/**
	 * <p>Getter for the field <code>stuffType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStuffType() {
		return this.stuffType;
	}
	/**
	 * <p>Setter for the field <code>stuffType</code>.</p>
	 *
	 * @param stuffType a {@link java.lang.String} object.
	 */
	public void setStuffType(String stuffType) {
		this.stuffType = stuffType;
	}

}
