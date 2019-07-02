package com.test.listview;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public static ArrayList<Teacher> get8RandomTeachers(){
        ArrayList<Teacher> teachers=new ArrayList<>();
        teachers.add(new Teacher("Mukul","Coding"));
        teachers.add(new Teacher("Rahul","Android Development"));
        teachers.add(new Teacher("Alex","Web Development"));
        teachers.add(new Teacher("Swati","Human Values"));
        teachers.add(new Teacher("Abanda","Angular"));
        teachers.add(new Teacher("Atul","Public Speaking"));
        teachers.add(new Teacher("Bad Boy","Timepass"));
        teachers.add(new Teacher("Terminator","Shooting"));
        teachers.add(new Teacher("Thor","Lifting Hammers"));
        teachers.add(new Teacher("Iron Man","Create Jarvis Using Python"));
    return teachers;
    }
}
