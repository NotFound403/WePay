package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 教育缴费账单发送接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduKtBillingSendModel extends AlipayObject {

	private static final long serialVersionUID = 1367411745231747742L;

	/**
	 * 总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 缴费账单名称
	 */
	@ApiField("charge_bill_title")
	private String chargeBillTitle;

	/**
	 * 缴费详情：输入json格式字符串。Json定义：key填写缴费项名称，value填写缴费项金额，金额保留2位小数
	 */
	@ApiListField("charge_item")
	@ApiField("charge_items")
	private List<ChargeItems> chargeItem;

	/**
	 * 孩子名字
	 */
	@ApiField("child_name")
	private String childName;

	/**
	 * 孩子所在班级
	 */
	@ApiField("class_in")
	private String classIn;

	/**
	 * 截止日期是否生效，与gmt_end_time发布配合使用,N为gmt_end_time不生效，用户过期后仍可以缴费；Y为gmt_end_time生效，用户过期后，不能再缴费。
	 */
	@ApiField("end_enable")
	private String endEnable;

	/**
	 * 缴费截止时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 孩子所在年级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * ISV端的缴费账单编号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * ISV_NO, 支付宝签约后，返回给ISV编号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 学校编码，录入学校接口返回的参数
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 用于删除孩子，状态为“D”，表示删除孩子，状态“U”表示孩子信息添加或更新
	 */
	@ApiField("status")
	private String status;

	/**
	 * 学生的学号，一般以教育局学号为准，作为学生的唯一标识。此字段与student_identify、家长user_mobile至少选一个
	 */
	@ApiField("student_code")
	private String studentCode;

	/**
	 * 学生的身份证号，如果ISV有学生身份证号，则同步身份证号作为学生唯一标识。此字段与student_code、家长user_mobile至少选一个
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/**
	 * 孩子的家长信息，最多一次输入20个家长，此字段做为识别家长的孩子用，与student_identify、student_code至少选一个
	 */
	@ApiListField("users")
	@ApiField("user_details")
	private List<UserDetails> users;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>chargeBillTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeBillTitle() {
		return this.chargeBillTitle;
	}
	/**
	 * <p>Setter for the field <code>chargeBillTitle</code>.</p>
	 *
	 * @param chargeBillTitle a {@link java.lang.String} object.
	 */
	public void setChargeBillTitle(String chargeBillTitle) {
		this.chargeBillTitle = chargeBillTitle;
	}

	/**
	 * <p>Getter for the field <code>chargeItem</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ChargeItems> getChargeItem() {
		return this.chargeItem;
	}
	/**
	 * <p>Setter for the field <code>chargeItem</code>.</p>
	 *
	 * @param chargeItem a {@link java.util.List} object.
	 */
	public void setChargeItem(List<ChargeItems> chargeItem) {
		this.chargeItem = chargeItem;
	}

	/**
	 * <p>Getter for the field <code>childName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChildName() {
		return this.childName;
	}
	/**
	 * <p>Setter for the field <code>childName</code>.</p>
	 *
	 * @param childName a {@link java.lang.String} object.
	 */
	public void setChildName(String childName) {
		this.childName = childName;
	}

	/**
	 * <p>Getter for the field <code>classIn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClassIn() {
		return this.classIn;
	}
	/**
	 * <p>Setter for the field <code>classIn</code>.</p>
	 *
	 * @param classIn a {@link java.lang.String} object.
	 */
	public void setClassIn(String classIn) {
		this.classIn = classIn;
	}

	/**
	 * <p>Getter for the field <code>endEnable</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndEnable() {
		return this.endEnable;
	}
	/**
	 * <p>Setter for the field <code>endEnable</code>.</p>
	 *
	 * @param endEnable a {@link java.lang.String} object.
	 */
	public void setEndEnable(String endEnable) {
		this.endEnable = endEnable;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>grade</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGrade() {
		return this.grade;
	}
	/**
	 * <p>Setter for the field <code>grade</code>.</p>
	 *
	 * @param grade a {@link java.lang.String} object.
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}
	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * <p>Getter for the field <code>schoolNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolNo() {
		return this.schoolNo;
	}
	/**
	 * <p>Setter for the field <code>schoolNo</code>.</p>
	 *
	 * @param schoolNo a {@link java.lang.String} object.
	 */
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

	/**
	 * <p>Getter for the field <code>schoolPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolPid() {
		return this.schoolPid;
	}
	/**
	 * <p>Setter for the field <code>schoolPid</code>.</p>
	 *
	 * @param schoolPid a {@link java.lang.String} object.
	 */
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>studentCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStudentCode() {
		return this.studentCode;
	}
	/**
	 * <p>Setter for the field <code>studentCode</code>.</p>
	 *
	 * @param studentCode a {@link java.lang.String} object.
	 */
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	/**
	 * <p>Getter for the field <code>studentIdentify</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStudentIdentify() {
		return this.studentIdentify;
	}
	/**
	 * <p>Setter for the field <code>studentIdentify</code>.</p>
	 *
	 * @param studentIdentify a {@link java.lang.String} object.
	 */
	public void setStudentIdentify(String studentIdentify) {
		this.studentIdentify = studentIdentify;
	}

	/**
	 * <p>Getter for the field <code>users</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<UserDetails> getUsers() {
		return this.users;
	}
	/**
	 * <p>Setter for the field <code>users</code>.</p>
	 *
	 * @param users a {@link java.util.List} object.
	 */
	public void setUsers(List<UserDetails> users) {
		this.users = users;
	}

}
