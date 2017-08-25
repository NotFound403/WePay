package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员合作专区权益状态变更接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserBenefitStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2365947735321922219L;

	/**
	 * 权益的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * YES表示当前操作的是会员3.0权益，NO表示当前操作的是改版之前的权益
	 */
	@ApiField("benefit_new_flag")
	private String benefitNewFlag;

	/**
	 * 1:上线， 0:下线,  2:失效；
上线状态所有人可见，不可编辑；
下线状态白名单可见，可以编辑；
失效状态所有人不可见，不可编辑。
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	/**
	 * <p>Getter for the field <code>benefitId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitId() {
		return this.benefitId;
	}
	/**
	 * <p>Setter for the field <code>benefitId</code>.</p>
	 *
	 * @param benefitId a {@link java.lang.String} object.
	 */
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	/**
	 * <p>Getter for the field <code>benefitNewFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitNewFlag() {
		return this.benefitNewFlag;
	}
	/**
	 * <p>Setter for the field <code>benefitNewFlag</code>.</p>
	 *
	 * @param benefitNewFlag a {@link java.lang.String} object.
	 */
	public void setBenefitNewFlag(String benefitNewFlag) {
		this.benefitNewFlag = benefitNewFlag;
	}

	/**
	 * <p>Getter for the field <code>benefitStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitStatus() {
		return this.benefitStatus;
	}
	/**
	 * <p>Setter for the field <code>benefitStatus</code>.</p>
	 *
	 * @param benefitStatus a {@link java.lang.String} object.
	 */
	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}

}
