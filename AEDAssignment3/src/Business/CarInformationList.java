/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tusiyu
 */
public class CarInformationList {
    
    private static CarInformationList carLists;
    public List<Car> carList;
    
    private CarInformationList(){
        
        carList = new ArrayList<>();
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true, 58);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true, 70);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true, 49);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true, 62);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true, 68);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true, 52);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "", "Seattle", true, 52);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true, 78);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true, 80);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true, 90);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
    }

    public static CarInformationList  getCarList() {
        carLists = new CarInformationList();
        return carLists;
    }

}
