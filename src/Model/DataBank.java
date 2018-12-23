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
    private static ArrayList<MedicalBill> medicalBills = new ArrayList<MedicalBill>();
    private static ArrayList<Bed> beds = new ArrayList<Bed>();

    static int lastReferencedPatientIndex;
    static int lastReferencedDoctorIndex;
    public DataBank() {
        Department d = new Department("surgery", 1, 1, 1000);
        departments.add(d);
        Doctor e = new Doctor("sherif", 20, d, 1000, Long.parseLong("0102104"));
        doctors.add(e);
        Patient p = new Patient("ahmed", 26, Long.parseLong("01021047921"), Long.parseLong("01005108452"));
        patients.add(p);
        Bed b1 = new Bed(1, true, 120);
        Bed b2 = new Bed(2, false, 120);
        Bed b3 = new Bed(3, true, 121);
        Bed b4 = new Bed(4, false, 121);
        beds.add(b1);
        beds.add(b2);
        beds.add(b3);
        beds.add(b4);

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


    public static boolean setActiveFalse(String name){
        for (int i = 0; i < patients.size(); i++){
            if (patients.get(i).getName()== name){
                patients.get(i).setIsActivePatient(false);

                return true;
            }
        }
        return false;
    }

    public static void addMedicalBill(MedicalBill m) {
        medicalBills.add(m);
    }

    public static boolean modifyDoctor(String newName, int newAge, String newDepartmentString, long newPhone, int newSalary){
        for (int i = 0; i < departments.size(); i++){
            if (departments.get(i).getName() == newDepartmentString){
                doctors.get(lastReferencedDoctorIndex).setName(newName);
                doctors.get(lastReferencedDoctorIndex).setAge(newAge);
                doctors.get(lastReferencedDoctorIndex).setDepartment(departments.get(i));
                doctors.get(lastReferencedDoctorIndex).setSalary(newSalary);
                doctors.get(lastReferencedDoctorIndex).setPhoneNumber(newPhone);
                return true;
            }
        }
        return false;
    }


    
    public static Doctor getDoctor(String name){
        for (int i = 0; i < doctors.size(); i++){
            if (doctors.get(i).getName().equals(name)){
                lastReferencedDoctorIndex = 1;
                return doctors.get(i);
            }
        }
        return null;
    }

    public static boolean checkPatientExistence(String patientName) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getName().equals(patientName)) {
                return true;
            }
        }
        return false;
    }

    public static int reserveBed(int bedNumber) {
        for (int i = 0; i < beds.size(); i++) {
            if ((beds.get(i).getNumber() == bedNumber) && (beds.get(i).getisAvailable())) {
                beds.get(i).setIsAvailable(false);
                return 2;
            }

        }
        return 3;
    }
    public static void printBed()
    {
        for (int i = 0; i < beds.size(); i++) {
            System.out.println(beds.get(i).getNumber()+" "+beds.get(i).getisAvailable());
        }
    }

//    public static void printPatient()
//    {
//        for (int i = 0; i < patients.size(); i++) {
//            System.out.println(patients.get(i).getName());
//        }
//    }
}
