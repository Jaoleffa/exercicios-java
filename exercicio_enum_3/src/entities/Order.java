package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    //Associação
    private List<OrderItem> item = new ArrayList<>();
    private Client cliente;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        cliente = client;
    }

    public void addItem(OrderItem item) {
        this.item.add(item);
    }

    public void removeItem(OrderItem item) {
        this.item.remove(item);
    }

    public double total(){
        double soma = 0;
        for(OrderItem item: item) {
            soma+= item.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append(cliente + "\n");
        sb.append("Order items: " + "\n");
        for(OrderItem i : item) {
            sb.append(i + "\n");
        }
        sb.append("Total: $" + total());
        return sb.toString();
    }
 }
