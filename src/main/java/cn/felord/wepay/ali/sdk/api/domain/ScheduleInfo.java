package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 时间表，定义当前服务者在一定时间范围内，可以提供服务的时间窗口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ScheduleInfo extends AlipayObject {

	private static final long serialVersionUID = 3434876172375547887L;

	/**
	 * 根据定义的间隔长度跟单位，将date的时间切分，例如将2016-11-29整天按30分钟为一段切分为48段： 111111111111111111111111111111111110000011111111 ， 其中0表示不可用，1表示可用
	 */
	@ApiField("bitmap")
	private String bitmap;

	/**
	 * 时间，默认YYYY-MM-DD格式，如果是单位是月，就填写YYYY-01-01格式，如果单位是周和日，就是YYYY-MM-01格式
	 */
	@ApiField("date")
	private String date;

	/**
	 * <p>Getter for the field <code>bitmap</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBitmap() {
		return this.bitmap;
	}
	/**
	 * <p>Setter for the field <code>bitmap</code>.</p>
	 *
	 * @param bitmap a {@link java.lang.String} object.
	 */
	public void setBitmap(String bitmap) {
		this.bitmap = bitmap;
	}

	/**
	 * <p>Getter for the field <code>date</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDate() {
		return this.date;
	}
	/**
	 * <p>Setter for the field <code>date</code>.</p>
	 *
	 * @param date a {@link java.lang.String} object.
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
