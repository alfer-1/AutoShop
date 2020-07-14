package com.example.demo.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Products {
    @Id
    @Column
    private Integer id;

    @Column
    private String article;

    @Column
    private  String name;

    @Column
    private String producer;

    @Column
    private Double price;

    @Column
    private Integer quantity;

    @Column
    private Integer rating;

    @ManyToMany(mappedBy = "products")
    private Set <Users> user;



    @OneToMany(mappedBy = "products")
    private Set<Coment> coment;


    @OneToMany(mappedBy = "products")
    private Set<Order> order;



    public Set<Users> getUser() {
        return user;
    }

    public void setUser(Set<Users> user) {
        this.user = user;
    }

    public Products() {
    }

    public Integer getId() {
        return id;
    }

    public String getArticle() {
        return article;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getRating() {
        return rating;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


}
