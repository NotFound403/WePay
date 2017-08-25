package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 企业融资数据采集平台对外的数据提交接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCreditCreditriskDataPutModel extends AlipayObject {

	private static final long serialVersionUID = 3482133282132369916L;

	/**
	 * 数据类别,ISV注册成为网商银行的会员，达成数据合作服务，约定数据模型，由网商分配给ISV的数据模型的类别
	 */
	@ApiField("category")
	private String category;

	/**
	 * 外部机构编码(ISV注册成为网商银行的会员，ISV在网商的会员ID)
	 */
	@ApiField("dataorgid")
	private String dataorgid;

	/**
	 * 数据提供者,ISV注册成为网商银行的会员，达成数据合作服务，约定数据模型，由网商分配给ISV的机构代号
	 */
	@ApiField("dataprovider")
	private String dataprovider;

	/**
	 * 实体编码(ISV客户的支付宝数字ID)
	 */
	@ApiField("entitycode")
	private String entitycode;

	/**
	 * 实体名(ISV客户的支付宝登录号)
	 */
	@ApiField("entityname")
	private String entityname;

	/**
	 * 实体类型(固定为ALIPAY)
	 */
	@ApiField("entitytype")
	private String entitytype;

	/**
	 * Json格式,数据内容,ISV注册成为网商银行的会员，达成数据合作服务，约定json串字段和内容,ISV将数据给到网商，网商按照约定解析Json内容
	 */
	@ApiField("objectcontent")
	private String objectcontent;

	/**
	 * <p>Getter for the field <code>category</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategory() {
		return this.category;
	}
	/**
	 * <p>Setter for the field <code>category</code>.</p>
	 *
	 * @param category a {@link java.lang.String} object.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * <p>Getter for the field <code>dataorgid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataorgid() {
		return this.dataorgid;
	}
	/**
	 * <p>Setter for the field <code>dataorgid</code>.</p>
	 *
	 * @param dataorgid a {@link java.lang.String} object.
	 */
	public void setDataorgid(String dataorgid) {
		this.dataorgid = dataorgid;
	}

	/**
	 * <p>Getter for the field <code>dataprovider</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataprovider() {
		return this.dataprovider;
	}
	/**
	 * <p>Setter for the field <code>dataprovider</code>.</p>
	 *
	 * @param dataprovider a {@link java.lang.String} object.
	 */
	public void setDataprovider(String dataprovider) {
		this.dataprovider = dataprovider;
	}

	/**
	 * <p>Getter for the field <code>entitycode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntitycode() {
		return this.entitycode;
	}
	/**
	 * <p>Setter for the field <code>entitycode</code>.</p>
	 *
	 * @param entitycode a {@link java.lang.String} object.
	 */
	public void setEntitycode(String entitycode) {
		this.entitycode = entitycode;
	}

	/**
	 * <p>Getter for the field <code>entityname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityname() {
		return this.entityname;
	}
	/**
	 * <p>Setter for the field <code>entityname</code>.</p>
	 *
	 * @param entityname a {@link java.lang.String} object.
	 */
	public void setEntityname(String entityname) {
		this.entityname = entityname;
	}

	/**
	 * <p>Getter for the field <code>entitytype</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntitytype() {
		return this.entitytype;
	}
	/**
	 * <p>Setter for the field <code>entitytype</code>.</p>
	 *
	 * @param entitytype a {@link java.lang.String} object.
	 */
	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	/**
	 * <p>Getter for the field <code>objectcontent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getObjectcontent() {
		return this.objectcontent;
	}
	/**
	 * <p>Setter for the field <code>objectcontent</code>.</p>
	 *
	 * @param objectcontent a {@link java.lang.String} object.
	 */
	public void setObjectcontent(String objectcontent) {
		this.objectcontent = objectcontent;
	}

}
