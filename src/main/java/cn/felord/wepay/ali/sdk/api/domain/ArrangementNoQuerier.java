package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 合约号查询器，直接获得合约号
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ArrangementNoQuerier extends AlipayObject {

	private static final long serialVersionUID = 8478943952331293295L;

	/**
	 * 合约编号列表
	 */
	@ApiListField("ar_nos")
	@ApiField("string")
	private List<String> arNos;

	/**
	 * <p>Getter for the field <code>arNos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getArNos() {
		return this.arNos;
	}
	/**
	 * <p>Setter for the field <code>arNos</code>.</p>
	 *
	 * @param arNos a {@link java.util.List} object.
	 */
	public void setArNos(List<String> arNos) {
		this.arNos = arNos;
	}

}
