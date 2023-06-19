package shopping;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(int index){
        products.remove(index);
    }

}
