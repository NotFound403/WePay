package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.InfoCode;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.rainscore.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceRiskRainscoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3788215585756682538L;

	/** 
	 * 风险解释，即本次风险评分中TOP 3风险因子的代码、名称、解释、风险倍数（JSON格式）。详情请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=214&articleId=104588&docType=1">《风险解释与身份标签》</a>
	 */
	@ApiListField("infocode")
	@ApiField("info_code")
	private List<InfoCode> infocode;

	/** 
	 * 身份标签，即本次风险评分中评分主体（手机号）相关自然人的推测身份，例如：Scalper_3C（3C行业黄牛）等。没有与当前风险类型相关的推测身份时，身份标签可能为空。详情及申请方式请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=214&articleId=104588&docType=1#s1">《风险解释及身份标签》</a>
	 */
	@ApiListField("label")
	@ApiField("string")
	private List<String> label;

	/** 
	 * 风险评分，范围为[0,100]，评分越高风险越大
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 用户唯一请求id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * <p>Setter for the field <code>infocode</code>.</p>
	 *
	 * @param infocode a {@link java.util.List} object.
	 */
	public void setInfocode(List<InfoCode> infocode) {
		this.infocode = infocode;
	}
	/**
	 * <p>Getter for the field <code>infocode</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InfoCode> getInfocode( ) {
		return this.infocode;
	}

	/**
	 * <p>Setter for the field <code>label</code>.</p>
	 *
	 * @param label a {@link java.util.List} object.
	 */
	public void setLabel(List<String> label) {
		this.label = label;
	}
	/**
	 * <p>Getter for the field <code>label</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getLabel( ) {
		return this.label;
	}

	/**
	 * <p>Setter for the field <code>score</code>.</p>
	 *
	 * @param score a {@link java.lang.String} object.
	 */
	public void setScore(String score) {
		this.score = score;
	}
	/**
	 * <p>Getter for the field <code>score</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScore( ) {
		return this.score;
	}

	/**
	 * <p>Setter for the field <code>uniqueId</code>.</p>
	 *
	 * @param uniqueId a {@link java.lang.String} object.
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	/**
	 * <p>Getter for the field <code>uniqueId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
