package org.example.pojo;

public class Person {
    private String name;

    public Person() {
        System.out.println("Person的无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
