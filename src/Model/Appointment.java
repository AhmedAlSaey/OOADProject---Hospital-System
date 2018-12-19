/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tasneem
 */
public class Appointment {
    private Calendar date;
    private Doctor doctor;
    private Patient patient;

    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 3);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }
    public Calendar getDate() {
        return date;
    }
    
}
