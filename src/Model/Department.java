    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Sherif Ashraf
 */
public class Department {
    private String name;
    private int buildingNumber;
    private int floor;
    private int budget;
    private ArrayList<Doctor> doctors;

    public Department(String name, int buildingNumber, int floor, int budget, ArrayList<Doctor> doctors) {
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.floor = floor;
        this.budget = budget;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getBudget() {
        return budget;
    }

    public int getFloor() {
        return floor;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    
    
    
    
}
