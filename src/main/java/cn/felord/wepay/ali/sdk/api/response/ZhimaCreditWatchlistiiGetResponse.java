package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ZmWatchListDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.watchlistii.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCreditWatchlistiiGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1341257146421296653L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 所查询的某个用户的行业关注名单列表。当is_matched为true时会返回该参数。
	 */
	@ApiListField("details")
	@ApiField("zm_watch_list_detail")
	private List<ZmWatchListDetail> details;

	/** 
	 * true=命中 在关注名单中
false=未命中
	 */
	@ApiField("is_matched")
	private Boolean isMatched;

	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo( ) {
		return this.bizNo;
	}

	/**
	 * <p>Setter for the field <code>details</code>.</p>
	 *
	 * @param details a {@link java.util.List} object.
	 */
	public void setDetails(List<ZmWatchListDetail> details) {
		this.details = details;
	}
	/**
	 * <p>Getter for the field <code>details</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ZmWatchListDetail> getDetails( ) {
		return this.details;
	}

	/**
	 * <p>Setter for the field <code>isMatched</code>.</p>
	 *
	 * @param isMatched a {@link java.lang.Boolean} object.
	 */
	public void setIsMatched(Boolean isMatched) {
		this.isMatched = isMatched;
	}
	/**
	 * <p>Getter for the field <code>isMatched</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsMatched( ) {
		return this.isMatched;
	}

}
