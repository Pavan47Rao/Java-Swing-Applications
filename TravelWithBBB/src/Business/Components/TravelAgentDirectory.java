/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Components;

import Business.Users.Customer;
import Business.Users.TravelAgent;
import java.util.ArrayList;

/**
 *
 * @author Floyed Pinto
 */
public class TravelAgentDirectory {
    
    private ArrayList<TravelAgent> travelAgentList = new ArrayList<>();

    public ArrayList<TravelAgent> getTravelAgentList() {
        return travelAgentList;
    }

    public void setTravelAgentList(ArrayList<TravelAgent> travelAgentList) {
        this.travelAgentList = travelAgentList;
    }

    public void addTravelAgent(TravelAgent travelAgent){
        this.travelAgentList.add(travelAgent);
    }
    
    
}
