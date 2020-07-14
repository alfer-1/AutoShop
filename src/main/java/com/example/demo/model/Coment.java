package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table
public class Coment {

    @Id
    @Column
    private Integer id;

    @Column
    private String valve;

    @Column
    private Integer user_id;

    @Column
    private Integer product_id;

    @Column
    private String data;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Products products;

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;




    public Coment() {
    }

    public Integer getId() {
        return id;
    }

    public String getValve() {
        return valve;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public String getData() {
        return data;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setValve(String valve) {
        this.valve = valve;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public void setData(String data) {
        this.data = data;
    }
}
