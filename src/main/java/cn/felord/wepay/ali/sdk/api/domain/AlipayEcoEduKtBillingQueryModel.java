package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 缴费账单查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduKtBillingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5238766897575491758L;

	/**
	 * Isv pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * ISV调用发送账单接口，返回给商户的order_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 学校支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * <p>Getter for the field <code>isvPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvPid() {
		return this.isvPid;
	}
	/**
	 * <p>Setter for the field <code>isvPid</code>.</p>
	 *
	 * @param isvPid a {@link java.lang.String} object.
	 */
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	/**
	 * <p>Getter for the field <code>schoolPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolPid() {
		return this.schoolPid;
	}
	/**
	 * <p>Setter for the field <code>schoolPid</code>.</p>
	 *
	 * @param schoolPid a {@link java.lang.String} object.
	 */
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

}
