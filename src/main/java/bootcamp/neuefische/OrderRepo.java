package bootcamp.neuefische;

public interface OrderRepo {

    void addOrder(Order order);

    void removeOrder(Order order);

    boolean queryOrder(Order order);
}
