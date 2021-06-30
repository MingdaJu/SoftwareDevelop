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
public class Flight {

    private String departure;
    private String destination;
    private String flightNumber;
    private String takeOffDate;
    private String takeOffTime;
    private String arrival;
    private String timerange;
    private String airplane;
    private String airliner;

    public Flight(String flightNumber, String departure, String destination, String takeOffDate, String takeOffTime, String arrival, String timerange, String airplane, String airliner) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.takeOffDate = takeOffDate;
        this.takeOffTime = takeOffTime;
        this.arrival = arrival;
        this.timerange = timerange;
        this.airplane = airplane;
        this.airliner = airliner;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Flight() {

    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTakeOffDate() {
        return takeOffDate;
    }

    public void setTakeOffDate(String takeOffDate) {
        this.takeOffDate = takeOffDate;
    }

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getTimerange() {
        return timerange;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    @Override
    public String toString() {
        return this.getFlightNumber();
    }

}
