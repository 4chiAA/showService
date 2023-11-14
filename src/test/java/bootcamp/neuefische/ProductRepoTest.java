package bootcamp.neuefische;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {


    @Test
    void addProduct_whenAdding1Product_thenSizeofListIs1(){
        // GIVEN
        Product product = new Product("Harry Potter Caslte", "Puzzle", 149.99);
        int expected = 1;
        // WHEN
        ProductRepo pRepo = new ProductRepo();
        pRepo.addProduct(product);
        int actual = pRepo.products.size();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void addProduct_whenAddingProduct_thenAddSameProduct(){
        // GIVEN
        Product product = new Product("Harry Potter Caslte", "Puzzle", 149.99);
        List<Product> expected = new ArrayList<>();
        expected.add(product);
        // WHEN
        ProductRepo pRepo = new ProductRepo();
        pRepo.addProduct(product);
        List<Product> actual = pRepo.products;
        // THEN
        assertEquals(expected, actual);
    }




    // GIVEN
    // WHEN
    // THEN

}