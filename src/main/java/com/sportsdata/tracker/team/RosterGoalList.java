package com.sportsdata.tracker.team;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RosterGoalList {

    @SerializedName("currentLevel")
    @Expose
    private Integer currentLevel;
    @SerializedName("completionValue2")
    @Expose
    private Integer completionValue2;
    @SerializedName("completionValue1")
    @Expose
    private Integer completionValue1;
    @SerializedName("completionValue4")
    @Expose
    private Integer completionValue4;
    @SerializedName("goalId")
    @Expose
    private Integer goalId;
    @SerializedName("completionValue3")
    @Expose
    private Integer completionValue3;
    @SerializedName("experienceAward2")
    @Expose
    private Integer experienceAward2;
    @SerializedName("experienceAward1")
    @Expose
    private Integer experienceAward1;
    @SerializedName("experienceAward4")
    @Expose
    private Integer experienceAward4;
    @SerializedName("experienceAward3")
    @Expose
    private Integer experienceAward3;
    @SerializedName("title")
    @Expose
    private String title;

    public Integer getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Integer getCompletionValue2() {
        return completionValue2;
    }

    public void setCompletionValue2(Integer completionValue2) {
        this.completionValue2 = completionValue2;
    }

    public Integer getCompletionValue1() {
        return completionValue1;
    }

    public void setCompletionValue1(Integer completionValue1) {
        this.completionValue1 = completionValue1;
    }

    public Integer getCompletionValue4() {
        return completionValue4;
    }

    public void setCompletionValue4(Integer completionValue4) {
        this.completionValue4 = completionValue4;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }

    public Integer getCompletionValue3() {
        return completionValue3;
    }

    public void setCompletionValue3(Integer completionValue3) {
        this.completionValue3 = completionValue3;
    }

    public Integer getExperienceAward2() {
        return experienceAward2;
    }

    public void setExperienceAward2(Integer experienceAward2) {
        this.experienceAward2 = experienceAward2;
    }

    public Integer getExperienceAward1() {
        return experienceAward1;
    }

    public void setExperienceAward1(Integer experienceAward1) {
        this.experienceAward1 = experienceAward1;
    }

    public Integer getExperienceAward4() {
        return experienceAward4;
    }

    public void setExperienceAward4(Integer experienceAward4) {
        this.experienceAward4 = experienceAward4;
    }

    public Integer getExperienceAward3() {
        return experienceAward3;
    }

    public void setExperienceAward3(Integer experienceAward3) {
        this.experienceAward3 = experienceAward3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}