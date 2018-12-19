/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sherif Ashraf
 */
public class Bed {
    private int number;
    private boolean isAvailable;
    private int roomNumber;

    public Bed(int number, boolean isAvailable, int roomNumber) {
        this.number = number;
        this.isAvailable = isAvailable;
        this.roomNumber = roomNumber;
    }

    public int getNumber() {
        return number;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    
    
    
}
