package impl;

import java.util.List;

import OOP_s1.Product;
import OOP_s1.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {
    public HotDrinkVendingMachine() {
        super();
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }

    // @Override
    // public Product getProduct(String name, int value, int temperature){
    //     for (Product product : products) {
    //         if (product.getName().equals(name)) {
     
    //             Product result = product;
    //             System.out.println("product down --> " + result);
    //             products.remove(product);
    //             return result;
    //         }
    //     }
    //       // - так тоже правильно --> throw new RuntimeException("No such product:" +
    //     // name);
    //     System.out.println("No such product:" + name);
    //     return null;
        // return super.getProduct(name);
    // }
    // @Override
    // public Product getProduct(String name) {
    // // TODO Auto-generated method stub
    // return super.getProduct(name);
    // }
}
