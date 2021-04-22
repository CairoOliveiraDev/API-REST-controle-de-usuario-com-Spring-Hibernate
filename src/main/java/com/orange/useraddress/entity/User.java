package com.orange.useraddress.entity;


import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;
    private LocalDate date;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String cpf;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();


    public User() {
    }
    public User(String name, LocalDate date, String email, String cpf) {
        this.name = name;
        this.date = date;
        this.email = email;
        this.cpf = cpf;
    }
    public void addAddress(Address address) {
        this.addressList.add(address);
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public LocalDate getDate() {
        return date;
    }


    public String getEmail() {
        return email;
    }


    public String getCpf() {
        return cpf;
    }


    public List<Address> getAddressList() {
        return addressList;
    }


}

