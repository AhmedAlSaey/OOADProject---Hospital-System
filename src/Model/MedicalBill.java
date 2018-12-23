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
    String name;
    String services;
    int medicalBillCost;

    public MedicalBill(String name, String services, int medicalBillCost) {
        this.name = name;
        this.services = services;
        this.medicalBillCost = medicalBillCost;
    }
    
    
}
