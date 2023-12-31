package bootcamp.neuefische;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);

    }

    public void removeProduct(Product product){
        if(queryProduct(product)){
            products.remove(product);
        }
    }

    public boolean queryProduct(Product product){
        return products.contains(product);
    }

}
