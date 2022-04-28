package com.jkuat.dit;

public class Student {
    private int regNo;
    private String name;
    private String gender;


    public Student(int regNo, String name, String gender) {
        this.regNo = regNo;
        this.name = name;
        this.gender = gender;
    }

    public void display(){
        System.out.println("Reg No: " + regNo + "\nName: " + name + "\nGender: " + gender);
    }

}
