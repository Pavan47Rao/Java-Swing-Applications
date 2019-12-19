/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author info
 */
public class ProductDirectory {
    
    private ArrayList<Product> productDirectory;
    
    public ProductDirectory(){
        productDirectory = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ArrayList<Product> productDirectory) {
        this.productDirectory = productDirectory;
    }
    
    public void addProduct(Product newProduct){
        productDirectory.add(newProduct);
    }
    
    public void deleteProduct(Product product){
        productDirectory.remove(product);
    }
    
    public Product searchProduct(String name){
        for(Product prod : this.productDirectory){
            if(prod.getName().equalsIgnoreCase(name)){
                return prod;
            }
        }
        return null;
    }
    
//    public int getIndexOfProduct(Product prod) {
//        for(int i=0; i<productDirectory.size(); i++ ){
//            
//            if(prod.getName().equals(productDirectory.get(i).getName()) && 
//               prod.getPrice() == productDirectory.get(i).getPrice() &&
//                    prod.getAvailNum() == (productDirectory.get(i).getAvailNum()) &&
//                    prod.getDescription().equals(productDirectory.get(i).getDescription())){
//                return i;
//            }
//        }
//        return -1;
//    }
    
//    public void setProductInProdDir(Product prod, int index) {
//        Product prodInIndex = productDirectory.get(index);
//        prodInIndex.setName(prod.getName());
//        prodInIndex.setAvailNum(prod.getAvailNum());
//        prodInIndex.setPrice(prod.getPrice());
//        prodInIndex.setDescription(prod.getDescription());
//        productDirectory.set(index, prodInIndex);
//    }
}
