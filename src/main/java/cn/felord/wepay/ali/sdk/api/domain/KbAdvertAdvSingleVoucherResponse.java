package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统推广详情(单张券)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertAdvSingleVoucherResponse extends AlipayObject {

	private static final long serialVersionUID = 8557661769277823916L;

	/**
	 * 广告内容模型
	 */
	@ApiListField("adv_content_list")
	@ApiField("kb_advert_adv_content_response")
	private List<KbAdvertAdvContentResponse> advContentList;

	/**
	 * 广告内容（广告内容请使用新的属性adv_content_list，此属性仍会保留）
	 */
	@ApiField("content")
	private KbAdvertAdvContent content;

	/**
	 * 券标的
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucherResponse voucher;

	/**
	 * <p>Getter for the field <code>advContentList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertAdvContentResponse> getAdvContentList() {
		return this.advContentList;
	}
	/**
	 * <p>Setter for the field <code>advContentList</code>.</p>
	 *
	 * @param advContentList a {@link java.util.List} object.
	 */
	public void setAdvContentList(List<KbAdvertAdvContentResponse> advContentList) {
		this.advContentList = advContentList;
	}

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertAdvContent} object.
	 */
	public KbAdvertAdvContent getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertAdvContent} object.
	 */
	public void setContent(KbAdvertAdvContent content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>voucher</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertSubjectVoucherResponse} object.
	 */
	public KbAdvertSubjectVoucherResponse getVoucher() {
		return this.voucher;
	}
	/**
	 * <p>Setter for the field <code>voucher</code>.</p>
	 *
	 * @param voucher a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertSubjectVoucherResponse} object.
	 */
	public void setVoucher(KbAdvertSubjectVoucherResponse voucher) {
		this.voucher = voucher;
	}

}
