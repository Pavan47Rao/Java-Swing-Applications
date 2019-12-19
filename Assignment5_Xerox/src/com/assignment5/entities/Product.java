/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author kasai
 */
public class Product {

    public Product(int productId, int minPrice, int maxPrice, int targetPrice) {
        this.productId = productId;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.targetPrice = targetPrice;
    }
    int productId;
    int minPrice;
    int maxPrice;
    int targetPrice;
    int avgSalesPrice;

    public int getAvgSalesPrice() {
        return avgSalesPrice;
    }

    public void setAvgSalesPrice(int avgSalesPrice) {
        this.avgSalesPrice = avgSalesPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    @Override
    public String toString() {
        return "productId :" + productId + " "
                + "minPrice :" + minPrice + " "
                + "maxPrice :" + maxPrice + " "
                + "targetPrice :" + targetPrice + " "
                + "avgSalesPrice :" + avgSalesPrice;
    }

}
