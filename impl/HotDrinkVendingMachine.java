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
}
