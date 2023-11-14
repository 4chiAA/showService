package bootcamp.neuefische;

import java.util.List;

public class ShopService {

    ProductRepo pRepo = new ProductRepo();
    OrderListRepo oRepo = new OrderListRepo();


    public void placeOrder(Order order){

        List<Product> productsInOrder = order.getOrder();

        if(productsInOrder.retainAll(pRepo.products)){
            oRepo.addOrder(order);
        } else {
            System.out.println("Some products are not available");
        }


        /*
        List<Product> listOfCommonItems = orders.stream()
                .filter(item -> repo.products.contains(item))
                .toList();


        (int i = 0; i < orders.size(); i++){
            for(int j = 0; j < pRepo.products.size(); i++){
                String orderName = orders.getFirst().name();
                String productName = pRepo.products.getFirst().name();
                if(orderName.equals(productName)){
                    orders.addO
                }
            }

            boolean checkForEquality = false;
        for(int i = 0; i < orders.size(); i++){
            for(int j = 0; j < repo.products.size(); i++){
                if(orders.get(i).equals(repo.products.get(j));
                checkForEquality = true;
            }
        }
         */


    }
}
