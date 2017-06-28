package com.sportsdata.tracker.team;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RushPlayerStats {
	
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
	@SerializedName("rushToPct")
	@Expose
	private Double rushToPct;
	@SerializedName("statsId")
	@Expose
	private Integer statsId;
	@SerializedName("seasonIndex")
	@Expose
	private Integer seasonIndex;
	@SerializedName("rushYds")
	@Expose
	private Integer rushYds;
	@SerializedName("scheduleId")
	@Expose
	private Integer scheduleId;
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
	private Double rushYdsAfterContact;
	@SerializedName("rushPts")
	@Expose
	private Integer rushPts;
	@SerializedName("teamId")
	@Expose
	private Integer teamId;
	@SerializedName("rush20PlusYds")
	@Expose
	private Integer rush20PlusYds;
	@SerializedName("rushBrokenTackles")
	@Expose
	private Integer rushBrokenTackles;
	@SerializedName("fullName")
	@Expose
	private String fullName;
	@SerializedName("weekIndex")
	@Expose
	private Integer weekIndex;
	@SerializedName("rushYdsPerGame")
	@Expose
	private Double rushYdsPerGame;
	
}
