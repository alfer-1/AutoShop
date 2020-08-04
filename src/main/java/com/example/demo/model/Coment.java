package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Coment {

    @Id
    @Column
    private Integer id;

    @Column
    private String valve;


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


}
