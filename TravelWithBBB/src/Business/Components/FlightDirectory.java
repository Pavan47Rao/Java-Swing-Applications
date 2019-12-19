/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Components;

import Business.Users.Customer;
import java.util.ArrayList;

/**
 *
 * @author Floyed Pinto
 * Will be stored in the Airline Object
 */
public class FlightDirectory {
    
    private ArrayList<Flight> flightList = new ArrayList<>();

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public void addFlight(Flight flight){
        this.flightList.add(flight);
    }
}
