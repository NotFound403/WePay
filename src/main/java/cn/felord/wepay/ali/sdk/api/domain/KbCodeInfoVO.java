package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑码信息对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbCodeInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7599556754991538431L;

	/**
	 * 创建口碑码的批次号
	 */
	@ApiField("batch_id")
	private Long batchId;

	/**
	 * 口碑码图片(不带背景图)
	 */
	@ApiField("code_url")
	private String codeUrl;

	/**
	 * 口碑码创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 口碑码ID
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 口碑码物料图（带背景）
	 */
	@ApiField("resource_url")
	private String resourceUrl;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 口碑门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 物料模板
	 */
	@ApiField("stuff_template")
	private String stuffTemplate;

	/**
	 * 物料模板描述
	 */
	@ApiField("stuff_template_desc")
	private String stuffTemplateDesc;

	/**
	 * 口碑码类型描述
	 */
	@ApiField("stuff_type_desc")
	private String stuffTypeDesc;

	/**
	 * 桌号
	 */
	@ApiField("table_no")
	private String tableNo;

	/**
	 * <p>Getter for the field <code>batchId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBatchId() {
		return this.batchId;
	}
	/**
	 * <p>Setter for the field <code>batchId</code>.</p>
	 *
	 * @param batchId a {@link java.lang.Long} object.
	 */
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	/**
	 * <p>Getter for the field <code>codeUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeUrl() {
		return this.codeUrl;
	}
	/**
	 * <p>Setter for the field <code>codeUrl</code>.</p>
	 *
	 * @param codeUrl a {@link java.lang.String} object.
	 */
	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	/**
	 * <p>Getter for the field <code>createTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateTime() {
		return this.createTime;
	}
	/**
	 * <p>Setter for the field <code>createTime</code>.</p>
	 *
	 * @param createTime a {@link java.lang.String} object.
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * <p>Getter for the field <code>qrCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCode() {
		return this.qrCode;
	}
	/**
	 * <p>Setter for the field <code>qrCode</code>.</p>
	 *
	 * @param qrCode a {@link java.lang.String} object.
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	/**
	 * <p>Getter for the field <code>resourceUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResourceUrl() {
		return this.resourceUrl;
	}
	/**
	 * <p>Setter for the field <code>resourceUrl</code>.</p>
	 *
	 * @param resourceUrl a {@link java.lang.String} object.
	 */
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>shopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * <p>Setter for the field <code>shopName</code>.</p>
	 *
	 * @param shopName a {@link java.lang.String} object.
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * <p>Getter for the field <code>stuffTemplate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStuffTemplate() {
		return this.stuffTemplate;
	}
	/**
	 * <p>Setter for the field <code>stuffTemplate</code>.</p>
	 *
	 * @param stuffTemplate a {@link java.lang.String} object.
	 */
	public void setStuffTemplate(String stuffTemplate) {
		this.stuffTemplate = stuffTemplate;
	}

	/**
	 * <p>Getter for the field <code>stuffTemplateDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStuffTemplateDesc() {
		return this.stuffTemplateDesc;
	}
	/**
	 * <p>Setter for the field <code>stuffTemplateDesc</code>.</p>
	 *
	 * @param stuffTemplateDesc a {@link java.lang.String} object.
	 */
	public void setStuffTemplateDesc(String stuffTemplateDesc) {
		this.stuffTemplateDesc = stuffTemplateDesc;
	}

	/**
	 * <p>Getter for the field <code>stuffTypeDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStuffTypeDesc() {
		return this.stuffTypeDesc;
	}
	/**
	 * <p>Setter for the field <code>stuffTypeDesc</code>.</p>
	 *
	 * @param stuffTypeDesc a {@link java.lang.String} object.
	 */
	public void setStuffTypeDesc(String stuffTypeDesc) {
		this.stuffTypeDesc = stuffTypeDesc;
	}

	/**
	 * <p>Getter for the field <code>tableNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTableNo() {
		return this.tableNo;
	}
	/**
	 * <p>Setter for the field <code>tableNo</code>.</p>
	 *
	 * @param tableNo a {@link java.lang.String} object.
	 */
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

}
