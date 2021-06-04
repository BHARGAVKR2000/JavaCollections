package com.java.overridehashcode;

public class Customer {
    private String name;
    private String city;
    private int age;

    public Customer(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Customer customer = (Customer)obj;
        return name == customer.name && age == customer.age && city == customer.city;
    }
}
