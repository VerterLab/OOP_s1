package OOP_s1;

import java.util.ArrayList;
import java.util.List;

import impl.HotDrink;

public class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                System.out.println("product down --> " + result);
                System.out.println();
                products.remove(product);
                return result;
            }
        }
        System.out.println("No such product:" + name);
        return null;
    }

    public Product getProduct(String name, int valume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == valume
                        && hotDrink.getTemperature() == temperature) {
                    Product result = hotDrink;
                    System.out.println("product down --> " + result);
                    System.out.println();
                    products.remove(hotDrink);
                    return result;

                }
            }
        }
        System.out.println("No such product:" + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
