package task3;

public class Store {
    private Product[] products;

    public Store(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void displayProducts() {
        for (Product product : products) {
            String type = product instanceof Milk ? "Milk" :
                    product instanceof Cookie ? "Cookie" :
                            product instanceof Sandwich ? "Sandwich" : "Unknown";
            System.out.println(type + ": Price = " + product.getPrice() + ", Expires = " + product.getExpires());
        }
    }
}
