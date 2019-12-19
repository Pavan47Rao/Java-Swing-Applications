/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Components;

import Business.Users.Airline;
import Business.Users.Customer;
import Business.Users.TravelAgent;
import java.util.ArrayList;

/**
 *
 * @author Floyed Pinto
 */
public class AirlineDirectory {
    
    private ArrayList<Airline> airlineList = new ArrayList<>();

    public ArrayList<Airline> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(ArrayList<Airline> airlineList) {
        this.airlineList = airlineList;
    }

    public void addAirline(Airline customer){
        this.airlineList.add(customer);
    }
    
}
