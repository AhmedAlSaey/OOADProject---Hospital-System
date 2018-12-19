/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tasneem
 */
public class Patient {
    private static int sequentialID;
    private int id;
    private String name;
    private int age;
    private long phoneNumber;
    private long familyMemberPhoneNumber;
    private boolean isActivePatient;
    static{
        sequentialID = 0;
    }
    public Patient(int id, String name, int age, long phoneNumber, long familyMemberPhoneNumber, boolean isActivePatient) {
        this.id = sequentialID++;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.familyMemberPhoneNumber = familyMemberPhoneNumber;
        this.isActivePatient = isActivePatient;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getFamilyMemberPhoneNumber() {
        return familyMemberPhoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFamilyMemberPhoneNumber(long familyMemberPhoneNumber) {
        this.familyMemberPhoneNumber = familyMemberPhoneNumber;
    }

    public void setIsActivePatient(boolean isActivePatient) {
        this.isActivePatient = isActivePatient;
    }
}
