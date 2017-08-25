package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑客商品推广汇总数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PromoteDetailModel extends AlipayObject {

	private static final long serialVersionUID = 4654422327252169319L;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 标的业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型（目前只支持ITEM）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 推广标的商品信息
	 */
	@ApiField("item_info")
	private PromoteItemModel itemInfo;

	/**
	 * 推广数据
	 */
	@ApiField("promote_data")
	private PromoteDataModel promoteData;

	/**
	 * <p>Getter for the field <code>advId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdvId() {
		return this.advId;
	}
	/**
	 * <p>Setter for the field <code>advId</code>.</p>
	 *
	 * @param advId a {@link java.lang.String} object.
	 */
	public void setAdvId(String advId) {
		this.advId = advId;
	}

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
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>itemInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteItemModel} object.
	 */
	public PromoteItemModel getItemInfo() {
		return this.itemInfo;
	}
	/**
	 * <p>Setter for the field <code>itemInfo</code>.</p>
	 *
	 * @param itemInfo a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteItemModel} object.
	 */
	public void setItemInfo(PromoteItemModel itemInfo) {
		this.itemInfo = itemInfo;
	}

	/**
	 * <p>Getter for the field <code>promoteData</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public PromoteDataModel getPromoteData() {
		return this.promoteData;
	}
	/**
	 * <p>Setter for the field <code>promoteData</code>.</p>
	 *
	 * @param promoteData a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public void setPromoteData(PromoteDataModel promoteData) {
		this.promoteData = promoteData;
	}

}
