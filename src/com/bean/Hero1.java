package com.bean;

public class Hero1 {

    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Hero1{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
