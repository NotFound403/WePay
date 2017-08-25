package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 洗车保养的订单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MaintainBizOrder extends AlipayObject {

	private static final long serialVersionUID = 7689639534716662298L;

	/**
	 * 原始金额。服务对应原始价格。对应划掉的服务价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("origin_cost")
	private String originCost;

	/**
	 * 外部服务商品编码。下单时记录ISV服务商品唯一标示。用于区分不同商品
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 销售金额。服务真实售卖单价。金额单位(元)，保留两位小数。
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 数量
	 */
	@ApiField("sale_num")
	private Long saleNum;

	/**
	 * 车主平台服务类目编号。  
洗车类：
4:普通洗车-5座
5:普通洗车-7座
6:精细洗车-5座
7:精细洗车-7座
保养类：
12:更换机油、机滤
4S保养类：
401001:更换机油(4S)  
401001:更换机油滤清器(4S)  
401001:更换油塞密封垫片(4S)
401001:更换空气滤清器(4S)  
401001:更换空调滤清器(4S)  
401001:更换燃油滤清器(4S)  
401001:更换制动液(4S)  
401001:更换火花塞(4S)  
401001:更换手动变速器油(4S)  
401001:更换自动变速箱油(4S)
401001:更换冷却液(4S)  
401001:更换转向油(4S)
401001:更换助力油(4S)
401001:发送机正时套件(4S)  
401001:碳罐(4S)  
401001:轮胎换位(4S)  
401001:离合器油(4S)  
401001:传动皮带套件(4S)  
401001:冷媒（4S） 
4S养护类：
402001:清洗节气门(4S)
402001:清洗喷油嘴(4S)
402001:清洗三元催化(4S)
402001:清洗进气道(4S)
402001:添加新车保护剂(4S)
402001:发动机润滑系统清洗(4S)
402001:发动机内部保护(4S)
	 */
	@ApiField("service_category_id")
	private Long serviceCategoryId;

	/**
	 * <p>Getter for the field <code>originCost</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginCost() {
		return this.originCost;
	}
	/**
	 * <p>Setter for the field <code>originCost</code>.</p>
	 *
	 * @param originCost a {@link java.lang.String} object.
	 */
	public void setOriginCost(String originCost) {
		this.originCost = originCost;
	}

	/**
	 * <p>Getter for the field <code>outProductId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutProductId() {
		return this.outProductId;
	}
	/**
	 * <p>Setter for the field <code>outProductId</code>.</p>
	 *
	 * @param outProductId a {@link java.lang.String} object.
	 */
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
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

	/**
	 * <p>Getter for the field <code>serviceCategoryId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getServiceCategoryId() {
		return this.serviceCategoryId;
	}
	/**
	 * <p>Setter for the field <code>serviceCategoryId</code>.</p>
	 *
	 * @param serviceCategoryId a {@link java.lang.Long} object.
	 */
	public void setServiceCategoryId(Long serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
	}

}
