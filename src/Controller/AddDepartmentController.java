/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataBank;
import Model.Department;

/**
 *
 * @author Sherif Ashraf
 */
public class AddDepartmentController {
    public static void addNewDepartment(String name,int BuildingNumber,int floor,int budget)
    {
        Department d=new Department(name, BuildingNumber, floor, budget);
        DataBank.addDepartment(d);
    }
    
}
