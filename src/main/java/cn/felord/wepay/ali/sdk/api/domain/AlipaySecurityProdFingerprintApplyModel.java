package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 指纹注册
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFingerprintApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2235964567891718245L;

	/**
	 * ifaf_message:注册阶段客户端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含客户端的校验数据。
	 */
	@ApiField("ifaf_message")
	private String ifafMessage;

	/**
	 * 外部业务号，商户的业务单据号，用于核对与问题排查
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * <p>Getter for the field <code>ifafMessage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIfafMessage() {
		return this.ifafMessage;
	}
	/**
	 * <p>Setter for the field <code>ifafMessage</code>.</p>
	 *
	 * @param ifafMessage a {@link java.lang.String} object.
	 */
	public void setIfafMessage(String ifafMessage) {
		this.ifafMessage = ifafMessage;
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
