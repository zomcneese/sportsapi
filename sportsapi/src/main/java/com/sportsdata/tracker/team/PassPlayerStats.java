package com.sportsdata.tracker.team;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PassPlayerStats {
	
	@SerializedName("passComp")
	@Expose
	private Integer passComp;
	@SerializedName("passCompPct")
	@Expose
	private Double passCompPct;
	@SerializedName("rosterId")
	@Expose
	private Integer rosterId;
	@SerializedName("rushFum")
	@Expose
	private Integer rushFum;
	@SerializedName("rushAtt")
	@Expose
	private Integer rushAtt;
	@SerializedName("rushTDs")
	@Expose
	private Integer rushTDs;
	@SerializedName("passSacks")
	@Expose
	private Integer passSacks;
	@SerializedName("rushToPct")
	@Expose
	private Double rushToPct;
	@SerializedName("statsId")
	@Expose
	private Integer statsId;
	@SerializedName("seasonIndex")
	@Expose
	private Integer seasonIndex;
	@SerializedName("passAtt")
	@Expose
	private Integer passAtt;
	@SerializedName("rushYds")
	@Expose
	private Integer rushYds;
	@SerializedName("scheduleId")
	@Expose
	private Integer scheduleId;
	@SerializedName("passTDs")
	@Expose
	private Integer passTDs;
	@SerializedName("rushLongest")
	@Expose
	private Integer rushLongest;
	@SerializedName("rushYdsPerAtt")
	@Expose
	private Double rushYdsPerAtt;
	@SerializedName("stageIndex")
	@Expose
	private Integer stageIndex;
	@SerializedName("rushYdsAfterContact")
	@Expose
	private Integer rushYdsAfterContact;
	@SerializedName("passInts")
	@Expose
	private Integer passInts;
	@SerializedName("passYds")
	@Expose
	private Integer passYds;
	@SerializedName("rushPts")
	@Expose
	private Integer rushPts;
	@SerializedName("teamId")
	@Expose
	private Integer teamId;
	@SerializedName("passYdsPerGame")
	@Expose
	private Double passYdsPerGame;
	@SerializedName("rush20PlusYds")
	@Expose
	private Integer rush20PlusYds;
	@SerializedName("rushBrokenTackles")
	@Expose
	private Integer rushBrokenTackles;
	@SerializedName("passLongest")
	@Expose
	private Integer passLongest;
	@SerializedName("fullName")
	@Expose
	private String fullName;
	@SerializedName("passYdsPerAtt")
	@Expose
	private Double passYdsPerAtt;
	@SerializedName("passerRating")
	@Expose
	private Double passerRating;
	@SerializedName("passPts")
	@Expose
	private Integer passPts;
	@SerializedName("weekIndex")
	@Expose
	private Integer weekIndex;
	@SerializedName("rushYdsPerGame")
	@Expose
	private Double rushYdsPerGame;
	
	public Integer getPassComp() {
		return passComp;
	}
	public void setPassComp(Integer passComp) {
		this.passComp = passComp;
	}
	public Double getPassCompPct() {
		return passCompPct;
	}
	public void setPassCompPct(Double passCompPct) {
		this.passCompPct = passCompPct;
	}
	public Integer getRosterId() {
		return rosterId;
	}
	public void setRosterId(Integer rosterId) {
		this.rosterId = rosterId;
	}
	public Integer getRushFum() {
		return rushFum;
	}
	public void setRushFum(Integer rushFum) {
		this.rushFum = rushFum;
	}
	public Integer getRushAtt() {
		return rushAtt;
	}
	public void setRushAtt(Integer rushAtt) {
		this.rushAtt = rushAtt;
	}
	public Integer getRushTDs() {
		return rushTDs;
	}
	public void setRushTDs(Integer rushTDs) {
		this.rushTDs = rushTDs;
	}
	public Integer getPassSacks() {
		return passSacks;
	}
	public void setPassSacks(Integer passSacks) {
		this.passSacks = passSacks;
	}
	public Double getRushToPct() {
		return rushToPct;
	}
	public void setRushToPct(Double rushToPct) {
		this.rushToPct = rushToPct;
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
	public Integer getPassAtt() {
		return passAtt;
	}
	public void setPassAtt(Integer passAtt) {
		this.passAtt = passAtt;
	}
	public Integer getRushYds() {
		return rushYds;
	}
	public void setRushYds(Integer rushYds) {
		this.rushYds = rushYds;
	}
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Integer getPassTDs() {
		return passTDs;
	}
	public void setPassTDs(Integer passTDs) {
		this.passTDs = passTDs;
	}
	public Integer getRushLongest() {
		return rushLongest;
	}
	public void setRushLongest(Integer rushLongest) {
		this.rushLongest = rushLongest;
	}
	public Double getRushYdsPerAtt() {
		return rushYdsPerAtt;
	}
	public void setRushYdsPerAtt(Double rushYdsPerAtt) {
		this.rushYdsPerAtt = rushYdsPerAtt;
	}
	public Integer getStageIndex() {
		return stageIndex;
	}
	public void setStageIndex(Integer stageIndex) {
		this.stageIndex = stageIndex;
	}
	public Integer getRushYdsAfterContact() {
		return rushYdsAfterContact;
	}
	public void setRushYdsAfterContact(Integer rushYdsAfterContact) {
		this.rushYdsAfterContact = rushYdsAfterContact;
	}
	public Integer getPassInts() {
		return passInts;
	}
	public void setPassInts(Integer passInts) {
		this.passInts = passInts;
	}
	public Integer getPassYds() {
		return passYds;
	}
	public void setPassYds(Integer passYds) {
		this.passYds = passYds;
	}
	public Integer getRushPts() {
		return rushPts;
	}
	public void setRushPts(Integer rushPts) {
		this.rushPts = rushPts;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public Double getPassYdsPerGame() {
		return passYdsPerGame;
	}
	public void setPassYdsPerGame(Double passYdsPerGame) {
		this.passYdsPerGame = passYdsPerGame;
	}
	public Integer getRush20PlusYds() {
		return rush20PlusYds;
	}
	public void setRush20PlusYds(Integer rush20PlusYds) {
		this.rush20PlusYds = rush20PlusYds;
	}
	public Integer getRushBrokenTackles() {
		return rushBrokenTackles;
	}
	public void setRushBrokenTackles(Integer rushBrokenTackles) {
		this.rushBrokenTackles = rushBrokenTackles;
	}
	public Integer getPassLongest() {
		return passLongest;
	}
	public void setPassLongest(Integer passLongest) {
		this.passLongest = passLongest;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Double getPassYdsPerAtt() {
		return passYdsPerAtt;
	}
	public void setPassYdsPerAtt(Double passYdsPerAtt) {
		this.passYdsPerAtt = passYdsPerAtt;
	}
	public Double getPasserRating() {
		return passerRating;
	}
	public void setPasserRating(Double passerRating) {
		this.passerRating = passerRating;
	}
	public Integer getPassPts() {
		return passPts;
	}
	public void setPassPts(Integer passPts) {
		this.passPts = passPts;
	}
	public Integer getWeekIndex() {
		return weekIndex;
	}
	public void setWeekIndex(Integer weekIndex) {
		this.weekIndex = weekIndex;
	}
	public Double getRushYdsPerGame() {
		return rushYdsPerGame;
	}
	public void setRushYdsPerGame(Double rushYdsPerGame) {
		this.rushYdsPerGame = rushYdsPerGame;
	}
	
	
}
