/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment.data.DataStore;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {

    public static void main(String args[]) throws IOException {        
        
        DataGenerator generator = DataGenerator.getInstance();

        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        DataReader orderReader = new DataReader(generator.getOrderFilePath());
        String[] orderRow;
        //generateSalesData(orderReader.getFileHeader());
        while ((orderRow = orderReader.getNextRow()) != null) {
            generateSalesData(orderRow);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        DataReader productReader = new DataReader(generator.getProductCataloguePath());

        String[] prodRow;

        while ((prodRow = productReader.getNextRow()) != null) {
            storeProduct(prodRow);
        }

        //Not Required
        //TODO remove this 
//        System.out.println(DataStore.getInstance().getProducts());
//        System.out.println(DataStore.getInstance().getCustomers());
//        System.out.println(DataStore.getInstance().getItems());
//        System.out.println(DataStore.getInstance().getOrders());
//        System.out.println(DataStore.getInstance().getSalesPersons());
        performAnalysis();

    }

    public static void generateSalesData(String[] row) {
        Item item = generateItem(Integer.parseInt(row[1]), Integer.parseInt(row[2]), Integer.parseInt(row[3]), Integer.parseInt(row[6]));
        Order order = generateOrder(Integer.parseInt(row[0]), Integer.parseInt(row[4]), Integer.parseInt(row[5]), item);
        generateSalesPerson(Integer.parseInt(row[4]));
        generateCustomer(Integer.parseInt(row[5]));
    }

    private static Customer generateCustomer(int customerId) {
        ArrayList<Order> orderList = new ArrayList<Order>();
        DataStore dataStore = DataStore.getInstance();
        Map<Integer, Order> orderMap = dataStore.getOrders();
        for (Order i : orderMap.values()) {
            if (i.getCustomerId() == customerId) {
                orderList.add(i);
            }
        }
        Customer customer = new Customer(customerId, orderList);
        Map<Integer, Customer> customerMap = dataStore.getCustomers();
        customerMap.put(customerId, customer);
        return customer;
    }

    private static SalesPerson generateSalesPerson(int salesId) {
        ArrayList<Order> orderList = new ArrayList<Order>();
        DataStore dataStore = DataStore.getInstance();
        Map<Integer, Order> orderMap = dataStore.getOrders();
        for (Order i : orderMap.values()) {
            if (i.getSupplierId() == salesId) {
                orderList.add(i);
            }
        }
        SalesPerson salesPerson = new SalesPerson(salesId, orderList);
        Map<Integer, SalesPerson> salesPersonMap = dataStore.getSalesPersons();
        salesPersonMap.put(salesId, salesPerson);
        return salesPerson;
    }

    private static Item generateItem(int itemId, int productId, int quantity, int salesPrice) {
        Item item = new Item(itemId, productId, salesPrice, quantity);
        DataStore dataStore = DataStore.getInstance();
        Map<Integer, Item> itemMap = dataStore.getItems();
        itemMap.put(itemId, item);
        return item;
    }

    private static Order generateOrder(int orderId, int supplierId, int customerId, Item item) {
        Order order = new Order(orderId, supplierId, customerId, item);
        DataStore dataStore = DataStore.getInstance();
        Map<Integer, Order> orderMap = dataStore.getOrders();
        orderMap.put(orderId, order);
        return order;
    }

    public static void storeProduct(String[] row) {

        int productId = Integer.valueOf(row[0]);
        int minPrice = Integer.valueOf(row[1]);
        int maxPrice = Integer.valueOf(row[2]);
        int targetPrice = Integer.valueOf(row[3]);

        Product p = new Product(productId, minPrice, maxPrice, targetPrice);

        DataStore.getInstance().getProducts().put(productId, p);

        Product p1 = new Product(productId, minPrice, maxPrice, targetPrice);

        DataStore.getInstance().getModifiedProducts().put(productId, p1);

    }

    public static void performAnalysis() {

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1) The top 3 best negotiated products (meaning products that sell above target) : ");
        displayBestNegotiatedProduct();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        System.out.println("2) The top 3 customers: ");
        displayTopThreeCustomers();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        System.out.println("3) The top 3 sales people : ");
        displayTopThreeSalesPeople();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        System.out.print("4) Total profit by all sales people : ");
        calculateOverAllProfitByAllSalesPeople();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        System.out.println("5) i) Analysis of Product Catalog on existing Sales data : ");
        calculateAverageSalesPrice();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        //generate new data
        generateNewData();

//        System.out.print(DataStore.getInstance().getProducts());
//        System.out.println();
//        System.out.print(DataStore.getInstance().getModifiedProducts());
        System.out.println("5) ii) Analysis of Product Catalog on modified Sales data :");
        calculateModifiedAverageSalesPrice();

        System.out.println("");
        System.out.println("---------------------------------------------END--------------------------------------------------------------------------");

    }

    public static void calculateAverageSalesPrice() {
        Iterator productsIterator = DataStore.getInstance().getProducts().entrySet().iterator();
        Map<Integer, Integer> productsMap = new HashMap<Integer, Integer>();
        while (productsIterator.hasNext()) {
            Iterator itemsIterator = DataStore.getInstance().getItems().entrySet().iterator();
            int salesPriceSum = 0, quantitySum = 0, average = 0;
            Map.Entry mapElement = (Map.Entry) productsIterator.next();
            Integer productId = (Integer) mapElement.getKey();
            while (itemsIterator.hasNext()) {
                Map.Entry map2Element = (Map.Entry) itemsIterator.next();
                Item item = (Item) map2Element.getValue();
                if (item.getProductId() == productId) {
                    salesPriceSum += item.getSalesPrice() * item.getQuantity();
                    quantitySum += item.getQuantity();
                }
            }
            if(quantitySum != 0){
                average = salesPriceSum / quantitySum;
            }
            Product prod = (Product) mapElement.getValue();
            prod.setAvgSalesPrice(average);

            DataStore.getInstance().getModifiedProducts().get(prod.getProductId()).setAvgSalesPrice(average);

            productsMap.put(productId, average);
        }

        List<Map.Entry<Integer, Product>> productList
                = new LinkedList<Map.Entry<Integer, Product>>(DataStore.getInstance().getProducts().entrySet());

        Collections.sort(productList, new Comparator<Map.Entry<Integer, Product>>() {
            @Override
            public int compare(Map.Entry<Integer, Product> o1, Map.Entry<Integer, Product> o2) {
                Product product1 = o1.getValue();
                Integer diff1 = Math.abs(product1.getAvgSalesPrice() - product1.getTargetPrice());
                Product product2 = o2.getValue();
                Integer diff2 = Math.abs(product2.getAvgSalesPrice() - product2.getTargetPrice());
                return (diff2).compareTo(diff1);
            }
        });

        System.out.println();
        System.out.println("PRODUCTS WHOSE AVG SALES PRICE IS GREATER THAN TARGET PRICE");
        System.out.printf("%10s %10s %10s %10s %10s %10s", "Product Id | ", "Average Sales Price | ", "Target Price | ", "Difference |","Min Price |","Max Price |");
        System.out.println();
        for (Map.Entry<Integer, Product> prod : productList) {
            Product product = prod.getValue();
            if (product.getAvgSalesPrice() > product.getTargetPrice()) {
                int diff = Math.abs(product.getAvgSalesPrice() - product.getTargetPrice());
                System.out.printf("%7s %20s %18s %10s %12s %11s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff,product.getMinPrice(),product.getMaxPrice());
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("PRODUCTS WHOSE AVG SALES PRICE IS LOWER THAN TARGET PRICE");
        System.out.printf("%10s %10s %10s %10s %10s %10s", "Product Id | ", "Average Sales Price | ", "Target Price | ", "Difference |","Min Price |","Max Price |");
        System.out.println();
        for (Map.Entry<Integer, Product> prod : productList) {
            Product product = prod.getValue();
            if (product.getAvgSalesPrice() < product.getTargetPrice()) {
                int diff = Math.abs(product.getAvgSalesPrice() - product.getTargetPrice());
                System.out.printf("%7s %20s %18s %10s %12s %11s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff,product.getMinPrice(),product.getMaxPrice());
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("PRODUCTS WHOSE AVG SALES PRICE IS EQUAL TO TARGET PRICE");
        System.out.printf("%10s %10s %10s %10s %10s %10s", "Product Id | ", "Average Sales Price | ", "Target Price | ", "Difference |","Min Price |","Max Price |");
        System.out.println();
        for (Map.Entry<Integer, Product> prod : productList) {
            Product product = prod.getValue();
            if (product.getAvgSalesPrice() == product.getTargetPrice()) {
                int diff = Math.abs(product.getAvgSalesPrice() - product.getTargetPrice());
                System.out.printf("%7s %20s %18s %10s %12s %11s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff,product.getMinPrice(),product.getMaxPrice());
                System.out.println();
            }
        }
    }

    public static void displayTopThreeSalesPeople() {
        Map<Integer, Integer> profitMap = calculateProfitByAllSalesPeople();
//        System.out.println(profitMap);
        sortMapAndDisplayTop3(profitMap, "sales");
    }

    public static void displayTopThreeCustomers() {
        int salesPrice;
        int pID;
        int target = 0;
        int sum;
        Map<Integer, Integer> absoluteSumMap = new HashMap<Integer, Integer>();
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        Iterator customerIterator = DataStore.getInstance().getCustomers().entrySet().iterator();
        while (customerIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) customerIterator.next();
            Customer customer = (Customer) mapElement.getValue();
            sum = 0;
            for (Order o : customer.getOrderList()) {
                salesPrice = o.getItem().getSalesPrice();
                pID = o.getItem().getProductId();
                for (Product p : products.values()) {
                    if (pID == p.getProductId()) {
                        target = p.getTargetPrice();
                    }
                }
                sum += absoluteValue(salesPrice, target);
            }
            absoluteSumMap.put(customer.getCustomerID(), sum);
        }

        sortMapAndDisplayTop3(absoluteSumMap, "customer");

    }

    public static int absoluteValue(int a, int b) {
        if (a - b < 0) {
            return -(a - b);
        } else {
            return (a - b);
        }
    }

    public static void calculateOverAllProfitByAllSalesPeople() {
        Iterator salesIterator = calculateProfitByAllSalesPeople().entrySet().iterator();
        int profit = 0;
        while (salesIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) salesIterator.next();
            Integer profitPerSalesPerson = (Integer) mapElement.getValue();
            profit += profitPerSalesPerson;
        }
        System.out.println(profit);
    }

    public static Map<Integer, Integer> calculateProfitByAllSalesPeople() {
        Iterator salesIterator = DataStore.getInstance().getSalesPersons().entrySet().iterator();
        Map<Integer, Product> productsMap = DataStore.getInstance().getProducts();
        Map<Integer, Integer> profitPerSalesPersonMap = new HashMap<Integer, Integer>();
        while (salesIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) salesIterator.next();
            SalesPerson salesPerson = (SalesPerson) mapElement.getValue();
            List<Order> orderList = salesPerson.getOrders();
            for (Order order : orderList) {
                int quantity = order.getItem().getQuantity();
                int productId = order.getItem().getProductId();
                int sellingPrice = order.getItem().getSalesPrice();
                if (productsMap.get(productId).getTargetPrice() < sellingPrice) {
                    int profit = (sellingPrice - productsMap.get(productId).getTargetPrice()) * quantity;
                    if (profitPerSalesPersonMap.containsKey(salesPerson.getSupplierId())) {
                        profitPerSalesPersonMap.replace(salesPerson.getSupplierId(), profitPerSalesPersonMap.get(salesPerson.getSupplierId()) + profit);
                    } else {
                        profitPerSalesPersonMap.put(salesPerson.getSupplierId(), profit);
                    }
                }
            }
        }
        return profitPerSalesPersonMap;
    }

    //--------------------------------------------------------------------------------------------------------------------------
    //  Point 1 - START
    //--------------------------------------------------------------------------------------------------------------------------
    public static void displayBestNegotiatedProduct() {

        Map<Integer, Integer> negotiateCount = new HashMap<>();

        Iterator hmIterator = DataStore.getInstance().getOrders().entrySet().iterator();

        while (hmIterator.hasNext()) {

            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            Order currOrder = (Order) mapElement.getValue();

            int currentSalesPricePerProduct = currOrder.getItem().getSalesPrice();

            int target = 0;

            target = DataStore.getInstance().getProducts().get(currOrder.getItem().getProductId()).getTargetPrice();

            if (currentSalesPricePerProduct <= target) {
                continue;
            }

            int productId = currOrder.getItem().getProductId();
            int quantity = currOrder.getItem().getQuantity();

            negotiateCount.put(productId, negotiateCount.getOrDefault(productId, 0) + quantity);

        }

        sortMapAndDisplayTop3(negotiateCount, "product");
    }

    public static void sortMapAndDisplayTop3(Map<Integer, Integer> userPostsCount, String typeOfMap) {

        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(userPostsCount.entrySet());

        if (typeOfMap.equals("product") || typeOfMap.equals("sales")) {
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1,
                        Map.Entry<Integer, Integer> o2) {
                    return (o2.getValue()).compareTo(o1.getValue());
                }
            });
        } else if (typeOfMap.equals("customer")) {
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1,
                        Map.Entry<Integer, Integer> o2) {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });
        }

        int prevVal = -1;
        int position = 1;

        for (Map.Entry<Integer, Integer> aa : list) {

            if (prevVal == -1) {
                prevVal = aa.getValue();
            } else if (prevVal == aa.getValue()) {

            } else {
                prevVal = aa.getValue();
                position++;
            }

            if (position == 4) {
                return;
            }

            if (typeOfMap.equals("product")) {
                System.out.println("Position " + position + " || Product ID : " + aa.getKey() + " || Quantity : " + aa.getValue());
            }
            if (typeOfMap.equals("sales")) {
                System.out.println("Position " + position + " || Sales Person ID : " + aa.getKey() + " || Profit : " + aa.getValue());
            }
            if (typeOfMap.equals("customer")) {
                System.out.println("Position " + position + " || Customer ID : " + aa.getKey() + " || Sum of absolute value of sales price and target price : " + aa.getValue());
            }
        }
    }

    //--------------------------------------------------------------------------------------------------------------------------
    //  Point 1 - END
    //--------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------
    //  New Data creation - START
    //--------------------------------------------------------------------------------------------------------------------------
    public static void generateNewData() {

        Iterator hmIterator = DataStore.getInstance().getModifiedProducts().entrySet().iterator();

        while (hmIterator.hasNext()) {

            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            Product currProduct = (Product) mapElement.getValue();

//            if(currProduct.getAvgSalesPrice() != currProduct.getTargetPrice() 
//                    && (Math.abs(currProduct.getAvgSalesPrice() - currProduct.getTargetPrice())) > 1){
//                
//                int percent = ThreadLocalRandom.current().nextInt(98, 102);
//                                
//                int k = (int)(currProduct.getTargetPrice() * percent)/ 100;
//                                
//                currProduct.setTargetPrice(k);
//                
//                if(currProduct.getTargetPrice() > currProduct.getAvgSalesPrice()){
//                    currProduct.setMaxPrice(currProduct.getAvgSalesPrice() + (currProduct.getAvgSalesPrice() - currProduct.getMinPrice()));
//                } else if(currProduct.getTargetPrice() < currProduct.getAvgSalesPrice()){
//                    currProduct.setMinPrice(currProduct.getAvgSalesPrice() - (currProduct.getMaxPrice()- currProduct.getAvgSalesPrice()));
//                }
//                
//            }
            if ((0.95 * currProduct.getAvgSalesPrice()) > currProduct.getTargetPrice()) {

                int newVal = new Double(0.97 * currProduct.getAvgSalesPrice()).intValue();

                currProduct.setTargetPrice(newVal);
            } else if ((1.05 * currProduct.getAvgSalesPrice()) < currProduct.getTargetPrice()) {

                int newVal = new Double(1.03 * currProduct.getAvgSalesPrice()).intValue();

                currProduct.setTargetPrice(newVal);
            }

            if (currProduct.getTargetPrice() > currProduct.getAvgSalesPrice()) {
                currProduct.setMaxPrice(currProduct.getAvgSalesPrice() + (currProduct.getAvgSalesPrice() - currProduct.getMinPrice()));
            } else if (currProduct.getTargetPrice() < currProduct.getAvgSalesPrice()) {
                currProduct.setMinPrice(currProduct.getAvgSalesPrice() - (currProduct.getMaxPrice() - currProduct.getAvgSalesPrice()));
            }

        }

    }

    //--------------------------------------------------------------------------------------------------------------------------
    //  New Data creation - END
    //--------------------------------------------------------------------------------------------------------------------------
    //Displaying results on the basis of new product catalog data
    public static void calculateModifiedAverageSalesPrice() {
        Iterator productsIterator = DataStore.getInstance().getModifiedProducts().entrySet().iterator();
        Map<Integer, Integer> productsMap = new HashMap<Integer, Integer>();
        while (productsIterator.hasNext()) {
            Iterator itemsIterator = DataStore.getInstance().getItems().entrySet().iterator();
            int salesPriceSum = 0, quantitySum = 0, average = 0;
            Map.Entry mapElement = (Map.Entry) productsIterator.next();
            Integer productId = (Integer) mapElement.getKey();
            while (itemsIterator.hasNext()) {
                Map.Entry map2Element = (Map.Entry) itemsIterator.next();
                Item item = (Item) map2Element.getValue();
                if (item.getProductId() == productId) {
                    salesPriceSum += item.getSalesPrice() * item.getQuantity();
                    quantitySum += item.getQuantity();
                }
            }
            if(quantitySum != 0){
                average = salesPriceSum / quantitySum;
            }
            Product prod = (Product) mapElement.getValue();
            prod.setAvgSalesPrice(average);

            DataStore.getInstance().getModifiedProducts().get(prod.getProductId()).setAvgSalesPrice(average);

            productsMap.put(productId, average);
        }

        List<Map.Entry<Integer, Product>> productList
                = new LinkedList<Map.Entry<Integer, Product>>(DataStore.getInstance().getModifiedProducts().entrySet());

        Collections.sort(productList, new Comparator<Map.Entry<Integer, Product>>() {
            @Override
            public int compare(Map.Entry<Integer, Product> o1, Map.Entry<Integer, Product> o2) {
                Product product1 = o1.getValue();
                Integer diff1 = Math.abs(product1.getAvgSalesPrice() - product1.getTargetPrice());
                Product product2 = o2.getValue();
                Integer diff2 = Math.abs(product2.getAvgSalesPrice() - product2.getTargetPrice());
                return (diff2).compareTo(diff1);
            }
        });

        System.out.println();
        System.out.println("PRODUCTS WHOSE AVG SALES PRICE IS GREATER THAN TARGET PRICE");
        System.out.printf("%10s %10s %10s %10s %8s %10s %10s", "Product Id | ", "Average Sales Price | ", "Target Price | ", "Difference |", "Error | ","Min Price |","Max Price |");
        System.out.println();
        for (Map.Entry<Integer, Product> prod : productList) {
            Product product = prod.getValue();
            if (product.getAvgSalesPrice() > product.getTargetPrice()) {
                int diff = Math.abs(product.getAvgSalesPrice() - product.getTargetPrice());
                DecimalFormat numberFormat = new DecimalFormat("#0.00%");
                
                Double error = null;
                
                if(product.getAvgSalesPrice() != 0){
                    error = ((product.getTargetPrice()) - (product.getAvgSalesPrice())) / (double) (product.getAvgSalesPrice());
                }
                System.out.printf("%7s %20s %18s %10s %12s %10s %10s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff, error==null?"N/A":numberFormat.format(error),product.getMinPrice(),product.getMaxPrice());
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("PRODUCTS WHOSE AVG SALES PRICE IS LOWER THAN TARGET PRICE");
        System.out.printf("%10s %10s %10s %10s %8s %10s %10s", "Product Id | ", "Average Sales Price | ", "Target Price | ", "Difference |", "Error | ","Min Price |","Max Price |");
        System.out.println();
        for (Map.Entry<Integer, Product> prod : productList) {
            Product product = prod.getValue();
            if (product.getAvgSalesPrice() < product.getTargetPrice()) {
                int diff = Math.abs(product.getAvgSalesPrice() - product.getTargetPrice());
//                DecimalFormat numberFormat = new DecimalFormat("#0.00%");
//                double error = ((product.getTargetPrice()) - (product.getAvgSalesPrice())) / (double) (product.getAvgSalesPrice());
//                System.out.printf("%7s %20s %18s %10s %12s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff, numberFormat.format(error));
//                System.out.println();

               DecimalFormat numberFormat = new DecimalFormat("#0.00%");
                
                Double error = null;
                
                if(product.getAvgSalesPrice() != 0){
                    error = ((product.getTargetPrice()) - (product.getAvgSalesPrice())) / (double) (product.getAvgSalesPrice());
                }
                System.out.printf("%7s %20s %18s %10s %12s %10s %10s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff, error==null?"N/A":numberFormat.format(error),product.getMinPrice(),product.getMaxPrice());
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("PRODUCTS WHOSE AVG SALES PRICE IS EQUAL TO TARGET PRICE");
        System.out.printf("%10s %10s %10s %10s %8s", "Product Id | ", "Average Sales Price | ", "Target Price | ", "Difference |", "Error | ");
        System.out.println();
        for (Map.Entry<Integer, Product> prod : productList) {
            Product product = prod.getValue();
            if (product.getAvgSalesPrice() == product.getTargetPrice()) {
                int diff = Math.abs(product.getAvgSalesPrice() - product.getTargetPrice());
                DecimalFormat numberFormat = new DecimalFormat("#0.00%");
//                double error = ((product.getTargetPrice()) - (product.getAvgSalesPrice())) / (double) (product.getAvgSalesPrice());
//                System.out.printf("%7s %20s %18s %10s %12s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff, numberFormat.format(error));
//                System.out.println();

                Double error = null;
                
                if(product.getAvgSalesPrice() != 0){
                    error = ((product.getTargetPrice()) - (product.getAvgSalesPrice())) / (double) (product.getAvgSalesPrice());
                }
                System.out.printf("%7s %20s %18s %10s %12s", product.getProductId(), product.getAvgSalesPrice(), product.getTargetPrice(), diff, error==null?"N/A":numberFormat.format(error));
                System.out.println();
            }
        }
    }

}
