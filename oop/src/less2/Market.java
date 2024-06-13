package less2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Human> actors = new ArrayList<Human>();

    private List<Human> actorsAtOffice = new ArrayList<Human>();

    public void acceptToMarket(Human actor) {
        if (!actors.contains(actor)) {
            actors.add(actor);
            System.out.printf("%s вошёл в магазин.\n", actor.getName());
        } else {
            System.out.printf("%s уже в магазине.\n", actor.getName());
        }
    }

    public void acceptToMarket(List<Human> group) {
        for (Human actor : group) {
            actors.add(actor);
        }
        System.out.println("Группа покупателей вошла в магазин.");
    }

    @Override
    public void releaseFromMarket(Human actor) {
        int namActor = actors.indexOf(actor);
        actors.remove(namActor);
        System.out.printf("%s вышёл из магазина.\n", actor.getName());
    }

    public void releaseFromMarket() {
        List<Human> temp = new ArrayList<>();
        for (Human human : actors) {
            if (human.isTakeOrder()) {
                System.out.printf("%s вышёл из магазина, получив заказ.\n", human.getName());
                temp.add(human);
            } else if(!human.isMakeOrder()){
                System.out.printf("%s вышёл из магазина, не сделав заказ заказ.\n", human.getName());
                temp.add(human);
            }
        }
        actors.removeAll(temp);
    }

    @Override
    public void update() {
        int i = 0;
        for (Human human : actors) {
            if (human.isMakeOrder() && !human.isTakeOrder()) {
                takeInQueue(human);
            }
        }
    
        while (actorsAtOffice.size() > 0) {
            takeOrders();
            i++;
        }

        System.out.printf("STATUS: %d закаов выдано, в магазине осталось %d посетителей.\n", i, actors.size());
    }

    @Override
    public void giveOrders(Human actor, List<EProduct> products) {
        if (actor.isMakeOrder()) {
            System.out.printf("%s дополнил заказ.\n", actor.getName());
        } else {
            System.out.printf("%s сделал заказ.\n", actor.getName());
        }
        int actorIndex = actors.indexOf(actor);
        Human tempActor = actors.remove(actorIndex);
        tempActor.saveOrder(products);
        actors.add(tempActor);
    }

    public void giveOrder(Human actor, EProduct product) { // сделать заказ/добавить продукт
        if (actor.isMakeOrder()) {
            System.out.printf("%s дополнил заказ.\n", actor.getName());
        }else{
            System.out.printf("%s сделал заказ.\n", actor.getName());
        }
        int actorIndex = actors.indexOf(actor);
        Human tempActor = actors.remove(actorIndex);
        tempActor.saveOrder(product);
        actors.add(tempActor);
    }

    @Override
    public void releaseFromQueue(Human actor) {// выход из очереди
        System.out.printf("%s вышел из очереди не получив заказ.\n", actor.getName());
        int namActor = actors.indexOf(actor);
        actorsAtOffice.remove(namActor);
    }

    public void releaseFromQueue() {
        System.out.printf("%s вышел из очереди не получив заказ.\n", actors.get(0).getName());
        actorsAtOffice.remove(0);
        
    }

    @Override
    public void takeInQueue(Human actor) {
        System.out.printf("%s встал в очередь за заказом.\n", actor.getName());
        if (actor.isMakeOrder()) {
            actorsAtOffice.add(actor);
        }
    }

    @Override
    public void takeOrders() {
        Human actorWithOrder = actorsAtOffice.remove(0);
        System.out.printf("%s получил заказ и вышел из очереди.\n", actorWithOrder.getName());
        actorWithOrder.setTakeOrder(true);
    }

    public int countActors() {
        return actors.size();
    }

}