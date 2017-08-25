package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 老版本复杂对象模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OldComplextMockModel extends AlipayObject {

	private static final long serialVersionUID = 8126375383547783741L;

	/**
	 * biz_num
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/**
	 * biz_type
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 简单model
	 */
	@ApiField("simple_mock_model")
	private SimpleMockModel simpleMockModel;

	/**
	 * <p>Getter for the field <code>bizNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBizNum() {
		return this.bizNum;
	}
	/**
	 * <p>Setter for the field <code>bizNum</code>.</p>
	 *
	 * @param bizNum a {@link java.lang.Long} object.
	 */
	public void setBizNum(Long bizNum) {
		this.bizNum = bizNum;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>simpleMockModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.SimpleMockModel} object.
	 */
	public SimpleMockModel getSimpleMockModel() {
		return this.simpleMockModel;
	}
	/**
	 * <p>Setter for the field <code>simpleMockModel</code>.</p>
	 *
	 * @param simpleMockModel a {@link cn.felord.wepay.ali.sdk.api.domain.SimpleMockModel} object.
	 */
	public void setSimpleMockModel(SimpleMockModel simpleMockModel) {
		this.simpleMockModel = simpleMockModel;
	}

}
