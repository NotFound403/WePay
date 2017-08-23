package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 删除手艺人作品信息接口
 *
 * @author auto create
 * @since 1.0, 2017-01-13 16:33:05
 */
public class KoubeiCraftsmanDataWorkDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3788858734599443475L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑手艺人id。是创建手艺人接口koubei.craftsman.data.provider.create返回的craftsman_id，或通过查询手艺人信息接口koubei.craftsman.data.provider查询craftsman_id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 口碑手艺人作品id列表，通过查询手艺人作品信息接口koubei.craftsman.data.work.batchquery获取work_id
	 */
	@ApiListField("work_ids")
	@ApiField("string")
	private List<String> workIds;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	public List<String> getWorkIds() {
		return this.workIds;
	}
	public void setWorkIds(List<String> workIds) {
		this.workIds = workIds;
	}

}