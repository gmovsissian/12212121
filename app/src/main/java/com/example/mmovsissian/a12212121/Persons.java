package com.example.mmovsissian.a12212121;

/**
 * Created by mmovsissian on 16-Jan-18.
 */

public class Persons {
    private String name;
    private String surname;
    private boolean sex;
    private String imgUrl;

    public Persons(String name, String surname, boolean sex, String imgUrl) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
