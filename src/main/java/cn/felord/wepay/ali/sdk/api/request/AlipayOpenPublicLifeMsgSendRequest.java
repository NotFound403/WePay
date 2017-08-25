package cn.felord.wepay.ali.sdk.api.request;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.FileItem;
import cn.felord.wepay.ali.sdk.api.AlipayUploadRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayOpenPublicLifeMsgSendResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.msg.send request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeMsgSendRequest implements AlipayUploadRequest<AlipayOpenPublicLifeMsgSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 消息分类，请传入对应分类编码值
	 */
	private String category;

	/** 
	* 消息正文，html原文或纯文本
	 */
	private String content;

	/** 
	* 消息背景图片（目前支持格式jpg, jpeg, bmp），需上传图片原始二进制流，图片最大1MB
	 */
	private FileItem cover;

	/** 
	* 消息概述
	 */
	private String desc;

	/** 
	* 媒体资讯类生活号消息类型
	 */
	private String msgType;

	/** 
	* 消息来源方附属信息，供搜索、推荐使用
publish_time（int）：消息发布时间，单位秒
keyword_list（String）: 文章的标签列表，英文逗号分隔
comment（int）：消息来源处评论次数
reward（int）：消息来源处打赏次数
is_recommended（boolean）：消息在来源处是否被推荐
is_news（boolean）：消息是否实时性内容
read（int）：消息在来源处被阅读次数
like（int）：消息在来源处被点赞次数
is_hot（boolean）：消息在来源平台是否是热门内容
share（int）：文章在来源平台的分享次数
deadline（int）：文章的失效时间，单位秒
	 */
	private String sourceExtInfo;

	/** 
	* 消息标题
	 */
	private String title;

	/** 
	* 来源方消息唯一标识；若不为空，根据此id和生活号id对消息去重；若为空，不去重
	 */
	private String uniqueMsgId;

	/** 
	* 生活号消息视频时长，单位：秒（视频类消息必填）
	 */
	private String videoLength;

	/** 
	* 视频类型消息中视频抽样关键帧截图，视频类消息选填
	 */
	private List<String> videoSamples;

	/** 
	* 视频大小，单位：KB（视频类消息必填）
	 */
	private String videoSize;

	/** 
	* 视频资源来源id（视频类消息必填），取值限定youku, miaopai, taobao, sina中的一个
	 */
	private String videoSource;

	/** 
	* 视频的临时链接（优酷来源的视频消息，该字段不能为空）
	 */
	private String videoTemporaryUrl;

	/** 
	* 生活号视频类消息视频id或url（视频类消息必填，根据来源区分）
	 */
	private String videoUrl;

	/**
	 * <p>Setter for the field <code>category</code>.</p>
	 *
	 * @param category a {@link java.lang.String} object.
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * <p>Getter for the field <code>category</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * <p>Setter for the field <code>cover</code>.</p>
	 *
	 * @param cover a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setCover(FileItem cover) {
		this.cover = cover;
	}
	/**
	 * <p>Getter for the field <code>cover</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getCover() {
		return this.cover;
	}

	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}

	/**
	 * <p>Setter for the field <code>msgType</code>.</p>
	 *
	 * @param msgType a {@link java.lang.String} object.
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	/**
	 * <p>Getter for the field <code>msgType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsgType() {
		return this.msgType;
	}

	/**
	 * <p>Setter for the field <code>sourceExtInfo</code>.</p>
	 *
	 * @param sourceExtInfo a {@link java.lang.String} object.
	 */
	public void setSourceExtInfo(String sourceExtInfo) {
		this.sourceExtInfo = sourceExtInfo;
	}
	/**
	 * <p>Getter for the field <code>sourceExtInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceExtInfo() {
		return this.sourceExtInfo;
	}

	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * <p>Setter for the field <code>uniqueMsgId</code>.</p>
	 *
	 * @param uniqueMsgId a {@link java.lang.String} object.
	 */
	public void setUniqueMsgId(String uniqueMsgId) {
		this.uniqueMsgId = uniqueMsgId;
	}
	/**
	 * <p>Getter for the field <code>uniqueMsgId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqueMsgId() {
		return this.uniqueMsgId;
	}

	/**
	 * <p>Setter for the field <code>videoLength</code>.</p>
	 *
	 * @param videoLength a {@link java.lang.String} object.
	 */
	public void setVideoLength(String videoLength) {
		this.videoLength = videoLength;
	}
	/**
	 * <p>Getter for the field <code>videoLength</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVideoLength() {
		return this.videoLength;
	}

	/**
	 * <p>Setter for the field <code>videoSamples</code>.</p>
	 *
	 * @param videoSamples a {@link java.util.List} object.
	 */
	public void setVideoSamples(List<String> videoSamples) {
		this.videoSamples = videoSamples;
	}
	/**
	 * <p>Getter for the field <code>videoSamples</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getVideoSamples() {
		return this.videoSamples;
	}

	/**
	 * <p>Setter for the field <code>videoSize</code>.</p>
	 *
	 * @param videoSize a {@link java.lang.String} object.
	 */
	public void setVideoSize(String videoSize) {
		this.videoSize = videoSize;
	}
	/**
	 * <p>Getter for the field <code>videoSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVideoSize() {
		return this.videoSize;
	}

	/**
	 * <p>Setter for the field <code>videoSource</code>.</p>
	 *
	 * @param videoSource a {@link java.lang.String} object.
	 */
	public void setVideoSource(String videoSource) {
		this.videoSource = videoSource;
	}
	/**
	 * <p>Getter for the field <code>videoSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVideoSource() {
		return this.videoSource;
	}

	/**
	 * <p>Setter for the field <code>videoTemporaryUrl</code>.</p>
	 *
	 * @param videoTemporaryUrl a {@link java.lang.String} object.
	 */
	public void setVideoTemporaryUrl(String videoTemporaryUrl) {
		this.videoTemporaryUrl = videoTemporaryUrl;
	}
	/**
	 * <p>Getter for the field <code>videoTemporaryUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVideoTemporaryUrl() {
		return this.videoTemporaryUrl;
	}

	/**
	 * <p>Setter for the field <code>videoUrl</code>.</p>
	 *
	 * @param videoUrl a {@link java.lang.String} object.
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	/**
	 * <p>Getter for the field <code>videoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVideoUrl() {
		return this.videoUrl;
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
		return "alipay.open.public.life.msg.send";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category", this.category);
		txtParams.put("content", this.content);
		txtParams.put("desc", this.desc);
		txtParams.put("msg_type", this.msgType);
		txtParams.put("source_ext_info", this.sourceExtInfo);
		txtParams.put("title", this.title);
		txtParams.put("unique_msg_id", this.uniqueMsgId);
		txtParams.put("video_length", this.videoLength);
		txtParams.put("video_samples", this.videoSamples);
		txtParams.put("video_size", this.videoSize);
		txtParams.put("video_source", this.videoSource);
		txtParams.put("video_temporary_url", this.videoTemporaryUrl);
		txtParams.put("video_url", this.videoUrl);
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
		params.put("cover", this.cover);
		return params;
	}

	/**
	 * <p>getResponseClass.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<AlipayOpenPublicLifeMsgSendResponse> getResponseClass() {
		return AlipayOpenPublicLifeMsgSendResponse.class;
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
