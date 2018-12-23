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
public class ReserveBedController {

    public static int reserveBed(String patientName, int bedNumber) {
        if (DataBank.checkPatientExistence(patientName)) {
            return DataBank.reserveBed(bedNumber);
        }
        return 1;
    }
}
