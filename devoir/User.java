/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devoirJava.sevenAcademy;

/**
 *
 * @author operator.cam
 */
public class User {
    public String name;
    public int age;
    public float height;
    public String gender;
    
    public User(){
    }

    public User(String name, int age, float height, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public float getHeight() {
        return height;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
