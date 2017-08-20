package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 查询用户的保单列表
 *
 * @author auto create
 * @since 1.0, 2017-07-20 21:55:46
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

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public InsQueryPerson getPerson() {
		return this.person;
	}
	public void setPerson(InsQueryPerson person) {
		this.person = person;
	}

	public List<String> getProductList() {
		return this.productList;
	}
	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
