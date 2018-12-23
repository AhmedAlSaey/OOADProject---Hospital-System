/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataBank;
import Model.Doctor;

/**
 *
 * @author Sherif Ashraf
 */
public class SearchDoctorController {
    public static Doctor searchDoctor(String name){
        Doctor d = DataBank.getDoctor(name);
        return d;
    }
}
