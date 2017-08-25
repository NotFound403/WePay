package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 即时到账批量退款接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeBatchRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3691589734354251521L;

	/**
	 * 每进行一次即时到账批量退款，都需要提供一个批次号，通过该批次号可以查询这一批次的退款交易记录。对于每一个合作伙伴，传递的每一个批次号都必须保证唯一性。
格式为：退款日期（8位当天日期）+流水号（3～24位，流水号可以接受数字或英文字符，建议使用数字）。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 退款明细的笔数，即参数detail_data的值中，“#”字符出现的数量加1，最大支持1000笔。
	 */
	@ApiField("batch_num")
	private String batchNum;

	/**
	 * 退款明细列表
	 */
	@ApiListField("detail_data")
	@ApiField("refund_detail")
	private List<RefundDetail> detailData;

	/**
	 * 退款请求的当前时间。
格式为：yyyy-MM-dd hh:mm:ss。
	 */
	@ApiField("refund_date")
	private String refundDate;

	/**
	 * 是否使用冻结金额退款。
Y：可以使用冻结金额退款；
N：不可使用冻结金额退款；
如果不提供，则默认值为N。
	 */
	@ApiField("use_freeze_amount")
	private String useFreezeAmount;

	/**
	 * <p>Getter for the field <code>batchNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchNo() {
		return this.batchNo;
	}
	/**
	 * <p>Setter for the field <code>batchNo</code>.</p>
	 *
	 * @param batchNo a {@link java.lang.String} object.
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * <p>Getter for the field <code>batchNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchNum() {
		return this.batchNum;
	}
	/**
	 * <p>Setter for the field <code>batchNum</code>.</p>
	 *
	 * @param batchNum a {@link java.lang.String} object.
	 */
	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	/**
	 * <p>Getter for the field <code>detailData</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RefundDetail> getDetailData() {
		return this.detailData;
	}
	/**
	 * <p>Setter for the field <code>detailData</code>.</p>
	 *
	 * @param detailData a {@link java.util.List} object.
	 */
	public void setDetailData(List<RefundDetail> detailData) {
		this.detailData = detailData;
	}

	/**
	 * <p>Getter for the field <code>refundDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundDate() {
		return this.refundDate;
	}
	/**
	 * <p>Setter for the field <code>refundDate</code>.</p>
	 *
	 * @param refundDate a {@link java.lang.String} object.
	 */
	public void setRefundDate(String refundDate) {
		this.refundDate = refundDate;
	}

	/**
	 * <p>Getter for the field <code>useFreezeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUseFreezeAmount() {
		return this.useFreezeAmount;
	}
	/**
	 * <p>Setter for the field <code>useFreezeAmount</code>.</p>
	 *
	 * @param useFreezeAmount a {@link java.lang.String} object.
	 */
	public void setUseFreezeAmount(String useFreezeAmount) {
		this.useFreezeAmount = useFreezeAmount;
	}

}
