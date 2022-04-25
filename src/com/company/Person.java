package com.company;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name,String lastName,int age){
        this.lastName=lastName;
        this.name=name;
        this.age= age;
    }

    public void displayPerson(){
        System.out.print("Last name: " + lastName);
        System.out.print(", Name: "+ name);
        System.out.println(", Age: "+ age);
    }

    public String getLastName() {
        return lastName;
    }
}
