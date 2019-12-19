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
public class TicketDirectory {
    
    private ArrayList<Ticket> ticketList = new ArrayList<>();

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public void addTicket(Ticket ticket){
        this.ticketList.add(ticket);
    }
    
}
