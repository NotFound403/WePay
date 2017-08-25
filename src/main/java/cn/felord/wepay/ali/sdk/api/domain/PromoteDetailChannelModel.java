package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑客商品渠道推广汇总数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PromoteDetailChannelModel extends AlipayObject {

	private static final long serialVersionUID = 3897349985558935556L;

	/**
	 * 渠道id
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 查询时间段内的推广数据
	 */
	@ApiField("part_promote_data")
	private PromoteDataModel partPromoteData;

	/**
	 * 总推广数据
	 */
	@ApiField("total_promote_data")
	private PromoteDataModel totalPromoteData;

	/**
	 * <p>Getter for the field <code>channelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelId() {
		return this.channelId;
	}
	/**
	 * <p>Setter for the field <code>channelId</code>.</p>
	 *
	 * @param channelId a {@link java.lang.String} object.
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * <p>Getter for the field <code>channelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelName() {
		return this.channelName;
	}
	/**
	 * <p>Setter for the field <code>channelName</code>.</p>
	 *
	 * @param channelName a {@link java.lang.String} object.
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	/**
	 * <p>Getter for the field <code>partPromoteData</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public PromoteDataModel getPartPromoteData() {
		return this.partPromoteData;
	}
	/**
	 * <p>Setter for the field <code>partPromoteData</code>.</p>
	 *
	 * @param partPromoteData a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public void setPartPromoteData(PromoteDataModel partPromoteData) {
		this.partPromoteData = partPromoteData;
	}

	/**
	 * <p>Getter for the field <code>totalPromoteData</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public PromoteDataModel getTotalPromoteData() {
		return this.totalPromoteData;
	}
	/**
	 * <p>Setter for the field <code>totalPromoteData</code>.</p>
	 *
	 * @param totalPromoteData a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public void setTotalPromoteData(PromoteDataModel totalPromoteData) {
		this.totalPromoteData = totalPromoteData;
	}

}
