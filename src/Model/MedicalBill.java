/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ahmedalsai
 */
public class MedicalBill {
    int id;
    String services;
    int medicalBillCost;

    public MedicalBill(int id, String services, int medicalBillCost) {
        this.id = id;
        this.services = services;
        this.medicalBillCost = medicalBillCost;
    }
    
    
}
