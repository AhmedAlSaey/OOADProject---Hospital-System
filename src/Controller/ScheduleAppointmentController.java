/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Appointment;
import Model.DataBank;
import Model.Doctor;
import Model.Patient;

/**
 *
 * @author Sherif Ashraf
 */
public class ScheduleAppointmentController {
    public static int scheduleAppointment(String pName, String dName, String note){
        Doctor d = DataBank.getDoctor(dName);
        Patient p = DataBank.searchPatient(pName);
        if (d == null){
            return 1;
        }
        if (p == null){
            return 2;
        }
        Appointment a = new Appointment(d, p);
        DataBank.addAppointment(a);
        return 0;
        
    }
}
