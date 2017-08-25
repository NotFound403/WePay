package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 包含两个String成员变量
 *String cardNo; //获取前6后2
 *String instId; //如ICBC
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserCreditCard extends AlipayObject {

	private static final long serialVersionUID = 8563367274611565332L;

	/**
	 * 信用卡卡号，显示前6后2
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 开户行代码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * <p>Getter for the field <code>cardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNo() {
		return this.cardNo;
	}
	/**
	 * <p>Setter for the field <code>cardNo</code>.</p>
	 *
	 * @param cardNo a {@link java.lang.String} object.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * <p>Getter for the field <code>instId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstId() {
		return this.instId;
	}
	/**
	 * <p>Setter for the field <code>instId</code>.</p>
	 *
	 * @param instId a {@link java.lang.String} object.
	 */
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
