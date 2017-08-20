package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分段数值，用于存储分期费用和分段还款的分段值
 *
 * @author auto create
 * @since 1.0, 2017-05-19 11:45:39
 */
public class InstallmentValue extends AlipayObject {

	private static final long serialVersionUID = 4653265769334819128L;

	/**
	 * 分段值
	 */
	@ApiListField("installment_values")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> installmentValues;

	public List<InstallmentMetaInfo> getInstallmentValues() {
		return this.installmentValues;
	}
	public void setInstallmentValues(List<InstallmentMetaInfo> installmentValues) {
		this.installmentValues = installmentValues;
	}

}
