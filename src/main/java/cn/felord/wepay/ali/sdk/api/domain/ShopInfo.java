package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 店铺信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopInfo extends AlipayObject {

	private static final long serialVersionUID = 6715329884249923487L;

	/**
	 * 企业门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺内景图片，如要签约当面付产品，需上传3张店铺内景图片
	 */
	@ApiListField("shop_scene_pic")
	@ApiField("string")
	private List<String> shopScenePic;

	/**
	 * 店铺门头照图片
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

	/**
	 * <p>Getter for the field <code>shopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * <p>Setter for the field <code>shopName</code>.</p>
	 *
	 * @param shopName a {@link java.lang.String} object.
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * <p>Getter for the field <code>shopScenePic</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopScenePic() {
		return this.shopScenePic;
	}
	/**
	 * <p>Setter for the field <code>shopScenePic</code>.</p>
	 *
	 * @param shopScenePic a {@link java.util.List} object.
	 */
	public void setShopScenePic(List<String> shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

	/**
	 * <p>Getter for the field <code>shopSignBoardPic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}
	/**
	 * <p>Setter for the field <code>shopSignBoardPic</code>.</p>
	 *
	 * @param shopSignBoardPic a {@link java.lang.String} object.
	 */
	public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

}
