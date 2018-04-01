package com.omotyliu.swingy.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable
{
    private String name;

    private HeroClass heroClass;

    private int level;

    private int exp;

    private int attack;

    private int defence;

    private int speed;

    private int hitPoints;

    private List<HeroArtifact> artifacts;

    private int money;


    public Player() {
        money = 1000;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
        this.attack = heroClass.attack;
        this.defence = heroClass.defence;
        this.speed = heroClass.speed;
        this.artifacts = new ArrayList<>();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void addArtifact(HeroArtifact artifact)
    {
        artifacts.add(artifact);
    }

    public void buyArtifact(HeroArtifact artifact)
    {
        if (artifact.artifactCoast < money)
        {
            addArtifact(artifact);
            money -= artifact.artifactCoast;
        }
    }


    @Override
    public String toString() {
        return
                "  name='" + name +
                ", heroClass=" + ((heroClass == null) ? null : heroClass.name)+
                ", level=" + level +
                ", exp=" + exp +
                ", attack=" + attack +
                ", defence=" + defence +
                ", hitPoints=" + hitPoints +
                ", artifacts=" + artifacts;
    }
}
