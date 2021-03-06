package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * mydds 数据服务处理器
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataBizadviserMyddsreportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4889945778683863998L;

	/**
	 * req_parameters是请求参数汇集的一个json串和格式如下；
json串里需要传两个参数：shopId：门店Id 
memberType会员类型，1:会员、2:潜客。
"req_parameters": [{
          "paramKey": "shopId",
          "paramValue": "门店Id 的值"
          },{
          "paramKey": "memberType",
          "paramValue": "1"
          }]
	 */
	@ApiField("req_parameters")
	private String reqParameters;

	/**
	 * uniq_key 为请求类型，传值为shopMemberHeatmap时查询门店会员/潜在会员 热力图数据；
	 */
	@ApiField("uniq_key")
	private String uniqKey;

	/**
	 * <p>Getter for the field <code>reqParameters</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReqParameters() {
		return this.reqParameters;
	}
	/**
	 * <p>Setter for the field <code>reqParameters</code>.</p>
	 *
	 * @param reqParameters a {@link java.lang.String} object.
	 */
	public void setReqParameters(String reqParameters) {
		this.reqParameters = reqParameters;
	}

	/**
	 * <p>Getter for the field <code>uniqKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqKey() {
		return this.uniqKey;
	}
	/**
	 * <p>Setter for the field <code>uniqKey</code>.</p>
	 *
	 * @param uniqKey a {@link java.lang.String} object.
	 */
	public void setUniqKey(String uniqKey) {
		this.uniqKey = uniqKey;
	}

}
