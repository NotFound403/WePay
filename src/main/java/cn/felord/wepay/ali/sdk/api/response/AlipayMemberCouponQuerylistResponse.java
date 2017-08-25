package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.Coupon;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.coupon.querylist response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMemberCouponQuerylistResponse extends AlipayResponse {

	private static final long serialVersionUID = 2163235589758259524L;

	/** 
	 * 券信息数组.
如果没有查询到券信息，则为数组长度为0。
否则返回券信息数组
	 */
	@ApiListField("coupon_list")
	@ApiField("coupon")
	private List<Coupon> couponList;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数为错误代码，参见“7  错误码”。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数返回具体的错误原因。
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 本轮查询返回的数量
	 */
	@ApiField("list_size")
	private String listSize;

	/** 
	 * 整个业务处理成功时
返回T否则返回F。
具体的错误码和 信息科参考error_code和error_msg信息
	 */
	@ApiField("success_code")
	private String successCode;

	/** 
	 * 总记录数
	 */
	@ApiField("total_num")
	private String totalNum;

	/**
	 * <p>Setter for the field <code>couponList</code>.</p>
	 *
	 * @param couponList a {@link java.util.List} object.
	 */
	public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}
	/**
	 * <p>Getter for the field <code>couponList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Coupon> getCouponList( ) {
		return this.couponList;
	}

	/** {@inheritDoc} */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * <p>Getter for the field <code>errorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorCode( ) {
		return this.errorCode;
	}

	/**
	 * <p>Setter for the field <code>errorMsg</code>.</p>
	 *
	 * @param errorMsg a {@link java.lang.String} object.
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * <p>Getter for the field <code>errorMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	/**
	 * <p>Setter for the field <code>listSize</code>.</p>
	 *
	 * @param listSize a {@link java.lang.String} object.
	 */
	public void setListSize(String listSize) {
		this.listSize = listSize;
	}
	/**
	 * <p>Getter for the field <code>listSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getListSize( ) {
		return this.listSize;
	}

	/**
	 * <p>Setter for the field <code>successCode</code>.</p>
	 *
	 * @param successCode a {@link java.lang.String} object.
	 */
	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}
	/**
	 * <p>Getter for the field <code>successCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSuccessCode( ) {
		return this.successCode;
	}

	/**
	 * <p>Setter for the field <code>totalNum</code>.</p>
	 *
	 * @param totalNum a {@link java.lang.String} object.
	 */
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * <p>Getter for the field <code>totalNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalNum( ) {
		return this.totalNum;
	}

}
