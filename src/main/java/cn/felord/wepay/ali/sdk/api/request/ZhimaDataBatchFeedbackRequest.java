package cn.felord.wepay.ali.sdk.api.request;

import java.util.HashMap;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.FileItem;
import cn.felord.wepay.ali.sdk.api.AlipayUploadRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.ZhimaDataBatchFeedbackResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: zhima.data.batch.feedback request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaDataBatchFeedbackRequest implements AlipayUploadRequest<ZhimaDataBatchFeedbackResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 扩展参数
	 */
	private String bizExtParams;

	/** 
	* 单条数据的数据列，多个列以逗号隔开
	 */
	private String columns;

	/** 
	* 反馈的json格式文件，其中{"records":  是每个文件的固定开头，文件中的字段名请使用数据反馈模板（该模板是通过“获取数据反馈模板”接口获得）中字段编码列的英文字段来组装
	 */
	private FileItem file;

	/** 
	* 是反馈文件的数据编码，如果文件格式是UTF-8，则填写UTF-8，如果文件格式是GBK，则填写GBK
	 */
	private String fileCharset;

	/** 
	* 文件描述信息
	 */
	private String fileDescription;

	/** 
	* 反馈的数据类型
	 */
	private String fileType;

	/** 
	* 主键列使用反馈字段进行组合，也可以使用反馈的某个单字段（确保主键稳定，而且可以很好的区分不同的数据）。例如order_no,pay_month或者order_no,bill_month组合，对于一个order_no只会有一条数据的情况，直接使用order_no作为主键列
	 */
	private String primaryKeyColumns;

	/** 
	* 文件数据记录条数
	 */
	private String records;

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
	 * <p>Setter for the field <code>fileDescription</code>.</p>
	 *
	 * @param fileDescription a {@link java.lang.String} object.
	 */
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	/**
	 * <p>Getter for the field <code>fileDescription</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileDescription() {
		return this.fileDescription;
	}

	/**
	 * <p>Setter for the field <code>fileType</code>.</p>
	 *
	 * @param fileType a {@link java.lang.String} object.
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	/**
	 * <p>Getter for the field <code>fileType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileType() {
		return this.fileType;
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
		return "zhima.data.batch.feedback";
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
		txtParams.put("file_description", this.fileDescription);
		txtParams.put("file_type", this.fileType);
		txtParams.put("primary_key_columns", this.primaryKeyColumns);
		txtParams.put("records", this.records);
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
	public Class<ZhimaDataBatchFeedbackResponse> getResponseClass() {
		return ZhimaDataBatchFeedbackResponse.class;
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
