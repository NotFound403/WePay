package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 查询用户的保单列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsUnderwriteUserPolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5628384117947922733L;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页，依次类推。不填默认值为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为20,不填默认值为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询对应的保险干系人
	 */
	@ApiField("person")
	private InsQueryPerson person;

	/**
	 * 查询的保单对于的产品列表。查询返回的结果是这几个产品下的保单,格式为:
[产品码1,产品码2,...]
	 */
	@ApiListField("product_list")
	@ApiField("string")
	private List<String> productList;

	/**
	 * 保单状态.INEFFECTIVE:未生效、GUARANTEE:保障中、EXPIRED:已失效、SURRENDERRED:已退保、ALL: 所有保单  不填默认值为ALL(所有保单)
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNo() {
		return this.pageNo;
	}
	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.Long} object.
	 */
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
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
	 * <p>Getter for the field <code>person</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsQueryPerson} object.
	 */
	public InsQueryPerson getPerson() {
		return this.person;
	}
	/**
	 * <p>Setter for the field <code>person</code>.</p>
	 *
	 * @param person a {@link cn.felord.wepay.ali.sdk.api.domain.InsQueryPerson} object.
	 */
	public void setPerson(InsQueryPerson person) {
		this.person = person;
	}

	/**
	 * <p>Getter for the field <code>productList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getProductList() {
		return this.productList;
	}
	/**
	 * <p>Setter for the field <code>productList</code>.</p>
	 *
	 * @param productList a {@link java.util.List} object.
	 */
	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
