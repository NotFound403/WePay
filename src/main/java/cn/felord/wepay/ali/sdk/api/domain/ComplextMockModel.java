package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 负责对象mock模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ComplextMockModel extends AlipayObject {

	private static final long serialVersionUID = 5823162723265611244L;

	/**
	 * biz_model
	 */
	@ApiField("biz_model")
	private SimpleMockModel bizModel;

	/**
	 * 11
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/**
	 * 208xxx
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * <p>Getter for the field <code>bizModel</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.SimpleMockModel} object.
	 */
	public SimpleMockModel getBizModel() {
		return this.bizModel;
	}
	/**
	 * <p>Setter for the field <code>bizModel</code>.</p>
	 *
	 * @param bizModel a {@link cn.felord.wepay.ali.sdk.api.domain.SimpleMockModel} object.
	 */
	public void setBizModel(SimpleMockModel bizModel) {
		this.bizModel = bizModel;
	}

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

}
