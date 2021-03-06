package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统任务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertMissionResponse extends AlipayObject {

	private static final long serialVersionUID = 4174475767984797231L;

	/**
	 * 任务领取时间
	 */
	@ApiField("gmt_claimed")
	private String gmtClaimed;

	/**
	 * 任务结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 任务开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 任务ID
	 */
	@ApiField("mission_id")
	private String missionId;

	/**
	 * 推广状态
EFFECTIVE-有效
INVALID-无效
	 */
	@ApiField("promote_status")
	private String promoteStatus;

	/**
	 * 任务标的列表
	 */
	@ApiListField("subjects")
	@ApiField("kb_advert_subject_response")
	private List<KbAdvertSubjectResponse> subjects;

	/**
	 * <p>Getter for the field <code>gmtClaimed</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtClaimed() {
		return this.gmtClaimed;
	}
	/**
	 * <p>Setter for the field <code>gmtClaimed</code>.</p>
	 *
	 * @param gmtClaimed a {@link java.lang.String} object.
	 */
	public void setGmtClaimed(String gmtClaimed) {
		this.gmtClaimed = gmtClaimed;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>gmtStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtStart() {
		return this.gmtStart;
	}
	/**
	 * <p>Setter for the field <code>gmtStart</code>.</p>
	 *
	 * @param gmtStart a {@link java.lang.String} object.
	 */
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	/**
	 * <p>Getter for the field <code>missionId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMissionId() {
		return this.missionId;
	}
	/**
	 * <p>Setter for the field <code>missionId</code>.</p>
	 *
	 * @param missionId a {@link java.lang.String} object.
	 */
	public void setMissionId(String missionId) {
		this.missionId = missionId;
	}

	/**
	 * <p>Getter for the field <code>promoteStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromoteStatus() {
		return this.promoteStatus;
	}
	/**
	 * <p>Setter for the field <code>promoteStatus</code>.</p>
	 *
	 * @param promoteStatus a {@link java.lang.String} object.
	 */
	public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}

	/**
	 * <p>Getter for the field <code>subjects</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertSubjectResponse> getSubjects() {
		return this.subjects;
	}
	/**
	 * <p>Setter for the field <code>subjects</code>.</p>
	 *
	 * @param subjects a {@link java.util.List} object.
	 */
	public void setSubjects(List<KbAdvertSubjectResponse> subjects) {
		this.subjects = subjects;
	}

}
