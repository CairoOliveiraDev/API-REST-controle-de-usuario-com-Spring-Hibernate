package com.orange.useraddress.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AddressDTO {

    private Long userId;

    @GeneratedValue
    @Id
    private Long id;
    private String address;

    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private Integer cep;

    public AddressDTO() {
    }
    public AddressDTO(Long userId, Long id, String logradouro, Integer numero, String complemento, String bairro, String cidade, String estado, Integer cep) {
        this.userId = userId;
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
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

    public Long getUserId() {
        return userId;
    }
}

