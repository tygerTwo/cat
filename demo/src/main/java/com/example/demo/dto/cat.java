package com.example.demo.dto;

import com.example.demo.commen.CAT_COLOUR_ENUM;
import com.example.demo.commen.CAT_TYPE_ENUM;

public class cat {
    private int age;
    private long exp;
    private int size;
    private CAT_TYPE_ENUM type;
    private CAT_COLOUR_ENUM colour;

    public CAT_COLOUR_ENUM getColour() {
        return colour;
    }

    public void setColour(CAT_COLOUR_ENUM colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CAT_TYPE_ENUM getType() {
        return type;
    }

    public void setType(CAT_TYPE_ENUM type) {
        this.type = type;
    }
}
