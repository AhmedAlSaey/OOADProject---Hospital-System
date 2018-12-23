/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Sherif Ashraf
 */
public class ModifyDoctorController {
    public static boolean modifyDoctor(String newName, int newAge, String newDepartmentString, long newPhone, int newSalary){
        return DataBank.modifyDoctor(newName, newAge, newDepartmentString, newPhone, newSalary);
    }
}
