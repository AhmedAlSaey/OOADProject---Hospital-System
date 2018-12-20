/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Sherif Ashraf
 */
public class DataBank {
    private static ArrayList<Patient> patients=new ArrayList<Patient>();
    private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private static ArrayList<Department> departments = new ArrayList<Department>();
    public static void addPatient(Patient p){
        patients.add(p);
        
    }
<<<<<<< HEAD
    public static void printPatient()
    {
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i).getName());
        }
    }
    public static Department getDepartment(String department){
        Department d;
        for (int i = 0; i < departments.size(); i++){
            if (departments.get(i).getName().equals(department)){
                d = departments.get(i);
                return d;
            }
        }
        return null;
    }
    public static void addDoctor(Doctor d){
        doctors.add(d);
    }
=======
//    public static void printPatient()
//    {
//        for (int i = 0; i < patients.size(); i++) {
//            System.out.println(patients.get(i).getName());
//        }
//    }
>>>>>>> 7a40c9d99c0608f58b337e7361859ced513c5d07
}
