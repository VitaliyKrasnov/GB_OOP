package less1.practice.impl;

import java.time.LocalDate;

import less1.practice.Product;

public class HotDrink extends Product {

    private HotDrinkVolumes volume;
    private HotDrinkTemperatures temperature; 

    public HotDrink(String name, double price, LocalDate releaseDate, 
            HotDrinkVolumes volume, HotDrinkTemperatures temperature) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrinkVolumes getVolume() {
        return volume;
    }

    public HotDrinkTemperatures getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume.getDescription() +
                ", temperature=" + temperature.getDescription() +
                '}';
    }
    
}
