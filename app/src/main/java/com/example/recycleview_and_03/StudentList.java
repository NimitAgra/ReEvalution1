package com.example.recycleview_and_03;
/**** this is a model class  we will use  this class for generate class*****/

public class StudentList {
    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRoll_No() {

        return Roll_No;
    }


    public StudentList(String name, int age, String roll_No) {
        this.name = name;
        this.age = age;
        Roll_No = roll_No;
    }
    private String name;
    private int age;
    private String Roll_No;
}
