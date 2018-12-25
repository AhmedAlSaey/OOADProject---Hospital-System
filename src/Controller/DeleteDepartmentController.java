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
public class DeleteDepartmentController {
 
    public static boolean deleteDepartment(String name) {
        if (DataBank.checkDepartmentexists(name)) {
            DataBank.deleteDoctorsUnderDepartment(name);
            DataBank.deleteDepartment(name);
            return true;
        }
        return false;
    }

}
