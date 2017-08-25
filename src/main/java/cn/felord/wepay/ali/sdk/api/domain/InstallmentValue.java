package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分段数值，用于存储分期费用和分段还款的分段值
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InstallmentValue extends AlipayObject {

	private static final long serialVersionUID = 4653265769334819128L;

	/**
	 * 分段值
	 */
	@ApiListField("installment_values")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> installmentValues;

	/**
	 * <p>Getter for the field <code>installmentValues</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InstallmentMetaInfo> getInstallmentValues() {
		return this.installmentValues;
	}
	/**
	 * <p>Setter for the field <code>installmentValues</code>.</p>
	 *
	 * @param installmentValues a {@link java.util.List} object.
	 */
	public void setInstallmentValues(List<InstallmentMetaInfo> installmentValues) {
		this.installmentValues = installmentValues;
	}

}
