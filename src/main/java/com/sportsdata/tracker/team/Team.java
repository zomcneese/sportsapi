package com.sportsdata.tracker.team;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Team {

    @Id
    @Indexed(unique = true)
    private String id;
    @JsonProperty("teamName")
    private String teamName;
    @JsonProperty("divName")
    private String divName;
    @JsonProperty("totalLosses")
    private Integer totalLosses;
    @JsonProperty("defRushYdsRank")
    private Integer defRushYdsRank;
    @JsonProperty("primaryColor")
    private Integer primaryColor;
    @JsonProperty("divisionName")
    private String divisionName;
    @JsonProperty("capSpent")
    private Integer capSpent;
    @JsonProperty("defPassYdsRank")
    private Integer defPassYdsRank;
    @JsonProperty("awayWins")
    private Integer awayWins;
    @JsonProperty("divWins")
    private Integer divWins;
    @JsonProperty("homeWins")
    private Integer homeWins;
    @JsonProperty("offTotalYds")
    private Integer offTotalYds;
    @JsonProperty("offScheme")
    private Integer offScheme;
    @JsonProperty("defScheme")
    private Integer defScheme;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("divisionId")
    private Integer divisionId;
    @JsonProperty("ovrRating")
    private Integer ovrRating;
    @JsonProperty("conferenceName")
    private String conferenceName;
    @JsonProperty("seasonIndex")
    private Integer seasonIndex;
    @JsonProperty("nickName")
    private String nickName;
    @JsonProperty("winLossStreak")
    private Integer winLossStreak;
    @JsonProperty("capRoom")
    private Integer capRoom;
    @JsonProperty("ptsForRank")
    private Integer ptsForRank;
    @JsonProperty("offTotalYdsRank")
    private Integer offTotalYdsRank;
    @JsonProperty("capAvailable")
    private Integer capAvailable;
    @JsonProperty("confWins")
    private Integer confWins;
    @JsonProperty("divLosses")
    private Integer divLosses;
    @JsonProperty("logoId")
    private Integer logoId;
    @JsonProperty("seed")
    private Integer seed;
    @JsonProperty("confTies")
    private Integer confTies;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("confLosses")
    private Integer confLosses;
    @JsonProperty("abbrName")
    private String abbrName;
    @JsonProperty("defTotalYds")
    private Integer defTotalYds;
    @JsonProperty("totalTies")
    private Integer totalTies;
    @JsonProperty("roster")
    private Roster roster;
    @JsonProperty("ptsAgainstRank")
    private Integer ptsAgainstRank;
    @JsonProperty("cityName")
    private String cityName;
    @JsonProperty("offPassYdsRank")
    private Integer offPassYdsRank;
    @JsonProperty("divTies")
    private Integer divTies;
    @JsonProperty("awayLosses")
    private Integer awayLosses;
    @JsonProperty("defRushYds")
    private Integer defRushYds;
    @JsonProperty("defPassYds")
    private Integer defPassYds;
    @JsonProperty("injuryCount")
    private Integer injuryCount;
    @JsonProperty("ptsAgainst")
    private Integer ptsAgainst;
    @JsonProperty("offRushYds")
    private Integer offRushYds;
    @JsonProperty("offPassYds")
    private Integer offPassYds;
    @JsonProperty("awayTies")
    private Integer awayTies;
    @JsonProperty("totalWins")
    private Integer totalWins;
    @JsonProperty("calendarYear")
    private Integer calendarYear;
    @JsonProperty("homeTies")
    private Integer homeTies;
    @JsonProperty("netPts")
    private Integer netPts;
    @JsonProperty("defTotalYdsRank")
    private Integer defTotalYdsRank;
    @JsonProperty("homeLosses")
    private Integer homeLosses;
    @JsonProperty("tODiff")
    private Integer tODiff;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("ptsFor")
    private Integer ptsFor;
    @JsonProperty("winPct")
    private Double winPct;
    @JsonProperty("stageIndex")
    private Integer stageIndex;
    @JsonProperty("weekIndex")
    private Integer weekIndex;
    @JsonProperty("conferenceId")
    private Integer conferenceId;
    @JsonProperty("offRushYdsRank")
    private Integer offRushYdsRank;
    @JsonProperty("prevRank")
    private Integer prevRank;
    @JsonProperty("teamId")
    private Integer teamId;
    @JsonProperty("playoffStatus")
    private Integer playoffStatus;
    @JsonProperty("teamOvr")
    private Integer teamOvr;
    @JsonProperty("secondaryColor")
    private Integer secondaryColor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    @JsonProperty("teamName")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("teamName")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("divName")
    public String getDivName() {
        return divName;
    }

    @JsonProperty("divName")
    public void setDivName(String divName) {
        this.divName = divName;
    }

    @JsonProperty("totalLosses")
    public Integer getTotalLosses() {
        return totalLosses;
    }

    @JsonProperty("totalLosses")
    public void setTotalLosses(Integer totalLosses) {
        this.totalLosses = totalLosses;
    }

    @JsonProperty("defRushYdsRank")
    public Integer getDefRushYdsRank() {
        return defRushYdsRank;
    }

    @JsonProperty("defRushYdsRank")
    public void setDefRushYdsRank(Integer defRushYdsRank) {
        this.defRushYdsRank = defRushYdsRank;
    }

    @JsonProperty("primaryColor")
    public Integer getPrimaryColor() {
        return primaryColor;
    }

    @JsonProperty("primaryColor")
    public void setPrimaryColor(Integer primaryColor) {
        this.primaryColor = primaryColor;
    }

    @JsonProperty("divisionName")
    public String getDivisionName() {
        return divisionName;
    }

    @JsonProperty("divisionName")
    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @JsonProperty("capSpent")
    public Integer getCapSpent() {
        return capSpent;
    }

    @JsonProperty("capSpent")
    public void setCapSpent(Integer capSpent) {
        this.capSpent = capSpent;
    }

    @JsonProperty("defPassYdsRank")
    public Integer getDefPassYdsRank() {
        return defPassYdsRank;
    }

    @JsonProperty("defPassYdsRank")
    public void setDefPassYdsRank(Integer defPassYdsRank) {
        this.defPassYdsRank = defPassYdsRank;
    }

    @JsonProperty("awayWins")
    public Integer getAwayWins() {
        return awayWins;
    }

    @JsonProperty("awayWins")
    public void setAwayWins(Integer awayWins) {
        this.awayWins = awayWins;
    }

    @JsonProperty("divWins")
    public Integer getDivWins() {
        return divWins;
    }

    @JsonProperty("divWins")
    public void setDivWins(Integer divWins) {
        this.divWins = divWins;
    }

    @JsonProperty("homeWins")
    public Integer getHomeWins() {
        return homeWins;
    }

    @JsonProperty("homeWins")
    public void setHomeWins(Integer homeWins) {
        this.homeWins = homeWins;
    }

    @JsonProperty("offTotalYds")
    public Integer getOffTotalYds() {
        return offTotalYds;
    }

    @JsonProperty("offTotalYds")
    public void setOffTotalYds(Integer offTotalYds) {
        this.offTotalYds = offTotalYds;
    }

    @JsonProperty("offScheme")
    public Integer getOffScheme() {
        return offScheme;
    }

    @JsonProperty("offScheme")
    public void setOffScheme(Integer offScheme) {
        this.offScheme = offScheme;
    }

    @JsonProperty("defScheme")
    public Integer getDefScheme() {
        return defScheme;
    }

    @JsonProperty("defScheme")
    public void setDefScheme(Integer defScheme) {
        this.defScheme = defScheme;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }


    @JsonProperty("divisionId")
    public Integer getDivisionId() {
        return divisionId;
    }

    @JsonProperty("divisionId")
    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }


    @JsonProperty("ovrRating")
    public Integer getOvrRating() {
        return ovrRating;
    }

    @JsonProperty("ovrRating")
    public void setOvrRating(Integer ovrRating) {
        this.ovrRating = ovrRating;
    }


    @JsonProperty("conferenceName")
    public String getConferenceName() {
        return conferenceName;
    }

    @JsonProperty("conferenceName")
    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }


    @JsonProperty("seasonIndex")
    public Integer getSeasonIndex() {
        return seasonIndex;
    }

    @JsonProperty("seasonIndex")
    public void setSeasonIndex(Integer seasonIndex) {
        this.seasonIndex = seasonIndex;
    }


    @JsonProperty("nickName")
    public String getNickName() {
        return nickName;
    }

    @JsonProperty("nickName")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    @JsonProperty("winLossStreak")
    public Integer getWinLossStreak() {
        return winLossStreak;
    }

    @JsonProperty("winLossStreak")
    public void setWinLossStreak(Integer winLossStreak) {
        this.winLossStreak = winLossStreak;
    }


    @JsonProperty("capRoom")
    public Integer getCapRoom() {
        return capRoom;
    }

    @JsonProperty("capRoom")
    public void setCapRoom(Integer capRoom) {
        this.capRoom = capRoom;
    }


    @JsonProperty("ptsForRank")
    public Integer getPtsForRank() {
        return ptsForRank;
    }

    @JsonProperty("ptsForRank")
    public void setPtsForRank(Integer ptsForRank) {
        this.ptsForRank = ptsForRank;
    }


    @JsonProperty("offTotalYdsRank")
    public Integer getOffTotalYdsRank() {
        return offTotalYdsRank;
    }

    @JsonProperty("offTotalYdsRank")
    public void setOffTotalYdsRank(Integer offTotalYdsRank) {
        this.offTotalYdsRank = offTotalYdsRank;
    }


    @JsonProperty("capAvailable")
    public Integer getCapAvailable() {
        return capAvailable;
    }

    @JsonProperty("capAvailable")
    public void setCapAvailable(Integer capAvailable) {
        this.capAvailable = capAvailable;
    }


    @JsonProperty("confWins")
    public Integer getConfWins() {
        return confWins;
    }

    @JsonProperty("confWins")
    public void setConfWins(Integer confWins) {
        this.confWins = confWins;
    }


    @JsonProperty("divLosses")
    public Integer getDivLosses() {
        return divLosses;
    }

    @JsonProperty("divLosses")
    public void setDivLosses(Integer divLosses) {
        this.divLosses = divLosses;
    }


    @JsonProperty("logoId")
    public Integer getLogoId() {
        return logoId;
    }

    @JsonProperty("logoId")
    public void setLogoId(Integer logoId) {
        this.logoId = logoId;
    }


    @JsonProperty("seed")
    public Integer getSeed() {
        return seed;
    }

    @JsonProperty("seed")
    public void setSeed(Integer seed) {
        this.seed = seed;
    }


    @JsonProperty("confTies")
    public Integer getConfTies() {
        return confTies;
    }

    @JsonProperty("confTies")
    public void setConfTies(Integer confTies) {
        this.confTies = confTies;
    }


    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    @JsonProperty("confLosses")
    public Integer getConfLosses() {
        return confLosses;
    }

    @JsonProperty("confLosses")
    public void setConfLosses(Integer confLosses) {
        this.confLosses = confLosses;
    }


    @JsonProperty("abbrName")
    public String getAbbrName() {
        return abbrName;
    }

    @JsonProperty("abbrName")
    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }


    @JsonProperty("defTotalYds")
    public Integer getDefTotalYds() {
        return defTotalYds;
    }

    @JsonProperty("defTotalYds")
    public void setDefTotalYds(Integer defTotalYds) {
        this.defTotalYds = defTotalYds;
    }


    @JsonProperty("totalTies")
    public Integer getTotalTies() {
        return totalTies;
    }

    @JsonProperty("totalTies")
    public void setTotalTies(Integer totalTies) {
        this.totalTies = totalTies;
    }


    @JsonProperty("roster")
    public Roster getRoster() {
        return roster;
    }

    @JsonProperty("roster")
    public void setRoster(Roster roster) {
        this.roster = roster;
    }


    @JsonProperty("ptsAgainstRank")
    public Integer getPtsAgainstRank() {
        return ptsAgainstRank;
    }

    @JsonProperty("ptsAgainstRank")
    public void setPtsAgainstRank(Integer ptsAgainstRank) {
        this.ptsAgainstRank = ptsAgainstRank;
    }


    @JsonProperty("cityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("cityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    @JsonProperty("offPassYdsRank")
    public Integer getOffPassYdsRank() {
        return offPassYdsRank;
    }

    @JsonProperty("offPassYdsRank")
    public void setOffPassYdsRank(Integer offPassYdsRank) {
        this.offPassYdsRank = offPassYdsRank;
    }


    @JsonProperty("divTies")
    public Integer getDivTies() {
        return divTies;
    }

    @JsonProperty("divTies")
    public void setDivTies(Integer divTies) {
        this.divTies = divTies;
    }


    @JsonProperty("awayLosses")
    public Integer getAwayLosses() {
        return awayLosses;
    }

    @JsonProperty("awayLosses")
    public void setAwayLosses(Integer awayLosses) {
        this.awayLosses = awayLosses;
    }

    @JsonProperty("defRushYds")
    public Integer getDefRushYds() {
        return defRushYds;
    }

    @JsonProperty("defRushYds")
    public void setDefRushYds(Integer defRushYds) {
        this.defRushYds = defRushYds;
    }


    @JsonProperty("defPassYds")
    public Integer getDefPassYds() {
        return defPassYds;
    }

    @JsonProperty("defPassYds")
    public void setDefPassYds(Integer defPassYds) {
        this.defPassYds = defPassYds;
    }


    @JsonProperty("injuryCount")
    public Integer getInjuryCount() {
        return injuryCount;
    }

    @JsonProperty("injuryCount")
    public void setInjuryCount(Integer injuryCount) {
        this.injuryCount = injuryCount;
    }


    @JsonProperty("ptsAgainst")
    public Integer getPtsAgainst() {
        return ptsAgainst;
    }

    @JsonProperty("ptsAgainst")
    public void setPtsAgainst(Integer ptsAgainst) {
        this.ptsAgainst = ptsAgainst;
    }

    @JsonProperty("offRushYds")
    public Integer getOffRushYds() {
        return offRushYds;
    }

    @JsonProperty("offRushYds")
    public void setOffRushYds(Integer offRushYds) {
        this.offRushYds = offRushYds;
    }

    @JsonProperty("offPassYds")
    public Integer getOffPassYds() {
        return offPassYds;
    }

    @JsonProperty("offPassYds")
    public void setOffPassYds(Integer offPassYds) {
        this.offPassYds = offPassYds;
    }


    @JsonProperty("awayTies")
    public Integer getAwayTies() {
        return awayTies;
    }

    @JsonProperty("awayTies")
    public void setAwayTies(Integer awayTies) {
        this.awayTies = awayTies;
    }


    @JsonProperty("totalWins")
    public Integer getTotalWins() {
        return totalWins;
    }

    @JsonProperty("totalWins")
    public void setTotalWins(Integer totalWins) {
        this.totalWins = totalWins;
    }


    @JsonProperty("calendarYear")
    public Integer getCalendarYear() {
        return calendarYear;
    }

    @JsonProperty("calendarYear")
    public void setCalendarYear(Integer calendarYear) {
        this.calendarYear = calendarYear;
    }

    @JsonProperty("homeTies")
    public Integer getHomeTies() {
        return homeTies;
    }

    @JsonProperty("homeTies")
    public void setHomeTies(Integer homeTies) {
        this.homeTies = homeTies;
    }


    @JsonProperty("netPts")
    public Integer getNetPts() {
        return netPts;
    }

    @JsonProperty("netPts")
    public void setNetPts(Integer netPts) {
        this.netPts = netPts;
    }

    @JsonProperty("defTotalYdsRank")
    public Integer getDefTotalYdsRank() {
        return defTotalYdsRank;
    }

    @JsonProperty("defTotalYdsRank")
    public void setDefTotalYdsRank(Integer defTotalYdsRank) {
        this.defTotalYdsRank = defTotalYdsRank;
    }

    @JsonProperty("homeLosses")
    public Integer getHomeLosses() {
        return homeLosses;
    }

    @JsonProperty("homeLosses")
    public void setHomeLosses(Integer homeLosses) {
        this.homeLosses = homeLosses;
    }

    @JsonProperty("tODiff")
    public Integer getTODiff() {
        return tODiff;
    }

    @JsonProperty("tODiff")
    public void setTODiff(Integer tODiff) {
        this.tODiff = tODiff;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("ptsFor")
    public Integer getPtsFor() {
        return ptsFor;
    }

    @JsonProperty("ptsFor")
    public void setPtsFor(Integer ptsFor) {
        this.ptsFor = ptsFor;
    }

    @JsonProperty("winPct")
    public Double getWinPct() {
        return winPct;
    }

    @JsonProperty("winPct")
    public void setWinPct(Double winPct) {
        this.winPct = winPct;
    }

    @JsonProperty("stageIndex")
    public Integer getStageIndex() {
        return stageIndex;
    }

    @JsonProperty("stageIndex")
    public void setStageIndex(Integer stageIndex) {
        this.stageIndex = stageIndex;
    }

    @JsonProperty("weekIndex")
    public Integer getWeekIndex() {
        return weekIndex;
    }

    @JsonProperty("weekIndex")
    public void setWeekIndex(Integer weekIndex) {
        this.weekIndex = weekIndex;
    }

    @JsonProperty("conferenceId")
    public Integer getConferenceId() {
        return conferenceId;
    }

    @JsonProperty("conferenceId")
    public void setConferenceId(Integer conferenceId) {
        this.conferenceId = conferenceId;
    }


    @JsonProperty("offRushYdsRank")
    public Integer getOffRushYdsRank() {
        return offRushYdsRank;
    }

    @JsonProperty("offRushYdsRank")
    public void setOffRushYdsRank(Integer offRushYdsRank) {
        this.offRushYdsRank = offRushYdsRank;
    }

    @JsonProperty("prevRank")
    public Integer getPrevRank() {
        return prevRank;
    }

    @JsonProperty("prevRank")
    public void setPrevRank(Integer prevRank) {
        this.prevRank = prevRank;
    }

    @JsonProperty("teamId")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("teamId")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("playoffStatus")
    public Integer getPlayoffStatus() {
        return playoffStatus;
    }

    @JsonProperty("playoffStatus")
    public void setPlayoffStatus(Integer playoffStatus) {
        this.playoffStatus = playoffStatus;
    }

    @JsonProperty("teamOvr")
    public Integer getTeamOvr() {
        return teamOvr;
    }

    @JsonProperty("teamOvr")
    public void setTeamOvr(Integer teamOvr) {
        this.teamOvr = teamOvr;
    }

    @JsonProperty("secondaryColor")
    public Integer getSecondaryColor() {
        return secondaryColor;
    }

    @JsonProperty("secondaryColor")
    public void setSecondaryColor(Integer secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
