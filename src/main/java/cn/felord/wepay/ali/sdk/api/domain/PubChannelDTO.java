package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 卡模板投放渠道
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PubChannelDTO extends AlipayObject {

	private static final long serialVersionUID = 7192678629985195615L;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 1、SHOP_DETAIL:店铺详情页 
2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）
	 */
	@ApiField("pub_channel")
	private String pubChannel;

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>pubChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPubChannel() {
		return this.pubChannel;
	}
	/**
	 * <p>Setter for the field <code>pubChannel</code>.</p>
	 *
	 * @param pubChannel a {@link java.lang.String} object.
	 */
	public void setPubChannel(String pubChannel) {
		this.pubChannel = pubChannel;
	}

}
