package com.orange.useraddress.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private Integer cep;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Address(){}
    public Address(User user, String logradouro, Integer numero,
                   String complemento, String bairro, String cidade, String estado, Integer cep) {
        this.user = user;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    public Long getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }


    public Integer getNumero() {
        return numero;
    }


    public String getComplemento() {
        return complemento;
    }


    public String getBairro() {
        return bairro;
    }


    public String getCidade() {
        return cidade;
    }


    public String getEstado() {
        return estado;
    }


    public Integer getCep() {
        return cep;
    }

    public User getUser() {
        return user;
    }

}
