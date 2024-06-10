package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    @Override
    public void addProducts(List<Product> products) {
        System.out.println("Всегда ничего не верну");
    }
}
