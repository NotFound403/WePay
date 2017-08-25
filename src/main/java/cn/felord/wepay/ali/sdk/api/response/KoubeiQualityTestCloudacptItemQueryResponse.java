package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.OpenItem;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.item.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiQualityTestCloudacptItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4279565824846698263L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/** 
	 * 批次状态
0，未检测
1，检测中
2，未通过
3，已通过
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 失败单品书列表
	 */
	@ApiListField("fail_list")
	@ApiField("open_item")
	private List<OpenItem> failList;

	/** 
	 * 失败数
	 */
	@ApiField("fail_num")
	private String failNum;

	/** 
	 * 单品列表
	 */
	@ApiListField("item_list")
	@ApiField("open_item")
	private List<OpenItem> itemList;

	/** 
	 * 单品数
	 */
	@ApiField("item_num")
	private String itemNum;

	/** 
	 * 通过单品列表
	 */
	@ApiListField("pass_list")
	@ApiField("open_item")
	private List<OpenItem> passList;

	/** 
	 * 通过数
	 */
	@ApiField("pass_num")
	private String passNum;

	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.String} object.
	 */
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityId( ) {
		return this.activityId;
	}

	/**
	 * <p>Setter for the field <code>batchId</code>.</p>
	 *
	 * @param batchId a {@link java.lang.String} object.
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	/**
	 * <p>Getter for the field <code>batchId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchId( ) {
		return this.batchId;
	}

	/**
	 * <p>Setter for the field <code>batchStatus</code>.</p>
	 *
	 * @param batchStatus a {@link java.lang.String} object.
	 */
	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	/**
	 * <p>Getter for the field <code>batchStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

	/**
	 * <p>Setter for the field <code>failList</code>.</p>
	 *
	 * @param failList a {@link java.util.List} object.
	 */
	public void setFailList(List<OpenItem> failList) {
		this.failList = failList;
	}
	/**
	 * <p>Getter for the field <code>failList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OpenItem> getFailList( ) {
		return this.failList;
	}

	/**
	 * <p>Setter for the field <code>failNum</code>.</p>
	 *
	 * @param failNum a {@link java.lang.String} object.
	 */
	public void setFailNum(String failNum) {
		this.failNum = failNum;
	}
	/**
	 * <p>Getter for the field <code>failNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFailNum( ) {
		return this.failNum;
	}

	/**
	 * <p>Setter for the field <code>itemList</code>.</p>
	 *
	 * @param itemList a {@link java.util.List} object.
	 */
	public void setItemList(List<OpenItem> itemList) {
		this.itemList = itemList;
	}
	/**
	 * <p>Getter for the field <code>itemList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OpenItem> getItemList( ) {
		return this.itemList;
	}

	/**
	 * <p>Setter for the field <code>itemNum</code>.</p>
	 *
	 * @param itemNum a {@link java.lang.String} object.
	 */
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * <p>Getter for the field <code>itemNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemNum( ) {
		return this.itemNum;
	}

	/**
	 * <p>Setter for the field <code>passList</code>.</p>
	 *
	 * @param passList a {@link java.util.List} object.
	 */
	public void setPassList(List<OpenItem> passList) {
		this.passList = passList;
	}
	/**
	 * <p>Getter for the field <code>passList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OpenItem> getPassList( ) {
		return this.passList;
	}

	/**
	 * <p>Setter for the field <code>passNum</code>.</p>
	 *
	 * @param passNum a {@link java.lang.String} object.
	 */
	public void setPassNum(String passNum) {
		this.passNum = passNum;
	}
	/**
	 * <p>Getter for the field <code>passNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassNum( ) {
		return this.passNum;
	}

}
