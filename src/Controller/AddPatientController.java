/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.DataBank;
import Model.Patient;

/**
 *
 * @author Sherif Ashraf
 */
public class AddPatientController {
    public static void addNewPatient(String name,int age,long phoneNumber,long familyPhoneNumber){
    
        Patient p=new Patient(name,age,phoneNumber,familyPhoneNumber);
        DataBank.addPatient(p);
        
    }
}
