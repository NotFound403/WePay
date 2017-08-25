package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统主键结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertIdentifyResponse extends AlipayObject {

	private static final long serialVersionUID = 3464871573899335581L;

	/**
	 * 根据benefit_type，确定ID含义
SINGLE_VOUCHER时，benefit_ids为券ID
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

	/**
	 * 发放权益类型
SINGLE_VOUCHER：单券
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 返回码
success: 成功
invalid-arguments: 无效参数
retry-exception: 异常请重试
isv.user-already-get-voucher：用户已经领过该券，同时券状态为有效
isv.item_inventory_not_enough:优惠领光了
isv.item_not_in_this_shop_sales:不是该商家的优惠，不能领取
isv.voucher_activity_not_started:活动未开始
isv.voucher_activity_expired:活动已结束
isv.crowd_limit_not_match_error:暂无领取资格，详情请咨询商家
isv.member_crowd_limit_not_match_error:会员专属，请先注册会员
	 */
	@ApiField("code")
	private String code;

	/**
	 * JSON格式数据，需要ISV自行解析
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 主键的值
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 主键类型
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * <p>Getter for the field <code>benefitIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getBenefitIds() {
		return this.benefitIds;
	}
	/**
	 * <p>Setter for the field <code>benefitIds</code>.</p>
	 *
	 * @param benefitIds a {@link java.util.List} object.
	 */
	public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}

	/**
	 * <p>Getter for the field <code>benefitType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitType() {
		return this.benefitType;
	}
	/**
	 * <p>Setter for the field <code>benefitType</code>.</p>
	 *
	 * @param benefitType a {@link java.lang.String} object.
	 */
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

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
	 * <p>Getter for the field <code>identify</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentify() {
		return this.identify;
	}
	/**
	 * <p>Setter for the field <code>identify</code>.</p>
	 *
	 * @param identify a {@link java.lang.String} object.
	 */
	public void setIdentify(String identify) {
		this.identify = identify;
	}

	/**
	 * <p>Getter for the field <code>identifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentifyType() {
		return this.identifyType;
	}
	/**
	 * <p>Setter for the field <code>identifyType</code>.</p>
	 *
	 * @param identifyType a {@link java.lang.String} object.
	 */
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

}
