package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚂蚁乐驾车主车辆保存服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsAutoCarSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6687874863918871382L;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 用户ID,车主会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>carNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarNo() {
		return this.carNo;
	}
	/**
	 * <p>Setter for the field <code>carNo</code>.</p>
	 *
	 * @param carNo a {@link java.lang.String} object.
	 */
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
