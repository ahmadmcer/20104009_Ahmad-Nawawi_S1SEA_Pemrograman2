package com.nawawi.pbo.modul6.latihan;

public class Person {
    protected String name;
    protected String address;

    public Person() {
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setNae(String name) {
        this.name = name;
    }

    public void setAddress(String add) {
        this.address = add;
    }
}
