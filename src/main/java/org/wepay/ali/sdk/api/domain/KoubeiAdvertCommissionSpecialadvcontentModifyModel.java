package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 特殊广告内容修改接口
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:46
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

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public List<KbAdvertSpecialAdvContentRequest> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<KbAdvertSpecialAdvContentRequest> contentList) {
		this.contentList = contentList;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

}
