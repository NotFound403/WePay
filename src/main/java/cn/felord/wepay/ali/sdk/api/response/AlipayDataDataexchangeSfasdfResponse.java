package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayItemGoodsList;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.sfasdf response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataexchangeSfasdfResponse extends AlipayResponse {

	private static final long serialVersionUID = 6255497286685797651L;

	/** 
	 * dsfagshdj
	 */
	@ApiListField("azxfghd")
	@ApiField("string")
	private List<String> azxfghd;

	/** 
	 * asghdfsdas阿福故事、
	 */
	@ApiListField("gfdhsdasafg")
	@ApiField("string")
	private List<String> gfdhsdasafg;

	/** 
	 * fgdhjdsfgh
	 */
	@ApiListField("gfhjfdsa")
	@ApiField("string")
	private List<String> gfhjfdsa;

	/** 
	 * sdfdhgjfdfsaghjfd
	 */
	@ApiListField("ghjfdsafgh")
	@ApiField("string")
	private List<String> ghjfdsafgh;

	/** 
	 * sadasff
	 */
	@ApiField("sdvsdv")
	private String sdvsdv;

	/** 
	 * hysasd
	 */
	@ApiListField("wrty")
	@ApiField("alipay_item_goods_list")
	private List<AlipayItemGoodsList> wrty;

	/**
	 * <p>Setter for the field <code>azxfghd</code>.</p>
	 *
	 * @param azxfghd a {@link java.util.List} object.
	 */
	public void setAzxfghd(List<String> azxfghd) {
		this.azxfghd = azxfghd;
	}
	/**
	 * <p>Getter for the field <code>azxfghd</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getAzxfghd( ) {
		return this.azxfghd;
	}

	/**
	 * <p>Setter for the field <code>gfdhsdasafg</code>.</p>
	 *
	 * @param gfdhsdasafg a {@link java.util.List} object.
	 */
	public void setGfdhsdasafg(List<String> gfdhsdasafg) {
		this.gfdhsdasafg = gfdhsdasafg;
	}
	/**
	 * <p>Getter for the field <code>gfdhsdasafg</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getGfdhsdasafg( ) {
		return this.gfdhsdasafg;
	}

	/**
	 * <p>Setter for the field <code>gfhjfdsa</code>.</p>
	 *
	 * @param gfhjfdsa a {@link java.util.List} object.
	 */
	public void setGfhjfdsa(List<String> gfhjfdsa) {
		this.gfhjfdsa = gfhjfdsa;
	}
	/**
	 * <p>Getter for the field <code>gfhjfdsa</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getGfhjfdsa( ) {
		return this.gfhjfdsa;
	}

	/**
	 * <p>Setter for the field <code>ghjfdsafgh</code>.</p>
	 *
	 * @param ghjfdsafgh a {@link java.util.List} object.
	 */
	public void setGhjfdsafgh(List<String> ghjfdsafgh) {
		this.ghjfdsafgh = ghjfdsafgh;
	}
	/**
	 * <p>Getter for the field <code>ghjfdsafgh</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getGhjfdsafgh( ) {
		return this.ghjfdsafgh;
	}

	/**
	 * <p>Setter for the field <code>sdvsdv</code>.</p>
	 *
	 * @param sdvsdv a {@link java.lang.String} object.
	 */
	public void setSdvsdv(String sdvsdv) {
		this.sdvsdv = sdvsdv;
	}
	/**
	 * <p>Getter for the field <code>sdvsdv</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSdvsdv( ) {
		return this.sdvsdv;
	}

	/**
	 * <p>Setter for the field <code>wrty</code>.</p>
	 *
	 * @param wrty a {@link java.util.List} object.
	 */
	public void setWrty(List<AlipayItemGoodsList> wrty) {
		this.wrty = wrty;
	}
	/**
	 * <p>Getter for the field <code>wrty</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayItemGoodsList> getWrty( ) {
		return this.wrty;
	}

}
