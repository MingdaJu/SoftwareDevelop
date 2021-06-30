/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author jumin
 */
public class Customer {
    private String name;
    private String flightNumber;
    private int[] seat = new int[2];

    public Customer() {
        
    }
    
    public Customer(String name, String flightNumber, int[] seat) {
        this.name = name;
        this.flightNumber=flightNumber;
        this.seat=seat;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int[] getSeat() {
        return seat;
    }

    public void setSeat(int[] seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}
