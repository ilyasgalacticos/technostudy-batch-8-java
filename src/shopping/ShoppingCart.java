package shopping;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int index) {
        products.remove(index);
    }

    public void printProductsData() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getData());
        }
    }

    public double calculatePrice(){
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i) instanceof Discountable){
                total = total + ((Discountable) products.get(i)).calculateDiscountPrice();
            }else{
                total = total + products.get(i).getPrice();
            }
        }
        return total;
    }

}
