package com.macgregor.ef.model.canonical;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel(value="Artifact", description="Model describing artifacts in Endless Frontier (e.g. Necromancer's Boots, Salim's Claw, etc.). Artifacts go by several names in the data: treasure, relics, artifacts. That should be hidden from you in this API.")
public class Artifact {

    @JsonProperty
    private Integer id;

    @JsonProperty
    @ApiModelProperty(value="Display name translated from Korean. Not guaranteed to be in english, there are cases where no translation is provided.")
    private String name;

    @JsonProperty
    @ApiModelProperty(value="Description of the artifact displayed under \"Artifact Ability\" in game.")
    private String desc;

    @JsonProperty
    @ApiModelProperty(value="Represented as stars (*) in app.", allowableValues = "1,2,3,4,5,6,7")
    private Integer rank;

    @JsonProperty
    @ApiModelProperty(value="Baseline max artifact level.", allowableValues = "20")
    private Integer baseMaxLevel;

    @JsonProperty
    @ApiModelProperty(value="Lookup key for ability associated with an artifact. Lookup table not currently available.")
    private String abilityCode1;

    @JsonProperty
    @ApiModelProperty(value="Lookup key for ability associated with an artifact. Lookup table not currently available.", allowEmptyValue = true)
    private String abilityCode2;

    @JsonProperty
    @ApiModelProperty(value="Lookup key for ability associated with an artifact. Lookup table not currently available. Appears unused at this time, all artifacts have it set to null", allowEmptyValue = true)
    private String abilityCode3;

    @JsonProperty
    @ApiModelProperty(value="Some kind of multiplier, probably for upgrade material cost of upgrades. Scales with artifact grade", allowableValues = "1, 2, 3, 4, 5, 84, 179")
    private Integer upgradeCostType;

    @JsonProperty
    @ApiModelProperty(value="Whether to hide the artifact description by default, e.g. Winged Boots of Hermes abilities are hidden until you unlock it in game.")
    private Boolean showDesc;

    @JsonProperty
    @ApiModelProperty(value="Id used for sorting artifacts in artifact book.")
    private Integer sortId;

    /***********************************************************
     *  Fields with unknown or unclear meaning below
     ***********************************************************/
    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Single character.", allowableValues="A, R, S, C, E, W, H, X, D, Z, Y, N")
    private String mainCode;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown.")
    private Integer subCode;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Even grade 7 artifacts have open cost, so doesnt seem to involve the artifact store price.")
    private List<Long> openCost;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Probably a modifier for skillCode2.")
    private Integer ability2;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Probably a modifier for skillCode2.")
    private Integer ability12;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Probably a modifier for skillCode2.")
    private Integer ability22;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Probably a modifier for skillCode1.")
    private Integer ability1;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Probably a modifier for skillCode1.")
    private Integer ability11;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Probably a modifier for skillCode1.")
    private Integer ability21;

    @JsonProperty
    @ApiModelProperty(value="Meaning unknown. Probably a modifier for skillCode3.")
    private Integer ability3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getBaseMaxLevel() {
        return baseMaxLevel;
    }

    public void setBaseMaxLevel(Integer baseMaxLevel) {
        this.baseMaxLevel = baseMaxLevel;
    }

    public String getAbilityCode1() {
        return abilityCode1;
    }

    public void setAbilityCode1(String abilityCode1) {
        this.abilityCode1 = abilityCode1;
    }

    public String getAbilityCode2() {
        return abilityCode2;
    }

    public void setAbilityCode2(String abilityCode2) {
        this.abilityCode2 = abilityCode2;
    }

    public String getAbilityCode3() {
        return abilityCode3;
    }

    public void setAbilityCode3(String abilityCode3) {
        this.abilityCode3 = abilityCode3;
    }

    public Integer getUpgradeCostType() {
        return upgradeCostType;
    }

    public void setUpgradeCostType(Integer upgradeCostType) {
        this.upgradeCostType = upgradeCostType;
    }

    public Boolean getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(Boolean showDesc) {
        this.showDesc = showDesc;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getMainCode() {
        return mainCode;
    }

    public void setMainCode(String mainCode) {
        this.mainCode = mainCode;
    }

    public Integer getSubCode() {
        return subCode;
    }

    public void setSubCode(Integer subCode) {
        this.subCode = subCode;
    }

    public List<Long> getOpenCost() {
        return openCost;
    }

    public void setOpenCost(List<Long> openCost) {
        this.openCost = openCost;
    }

    public Integer getAbility2() {
        return ability2;
    }

    public void setAbility2(Integer ability2) {
        this.ability2 = ability2;
    }

    public Integer getAbility12() {
        return ability12;
    }

    public void setAbility12(Integer ability12) {
        this.ability12 = ability12;
    }

    public Integer getAbility22() {
        return ability22;
    }

    public void setAbility22(Integer ability22) {
        this.ability22 = ability22;
    }

    public Integer getAbility1() {
        return ability1;
    }

    public void setAbility1(Integer ability1) {
        this.ability1 = ability1;
    }

    public Integer getAbility11() {
        return ability11;
    }

    public void setAbility11(Integer ability11) {
        this.ability11 = ability11;
    }

    public Integer getAbility21() {
        return ability21;
    }

    public void setAbility21(Integer ability21) {
        this.ability21 = ability21;
    }

    public Integer getAbility3() {
        return ability3;
    }

    public void setAbility3(Integer ability3) {
        this.ability3 = ability3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artifact artifact = (Artifact) o;

        if (id != null ? !id.equals(artifact.id) : artifact.id != null) return false;
        if (name != null ? !name.equals(artifact.name) : artifact.name != null) return false;
        if (desc != null ? !desc.equals(artifact.desc) : artifact.desc != null) return false;
        if (rank != null ? !rank.equals(artifact.rank) : artifact.rank != null) return false;
        if (baseMaxLevel != null ? !baseMaxLevel.equals(artifact.baseMaxLevel) : artifact.baseMaxLevel != null)
            return false;
        if (abilityCode1 != null ? !abilityCode1.equals(artifact.abilityCode1) : artifact.abilityCode1 != null)
            return false;
        if (abilityCode2 != null ? !abilityCode2.equals(artifact.abilityCode2) : artifact.abilityCode2 != null)
            return false;
        if (abilityCode3 != null ? !abilityCode3.equals(artifact.abilityCode3) : artifact.abilityCode3 != null)
            return false;
        if (upgradeCostType != null ? !upgradeCostType.equals(artifact.upgradeCostType) : artifact.upgradeCostType != null)
            return false;
        if (showDesc != null ? !showDesc.equals(artifact.showDesc) : artifact.showDesc != null) return false;
        if (sortId != null ? !sortId.equals(artifact.sortId) : artifact.sortId != null) return false;
        if (mainCode != null ? !mainCode.equals(artifact.mainCode) : artifact.mainCode != null) return false;
        if (subCode != null ? !subCode.equals(artifact.subCode) : artifact.subCode != null) return false;
        if (openCost != null ? !openCost.equals(artifact.openCost) : artifact.openCost != null) return false;
        if (ability2 != null ? !ability2.equals(artifact.ability2) : artifact.ability2 != null) return false;
        if (ability12 != null ? !ability12.equals(artifact.ability12) : artifact.ability12 != null) return false;
        if (ability22 != null ? !ability22.equals(artifact.ability22) : artifact.ability22 != null) return false;
        if (ability1 != null ? !ability1.equals(artifact.ability1) : artifact.ability1 != null) return false;
        if (ability11 != null ? !ability11.equals(artifact.ability11) : artifact.ability11 != null) return false;
        if (ability21 != null ? !ability21.equals(artifact.ability21) : artifact.ability21 != null) return false;
        return ability3 != null ? ability3.equals(artifact.ability3) : artifact.ability3 == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (baseMaxLevel != null ? baseMaxLevel.hashCode() : 0);
        result = 31 * result + (abilityCode1 != null ? abilityCode1.hashCode() : 0);
        result = 31 * result + (abilityCode2 != null ? abilityCode2.hashCode() : 0);
        result = 31 * result + (abilityCode3 != null ? abilityCode3.hashCode() : 0);
        result = 31 * result + (upgradeCostType != null ? upgradeCostType.hashCode() : 0);
        result = 31 * result + (showDesc != null ? showDesc.hashCode() : 0);
        result = 31 * result + (sortId != null ? sortId.hashCode() : 0);
        result = 31 * result + (mainCode != null ? mainCode.hashCode() : 0);
        result = 31 * result + (subCode != null ? subCode.hashCode() : 0);
        result = 31 * result + (openCost != null ? openCost.hashCode() : 0);
        result = 31 * result + (ability2 != null ? ability2.hashCode() : 0);
        result = 31 * result + (ability12 != null ? ability12.hashCode() : 0);
        result = 31 * result + (ability22 != null ? ability22.hashCode() : 0);
        result = 31 * result + (ability1 != null ? ability1.hashCode() : 0);
        result = 31 * result + (ability11 != null ? ability11.hashCode() : 0);
        result = 31 * result + (ability21 != null ? ability21.hashCode() : 0);
        result = 31 * result + (ability3 != null ? ability3.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", rank=" + rank +
                ", baseMaxLevel=" + baseMaxLevel +
                ", abilityCode1='" + abilityCode1 + '\'' +
                ", abilityCode2='" + abilityCode2 + '\'' +
                ", abilityCode3='" + abilityCode3 + '\'' +
                ", upgradeCostType=" + upgradeCostType +
                ", showDesc=" + showDesc +
                ", sortId=" + sortId +
                ", mainCode='" + mainCode + '\'' +
                ", subCode=" + subCode +
                ", openCost=" + openCost +
                ", ability2=" + ability2 +
                ", ability12=" + ability12 +
                ", ability22=" + ability22 +
                ", ability1=" + ability1 +
                ", ability11=" + ability11 +
                ", ability21=" + ability21 +
                ", ability3=" + ability3 +
                '}';
    }
}
