package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑客推广日期维度汇总数据模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PromoteDateModel extends AlipayObject {

	private static final long serialVersionUID = 5627483277825811818L;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 推广数据
	 */
	@ApiField("promote_data")
	private PromoteDataModel promoteData;

	/**
	 * <p>Getter for the field <code>date</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDate() {
		return this.date;
	}
	/**
	 * <p>Setter for the field <code>date</code>.</p>
	 *
	 * @param date a {@link java.lang.String} object.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * <p>Getter for the field <code>promoteData</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public PromoteDataModel getPromoteData() {
		return this.promoteData;
	}
	/**
	 * <p>Setter for the field <code>promoteData</code>.</p>
	 *
	 * @param promoteData a {@link cn.felord.wepay.ali.sdk.api.domain.PromoteDataModel} object.
	 */
	public void setPromoteData(PromoteDataModel promoteData) {
		this.promoteData = promoteData;
	}

}
