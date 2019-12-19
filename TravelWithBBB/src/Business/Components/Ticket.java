/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Components;

import Business.Users.Airline;
import Business.Users.Customer;

/**
 *
 * @author Floyed Pinto
 */
public class Ticket {
    
    /**
     * The flight which is related to this Ticket
     */
    private Flight flight;
    
    /**
     * The airline which is related to this Ticket
     */
    private Airline airline;
    
    /**
     * The Customer which has booked this flight
     */
    private Customer customer;
    
    /**
     * The Seat which has booked this flight
     */
    private Seat seat;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    
    
    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
    
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
