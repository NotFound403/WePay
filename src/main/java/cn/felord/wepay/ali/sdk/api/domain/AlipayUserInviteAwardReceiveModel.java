package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝用户拉新奖品抽奖接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserInviteAwardReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 2496457988149793497L;

	/**
	 * 用户扫码抽奖输入的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部业务方代码
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <p>Getter for the field <code>outBizCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizCode() {
		return this.outBizCode;
	}
	/**
	 * <p>Setter for the field <code>outBizCode</code>.</p>
	 *
	 * @param outBizCode a {@link java.lang.String} object.
	 */
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
