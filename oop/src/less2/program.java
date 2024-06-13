package less2;

import java.util.List;

public class program {

    public static void main(String[] args) {

        Human customer1 = new Human("покупатель 1");
        Human customer2 = new Human("покупатель 2");
        Human customer3 = new Human("покупатель 3");
        Human customer4 = new Human("покупатель 4");
        Human customer5 = new Human("покупатель 5");
        Human customer6 = new Human("покупатель 6");
        Human customer7 = new Human("покупатель 7");

        Market market = new Market();

        market.acceptToMarket(List.of(customer1, customer2, customer3, customer4, customer6, customer5));

        market.giveOrders(customer1, List.of(EProduct.SUGAR, EProduct.JUICE, EProduct.VODKA));
        market.giveOrders(customer2, List.of(EProduct.APPLE, EProduct.FILE, EProduct.POTATO, EProduct.MEAT));
        market.giveOrder(customer3, EProduct.APPLE);
        market.giveOrder(customer4, EProduct.APPLE);

        market.update();

        market.releaseFromMarket(customer2);
        market.releaseFromMarket(customer3);

        market.acceptToMarket(customer7);
        market.giveOrder(customer7, EProduct.VODKA);

        market.update();

        market.releaseFromMarket();

        market.update();
        
    }
}