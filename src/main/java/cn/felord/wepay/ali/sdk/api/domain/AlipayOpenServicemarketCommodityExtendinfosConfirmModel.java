package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 服务插件扩展信息补充
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenServicemarketCommodityExtendinfosConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6221487275567658854L;

	/**
	 * 公服BD审核扩展信息
	 */
	@ApiListField("commodity_ext_infos")
	@ApiField("commodity_ext_info_confirm")
	private List<CommodityExtInfoConfirm> commodityExtInfos;

	/**
	 * 服务Id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * status 为驳回时 必须输入驳回原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 公服BD审核结果：成功还是失败:
status 【0：表示不通过 ， 1：表示通过】
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>commodityExtInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CommodityExtInfoConfirm> getCommodityExtInfos() {
		return this.commodityExtInfos;
	}
	/**
	 * <p>Setter for the field <code>commodityExtInfos</code>.</p>
	 *
	 * @param commodityExtInfos a {@link java.util.List} object.
	 */
	public void setCommodityExtInfos(List<CommodityExtInfoConfirm> commodityExtInfos) {
		this.commodityExtInfos = commodityExtInfos;
	}

	/**
	 * <p>Getter for the field <code>commodityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityId() {
		return this.commodityId;
	}
	/**
	 * <p>Setter for the field <code>commodityId</code>.</p>
	 *
	 * @param commodityId a {@link java.lang.String} object.
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
