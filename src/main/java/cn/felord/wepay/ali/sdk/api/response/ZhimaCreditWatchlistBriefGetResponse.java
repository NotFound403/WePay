package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.watchlist.brief.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCreditWatchlistBriefGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4371511479294894242L;

	/** 
	 * 唯一标示每一次接口调用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 输入用户返回结果：
0 未命中逾期名单
1 命中一类名单，例如用户有一周以内的轻微逾期
2 命中二类名单，例如用户有一周以上中等逾期
3 命中三类名单，例如用户有一个月以上的严重逾期
N/A 无法评估该用户逾期状况，例如未获得用户授权。
	 */
	@ApiField("level")
	private String level;

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
	 * <p>Setter for the field <code>level</code>.</p>
	 *
	 * @param level a {@link java.lang.String} object.
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * <p>Getter for the field <code>level</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevel( ) {
		return this.level;
	}

}
