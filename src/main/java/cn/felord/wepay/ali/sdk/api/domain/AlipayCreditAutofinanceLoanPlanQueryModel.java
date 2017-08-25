package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询贷款方案
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCreditAutofinanceLoanPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1534745828624873494L;

	/**
	 * 扩展参数,针对不同的平台特殊业务场景，将需要的参数填入改字段，目前针对大搜车业务有以下参数：itemprice 车辆价格，lastprop 车辆残值率,extintamt 基础服务包+增值服务包，loantenor 贷款期数，creditamtprop 授信额度比例调整值；
	 */
	@ApiField("extparam")
	private String extparam;

	/**
	 * 机构编码，机构接入汽车金融平台时分配，固定值
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 产品编码，汽车金融平台给机构提供的产品编码
	 */
	@ApiField("productcode")
	private String productcode;

	/**
	 * 本次请求流水号，全局唯一
	 */
	@ApiField("seqno")
	private String seqno;

	/**
	 * 支付宝账号数字ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * <p>Getter for the field <code>extparam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtparam() {
		return this.extparam;
	}
	/**
	 * <p>Setter for the field <code>extparam</code>.</p>
	 *
	 * @param extparam a {@link java.lang.String} object.
	 */
	public void setExtparam(String extparam) {
		this.extparam = extparam;
	}

	/**
	 * <p>Getter for the field <code>orgcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgcode() {
		return this.orgcode;
	}
	/**
	 * <p>Setter for the field <code>orgcode</code>.</p>
	 *
	 * @param orgcode a {@link java.lang.String} object.
	 */
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	/**
	 * <p>Getter for the field <code>productcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductcode() {
		return this.productcode;
	}
	/**
	 * <p>Setter for the field <code>productcode</code>.</p>
	 *
	 * @param productcode a {@link java.lang.String} object.
	 */
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	/**
	 * <p>Getter for the field <code>seqno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSeqno() {
		return this.seqno;
	}
	/**
	 * <p>Setter for the field <code>seqno</code>.</p>
	 *
	 * @param seqno a {@link java.lang.String} object.
	 */
	public void setSeqno(String seqno) {
		this.seqno = seqno;
	}

	/**
	 * <p>Getter for the field <code>uid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUid() {
		return this.uid;
	}
	/**
	 * <p>Setter for the field <code>uid</code>.</p>
	 *
	 * @param uid a {@link java.lang.String} object.
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

}
