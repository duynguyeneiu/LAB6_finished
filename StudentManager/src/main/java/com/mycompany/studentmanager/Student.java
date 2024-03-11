/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanager;

import java.io.Serializable;

/**
 *
 * @author Student
 */
public class Student implements Serializable{
    private String studentID,lastName,midName,firstName,gender,schoolStage;
    private int yearOfBirth;
    
    public Student(){
        
    }

    public Student(String studentID, String lastName, String midName, String firstName, String gender, String schoolStage, int yearOfBirth) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.gender = gender;
        this.schoolStage = schoolStage;
        this.yearOfBirth = yearOfBirth;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public void setSchoolStage(String schoolStage) {
        this.schoolStage = schoolStage;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    
    
}
