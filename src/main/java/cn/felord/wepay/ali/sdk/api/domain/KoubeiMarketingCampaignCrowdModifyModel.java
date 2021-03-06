package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组修改接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignCrowdModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6791581892237361664L;

	/**
	 * 圈人的条件
op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
value:标签值
	 */
	@ApiField("conditions")
	private String conditions;

	/**
	 * 人群组的唯一标识ID
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * <p>Getter for the field <code>conditions</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConditions() {
		return this.conditions;
	}
	/**
	 * <p>Setter for the field <code>conditions</code>.</p>
	 *
	 * @param conditions a {@link java.lang.String} object.
	 */
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	/**
	 * <p>Getter for the field <code>crowdGroupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	/**
	 * <p>Setter for the field <code>crowdGroupId</code>.</p>
	 *
	 * @param crowdGroupId a {@link java.lang.String} object.
	 */
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>operatorType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorType() {
		return this.operatorType;
	}
	/**
	 * <p>Setter for the field <code>operatorType</code>.</p>
	 *
	 * @param operatorType a {@link java.lang.String} object.
	 */
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
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
