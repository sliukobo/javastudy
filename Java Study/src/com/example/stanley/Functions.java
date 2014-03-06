package com.example.stanley;

class Student {
    private String firstName;
    private String lastName;
    private static String name;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        Student.name="p";
        this.lastName = lastName;
    }
    public void printFullName() {
        System.out.println (this.firstName+" "+this.lastName);
    }
}

public class Functions {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }
}