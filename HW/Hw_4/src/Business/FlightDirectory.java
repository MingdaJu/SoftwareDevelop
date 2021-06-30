/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author jumin
 */
public class FlightDirectory {

    private ArrayList<Flight> flightList;

    public FlightDirectory() {

        this.flightList = new ArrayList<>();

        Flight flight1 = new Flight("HU481", "New York", "Boston", "2019-11-10", "09:10", "11:10", "Morning", "Airbus320","Hainan Airline");
        Flight flight2 = new Flight("AA384", "San Francisco", "Boston", "2019-12-10", "13:15", "15:15", "Afternoon", "Airbus330","American Airline");
        Flight flight3 = new Flight("UA121", "Seattle", "Florida", "2019-10-31", "14:50", "23:20", "Afternoon", "Airbus380","United Airline");
        Flight flight4 = new Flight("SA967", "Washington DC", "Seattle", "2019-12-25", "20:45", "22:10", "Evening", "Boeing777","Southwest Airline");
        Flight flight5 = new Flight("DA341", "Los Angeles", "Florida", "2019-11-20", "06:10", "23:10", "Morning", "Boeing787","Delta Airline");

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);

    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }


    public Flight addFlight() {
        Flight flight = new Flight();
        flightList.add(flight);
        return flight;

    }

    public void deleteFlight(Flight flight) {
        flightList.remove(flight);
    }

}
