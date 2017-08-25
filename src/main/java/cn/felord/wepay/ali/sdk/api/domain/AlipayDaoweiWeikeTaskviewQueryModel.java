package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询微客任务视图
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiWeikeTaskviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3667375777584745583L;

	/**
	 * 当前城市城市码,精确到地级市级别.城市编码参考最新国家标准http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201703/t20170310_1471429.html
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 第三方调用场景来源,由微客分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * <p>Getter for the field <code>cityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityCode() {
		return this.cityCode;
	}
	/**
	 * <p>Setter for the field <code>cityCode</code>.</p>
	 *
	 * @param cityCode a {@link java.lang.String} object.
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

}
