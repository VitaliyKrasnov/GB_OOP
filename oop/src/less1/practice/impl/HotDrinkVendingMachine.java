package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine() {
        super();
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name, HotDrinkVolumes volume, HotDrinkTemperatures temperture) {

        for (Product product : products) {
            HotDrink hd = (HotDrink) product;
            if (product.getName().equals(name)
                    && hd.getTemperature() == temperture
                    && hd.getVolume() == volume) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name + ", volume=" + volume + ", tempersture=" + temperture);
        return null;
    }

}
