package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 权益的等级配置信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BenefitGradeConfig extends AlipayObject {

	private static final long serialVersionUID = 8357387887322297371L;

	/**
	 * 权益背景图片地址，若没有，可以先mock一个地址进行填写
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 该等级下权益的介绍
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 用户等级，差异化时可填primary、golden、platinum、diamond，非差异化时可填common
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 权益关联的活动页面
	 */
	@ApiField("page_url")
	private String pageUrl;

	/**
	 * 当前等级兑换权益所需要消耗的积分
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 该等级兑换权益时，消耗的积分需要乘以配置的这个折扣，进行优惠
	 */
	@ApiField("point_discount")
	private String pointDiscount;

	/**
	 * <p>Getter for the field <code>backgroundUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBackgroundUrl() {
		return this.backgroundUrl;
	}
	/**
	 * <p>Setter for the field <code>backgroundUrl</code>.</p>
	 *
	 * @param backgroundUrl a {@link java.lang.String} object.
	 */
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	/**
	 * <p>Getter for the field <code>detail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetail() {
		return this.detail;
	}
	/**
	 * <p>Setter for the field <code>detail</code>.</p>
	 *
	 * @param detail a {@link java.lang.String} object.
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * <p>Getter for the field <code>grade</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGrade() {
		return this.grade;
	}
	/**
	 * <p>Setter for the field <code>grade</code>.</p>
	 *
	 * @param grade a {@link java.lang.String} object.
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * <p>Getter for the field <code>pageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageUrl() {
		return this.pageUrl;
	}
	/**
	 * <p>Setter for the field <code>pageUrl</code>.</p>
	 *
	 * @param pageUrl a {@link java.lang.String} object.
	 */
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	/**
	 * <p>Getter for the field <code>point</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPoint() {
		return this.point;
	}
	/**
	 * <p>Setter for the field <code>point</code>.</p>
	 *
	 * @param point a {@link java.lang.Long} object.
	 */
	public void setPoint(Long point) {
		this.point = point;
	}

	/**
	 * <p>Getter for the field <code>pointDiscount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPointDiscount() {
		return this.pointDiscount;
	}
	/**
	 * <p>Setter for the field <code>pointDiscount</code>.</p>
	 *
	 * @param pointDiscount a {@link java.lang.String} object.
	 */
	public void setPointDiscount(String pointDiscount) {
		this.pointDiscount = pointDiscount;
	}

}
