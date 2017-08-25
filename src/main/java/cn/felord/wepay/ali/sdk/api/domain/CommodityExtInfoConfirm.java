package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务插件扩展信息BD审核结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CommodityExtInfoConfirm extends AlipayObject {

	private static final long serialVersionUID = 2846951438533349694L;

	/**
	 * 城市上架结果 【 0：表示失败，  1：表示成功】
	 */
	@ApiField("city_status")
	private String cityStatus;

	/**
	 * 挂载ID，用于确认唯一记录的主键对象
	 */
	@ApiField("displayapp_id")
	private String displayappId;

	/**
	 * 修改城市记录映射对应的原有的挂载id,如果原有服务没有上架城市，该参数为空
	 */
	@ApiField("mapping_displayapp_id")
	private String mappingDisplayappId;

	/**
	 * 城市上架失败原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * <p>Getter for the field <code>cityStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityStatus() {
		return this.cityStatus;
	}
	/**
	 * <p>Setter for the field <code>cityStatus</code>.</p>
	 *
	 * @param cityStatus a {@link java.lang.String} object.
	 */
	public void setCityStatus(String cityStatus) {
		this.cityStatus = cityStatus;
	}

	/**
	 * <p>Getter for the field <code>displayappId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayappId() {
		return this.displayappId;
	}
	/**
	 * <p>Setter for the field <code>displayappId</code>.</p>
	 *
	 * @param displayappId a {@link java.lang.String} object.
	 */
	public void setDisplayappId(String displayappId) {
		this.displayappId = displayappId;
	}

	/**
	 * <p>Getter for the field <code>mappingDisplayappId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMappingDisplayappId() {
		return this.mappingDisplayappId;
	}
	/**
	 * <p>Setter for the field <code>mappingDisplayappId</code>.</p>
	 *
	 * @param mappingDisplayappId a {@link java.lang.String} object.
	 */
	public void setMappingDisplayappId(String mappingDisplayappId) {
		this.mappingDisplayappId = mappingDisplayappId;
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

}
