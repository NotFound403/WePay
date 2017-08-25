package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑商品交易凭证模板
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiTradeVoucherItemTemplete extends AlipayObject {

	private static final long serialVersionUID = 8256887521238631311L;

	/**
	 * 购买须知，列表类型，最多10项
	 */
	@ApiListField("buyer_notes")
	@ApiField("koubei_item_description")
	private List<KoubeiItemDescription> buyerNotes;

	/**
	 * 表示是否支持预定，支持“T”, 不支持“F”
	 */
	@ApiField("support_book")
	private String supportBook;

	/**
	 * 购买有效期：商品自购买起多长时间内有效，取值范围 7-360，单位天。举例，如果是7的话，是到第七天晚上23:59:59失效。商品购买后，没有在有效期内核销，则自动退款给用户。举例：买了一个高级造型师洗剪吹的商品，有效期一个月，如果一个月之后，用户没有使用商品来进行洗剪吹的服务，则自动退款给用户。
	 */
	@ApiField("validity_period")
	private String validityPeriod;

	/**
	 * <p>Getter for the field <code>buyerNotes</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KoubeiItemDescription> getBuyerNotes() {
		return this.buyerNotes;
	}
	/**
	 * <p>Setter for the field <code>buyerNotes</code>.</p>
	 *
	 * @param buyerNotes a {@link java.util.List} object.
	 */
	public void setBuyerNotes(List<KoubeiItemDescription> buyerNotes) {
		this.buyerNotes = buyerNotes;
	}

	/**
	 * <p>Getter for the field <code>supportBook</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSupportBook() {
		return this.supportBook;
	}
	/**
	 * <p>Setter for the field <code>supportBook</code>.</p>
	 *
	 * @param supportBook a {@link java.lang.String} object.
	 */
	public void setSupportBook(String supportBook) {
		this.supportBook = supportBook;
	}

	/**
	 * <p>Getter for the field <code>validityPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValidityPeriod() {
		return this.validityPeriod;
	}
	/**
	 * <p>Setter for the field <code>validityPeriod</code>.</p>
	 *
	 * @param validityPeriod a {@link java.lang.String} object.
	 */
	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

}
