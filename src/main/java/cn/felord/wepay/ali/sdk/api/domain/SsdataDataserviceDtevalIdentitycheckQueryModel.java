package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 上数用户信息核对身份查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceDtevalIdentitycheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2159629573574268199L;

	/**
	 * 工单流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 采集到的身份证号
	 */
	@ApiField("col_cert_no")
	private String colCertNo;

	/**
	 * 采集到的手机号码
	 */
	@ApiField("col_mobile")
	private String colMobile;

	/**
	 * 采集到的姓名
	 */
	@ApiField("col_user_name")
	private String colUserName;

	/**
	 * 额外参数
	 */
	@ApiField("ext_map")
	private String extMap;

	/**
	 * 实际身份证号
	 */
	@ApiField("real_cert_no")
	private String realCertNo;

	/**
	 * 实际手机号号码
	 */
	@ApiField("real_mobile")
	private String realMobile;

	/**
	 * 实际姓名
	 */
	@ApiField("real_user_name")
	private String realUserName;

	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo() {
		return this.bizNo;
	}
	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	/**
	 * <p>Getter for the field <code>colCertNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColCertNo() {
		return this.colCertNo;
	}
	/**
	 * <p>Setter for the field <code>colCertNo</code>.</p>
	 *
	 * @param colCertNo a {@link java.lang.String} object.
	 */
	public void setColCertNo(String colCertNo) {
		this.colCertNo = colCertNo;
	}

	/**
	 * <p>Getter for the field <code>colMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColMobile() {
		return this.colMobile;
	}
	/**
	 * <p>Setter for the field <code>colMobile</code>.</p>
	 *
	 * @param colMobile a {@link java.lang.String} object.
	 */
	public void setColMobile(String colMobile) {
		this.colMobile = colMobile;
	}

	/**
	 * <p>Getter for the field <code>colUserName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColUserName() {
		return this.colUserName;
	}
	/**
	 * <p>Setter for the field <code>colUserName</code>.</p>
	 *
	 * @param colUserName a {@link java.lang.String} object.
	 */
	public void setColUserName(String colUserName) {
		this.colUserName = colUserName;
	}

	/**
	 * <p>Getter for the field <code>extMap</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtMap() {
		return this.extMap;
	}
	/**
	 * <p>Setter for the field <code>extMap</code>.</p>
	 *
	 * @param extMap a {@link java.lang.String} object.
	 */
	public void setExtMap(String extMap) {
		this.extMap = extMap;
	}

	/**
	 * <p>Getter for the field <code>realCertNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealCertNo() {
		return this.realCertNo;
	}
	/**
	 * <p>Setter for the field <code>realCertNo</code>.</p>
	 *
	 * @param realCertNo a {@link java.lang.String} object.
	 */
	public void setRealCertNo(String realCertNo) {
		this.realCertNo = realCertNo;
	}

	/**
	 * <p>Getter for the field <code>realMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealMobile() {
		return this.realMobile;
	}
	/**
	 * <p>Setter for the field <code>realMobile</code>.</p>
	 *
	 * @param realMobile a {@link java.lang.String} object.
	 */
	public void setRealMobile(String realMobile) {
		this.realMobile = realMobile;
	}

	/**
	 * <p>Getter for the field <code>realUserName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealUserName() {
		return this.realUserName;
	}
	/**
	 * <p>Setter for the field <code>realUserName</code>.</p>
	 *
	 * @param realUserName a {@link java.lang.String} object.
	 */
	public void setRealUserName(String realUserName) {
		this.realUserName = realUserName;
	}

}
