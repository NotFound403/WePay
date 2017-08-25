package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 修改手艺人作品信息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCraftsmanDataWorkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6155793184796377124L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 作品标题。不能出现网络敏感词，异步审核，审核不通过会删除作品。不会回调isv
	 */
	@ApiField("title")
	private String title;

	/**
	 * 口碑手艺人作品id，通过查询手艺人作品信息接口koubei.craftsman.data.work.batchquery获取work_id
	 */
	@ApiField("work_id")
	private String workId;

	/**
	 * <p>Getter for the field <code>authCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthCode() {
		return this.authCode;
	}
	/**
	 * <p>Setter for the field <code>authCode</code>.</p>
	 *
	 * @param authCode a {@link java.lang.String} object.
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * <p>Getter for the field <code>workId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWorkId() {
		return this.workId;
	}
	/**
	 * <p>Setter for the field <code>workId</code>.</p>
	 *
	 * @param workId a {@link java.lang.String} object.
	 */
	public void setWorkId(String workId) {
		this.workId = workId;
	}

}
