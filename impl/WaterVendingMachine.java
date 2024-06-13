package impl;

import java.util.List;

import OOP_s1.Product;
import OOP_s1.VendingMachine;

public class WaterVendingMachine extends VendingMachine {

    public WaterVendingMachine(){
        super();
    }
    public WaterVendingMachine(List<Product> products){
        super(products);
    }
}
