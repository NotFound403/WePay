package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 凭证分页查询列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsCertificatePaginationList extends AlipayObject {

	private static final long serialVersionUID = 3696194984731749791L;

	/**
	 * 当前页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 结果列表
	 */
	@ApiListField("list")
	@ApiField("ins_certificate_api_d_t_o")
	private List<InsCertificateApiDTO> list;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 全部页数
	 */
	@ApiField("total_page_num")
	private Long totalPageNum;

	/**
	 * <p>Getter for the field <code>currentPage</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPage() {
		return this.currentPage;
	}
	/**
	 * <p>Setter for the field <code>currentPage</code>.</p>
	 *
	 * @param currentPage a {@link java.lang.Long} object.
	 */
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * <p>Getter for the field <code>list</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsCertificateApiDTO> getList() {
		return this.list;
	}
	/**
	 * <p>Setter for the field <code>list</code>.</p>
	 *
	 * @param list a {@link java.util.List} object.
	 */
	public void setList(List<InsCertificateApiDTO> list) {
		this.list = list;
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
	 * <p>Getter for the field <code>totalCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalCount() {
		return this.totalCount;
	}
	/**
	 * <p>Setter for the field <code>totalCount</code>.</p>
	 *
	 * @param totalCount a {@link java.lang.Long} object.
	 */
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * <p>Getter for the field <code>totalPageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalPageNum() {
		return this.totalPageNum;
	}
	/**
	 * <p>Setter for the field <code>totalPageNum</code>.</p>
	 *
	 * @param totalPageNum a {@link java.lang.Long} object.
	 */
	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

}
