package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.BenefitInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mpointprod.benefit.detail.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMpointprodBenefitDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2813454168257776441L;

	/** 
	 * 权益详情列表
	 */
	@ApiListField("benefit_infos")
	@ApiField("benefit_info")
	private List<BenefitInfo> benefitInfos;

	/** 
	 * 响应码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 响应描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * <p>Setter for the field <code>benefitInfos</code>.</p>
	 *
	 * @param benefitInfos a {@link java.util.List} object.
	 */
	public void setBenefitInfos(List<BenefitInfo> benefitInfos) {
		this.benefitInfos = benefitInfos;
	}
	/**
	 * <p>Getter for the field <code>benefitInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BenefitInfo> getBenefitInfos( ) {
		return this.benefitInfos;
	}

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

	/** {@inheritDoc} */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * <p>Getter for the field <code>msg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsg( ) {
		return this.msg;
	}

}
