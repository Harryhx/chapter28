package com.harry;

/**
 * Created by admin on 2018/12/5.
 */
public class PersonEntity {
    private String name;
    private String age;
    public String address;

    public PersonEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonEntity(String name, String age) {

        this.name = name;
        this.age = age;
    }

    public PersonEntity(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public PersonEntity() {

    }

    public void show() {
        System.out.println("-----show method-----");
    }

    public void funcation(String s) {
        System.out.println("s" + s + "-----------!");
    }
}
