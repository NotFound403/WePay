package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 物业社区通知通告详细信息.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CplifeNoticeDetail extends AlipayObject {

	private static final long serialVersionUID = 5522398297938615236L;

	/**
	 * 通告公告的具体内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 通知的下线时间.
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 通知公告中允许出现的图片列表。
	 */
	@ApiListField("image_list")
	@ApiField("cplife_notice_img")
	private List<CplifeNoticeImg> imageList;

	/**
	 * 通知的上线时间，该时刻之后，用户才能在支付宝客户端看到该通知。
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 通知是否置顶，默认为false.
	 */
	@ApiField("stickied")
	private Boolean stickied;

	/**
	 * 通知(公告)的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 通告公告的具体类型.通知：“01” ,公告：“02”
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.util.Date} object.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>imageList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CplifeNoticeImg> getImageList() {
		return this.imageList;
	}
	/**
	 * <p>Setter for the field <code>imageList</code>.</p>
	 *
	 * @param imageList a {@link java.util.List} object.
	 */
	public void setImageList(List<CplifeNoticeImg> imageList) {
		this.imageList = imageList;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>stickied</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getStickied() {
		return this.stickied;
	}
	/**
	 * <p>Setter for the field <code>stickied</code>.</p>
	 *
	 * @param stickied a {@link java.lang.Boolean} object.
	 */
	public void setStickied(Boolean stickied) {
		this.stickied = stickied;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
