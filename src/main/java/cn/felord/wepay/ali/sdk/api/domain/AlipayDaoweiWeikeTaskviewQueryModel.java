package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询微客任务视图
 *
 * @author auto create
 * @since 1.0, 2017-04-25 14:22:41
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

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
