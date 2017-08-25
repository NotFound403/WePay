package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 手艺人信息批量查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCraftsmanDataProviderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3228535283175642969L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 手艺人id  （如果传入craftsman_ids，会忽略其他参数：注意，不能与shop_id同时为空）
	 */
	@ApiListField("craftsman_ids")
	@ApiField("string")
	private List<String> craftsmanIds;

	/**
	 * 手艺人外部id（如果没有传craftsman_ids，传了craftsman_external_ids，会忽略其他参数，注意，不能与shop_id 同时为空）
	 */
	@ApiListField("out_craftsman_ids")
	@ApiField("string")
	private List<String> outCraftsmanIds;

	/**
	 * 页码，大于0，最大为int的最大值
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页的条数，大于0，最大不超过100条
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 手艺人码对应的门店，只有指定了码门店字段，才会返回手艺人码信息
	 */
	@ApiField("qr_code_shop_id")
	private String qrCodeShopId;

	/**
	 * 是否推荐 (true 返回在c端展示的手艺人，false 返回c端隐藏的手艺人，不传表示不过滤）
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 口碑门店id（不能与craftsman_ids和out_craftsman_ids同时为空）
	 */
	@ApiField("shop_id")
	private String shopId;

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
	 * <p>Getter for the field <code>craftsmanIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCraftsmanIds() {
		return this.craftsmanIds;
	}
	/**
	 * <p>Setter for the field <code>craftsmanIds</code>.</p>
	 *
	 * @param craftsmanIds a {@link java.util.List} object.
	 */
	public void setCraftsmanIds(List<String> craftsmanIds) {
		this.craftsmanIds = craftsmanIds;
	}

	/**
	 * <p>Getter for the field <code>outCraftsmanIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getOutCraftsmanIds() {
		return this.outCraftsmanIds;
	}
	/**
	 * <p>Setter for the field <code>outCraftsmanIds</code>.</p>
	 *
	 * @param outCraftsmanIds a {@link java.util.List} object.
	 */
	public void setOutCraftsmanIds(List<String> outCraftsmanIds) {
		this.outCraftsmanIds = outCraftsmanIds;
	}

	/**
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNo() {
		return this.pageNo;
	}
	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.String} object.
	 */
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * <p>Getter for the field <code>qrCodeShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCodeShopId() {
		return this.qrCodeShopId;
	}
	/**
	 * <p>Setter for the field <code>qrCodeShopId</code>.</p>
	 *
	 * @param qrCodeShopId a {@link java.lang.String} object.
	 */
	public void setQrCodeShopId(String qrCodeShopId) {
		this.qrCodeShopId = qrCodeShopId;
	}

	/**
	 * <p>Getter for the field <code>recommend</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getRecommend() {
		return this.recommend;
	}
	/**
	 * <p>Setter for the field <code>recommend</code>.</p>
	 *
	 * @param recommend a {@link java.lang.Boolean} object.
	 */
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
