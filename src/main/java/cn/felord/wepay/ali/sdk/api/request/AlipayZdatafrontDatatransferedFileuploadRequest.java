package cn.felord.wepay.ali.sdk.api.request;

import java.util.HashMap;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.FileItem;
import cn.felord.wepay.ali.sdk.api.AlipayUploadRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayZdatafrontDatatransferedFileuploadResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.fileupload request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZdatafrontDatatransferedFileuploadRequest implements AlipayUploadRequest<AlipayZdatafrontDatatransferedFileuploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 合作伙伴上传文件中的各字段,使用英文半角","分隔，file_type为json_data时必选
	 */
	private String columns;

	/** 
	* 二进制字节数组，由文件转出，最大支持50M文件的上传
	 */
	private FileItem file;

	/** 
	* 文件描述信息，非解析数据类型必选
	 */
	private String fileDescription;

	/** 
	* 文件摘要，算法SHA
	 */
	private String fileDigest;

	/** 
	* 描述上传文件的类型
	 */
	private String fileType;

	/** 
	* 上传数据文件的主键字段，注意该pk若出现重复则后入数据会覆盖前面的，file_type为json_data时必选
	 */
	private String primaryKey;

	/** 
	* 上传数据文件包含的记录数，file_type为json_data时必选
	 */
	private Long records;

	/** 
	* 外部公司的数据源标识信息，由联接网络分配
	 */
	private String typeId;

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
	 * <p>Setter for the field <code>fileDigest</code>.</p>
	 *
	 * @param fileDigest a {@link java.lang.String} object.
	 */
	public void setFileDigest(String fileDigest) {
		this.fileDigest = fileDigest;
	}
	/**
	 * <p>Getter for the field <code>fileDigest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileDigest() {
		return this.fileDigest;
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
	 * <p>Setter for the field <code>primaryKey</code>.</p>
	 *
	 * @param primaryKey a {@link java.lang.String} object.
	 */
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}
	/**
	 * <p>Getter for the field <code>primaryKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrimaryKey() {
		return this.primaryKey;
	}

	/**
	 * <p>Setter for the field <code>records</code>.</p>
	 *
	 * @param records a {@link java.lang.Long} object.
	 */
	public void setRecords(Long records) {
		this.records = records;
	}
	/**
	 * <p>Getter for the field <code>records</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRecords() {
		return this.records;
	}

	/**
	 * <p>Setter for the field <code>typeId</code>.</p>
	 *
	 * @param typeId a {@link java.lang.String} object.
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	/**
	 * <p>Getter for the field <code>typeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTypeId() {
		return this.typeId;
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
		return "alipay.zdatafront.datatransfered.fileupload";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("columns", this.columns);
		txtParams.put("file_description", this.fileDescription);
		txtParams.put("file_digest", this.fileDigest);
		txtParams.put("file_type", this.fileType);
		txtParams.put("primary_key", this.primaryKey);
		txtParams.put("records", this.records);
		txtParams.put("type_id", this.typeId);
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
	public Class<AlipayZdatafrontDatatransferedFileuploadResponse> getResponseClass() {
		return AlipayZdatafrontDatatransferedFileuploadResponse.class;
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
