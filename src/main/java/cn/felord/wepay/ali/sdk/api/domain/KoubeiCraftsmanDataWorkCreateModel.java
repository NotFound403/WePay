package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 手艺人作品发布接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCraftsmanDataWorkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2216976428484861315L;

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
	 * 作品所属门店id列表。可通过批量查询手艺人信息接口koubei.craftsman.data.provider.batchquery，查询手艺人所属的门店的shop_id。
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 作品列表
	 */
	@ApiListField("works")
	@ApiField("craftsman_work_create_open_model")
	private List<CraftsmanWorkCreateOpenModel> works;

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
	 * <p>Getter for the field <code>craftsmanId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	/**
	 * <p>Setter for the field <code>craftsmanId</code>.</p>
	 *
	 * @param craftsmanId a {@link java.lang.String} object.
	 */
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	/**
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopIds() {
		return this.shopIds;
	}
	/**
	 * <p>Setter for the field <code>shopIds</code>.</p>
	 *
	 * @param shopIds a {@link java.util.List} object.
	 */
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	/**
	 * <p>Getter for the field <code>works</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CraftsmanWorkCreateOpenModel> getWorks() {
		return this.works;
	}
	/**
	 * <p>Setter for the field <code>works</code>.</p>
	 *
	 * @param works a {@link java.util.List} object.
	 */
	public void setWorks(List<CraftsmanWorkCreateOpenModel> works) {
		this.works = works;
	}

}
