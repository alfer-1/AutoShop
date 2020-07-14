package com.example.demo.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Users implements UserDetails {
    @Id
    @Column
    private Integer id;

    @Column
    private String email;

    @Column (name="user_name")
    private String username;

    @Column
    private String password;

    @Column
    private Boolean is_active;

    @Column
    private String data_of_create;

    @Column
    private String rol;

    @Column
    private String phone;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_x_product",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = { @JoinColumn(name = "product_id")})

        private Set<Products> products = new HashSet<>();



    @OneToMany(mappedBy = "users")
    private Set<Coment> coment;


    @OneToMany(mappedBy = "users")
    private Set<Order> order;


    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return is_active;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public Set<Products> getProducts() {
        return products;
    }

    public void setProducts(Set<Products> products) {
        this.products = products;
    }

    public String getData_of_create() {
        return data_of_create;
    }

    public String getRol() {
        return rol;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public void setData_of_create(String data_of_create) {
        this.data_of_create = data_of_create;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Users() {
    }
}
