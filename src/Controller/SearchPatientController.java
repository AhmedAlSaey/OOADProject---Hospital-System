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
public class SearchPatientController {
    public static Patient searchPatient(String name){
        return(DataBank.searchPatient(name));
    }
}
