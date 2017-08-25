package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 特殊广告内容修改接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionSpecialadvcontentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6771397924613626842L;

	/**
	 * 广告ID
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道ID（如果修改的是广告的默认主推广的内容，则不传渠道ID；如果修改的是广告的指定投放渠道的内容，则传指定渠道的ID）
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 创建或者删除广告内容的请求参数List
	 */
	@ApiListField("content_list")
	@ApiField("kb_advert_special_adv_content_request")
	private List<KbAdvertSpecialAdvContentRequest> contentList;

	/**
	 * 特殊广告内容的修改枚举类型：
create：表示创建特殊广告内容
delete：表示删除特殊广告内容
	 */
	@ApiField("modify_type")
	private String modifyType;

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
	 * <p>Getter for the field <code>contentList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertSpecialAdvContentRequest> getContentList() {
		return this.contentList;
	}
	/**
	 * <p>Setter for the field <code>contentList</code>.</p>
	 *
	 * @param contentList a {@link java.util.List} object.
	 */
	public void setContentList(List<KbAdvertSpecialAdvContentRequest> contentList) {
		this.contentList = contentList;
	}

	/**
	 * <p>Getter for the field <code>modifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModifyType() {
		return this.modifyType;
	}
	/**
	 * <p>Setter for the field <code>modifyType</code>.</p>
	 *
	 * @param modifyType a {@link java.lang.String} object.
	 */
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

}
