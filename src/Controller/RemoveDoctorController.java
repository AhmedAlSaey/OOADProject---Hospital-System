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
public class RemoveDoctorController {
    public static boolean removeDoctor(String doctorName)
    {
        return(DataBank.removeDoctor(doctorName));
    }
}
