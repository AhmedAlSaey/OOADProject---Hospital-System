/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataBank;
import Model.Department;
import Model.Doctor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Sherif Ashraf
 */
class NoDepartmentFoundException extends Exception{
    
}
public class AddDoctorController {
    public static boolean addNewDoctor(String name, int age, String departmentString, int salary, long phoneNumber){
        Department department = null;
            department = DataBank.getDepartment(departmentString);
            if (department == null){
                JOptionPane.showMessageDialog(null, "Department not found");
                return false;
            }
            
        Doctor d = new Doctor(name, age, department, salary, phoneNumber);
        DataBank.addDoctor(d);
        return true;
    }
}
