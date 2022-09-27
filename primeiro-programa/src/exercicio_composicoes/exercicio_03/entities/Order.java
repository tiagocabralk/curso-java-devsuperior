package exercicio_composicoes.exercicio_03.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem it : items) {
            sum += it.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER SUMMARY:\n");
        stringBuilder.append("Order moment: " + moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
        stringBuilder.append("Order status: " + status + "\n");
        stringBuilder.append("Client: " + client.getName() + " (" + client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ") - " + client.getEmail() + "\n");
        stringBuilder.append("Order items:\n");
        for (OrderItem o : items) {
            stringBuilder.append(o.getProduct().getName() + ", Quantity: " + o.getQuantity() + ", Subtotal: U$ " + String.format("%.2f", o.subTotal()) + "\n");
        }
        stringBuilder.append("Total price: U$ " + String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}
