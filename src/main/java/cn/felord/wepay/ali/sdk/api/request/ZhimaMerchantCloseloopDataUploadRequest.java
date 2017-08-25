package cn.felord.wepay.ali.sdk.api.request;

import java.util.HashMap;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.FileItem;
import cn.felord.wepay.ali.sdk.api.AlipayUploadRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.ZhimaMerchantCloseloopDataUploadResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: zhima.merchant.closeloop.data.upload request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantCloseloopDataUploadRequest implements AlipayUploadRequest<ZhimaMerchantCloseloopDataUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 公用回传参数（非必填），该参数会透传给商户，商户可以用于业务逻辑处理，请使用json格式。
	 */
	private String bizExtParams;

	/** 
	* 单条数据的数据列，多个列以逗号隔开。
	 */
	private String columns;

	/** 
	* 传入的json格式的文件，其中records属性必填。json中的字段可以通过如下步骤获取：首先调用zhima.merchant.data.upload.initialize接口获取数据模板，该接口会返回一个数据模板文件的url地址，如：http://zmxymerchant-prod.oss-cn-shenzhen.zmxy.com.cn/openApi/openDoc/信用护航-负面记录和信用足迹商户数据模板V1.0.xlsx，该数据模板文件详细列出了需要传入的字段，及各字段的要求，data中的各字段就是该文件中列出的字段编码。
	 */
	private FileItem file;

	/** 
	* 文件的编码，如果文件格式是UTF-8，则填写UTF-8，如果文件格式是GBK，则填写GBK。
	 */
	private String fileCharset;

	/** 
	* 主键列使用传入字段进行组合，也可以使用传入的某个单字段（确保主键稳定，而且可以很好的区分不同的数据）。例如order_no,pay_month或者order_no,bill_month组合，对于一个order_no只会有一条数据的情况，直接使用order_no作为主键列。
	 */
	private String primaryKeyColumns;

	/** 
	* 文件数据记录条数，如file字段中的record数组有10条数据，那么就填10。
	 */
	private String records;

	/** 
	* 数据应用的场景编码 ，场景码和场景名称（数字为场景码）如下：
1:负面披露
2:信用足迹
3:负面+足迹
4:信用守护
5:负面+守护
6:足迹+守护
7:负面+足迹+守护
8:数据反馈
32:骑行
每个场景码对应的数据模板不一样，请使用zhima.merchant.data.upload.initialize接口获取场景码对应的数据模板。
	 */
	private String sceneCode;

	/**
	 * <p>Setter for the field <code>bizExtParams</code>.</p>
	 *
	 * @param bizExtParams a {@link java.lang.String} object.
	 */
	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	/**
	 * <p>Getter for the field <code>bizExtParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizExtParams() {
		return this.bizExtParams;
	}

	/**
	 * <p>Setter for the field <code>columns</code>.</p>
	 *
	 * @param columns a {@link java.lang.String} object.
	 */
	public void setColumns(String columns) {
		this.columns = columns;
	}
	/**
	 * <p>Getter for the field <code>columns</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColumns() {
		return this.columns;
	}

	/**
	 * <p>Setter for the field <code>file</code>.</p>
	 *
	 * @param file a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setFile(FileItem file) {
		this.file = file;
	}
	/**
	 * <p>Getter for the field <code>file</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getFile() {
		return this.file;
	}

	/**
	 * <p>Setter for the field <code>fileCharset</code>.</p>
	 *
	 * @param fileCharset a {@link java.lang.String} object.
	 */
	public void setFileCharset(String fileCharset) {
		this.fileCharset = fileCharset;
	}
	/**
	 * <p>Getter for the field <code>fileCharset</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileCharset() {
		return this.fileCharset;
	}

	/**
	 * <p>Setter for the field <code>primaryKeyColumns</code>.</p>
	 *
	 * @param primaryKeyColumns a {@link java.lang.String} object.
	 */
	public void setPrimaryKeyColumns(String primaryKeyColumns) {
		this.primaryKeyColumns = primaryKeyColumns;
	}
	/**
	 * <p>Getter for the field <code>primaryKeyColumns</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrimaryKeyColumns() {
		return this.primaryKeyColumns;
	}

	/**
	 * <p>Setter for the field <code>records</code>.</p>
	 *
	 * @param records a {@link java.lang.String} object.
	 */
	public void setRecords(String records) {
		this.records = records;
	}
	/**
	 * <p>Getter for the field <code>records</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecords() {
		return this.records;
	}

	/**
	 * <p>Setter for the field <code>sceneCode</code>.</p>
	 *
	 * @param sceneCode a {@link java.lang.String} object.
	 */
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	/**
	 * <p>Getter for the field <code>sceneCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneCode() {
		return this.sceneCode;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	/**
	 * <p>Getter for the field <code>notifyUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	/** {@inheritDoc} */
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	/**
	 * <p>Getter for the field <code>returnUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReturnUrl() {
		return this.returnUrl;
	}

	/** {@inheritDoc} */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * <p>Getter for the field <code>apiVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApiVersion() {
		return this.apiVersion;
	}
	/** {@inheritDoc} */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/** {@inheritDoc} */
	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    /**
     * <p>Getter for the field <code>terminalType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalType(){
    	return this.terminalType;
    }

    /** {@inheritDoc} */
    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    /**
     * <p>Getter for the field <code>terminalInfo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode; 
	}
	
	/** {@inheritDoc} */
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	/**
	 * <p>getApiMethodName.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApiMethodName() {
		return "zhima.merchant.closeloop.data.upload";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_ext_params", this.bizExtParams);
		txtParams.put("columns", this.columns);
		txtParams.put("file_charset", this.fileCharset);
		txtParams.put("primary_key_columns", this.primaryKeyColumns);
		txtParams.put("records", this.records);
		txtParams.put("scene_code", this.sceneCode);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	/**
	 * <p>putOtherTextParam.</p>
	 *
	 * @param key a {@link java.lang.String} object.
	 * @param value a {@link java.lang.String} object.
	 */
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	/**
	 * <p>getFileParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file", this.file);
		return params;
	}

	/**
	 * <p>getResponseClass.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<ZhimaMerchantCloseloopDataUploadResponse> getResponseClass() {
		return ZhimaMerchantCloseloopDataUploadResponse.class;
	}
	
	 /**
	  * <p>isNeedEncrypt.</p>
	  *
	  * @return a boolean.
	  */
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    /** {@inheritDoc} */
    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    /**
     * <p>Getter for the field <code>bizModel</code>.</p>
     *
     * @return a {@link cn.felord.wepay.ali.sdk.api.AlipayObject} object.
     */
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    /** {@inheritDoc} */
    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
