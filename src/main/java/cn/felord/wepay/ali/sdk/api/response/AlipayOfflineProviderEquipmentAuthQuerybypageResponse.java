package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.EquipmentAuthRemoveQueryBypageDTO;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.equipment.auth.querybypage response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderEquipmentAuthQuerybypageResponse extends AlipayResponse {

	private static final long serialVersionUID = 7736712325355882951L;

	/** 
	 * 机具解绑按照条件分页查询返回信息
	 */
	@ApiListField("equipmentauthremovequerybypagelist")
	@ApiField("equipment_auth_remove_query_bypage_d_t_o")
	private List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	/**
	 * <p>Setter for the field <code>equipmentauthremovequerybypagelist</code>.</p>
	 *
	 * @param equipmentauthremovequerybypagelist a {@link java.util.List} object.
	 */
	public void setEquipmentauthremovequerybypagelist(List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist) {
		this.equipmentauthremovequerybypagelist = equipmentauthremovequerybypagelist;
	}
	/**
	 * <p>Getter for the field <code>equipmentauthremovequerybypagelist</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<EquipmentAuthRemoveQueryBypageDTO> getEquipmentauthremovequerybypagelist( ) {
		return this.equipmentauthremovequerybypagelist;
	}

	/**
	 * <p>Setter for the field <code>total</code>.</p>
	 *
	 * @param total a {@link java.lang.Long} object.
	 */
	public void setTotal(Long total) {
		this.total = total;
	}
	/**
	 * <p>Getter for the field <code>total</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotal( ) {
		return this.total;
	}

}
