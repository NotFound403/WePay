package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.LifeLabel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeLabelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2544811685356648472L;

	/** 
	 * 标签列表
	 */
	@ApiListField("labels")
	@ApiField("life_label")
	private List<LifeLabel> labels;

	/**
	 * <p>Setter for the field <code>labels</code>.</p>
	 *
	 * @param labels a {@link java.util.List} object.
	 */
	public void setLabels(List<LifeLabel> labels) {
		this.labels = labels;
	}
	/**
	 * <p>Getter for the field <code>labels</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<LifeLabel> getLabels( ) {
		return this.labels;
	}

}
