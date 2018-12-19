/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tasneem
 */
public class OOADProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 3);
        System.out.println(c.get(Calendar.YEAR));
    }
    
}
