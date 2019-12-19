/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel;

import java.awt.image.BufferedImage;

/**
 *
 * @author pavanrao
 */
public class Car {
    
    private String company;
    private String model;
    private String color;
    private String startingPrice;
    private String engineLitres;
    private String horsepower;
    private String torque;
    private String transmissionType;
    private String topSpeed;
    private String fuelTankCapacity;
    private String tireType;
    private String wheelDimension;
    private String tireDimension;
    private String exteriorLWH;
    private String curbWeight;
    private BufferedImage image;

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
    
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(String startingPrice) {
        this.startingPrice = startingPrice;
    }

    public String getEngineLitres() {
        return engineLitres;
    }

    public void setEngineLitres(String engineLitres) {
        this.engineLitres = engineLitres;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(String fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getWheelDimension() {
        return wheelDimension;
    }

    public void setWheelDimension(String wheelDimension) {
        this.wheelDimension = wheelDimension;
    }

    public String getTireDimension() {
        return tireDimension;
    }

    public void setTireDimension(String tireDimension) {
        this.tireDimension = tireDimension;
    }

    public String getExteriorLWH() {
        return exteriorLWH;
    }

    public void setExteriorLWH(String exteriorLWH) {
        this.exteriorLWH = exteriorLWH;
    }

    public String getCurbWeight() {
        return curbWeight;
    }

    public void setCurbWeight(String curbWeight) {
        this.curbWeight = curbWeight;
    }
    
}
