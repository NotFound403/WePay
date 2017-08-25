package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户外部门店查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandMerchantStorelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5765126721695214987L;

	/**
	 * 可选：  true / false 。
当is_include_cognate = true ， 指定pid为空， 查询商户下所有pid的店铺
当is_include_cognate = true ，指定pid不为空时，查询指定pid的店铺
当is_include_cognate = false ，指定pid为空时，   查询当前商pid的店铺
当is_include_cognate = false ，指定pid不为空时，查询指定pid的店铺
	 */
	@ApiField("is_include_cognate")
	private String isIncludeCognate;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页，依次类推。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为30
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 指定的商户pid，如果指定， 只返回此pid的店铺信息。(此pid必须是商户自己的)
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * <p>Getter for the field <code>isIncludeCognate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsIncludeCognate() {
		return this.isIncludeCognate;
	}
	/**
	 * <p>Setter for the field <code>isIncludeCognate</code>.</p>
	 *
	 * @param isIncludeCognate a {@link java.lang.String} object.
	 */
	public void setIsIncludeCognate(String isIncludeCognate) {
		this.isIncludeCognate = isIncludeCognate;
	}

	/**
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNum() {
		return this.pageNum;
	}
	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.Long} object.
	 */
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
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
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid() {
		return this.pid;
	}
	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

}
