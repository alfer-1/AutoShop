package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table
public class Order {

    @Id
    @Column
    private Integer id;

    @Column
    private Integer product_id;

    @Column
    private Integer user_id;

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

    public Integer getProduct_id() {
        return product_id;
    }

    public Integer getUser_id() {
        return user_id;
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

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setData_of_create(String data_of_create) {
        this.data_of_create = data_of_create;
    }


}
