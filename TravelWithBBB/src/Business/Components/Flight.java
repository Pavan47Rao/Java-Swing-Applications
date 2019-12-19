/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Components;

import java.util.Date;

/**
 *
 * @author Floyed Pinto
 */
public class Flight {
    
    private String from;
    private String to;
    
    private String departure;
    private String arrival;
    
    private Double price;
    
    /**
     * Seats associated with this flight
     */
    private Seat[][] seats = new Seat[10][3];

    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }
    
//    /**
//     * Seats associated with this flight
//     */
//    private int[][] seats = new int[3][10];
//
//    public int[][] getSeats() {
//        return seats;
//    }
//
//    public void setSeats(int[][] seats) {
//        this.seats = seats;
//    }
    
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return this.getDeparture().toString();
    }
    
}
