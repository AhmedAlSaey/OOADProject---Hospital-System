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
    
    public static void addPatient(Patient p){
        patients.add(p);
        
    }
//    public static void printPatient()
//    {
//        for (int i = 0; i < patients.size(); i++) {
//            System.out.println(patients.get(i).getName());
//        }
//    }
}
