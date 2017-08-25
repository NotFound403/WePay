package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 洗车保养订单的商品
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MaintainBizOrderGoods extends AlipayObject {

	private static final long serialVersionUID = 8157977554327977798L;

	/**
	 * 商品图片地址，下单时记录的商品图片
	 */
	@ApiField("goods_image")
	private String goodsImage;

	/**
	 * 车主平台商品子订单id。保养订单对应商品子订单表id
	 */
	@ApiField("order_goods_id")
	private String orderGoodsId;

	/**
	 * 原始价格，下单时商品的原始价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("original_cost")
	private String originalCost;

	/**
	 * 外部商品编码
	 */
	@ApiField("out_goods_no")
	private String outGoodsNo;

	/**
	 * 外部商品套餐唯一标示。下单时记录的ISV端商品套餐主键
	 */
	@ApiField("out_package_id")
	private String outPackageId;

	/**
	 * 外部套餐名称。下单时记录的商品套餐名称，在商品详情页时透出显示
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 销售价格，下单时商品的销售价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 商品购买数量
	 */
	@ApiField("sale_num")
	private Long saleNum;

	/**
	 * <p>Getter for the field <code>goodsImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsImage() {
		return this.goodsImage;
	}
	/**
	 * <p>Setter for the field <code>goodsImage</code>.</p>
	 *
	 * @param goodsImage a {@link java.lang.String} object.
	 */
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	/**
	 * <p>Getter for the field <code>orderGoodsId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderGoodsId() {
		return this.orderGoodsId;
	}
	/**
	 * <p>Setter for the field <code>orderGoodsId</code>.</p>
	 *
	 * @param orderGoodsId a {@link java.lang.String} object.
	 */
	public void setOrderGoodsId(String orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	/**
	 * <p>Getter for the field <code>originalCost</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalCost() {
		return this.originalCost;
	}
	/**
	 * <p>Setter for the field <code>originalCost</code>.</p>
	 *
	 * @param originalCost a {@link java.lang.String} object.
	 */
	public void setOriginalCost(String originalCost) {
		this.originalCost = originalCost;
	}

	/**
	 * <p>Getter for the field <code>outGoodsNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutGoodsNo() {
		return this.outGoodsNo;
	}
	/**
	 * <p>Setter for the field <code>outGoodsNo</code>.</p>
	 *
	 * @param outGoodsNo a {@link java.lang.String} object.
	 */
	public void setOutGoodsNo(String outGoodsNo) {
		this.outGoodsNo = outGoodsNo;
	}

	/**
	 * <p>Getter for the field <code>outPackageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutPackageId() {
		return this.outPackageId;
	}
	/**
	 * <p>Setter for the field <code>outPackageId</code>.</p>
	 *
	 * @param outPackageId a {@link java.lang.String} object.
	 */
	public void setOutPackageId(String outPackageId) {
		this.outPackageId = outPackageId;
	}

	/**
	 * <p>Getter for the field <code>packageName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPackageName() {
		return this.packageName;
	}
	/**
	 * <p>Setter for the field <code>packageName</code>.</p>
	 *
	 * @param packageName a {@link java.lang.String} object.
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * <p>Getter for the field <code>realCost</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealCost() {
		return this.realCost;
	}
	/**
	 * <p>Setter for the field <code>realCost</code>.</p>
	 *
	 * @param realCost a {@link java.lang.String} object.
	 */
	public void setRealCost(String realCost) {
		this.realCost = realCost;
	}

	/**
	 * <p>Getter for the field <code>saleNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSaleNum() {
		return this.saleNum;
	}
	/**
	 * <p>Setter for the field <code>saleNum</code>.</p>
	 *
	 * @param saleNum a {@link java.lang.Long} object.
	 */
	public void setSaleNum(Long saleNum) {
		this.saleNum = saleNum;
	}

}
