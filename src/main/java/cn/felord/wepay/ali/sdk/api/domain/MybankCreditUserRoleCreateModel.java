package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建网商会员
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditUserRoleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4381913279635983291L;

	/**
	 * 客户身份编码-个人是身份证号码、企业是工商注册号、会员是会员编号-具体的数字编号
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 客户身份标识-个人是姓名、企业是公司名称、会员是会员名称，如支付宝的手机号或者邮箱号
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户身份类型-个人是PERSON、企业是COMPAY、会员是具体的站点如ALIPAY或者MYBANK
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 扩展数据（map转换为json字符串）
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 业务场景，7-代表网商贷在开放平台对外开放
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * <p>Getter for the field <code>entityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityCode() {
		return this.entityCode;
	}
	/**
	 * <p>Setter for the field <code>entityCode</code>.</p>
	 *
	 * @param entityCode a {@link java.lang.String} object.
	 */
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	/**
	 * <p>Getter for the field <code>entityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityName() {
		return this.entityName;
	}
	/**
	 * <p>Setter for the field <code>entityName</code>.</p>
	 *
	 * @param entityName a {@link java.lang.String} object.
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	/**
	 * <p>Getter for the field <code>entityType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityType() {
		return this.entityType;
	}
	/**
	 * <p>Setter for the field <code>entityType</code>.</p>
	 *
	 * @param entityType a {@link java.lang.String} object.
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/**
	 * <p>Getter for the field <code>extData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtData() {
		return this.extData;
	}
	/**
	 * <p>Setter for the field <code>extData</code>.</p>
	 *
	 * @param extData a {@link java.lang.String} object.
	 */
	public void setExtData(String extData) {
		this.extData = extData;
	}

	/**
	 * <p>Getter for the field <code>sceneType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneType() {
		return this.sceneType;
	}
	/**
	 * <p>Setter for the field <code>sceneType</code>.</p>
	 *
	 * @param sceneType a {@link java.lang.String} object.
	 */
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
