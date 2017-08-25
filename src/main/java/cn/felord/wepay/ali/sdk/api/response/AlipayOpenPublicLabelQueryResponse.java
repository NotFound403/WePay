package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.PublicLabel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7468154495799779787L;

	/** 
	 * 该服务窗拥有的标签列表
	 */
	@ApiListField("label_list")
	@ApiField("public_label")
	private List<PublicLabel> labelList;

	/**
	 * <p>Setter for the field <code>labelList</code>.</p>
	 *
	 * @param labelList a {@link java.util.List} object.
	 */
	public void setLabelList(List<PublicLabel> labelList) {
		this.labelList = labelList;
	}
	/**
	 * <p>Getter for the field <code>labelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PublicLabel> getLabelList( ) {
		return this.labelList;
	}

}
