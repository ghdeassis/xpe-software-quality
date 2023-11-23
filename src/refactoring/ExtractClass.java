package refactoring;

class Order {
    private String orderId;
    private Customer customer;
    private double totalAmount;

    // Getters and setters

    public double calculateDiscount() {
        // Lógica para calcular o desconto
        // ...
        return 0.0;
    }
}

class Customer {
    private String name;
    private String email;

    // Getters and setters

    public void sendConfirmationEmail() {
        // Lógica para enviar o email de confirmação
        // ...
    }
}