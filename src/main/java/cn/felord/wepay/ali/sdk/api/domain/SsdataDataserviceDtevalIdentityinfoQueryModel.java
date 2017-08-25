package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 上数用户信息核身信息查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceDtevalIdentityinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7386468484318642364L;

	/**
	 * 业务流水号(biz_no)，代表了一笔业务，该参数由上数系统创建，为了唯一确定一笔业务的具体核身查询动作
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型(biz_type)，代表了查询核身信息的业务具体类型，其中prophet来自于枚举值，目前枚举值只有一个业务枚举，即"先知"业务 ，该参数由上数系统传递
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 手机号(phone)，代表传入的用户手机号码，该参数由上数系统传递
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo() {
		return this.bizNo;
	}
	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
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
	 * <p>Getter for the field <code>phone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhone() {
		return this.phone;
	}
	/**
	 * <p>Setter for the field <code>phone</code>.</p>
	 *
	 * @param phone a {@link java.lang.String} object.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
