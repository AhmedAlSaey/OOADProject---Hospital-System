/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataBank;
import Model.MedicalBill;

/**
 *
 * @author Sherif Ashraf
 */
public class CheckoutPatientController {
    public static boolean checkoutPatient(String name, String services, int medicalBillCost){
        MedicalBill m = new MedicalBill(name, services, medicalBillCost);
        if (DataBank.setActiveFalse(name)){
            DataBank.addMedicalBill(m);
            return true;
        }
        return false;
    }
}
