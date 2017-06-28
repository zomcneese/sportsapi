package com.sportsdata.tracker.team;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DefPlayerStats {
	
	@SerializedName("defForcedFum")
	@Expose
	private Integer defForcedFum;
	@SerializedName("rosterId")
	@Expose
	private Integer rosterId;
	@SerializedName("defTotalTackles")
	@Expose
	private Integer defTotalTackles;
	@SerializedName("defInts")
	@Expose
	private Integer defInts;
	@SerializedName("defPts")
	@Expose
	private Integer defPts;
	@SerializedName("defIntReturnYds")
	@Expose
	private Integer defIntReturnYds;
	@SerializedName("statsId")
	@Expose
	private Integer statsId;
	@SerializedName("seasonIndex")
	@Expose
	private Integer seasonIndex;
	@SerializedName("scheduleId")
	@Expose
	private Integer scheduleId;
	@SerializedName("defCatchAllowed")
	@Expose
	private Integer defCatchAllowed;
	@SerializedName("stageIndex")
	@Expose
	private Integer stageIndex;
	@SerializedName("defDeflections")
	@Expose
	private Integer defDeflections;
	@SerializedName("defSafties")
	@Expose
	private Integer defSafties;
	@SerializedName("defFumRec")
	@Expose
	private Integer defFumRec;
	@SerializedName("teamId")
	@Expose
	private Integer teamId;
	@SerializedName("defSacks")
	@Expose
	private Integer defSacks;
	@SerializedName("fullName")
	@Expose
	private String fullName;
	@SerializedName("weekIndex")
	@Expose
	private Integer weekIndex;
	@SerializedName("defTDs")
	@Expose
	private Integer defTDs;
	
	public Integer getDefForcedFum() {
		return defForcedFum;
	}
	public void setDefForcedFum(Integer defForcedFum) {
		this.defForcedFum = defForcedFum;
	}
	public Integer getRosterId() {
		return rosterId;
	}
	public void setRosterId(Integer rosterId) {
		this.rosterId = rosterId;
	}
	public Integer getDefTotalTackles() {
		return defTotalTackles;
	}
	public void setDefTotalTackles(Integer defTotalTackles) {
		this.defTotalTackles = defTotalTackles;
	}
	public Integer getDefInts() {
		return defInts;
	}
	public void setDefInts(Integer defInts) {
		this.defInts = defInts;
	}
	public Integer getDefPts() {
		return defPts;
	}
	public void setDefPts(Integer defPts) {
		this.defPts = defPts;
	}
	public Integer getDefIntReturnYds() {
		return defIntReturnYds;
	}
	public void setDefIntReturnYds(Integer defIntReturnYds) {
		this.defIntReturnYds = defIntReturnYds;
	}
	public Integer getStatsId() {
		return statsId;
	}
	public void setStatsId(Integer statsId) {
		this.statsId = statsId;
	}
	public Integer getSeasonIndex() {
		return seasonIndex;
	}
	public void setSeasonIndex(Integer seasonIndex) {
		this.seasonIndex = seasonIndex;
	}
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Integer getDefCatchAllowed() {
		return defCatchAllowed;
	}
	public void setDefCatchAllowed(Integer defCatchAllowed) {
		this.defCatchAllowed = defCatchAllowed;
	}
	public Integer getStageIndex() {
		return stageIndex;
	}
	public void setStageIndex(Integer stageIndex) {
		this.stageIndex = stageIndex;
	}
	public Integer getDefDeflections() {
		return defDeflections;
	}
	public void setDefDeflections(Integer defDeflections) {
		this.defDeflections = defDeflections;
	}
	public Integer getDefSafties() {
		return defSafties;
	}
	public void setDefSafties(Integer defSafties) {
		this.defSafties = defSafties;
	}
	public Integer getDefFumRec() {
		return defFumRec;
	}
	public void setDefFumRec(Integer defFumRec) {
		this.defFumRec = defFumRec;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public Integer getDefSacks() {
		return defSacks;
	}
	public void setDefSacks(Integer defSacks) {
		this.defSacks = defSacks;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getWeekIndex() {
		return weekIndex;
	}
	public void setWeekIndex(Integer weekIndex) {
		this.weekIndex = weekIndex;
	}
	public Integer getDefTDs() {
		return defTDs;
	}
	public void setDefTDs(Integer defTDs) {
		this.defTDs = defTDs;
	}
	
}
