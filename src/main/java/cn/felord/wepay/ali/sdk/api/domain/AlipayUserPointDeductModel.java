package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员积分扣减接口（需要用户授权）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserPointDeductModel extends AlipayObject {

	private static final long serialVersionUID = 6347397417562745293L;

	/**
	 * 蚂蚁会员平台上的权益所对应的编号
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss ，业务操作时间用于对账，不传则以调用请求的当前时间计算
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务大类，表明此次调用的来源，若无需要则不传。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务流水号，会用于幂等性校验，所以请保证每次请求的业务流水号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务子类型，表明业务来源实际操作的业务分类，若无需要则不传。
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

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
	 * <p>Getter for the field <code>bizDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getBizDate() {
		return this.bizDate;
	}
	/**
	 * <p>Setter for the field <code>bizDate</code>.</p>
	 *
	 * @param bizDate a {@link java.util.Date} object.
	 */
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
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

	/**
	 * <p>Getter for the field <code>subBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubBizType() {
		return this.subBizType;
	}
	/**
	 * <p>Setter for the field <code>subBizType</code>.</p>
	 *
	 * @param subBizType a {@link java.lang.String} object.
	 */
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
