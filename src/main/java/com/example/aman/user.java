package com.example.aman;


public class user {

    int id;
    String name;
    int age;
    String course;

    public user() {

    }

    public user(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"name\":\"" + name + '\"' +
                ", \"age\":" + age +
                ", \"course\":\"" + course + '\"' +
                '}';
    }
}