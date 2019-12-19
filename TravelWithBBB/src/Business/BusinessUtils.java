/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Users.Airline;
import Business.Users.Customer;
import Business.Users.TravelAgent;
import java.util.ArrayList;
import Business.Components.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Floyed Pinto
 */
public class BusinessUtils {
    
    
    private static CustomerDirectory customerDirectory = new CustomerDirectory();
    private static AirlineDirectory airlineDirectory = new AirlineDirectory();
    private static TravelAgentDirectory travelAgentDirectory = new TravelAgentDirectory();
    private static TicketDirectory ticketDirectory = new TicketDirectory();

    
    static{
        
        Customer cust1 = new Customer("c1","c1");
        
        customerDirectory.addCustomer(cust1);
        
        TravelAgent ta1 = new TravelAgent("ta1","ta1");
        
        travelAgentDirectory.addTravelAgent(ta1);
        
        Airline air1 = new Airline("a1","a1");
        
        Flight flight = new Flight();
        flight.setArrival("10-12-2019 00:11:22");
        flight.setDeparture("10-11-2019 00:11:22");
        flight.setFrom("Bangalore");
        flight.setTo("Boston");
        flight.setPrice(236.89);
        
        air1.setName("Qatar Airways");
        air1.getFlightDirectory().addFlight(flight);
        
        airlineDirectory.addAirline(air1);
        
        Ticket ticket = new Ticket();
        
        ticket.setCustomer(cust1);
        ticket.setFlight(flight);
        ticket.setAirline(air1);
        
        Seat seat = new Seat();
        seat.setX(1);
        seat.setY(1);
        
        flight.getSeats()[1][1] = seat;

        
        ticket.setSeat(seat);
        
        ticketDirectory.addTicket(ticket);
        
        
        // For 2
        Flight flight2 = new Flight();
        flight2.setArrival("15-09-2020 10:20:20");
        flight2.setDeparture("31-01-2020 04:34:20");
        flight2.setFrom("Mumbai");
        flight2.setTo("Dubai");
        flight2.setPrice(126.89);
        
        Airline air2 = new Airline("a2","a2");
        
        air2.setName("Emirates");
        air2.getFlightDirectory().addFlight(flight2);
        
        flight2.setDeparture("10-12-2019 11:22:11");
        flight2.setArrival("10-11-2019 12:11:22");
        
        airlineDirectory.addAirline(air2);
        
        Ticket ticket2 = new Ticket();
        
        ticket2.setCustomer(cust1);
        ticket2.setFlight(flight2);
        ticket2.setAirline(air2);
        
        Seat seat2 = new Seat();
        seat2.setX(1);
        seat2.setY(2);
        
        flight2.getSeats()[1][2] = seat2;

        
        ticket2.setSeat(seat2);
        
        ticketDirectory.addTicket(ticket2);
        
        
    }

    public static void deleteTicket(Ticket ticket){
        
        ticketDirectory.getTicketList().remove(ticket);

    }
    
    
    
    public static void deleteFlight(Flight flight){
        
        //remove from airline directory 
        for(Airline airline : airlineDirectory.getAirlineList()){
            
            if(airline.getFlightDirectory().getFlightList().contains(flight)){
                airline.getFlightDirectory().getFlightList().remove(flight);
            }
        }
        
        //Cancel/remove all tickets
        
        for(Ticket ticket : ticketDirectory.getTicketList()){
            
            
            if(ticket.getFlight() == flight){
                deleteTicket(ticket);
            }
            
        }
        
//        ticketDirectory.getTicketList().remove();

        

    }
    
    
    
    public static CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public static AirlineDirectory getAirlineDirectory() {
        return airlineDirectory;
    }

    public static TravelAgentDirectory getTravelAgentDirectory() {
        return travelAgentDirectory;
    }
    
    public static TicketDirectory getTicketDirectory() {
        return ticketDirectory;
    }
          
}
