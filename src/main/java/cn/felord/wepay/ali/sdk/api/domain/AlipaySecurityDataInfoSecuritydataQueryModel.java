package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝风控数据查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityDataInfoSecuritydataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2471685699297451112L;

	/**
	 * 业务代码.由蚂蚁金服定义的风控查询业务类型，例如: EX0001：查询风控黑名单，EX0002:查询地理信息数据
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展参数,用于业务扩展入参,格式为json.注意由于嵌套在入参json中,引号需要转义,详见入参样式.
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 查询的主体值,例如身份证号: "210******019087",支持单个或者多个,多个以逗号分隔.主体值支持的数据类型目前有以下,跟type栏位定义的类型对应.
bank_card_no,银行卡号、
cert_no,身份证号码、
business_license_no,营业执照号码、
company_name, 公司名称，
phone,预留手机号
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 系统名称,标识接入机构内部部门的系统名 ,具体值需要与蚂蚁金服服务提供方约定.
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 查询参数类型,描述查询主体值类型.单次查询仅支持查询同一类型的主题值.
以黑名单业务为例:
bank_card_no,银行卡号、
cert_no,身份证号码、
business_license_no,营业执照号码、
company_name, 公司名称，
phone,预留手机号
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>bizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizId() {
		return this.bizId;
	}
	/**
	 * <p>Setter for the field <code>bizId</code>.</p>
	 *
	 * @param bizId a {@link java.lang.String} object.
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	/**
	 * <p>Getter for the field <code>ext</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExt() {
		return this.ext;
	}
	/**
	 * <p>Setter for the field <code>ext</code>.</p>
	 *
	 * @param ext a {@link java.lang.String} object.
	 */
	public void setExt(String ext) {
		this.ext = ext;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * <p>Getter for the field <code>systemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSystemName() {
		return this.systemName;
	}
	/**
	 * <p>Setter for the field <code>systemName</code>.</p>
	 *
	 * @param systemName a {@link java.lang.String} object.
	 */
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
