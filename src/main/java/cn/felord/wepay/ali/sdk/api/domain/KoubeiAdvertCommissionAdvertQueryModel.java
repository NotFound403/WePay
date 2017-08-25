package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分佣推广信息查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionAdvertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7218383167176116862L;

	/**
	 * 查询主键列表
identify_type=advert所有值都必须是推广ID
identify_type=mission所有值都必须是分佣任务ID
identify_type=voucher所有值都必须是券ID
	 */
	@ApiListField("identifies")
	@ApiField("string")
	private List<String> identifies;

	/**
	 * 查询主键类型(枚举值key对应于请求对象中查询主键列表的key)
advert-推广
mission-分佣任务
voucher-券
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * <p>Getter for the field <code>identifies</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getIdentifies() {
		return this.identifies;
	}
	/**
	 * <p>Setter for the field <code>identifies</code>.</p>
	 *
	 * @param identifies a {@link java.util.List} object.
	 */
	public void setIdentifies(List<String> identifies) {
		this.identifies = identifies;
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
