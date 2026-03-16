package org.example.Ex1;

import java.util.List;

public class User {
    private  String name;
    private Integer age ;
    private  boolean EstActive;

    public User(String name, Integer age, boolean estActive) {
        this.name = name;
        this.age = age;
        EstActive = estActive;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEstActive() {
        return EstActive;
    }

    public void setEstActive(boolean estActive) {
        EstActive = estActive;
    }
}
