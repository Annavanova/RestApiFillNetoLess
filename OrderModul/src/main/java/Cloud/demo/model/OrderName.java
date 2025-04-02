package Cloud.demo.model;

public class OrderName {
    private String orderName;
    private int quantity;
    private double price;

    public OrderName(String orderName, int quantity, double price) {
        this.orderName = orderName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
