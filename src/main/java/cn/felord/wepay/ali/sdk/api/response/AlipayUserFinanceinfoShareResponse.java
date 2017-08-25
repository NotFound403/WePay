package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayUserCreditCard;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.financeinfo.share response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserFinanceinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 7439376897236643889L;

	/** 
	 * 查询出的信用卡列表，包含0到多张卡，每张卡对应一组信息，包含卡号（已脱敏）和开户行代码
	 */
	@ApiListField("credit_card_list")
	@ApiField("alipay_user_credit_card")
	private List<AlipayUserCreditCard> creditCardList;

	/**
	 * <p>Setter for the field <code>creditCardList</code>.</p>
	 *
	 * @param creditCardList a {@link java.util.List} object.
	 */
	public void setCreditCardList(List<AlipayUserCreditCard> creditCardList) {
		this.creditCardList = creditCardList;
	}
	/**
	 * <p>Getter for the field <code>creditCardList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayUserCreditCard> getCreditCardList( ) {
		return this.creditCardList;
	}

}
