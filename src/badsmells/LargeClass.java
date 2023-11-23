package badsmells;

import java.util.List;

class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;
    // Mais atributos e métodos...

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    // Mais métodos e funcionalidades...
}

class Customer {
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
}

class Product {

}