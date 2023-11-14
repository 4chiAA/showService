package bootcamp.neuefische;

import java.util.List;


public record Order(int id, List<Product> products) {

    public int getID(){
        return id;
    }

    public List<Product> getOrder(){
        return products;
    }
}
