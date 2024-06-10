package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrink;
import less1.practice.impl.HotDrinkTemperatures;
import less1.practice.impl.HotDrinkVM;
import less1.practice.impl.HotDrinkVendingMachine;
import less1.practice.impl.HotDrinkVolumes;
import less1.practice.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        HotDrinkVendingMachine vm1 = new HotDrinkVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        Product hd1 = new HotDrink("чай", 100, LocalDate.of(2024, 6, 1),
                HotDrinkVolumes.SMALL, HotDrinkTemperatures.WARM);
        Product hd2 = new HotDrink("чай", 100, LocalDate.of(2024, 6, 1),
                HotDrinkVolumes.MEDIUM, HotDrinkTemperatures.VERY_HOT);
        Product hd3 = new HotDrink("кофе", 150, LocalDate.of(2024, 6, 1),
                HotDrinkVolumes.LARGE, HotDrinkTemperatures.VERY_HOT);
        Product hd4 = new HotDrink("шоколад", 100, LocalDate.of(2024, 6, 1),
                HotDrinkVolumes.MEDIUM, HotDrinkTemperatures.HOT);   
                
        vm1.addProducts(List.of(hd1, hd2, hd3, hd4));
        System.out.println(vm1.getProducts());
        Product p = vm1.getProduct("шоколад", HotDrinkVolumes.LARGE, HotDrinkTemperatures.WARM);
        if (p != null) System.out.println(p.toString());
        p = vm1.getProduct("шоколад", HotDrinkVolumes.MEDIUM, HotDrinkTemperatures.HOT);
        if (p != null) System.out.println(p.toString());
    }
}
