package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 个体工商户经营者信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OperatorInfo extends AlipayObject {

	private static final long serialVersionUID = 7537517617511285653L;

	/**
	 * 个体工商户经营者证件到期日，格式为YYYY-MM-DD
	 */
	@ApiField("operator_cert_indate")
	private String operatorCertIndate;

	/**
	 * 个体工商户经营者证件号码
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	/**
	 * 个体工商户经营者证件照片背面图片（如证件类型为身份证则上传国徽面图片）
	 */
	@ApiField("operator_cert_pic_back")
	private String operatorCertPicBack;

	/**
	 * 个体工商户经营者证件正面照片（如证件类型为身份证则需要上传头像面图片）
	 */
	@ApiField("operator_cert_pic_front")
	private String operatorCertPicFront;

	/**
	 * 个体工商户经营者证件类型，支持传入的类型为：RESIDENT(居民身份证)括号中为每种类型的释义，不需要将括号中的内容当参数内容传入。
	 */
	@ApiField("operator_cert_type")
	private String operatorCertType;

	/**
	 * 张三
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * <p>Getter for the field <code>operatorCertIndate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorCertIndate() {
		return this.operatorCertIndate;
	}
	/**
	 * <p>Setter for the field <code>operatorCertIndate</code>.</p>
	 *
	 * @param operatorCertIndate a {@link java.lang.String} object.
	 */
	public void setOperatorCertIndate(String operatorCertIndate) {
		this.operatorCertIndate = operatorCertIndate;
	}

	/**
	 * <p>Getter for the field <code>operatorCertNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorCertNo() {
		return this.operatorCertNo;
	}
	/**
	 * <p>Setter for the field <code>operatorCertNo</code>.</p>
	 *
	 * @param operatorCertNo a {@link java.lang.String} object.
	 */
	public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

	/**
	 * <p>Getter for the field <code>operatorCertPicBack</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorCertPicBack() {
		return this.operatorCertPicBack;
	}
	/**
	 * <p>Setter for the field <code>operatorCertPicBack</code>.</p>
	 *
	 * @param operatorCertPicBack a {@link java.lang.String} object.
	 */
	public void setOperatorCertPicBack(String operatorCertPicBack) {
		this.operatorCertPicBack = operatorCertPicBack;
	}

	/**
	 * <p>Getter for the field <code>operatorCertPicFront</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorCertPicFront() {
		return this.operatorCertPicFront;
	}
	/**
	 * <p>Setter for the field <code>operatorCertPicFront</code>.</p>
	 *
	 * @param operatorCertPicFront a {@link java.lang.String} object.
	 */
	public void setOperatorCertPicFront(String operatorCertPicFront) {
		this.operatorCertPicFront = operatorCertPicFront;
	}

	/**
	 * <p>Getter for the field <code>operatorCertType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorCertType() {
		return this.operatorCertType;
	}
	/**
	 * <p>Setter for the field <code>operatorCertType</code>.</p>
	 *
	 * @param operatorCertType a {@link java.lang.String} object.
	 */
	public void setOperatorCertType(String operatorCertType) {
		this.operatorCertType = operatorCertType;
	}

	/**
	 * <p>Getter for the field <code>operatorName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorName() {
		return this.operatorName;
	}
	/**
	 * <p>Setter for the field <code>operatorName</code>.</p>
	 *
	 * @param operatorName a {@link java.lang.String} object.
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

}
