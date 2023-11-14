package bootcamp.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            ShopService shop = new ShopService();

            Product product1 = new Product("Asterix 40: Die Weiße Iris", "Buch", 13.50);
            Product product2 = new Product("Canon EOS 2000D", "Kamera", 421.89);
            Product product3 = new Product("Lenovo (15,6 Zoll HD+ Notebook)", "Laptop", 299);
            Product product4 = new Product("Die Einladung", "Buch", 24.00);
            Product product5 = new Product("Arcchio LED Stehlampe", "Beleuchtung", 325.90);

            shop.pRepo.addProduct(product1);
            shop.pRepo.addProduct(product2);
            shop.pRepo.addProduct(product3);
            shop.pRepo.addProduct(product4);
            shop.pRepo.addProduct(product5);

            List<Product> orderProducts = new ArrayList<>();
            orderProducts.add(product1);
            orderProducts.add(product3);

            Order order = new Order(1, orderProducts);

            shop.placeOrder(order);

            System.out.println(shop.oRepo.orders);

    }
}