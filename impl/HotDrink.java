package impl;

import java.time.LocalDate;

import OOP_s1.Product;

public class HotDrink extends Product {
    int temperature;
    int volume;

    public HotDrink(String name, double price, LocalDate releaseDate, int volume, int temperature) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 20;
        this.volume = 4;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
