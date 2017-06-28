package com.sportsdata.tracker.team;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecPlayerStats {
	
	@SerializedName("rosterId")
	@Expose
	private Integer rosterId;
	@SerializedName("recYacPerCatch")
	@Expose
	private Double recYacPerCatch;
	@SerializedName("statsId")
	@Expose
	private Integer statsId;
	@SerializedName("seasonIndex")
	@Expose
	private Integer seasonIndex;
	@SerializedName("scheduleId")
	@Expose
	private Integer scheduleId;
	@SerializedName("recTDs")
	@Expose
	private Integer recTDs;
	@SerializedName("stageIndex")
	@Expose
	private Integer stageIndex;
	@SerializedName("recDrops")
	@Expose
	private Integer recDrops;
	@SerializedName("recCatchPct")
	@Expose
	private Double recCatchPct;
	@SerializedName("recToPct")
	@Expose
	private Double recToPct;
	@SerializedName("recYdsPerCatch")
	@Expose
	private Double recYdsPerCatch;
	@SerializedName("recYdsAfterCatch")
	@Expose
	private Double recYdsAfterCatch;
	@SerializedName("recYdsPerGame")
	@Expose
	private Double recYdsPerGame;
	@SerializedName("recYds")
	@Expose
	private Integer recYds;
	@SerializedName("teamId")
	@Expose
	private Integer teamId;
	@SerializedName("recCatches")
	@Expose
	private Integer recCatches;
	@SerializedName("fullName")
	@Expose
	private String fullName;
	@SerializedName("recLongest")
	@Expose
	private Integer recLongest;
	@SerializedName("weekIndex")
	@Expose
	private Integer weekIndex;
	@SerializedName("recPts")
	@Expose
	private Integer recPts;
	
	public Integer getRosterId() {
		return rosterId;
	}
	public void setRosterId(Integer rosterId) {
		this.rosterId = rosterId;
	}
	public Double getRecYacPerCatch() {
		return recYacPerCatch;
	}
	public void setRecYacPerCatch(Double recYacPerCatch) {
		this.recYacPerCatch = recYacPerCatch;
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
	public Integer getRecTDs() {
		return recTDs;
	}
	public void setRecTDs(Integer recTDs) {
		this.recTDs = recTDs;
	}
	public Integer getStageIndex() {
		return stageIndex;
	}
	public void setStageIndex(Integer stageIndex) {
		this.stageIndex = stageIndex;
	}
	public Integer getRecDrops() {
		return recDrops;
	}
	public void setRecDrops(Integer recDrops) {
		this.recDrops = recDrops;
	}
	public Double getRecCatchPct() {
		return recCatchPct;
	}
	public void setRecCatchPct(Double recCatchPct) {
		this.recCatchPct = recCatchPct;
	}
	public Double getRecToPct() {
		return recToPct;
	}
	public void setRecToPct(Double recToPct) {
		this.recToPct = recToPct;
	}
	public Double getRecYdsPerCatch() {
		return recYdsPerCatch;
	}
	public void setRecYdsPerCatch(Double recYdsPerCatch) {
		this.recYdsPerCatch = recYdsPerCatch;
	}
	public Double getRecYdsAfterCatch() {
		return recYdsAfterCatch;
	}
	public void setRecYdsAfterCatch(Double recYdsAfterCatch) {
		this.recYdsAfterCatch = recYdsAfterCatch;
	}
	public Double getRecYdsPerGame() {
		return recYdsPerGame;
	}
	public void setRecYdsPerGame(Double recYdsPerGame) {
		this.recYdsPerGame = recYdsPerGame;
	}
	public Integer getRecYds() {
		return recYds;
	}
	public void setRecYds(Integer recYds) {
		this.recYds = recYds;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public Integer getRecCatches() {
		return recCatches;
	}
	public void setRecCatches(Integer recCatches) {
		this.recCatches = recCatches;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getRecLongest() {
		return recLongest;
	}
	public void setRecLongest(Integer recLongest) {
		this.recLongest = recLongest;
	}
	public Integer getWeekIndex() {
		return weekIndex;
	}
	public void setWeekIndex(Integer weekIndex) {
		this.weekIndex = weekIndex;
	}
	public Integer getRecPts() {
		return recPts;
	}
	public void setRecPts(Integer recPts) {
		this.recPts = recPts;
	}

}
