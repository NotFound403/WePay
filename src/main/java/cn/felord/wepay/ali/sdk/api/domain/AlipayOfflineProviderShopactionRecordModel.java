package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * isv 回传的商户操作行为信息调用接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderShopactionRecordModel extends AlipayObject {

	private static final long serialVersionUID = 3223483259286823726L;

	/**
	 * 详情设置会根据action_type字段类型不同而格式不同，请详细查看开放平台文案，会详细说明如果设置，整体是json结构。参考文档：https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.u6pJ7Q&treeId=193&articleId=105281&docType=1#s1
	 */
	@ApiField("action_detail")
	private String actionDetail;

	/**
	 * 每次请求的唯一id，需开发者自行保证此参数值每次请求的唯一性。后续可以通过当前唯一id进行问题排查。
	 */
	@ApiField("action_outer_id")
	private String actionOuterId;

	/**
	 * 支持的操作类型

1. insert_table(插入桌位)

2. update_table(更新桌位)

3. insert_dish(插入菜品)

4. delete_dish(删除菜品)

5. soldout_dish(估清菜品)

6. modify_dish(修改菜品)

7. modify_shop_status(店铺状态变更)
每一种操作行为对应的action_detail都不同，action_detail结构都是json串。 
8.insert_one_shop_all_table(批量覆盖单个店铺桌位)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 商户行为发生时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * 参数值固定为shop，代表店铺行为
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 当action_type的参数值是 insert_table、update_table、insert_dish、delete_dish、soldout_dish、modify_dish、insert_dish、insert_one_shop_all_table时，此参数的值固定为：REPAST
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 传入店铺关联关系。标记当前接口涉及到的店铺信息，同时如果传入的数据在口碑不存在，口碑会建立一条shop_id+ outer_id+ type的关联数据
	 */
	@ApiField("outer_shop_do")
	private OuterShopDO outerShopDo;

	/**
	 * <p>Getter for the field <code>actionDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionDetail() {
		return this.actionDetail;
	}
	/**
	 * <p>Setter for the field <code>actionDetail</code>.</p>
	 *
	 * @param actionDetail a {@link java.lang.String} object.
	 */
	public void setActionDetail(String actionDetail) {
		this.actionDetail = actionDetail;
	}

	/**
	 * <p>Getter for the field <code>actionOuterId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionOuterId() {
		return this.actionOuterId;
	}
	/**
	 * <p>Setter for the field <code>actionOuterId</code>.</p>
	 *
	 * @param actionOuterId a {@link java.lang.String} object.
	 */
	public void setActionOuterId(String actionOuterId) {
		this.actionOuterId = actionOuterId;
	}

	/**
	 * <p>Getter for the field <code>actionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionType() {
		return this.actionType;
	}
	/**
	 * <p>Setter for the field <code>actionType</code>.</p>
	 *
	 * @param actionType a {@link java.lang.String} object.
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	/**
	 * <p>Getter for the field <code>dateTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDateTime() {
		return this.dateTime;
	}
	/**
	 * <p>Setter for the field <code>dateTime</code>.</p>
	 *
	 * @param dateTime a {@link java.lang.String} object.
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * <p>Getter for the field <code>entity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntity() {
		return this.entity;
	}
	/**
	 * <p>Setter for the field <code>entity</code>.</p>
	 *
	 * @param entity a {@link java.lang.String} object.
	 */
	public void setEntity(String entity) {
		this.entity = entity;
	}

	/**
	 * <p>Getter for the field <code>industry</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIndustry() {
		return this.industry;
	}
	/**
	 * <p>Setter for the field <code>industry</code>.</p>
	 *
	 * @param industry a {@link java.lang.String} object.
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * <p>Getter for the field <code>outerShopDo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OuterShopDO} object.
	 */
	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	/**
	 * <p>Setter for the field <code>outerShopDo</code>.</p>
	 *
	 * @param outerShopDo a {@link cn.felord.wepay.ali.sdk.api.domain.OuterShopDO} object.
	 */
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

}
