package task3;

import task3.*;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Milk(1.0, "2023-12-31" , 3),
                new Cookie(0.2, "2023-11-30", 1),
                new Sandwich(15.0,  "2023-10-15", 10)
        };

        Store store = new Store(products);
        store.displayProducts();
    }
}
