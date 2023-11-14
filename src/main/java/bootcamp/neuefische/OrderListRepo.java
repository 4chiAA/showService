package bootcamp.neuefische;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
            orders.add(order);

    }

    public void removeOrder(Order order){
        if(queryOrder(order)) {
            orders.remove(order);
        }
    }

    public boolean queryOrder(Order order){
        // String name = order.getName();
        // String type = order.getType();

        return orders.contains(order);
    }

}
