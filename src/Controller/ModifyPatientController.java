/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataBank;

/**
 *
 * @author Sherif Ashraf
 */
public class ModifyPatientController {
    public static void modifyPatient(String newName,int newAge,long newPhoneNumber,long newFamilyphoneNumber, boolean isActive){
        DataBank.modifyPatient(newName,newAge,newPhoneNumber,newFamilyphoneNumber, isActive);
    }
    
}
