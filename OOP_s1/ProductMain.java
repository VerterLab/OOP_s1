package OOP_s1;

import java.time.LocalDate;
import java.util.List;

import impl.BottleOfWater;
import impl.EPackage;
import impl.HotDrink;
import impl.HotDrinkVendingMachine;
import impl.WaterVendingMachine;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("borj", 100, LocalDate.of(2024, 5, 8));
        Product bottle2 = new BottleOfWater("Nabegl", 90, LocalDate.of(2024, 4, 30), 0.5f, EPackage.GLASS.getMaterial(),
                true);

        VendingMachine vm = new WaterVendingMachine();
        System.out.println(vm.getProducts());
        vm.addProducts(List.of(bottle1, bottle1, bottle2, bottle1, bottle2));

        System.out.println(vm.getProducts());
        System.out.println();
        vm.getProduct("Nabegl");
        System.out.println(vm.getProducts());
        System.out.println();

        HotDrink hotdrink1 = new HotDrink("tea", 10, LocalDate.of(2024, 5, 3), 2, 80);
        HotDrink hotdrink2 = new HotDrink("tea", 15, LocalDate.of(2024, 5, 3), 1, 90);
        HotDrinkVendingMachine hd = new HotDrinkVendingMachine();
        hd.addProducts(List.of(hotdrink1, hotdrink1, hotdrink2, hotdrink2));
        System.out.println(hd.getProducts());
        hd.getProduct("tea",1,90);
        System.out.println(hd.getProducts());


    }
}
