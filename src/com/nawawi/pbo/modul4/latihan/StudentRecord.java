package com.nawawi.pbo.modul4.latihan;

public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return (this.mathGrade + this.englishGrade + this.scienceGrade) / 3;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
