package com.macgregor.ef.model.canonical;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Tribe", description="Tribes in Endless Frontier (e.g. elf, orc, etc.)")
public class Tribe {

    public Tribe(){}

    public Tribe(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @JsonProperty
    private Integer id;

    @JsonProperty
    @ApiModelProperty(value = "name of the tribe")
    private String name;

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

    @Override
    public String toString() {
        return "Tribe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tribe tribe = (Tribe) o;

        if (id != null ? !id.equals(tribe.id) : tribe.id != null) return false;
        return name != null ? name.equals(tribe.name) : tribe.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
