package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝吱口令发放接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingSharetokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4466459436951444244L;

	/**
	 * 业务标识，类似于业务主键，诸如pid、uid、门店id
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/**
	 * 吱口令的业务类型，新增业务请联系吱口令PD和开发分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 展示在吱口令解码面板上的左下方按钮，一般用作取消操作
	 */
	@ApiField("btn_left")
	private String btnLeft;

	/**
	 * 吱口令解码面板上左下方按钮的连接。一般不建议传值，默认行为是关闭吱口令面板
	 */
	@ApiField("btn_left_href")
	private String btnLeftHref;

	/**
	 * 吱口令解码面板上的右下方按钮文案
	 */
	@ApiField("btn_right")
	private String btnRight;

	/**
	 * 吱口令解码面板上右下方按钮的链接、一般是活动页面或业务跳转地址
	 */
	@ApiField("btn_right_href")
	private String btnRightHref;

	/**
	 * 展示在吱口令解码的面板上的描述文案
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 展示在吱口令解码面板上的图标。建议传入cdn的地址。
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 启用时间，如果为空，则默认给接口调用时候系统的当前时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 吱口令的有效期
	 */
	@ApiField("timeout")
	private Long timeout;

	/**
	 * 展示在吱口令解码的面板上的标题字段
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>bizLinkedId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizLinkedId() {
		return this.bizLinkedId;
	}
	/**
	 * <p>Setter for the field <code>bizLinkedId</code>.</p>
	 *
	 * @param bizLinkedId a {@link java.lang.String} object.
	 */
	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
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
	 * <p>Getter for the field <code>btnLeft</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBtnLeft() {
		return this.btnLeft;
	}
	/**
	 * <p>Setter for the field <code>btnLeft</code>.</p>
	 *
	 * @param btnLeft a {@link java.lang.String} object.
	 */
	public void setBtnLeft(String btnLeft) {
		this.btnLeft = btnLeft;
	}

	/**
	 * <p>Getter for the field <code>btnLeftHref</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBtnLeftHref() {
		return this.btnLeftHref;
	}
	/**
	 * <p>Setter for the field <code>btnLeftHref</code>.</p>
	 *
	 * @param btnLeftHref a {@link java.lang.String} object.
	 */
	public void setBtnLeftHref(String btnLeftHref) {
		this.btnLeftHref = btnLeftHref;
	}

	/**
	 * <p>Getter for the field <code>btnRight</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBtnRight() {
		return this.btnRight;
	}
	/**
	 * <p>Setter for the field <code>btnRight</code>.</p>
	 *
	 * @param btnRight a {@link java.lang.String} object.
	 */
	public void setBtnRight(String btnRight) {
		this.btnRight = btnRight;
	}

	/**
	 * <p>Getter for the field <code>btnRightHref</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBtnRightHref() {
		return this.btnRightHref;
	}
	/**
	 * <p>Setter for the field <code>btnRightHref</code>.</p>
	 *
	 * @param btnRightHref a {@link java.lang.String} object.
	 */
	public void setBtnRightHref(String btnRightHref) {
		this.btnRightHref = btnRightHref;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>icon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIcon() {
		return this.icon;
	}
	/**
	 * <p>Setter for the field <code>icon</code>.</p>
	 *
	 * @param icon a {@link java.lang.String} object.
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * <p>Getter for the field <code>startDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartDate() {
		return this.startDate;
	}
	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.util.Date} object.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * <p>Getter for the field <code>timeout</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTimeout() {
		return this.timeout;
	}
	/**
	 * <p>Setter for the field <code>timeout</code>.</p>
	 *
	 * @param timeout a {@link java.lang.Long} object.
	 */
	public void setTimeout(Long timeout) {
		this.timeout = timeout;
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

}
