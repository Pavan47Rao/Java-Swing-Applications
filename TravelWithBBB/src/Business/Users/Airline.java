/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Components.FlightDirectory;

/**
 *
 * @author Floyed Pinto
 */
public class Airline extends User{
    
    private FlightDirectory flightDirectory = new FlightDirectory();
    
    private String name;
    
    private Boolean isAirlineCreated = false;
    
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public Airline(String userName, String password){
        super(userName,password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
    
    
    @Override
    public String toString(){
        return this.getName();
    }

    public Boolean getIsAirlineCreated() {
        return isAirlineCreated;
    }

    public void setIsAirlineCreated(Boolean isAirlineCreated) {
        this.isAirlineCreated = isAirlineCreated;
    }
    
}
