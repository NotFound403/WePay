package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISV推送新违章信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarViolationInfoPushModel extends AlipayObject {

	private static final long serialVersionUID = 2194529435624955466L;

	/**
	 * 1:可在线处理, 2:不可在线处理, 3:需查询确定
	 */
	@ApiField("deal_type")
	private String dealType;

	/**
	 * 暂无
	 */
	@ApiField("push_type")
	private String pushType;

	/**
	 * 违章地点
	 */
	@ApiField("vi_address")
	private String viAddress;

	/**
	 * 违章罚款金额
	 */
	@ApiField("vi_fine")
	private String viFine;

	/**
	 * 是否已处理, 0:已处理，1:未处理
	 */
	@ApiField("vi_handled")
	private String viHandled;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * 违章扣分
	 */
	@ApiField("vi_point")
	private String viPoint;

	/**
	 * 违章时间(yyyyMMddhhmmss)
	 */
	@ApiField("vi_time")
	private Date viTime;

	/**
	 * 违章行为
	 */
	@ApiField("vi_type")
	private String viType;

	/**
	 * <p>Getter for the field <code>dealType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDealType() {
		return this.dealType;
	}
	/**
	 * <p>Setter for the field <code>dealType</code>.</p>
	 *
	 * @param dealType a {@link java.lang.String} object.
	 */
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	/**
	 * <p>Getter for the field <code>pushType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPushType() {
		return this.pushType;
	}
	/**
	 * <p>Setter for the field <code>pushType</code>.</p>
	 *
	 * @param pushType a {@link java.lang.String} object.
	 */
	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	/**
	 * <p>Getter for the field <code>viAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViAddress() {
		return this.viAddress;
	}
	/**
	 * <p>Setter for the field <code>viAddress</code>.</p>
	 *
	 * @param viAddress a {@link java.lang.String} object.
	 */
	public void setViAddress(String viAddress) {
		this.viAddress = viAddress;
	}

	/**
	 * <p>Getter for the field <code>viFine</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViFine() {
		return this.viFine;
	}
	/**
	 * <p>Setter for the field <code>viFine</code>.</p>
	 *
	 * @param viFine a {@link java.lang.String} object.
	 */
	public void setViFine(String viFine) {
		this.viFine = viFine;
	}

	/**
	 * <p>Getter for the field <code>viHandled</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViHandled() {
		return this.viHandled;
	}
	/**
	 * <p>Setter for the field <code>viHandled</code>.</p>
	 *
	 * @param viHandled a {@link java.lang.String} object.
	 */
	public void setViHandled(String viHandled) {
		this.viHandled = viHandled;
	}

	/**
	 * <p>Getter for the field <code>viNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViNumber() {
		return this.viNumber;
	}
	/**
	 * <p>Setter for the field <code>viNumber</code>.</p>
	 *
	 * @param viNumber a {@link java.lang.String} object.
	 */
	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

	/**
	 * <p>Getter for the field <code>viPoint</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViPoint() {
		return this.viPoint;
	}
	/**
	 * <p>Setter for the field <code>viPoint</code>.</p>
	 *
	 * @param viPoint a {@link java.lang.String} object.
	 */
	public void setViPoint(String viPoint) {
		this.viPoint = viPoint;
	}

	/**
	 * <p>Getter for the field <code>viTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getViTime() {
		return this.viTime;
	}
	/**
	 * <p>Setter for the field <code>viTime</code>.</p>
	 *
	 * @param viTime a {@link java.util.Date} object.
	 */
	public void setViTime(Date viTime) {
		this.viTime = viTime;
	}

	/**
	 * <p>Getter for the field <code>viType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViType() {
		return this.viType;
	}
	/**
	 * <p>Setter for the field <code>viType</code>.</p>
	 *
	 * @param viType a {@link java.lang.String} object.
	 */
	public void setViType(String viType) {
		this.viType = viType;
	}

}
