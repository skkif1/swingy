package com.omotyliu.swingy.entity;

public enum HeroClass
{

    HUMAN("HUMAN", 10, 10, 4),
    OGR("OGR", 25, 15, 2),
    ELF("ELF", 7, 10, 5);

    public String name;

    public int attack;

    public int defence;

    public int speed;

    HeroClass(String name, int attack, int defence, int speed)
    {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
    }




    @Override
    public String toString() {
        return "HeroClass " +
                 name + " attack " + attack + " defence " + defence + " speed " + speed;
    }
}
