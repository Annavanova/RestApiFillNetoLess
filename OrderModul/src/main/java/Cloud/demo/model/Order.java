package Cloud.demo.model;

public class Order {
    private int id;
    private int userId;
    private double orderAmount;
    private String currencyOrder;
    private OrderName orderName;

    public Order(int id, int userId, double orderAmount, String currencyOrder, OrderName orderName) {
        this.id = id;
        this.userId = userId;
        this.orderAmount = orderAmount;
        this.currencyOrder = currencyOrder;
        this.orderName = orderName;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCurrencyOrder() {
        return currencyOrder;
    }

    public void setCurrencyOrder(String currencyOrder) {
        this.currencyOrder = currencyOrder;
    }

    public OrderName getOrderName() {
        return orderName;
    }

    public void setOrderName(OrderName orderName) {
        this.orderName = orderName;
    }
}
