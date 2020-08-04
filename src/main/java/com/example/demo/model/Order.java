package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table
public class Order {

    @Id
    @Column
    private Integer id;


    @Column
    private Integer quantity;

    @Column
    private String data_of_create;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Products products;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;



    public Order() {
    }

    public Integer getId() {
        return id;
    }


    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getData_of_create() {
        return data_of_create;
    }

    public void setId(Integer id) {
        this.id = id;
    }





    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setData_of_create(String data_of_create) {
        this.data_of_create = data_of_create;
    }


}
