package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 该API用于外部商户准入时的反洗钱风险分析。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdAmlriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5373385727478414347L;

	/**
	 * 办公地址
	 */
	@ApiField("business_address")
	private String businessAddress;

	/**
	 * 标识该次反洗钱风险分析事件请求的id，商户应保证此id唯一。
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 与商户相关个体的信息列表，可以有0个到多个。
	 */
	@ApiListField("individual_list")
	@ApiField("individual_info")
	private List<IndividualInfo> individualList;

	/**
	 * 公司名称、类型、性质
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 该商户准入申请的id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 公司注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 公司注册号
	 */
	@ApiField("registration_number")
	private String registrationNumber;

	/**
	 * <p>Getter for the field <code>businessAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessAddress() {
		return this.businessAddress;
	}
	/**
	 * <p>Setter for the field <code>businessAddress</code>.</p>
	 *
	 * @param businessAddress a {@link java.lang.String} object.
	 */
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	/**
	 * <p>Getter for the field <code>eventId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEventId() {
		return this.eventId;
	}
	/**
	 * <p>Setter for the field <code>eventId</code>.</p>
	 *
	 * @param eventId a {@link java.lang.String} object.
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	/**
	 * <p>Getter for the field <code>individualList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<IndividualInfo> getIndividualList() {
		return this.individualList;
	}
	/**
	 * <p>Setter for the field <code>individualList</code>.</p>
	 *
	 * @param individualList a {@link java.util.List} object.
	 */
	public void setIndividualList(List<IndividualInfo> individualList) {
		this.individualList = individualList;
	}

	/**
	 * <p>Getter for the field <code>legalName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLegalName() {
		return this.legalName;
	}
	/**
	 * <p>Setter for the field <code>legalName</code>.</p>
	 *
	 * @param legalName a {@link java.lang.String} object.
	 */
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	/**
	 * <p>Getter for the field <code>merchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantId() {
		return this.merchantId;
	}
	/**
	 * <p>Setter for the field <code>merchantId</code>.</p>
	 *
	 * @param merchantId a {@link java.lang.String} object.
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * <p>Getter for the field <code>orderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderId() {
		return this.orderId;
	}
	/**
	 * <p>Setter for the field <code>orderId</code>.</p>
	 *
	 * @param orderId a {@link java.lang.String} object.
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * <p>Getter for the field <code>registeredAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisteredAddress() {
		return this.registeredAddress;
	}
	/**
	 * <p>Setter for the field <code>registeredAddress</code>.</p>
	 *
	 * @param registeredAddress a {@link java.lang.String} object.
	 */
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	/**
	 * <p>Getter for the field <code>registrationNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}
	/**
	 * <p>Setter for the field <code>registrationNumber</code>.</p>
	 *
	 * @param registrationNumber a {@link java.lang.String} object.
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
