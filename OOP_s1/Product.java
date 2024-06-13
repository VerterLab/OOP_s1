package OOP_s1;

import java.time.LocalDate;

/**
 * Product
 */
public class Product {

    protected String name;
    protected double price;
    protected LocalDate releaseDate;

    /*
     * Product(String name,)
     */
    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Product{" + "name= " + name + '\'' + ", price= " + price + ", releaseDate=" + releaseDate;
    }
}