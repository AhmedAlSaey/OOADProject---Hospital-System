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
    private String name;
    private int age;
    private long phoneNumber;
    private long familyMemberPhoneNumber;
    private boolean isActivePatient;
    
    public Patient(String name, int age, long phoneNumber, long familyMemberPhoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.familyMemberPhoneNumber = familyMemberPhoneNumber;
        this.isActivePatient = true;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getFamilyMemberPhoneNumber() {
        return familyMemberPhoneNumber;
    }
    public boolean getisActivePatient()
    {
        return isActivePatient;
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
