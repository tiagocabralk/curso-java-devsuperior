package exercicios.estoque.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double TotalValueInStock() {
        return this.price * this.quantity;
    }

    public void AddProducts(int quantity) {
        setQuantity(getQuantity() + quantity);
    }

    public void RemoveProducts(int quantity) {
        setQuantity(getQuantity() - quantity);
    }

    @Override
    public String toString() {
        return String.format("Product data: %s, R$ %.2f, %d units, Total: R$  %.2f ", getName(), getPrice(), getQuantity(), TotalValueInStock());
    }
}
