/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sherif Ashraf
 */
public class Doctor {
    private String name;
    private int age;
    private int salary;
    private long phoneNumber;
    private Department department;

    public Doctor(String name, int age, int salary, long phoneNumber, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
}
