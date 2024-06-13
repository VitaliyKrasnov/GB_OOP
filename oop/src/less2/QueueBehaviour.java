package less2;

import java.util.List;

public interface QueueBehaviour {

    void takeInQueue(Human actor);

    void takeOrders();

    void giveOrders(Human actor, List<EProduct> products);

    void releaseFromQueue(Human actor);
    
}