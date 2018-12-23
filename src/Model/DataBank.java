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
public class DataBank {

    private static ArrayList<Patient> patients = new ArrayList<Patient>();
    private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private static ArrayList<Department> departments = new ArrayList<Department>();
    static int lastReferencedPatientIndex;

    public DataBank() {
        Department d = new Department("surgery", 1, 1, 1000);
        departments.add(d);
        Doctor e = new Doctor("sherif", 20, d, 100, 010);
        doctors.add(e);
    }

    public static void addPatient(Patient p) {
        patients.add(p);

    }

    public static Patient searchPatient(String name) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getName().equals(name)) {
                lastReferencedPatientIndex = i;
                return patients.get(i);
            }
        }
        return null;
    }

    public static void modifyPatient(String newName, int newAge, long newPhoneNumber, long newFamilyphoneNumber) {
        patients.get(lastReferencedPatientIndex).setName(newName);
        patients.get(lastReferencedPatientIndex).setAge(newAge);
        patients.get(lastReferencedPatientIndex).setPhoneNumber(newPhoneNumber);
        patients.get(lastReferencedPatientIndex).setFamilyMemberPhoneNumber(newFamilyphoneNumber);

    }

    public static void printPatient() {
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i).getName());
        }
    }

    public static void printDepartment() {
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).getName() + departments.get(i).getBuildingNumber() + departments.get(i).getFloor() + departments.get(i).getBudget());
        }
    }

    public static void printDoctor() {
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(doctors.get(i).getName() + doctors.get(i).getAge() + doctors.get(i).getDepartment().getName() + doctors.get(i).getSalary() + doctors.get(i).getPhoneNumber());
        }
    }

    public static Department getDepartment(String department) {
        Department d;
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getName().equals(department)) {
                d = departments.get(i);
                return d;
            }
        }
        return null;
    }

    public static void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public static boolean removeDoctor(String doctorName) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getName().equals(doctorName)) {
                doctors.remove(doctors.get(i));
                return true;
            }
        }
        return false;
    }

    public static void addDepartment(Department d) {
        departments.add(d);
    }

    public static boolean checkDepartmentexists(String name) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void deleteDepartment(String name) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getName().equals(name)) {
                departments.remove(i);
            }
        }
    }

    public static void deleteDoctorsUnderDepartment(String name) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getDepartment().getName().equals(name)) {
                doctors.remove(i);
            }
        }
    }

//    public static void printPatient()
//    {
//        for (int i = 0; i < patients.size(); i++) {
//            System.out.println(patients.get(i).getName());
//        }
//    }
}
