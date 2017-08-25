package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.IsvShopDishModel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.dish.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderDishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3852667224516672819L;

	/** 
	 * 总共有多少条菜品信息。可用于计算分页。
	 */
	@ApiField("items")
	private Long items;

	/** 
	 * 菜品列表信息
	 */
	@ApiListField("list")
	@ApiField("isv_shop_dish_model")
	private List<IsvShopDishModel> list;

	/** 
	 * 当前数据所在的页码数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 当前查询结果分页的条数，可用于计算分页
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 当前条件下查询结果总的页码数
	 */
	@ApiField("pages")
	private Long pages;

	/**
	 * <p>Setter for the field <code>items</code>.</p>
	 *
	 * @param items a {@link java.lang.Long} object.
	 */
	public void setItems(Long items) {
		this.items = items;
	}
	/**
	 * <p>Getter for the field <code>items</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getItems( ) {
		return this.items;
	}

	/**
	 * <p>Setter for the field <code>list</code>.</p>
	 *
	 * @param list a {@link java.util.List} object.
	 */
	public void setList(List<IsvShopDishModel> list) {
		this.list = list;
	}
	/**
	 * <p>Getter for the field <code>list</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<IsvShopDishModel> getList( ) {
		return this.list;
	}

	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page a {@link java.lang.Long} object.
	 */
	public void setPage(Long page) {
		this.page = page;
	}
	/**
	 * <p>Getter for the field <code>page</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPage( ) {
		return this.page;
	}

	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize( ) {
		return this.pageSize;
	}

	/**
	 * <p>Setter for the field <code>pages</code>.</p>
	 *
	 * @param pages a {@link java.lang.Long} object.
	 */
	public void setPages(Long pages) {
		this.pages = pages;
	}
	/**
	 * <p>Getter for the field <code>pages</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPages( ) {
		return this.pages;
	}

}
