package model;

import java.util.Date;

public class Order {
    private int id;
    private int idHome;
    private int idCustomer;
    private Date orderDate;

    public Order() {
    }

    public Order(int id, int idHome, int idCustomer, Date orderDate) {
        this.id = id;
        this.idHome = idHome;
        this.idCustomer = idCustomer;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHome() {
        return idHome;
    }

    public void setIdHome(int idHome) {
        this.idHome = idHome;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}