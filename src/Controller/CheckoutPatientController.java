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
    public static boolean checkoutPatient(int id, String services, int medicalBillCost){
        MedicalBill m = new MedicalBill(id, services, medicalBillCost);
        if (DataBank.setActiveFalse(id)){
            return false;
        }
        DataBank.addMedicalBill(m);
        return true;
    }
}
