package shopping;

import week9.lesson2.example4.Cat;

public class MainApp {

    public static void main(String[] args) {

        BookProduct martinEden = new BookProduct(
                "Martin Eden",
                100,
                Category.BOOKS,
                "Bookstore Inc.",
                "Jack London",
                Genre.FICTION);

        ElectronicProduct montor = new ElectronicProduct(
            "QMAX",
                300,
                Category.ELECTRONICS,
                110,
                0,
                PlugType.TYPE_C
        );

        ClothingProduct zaraJeans = new ClothingProduct(
                "Zara jeans",
                50,
                Category.CLOTHING,
                48,
                "Cotton",
                Season.SUMMER
        );

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(zaraJeans);
        shoppingCart.addProduct(montor);
        shoppingCart.addProduct(martinEden);

        shoppingCart.printProductsData();
        System.out.println("TOTAL PRICE : " + shoppingCart.calculatePrice());

        shoppingCart.removeProduct(0);

        shoppingCart.printProductsData();
        System.out.println("TOTAL PRICE : " + shoppingCart.calculatePrice());

    }
}
