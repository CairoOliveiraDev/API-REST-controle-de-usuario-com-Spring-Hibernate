package com.orange.useraddress.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.orange.useraddress.utils.DataUtils;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import java.time.LocalDate;

public class UserRequestDTO {

    private String name;
    @JsonFormat(pattern = DataUtils.DATE_TIME_FORMAT_BR)
    private LocalDate date;
    @Email(message = "Email inválido")
    private String email;
    @CPF(message = "CPF inválido")
    private String cpf;
    public UserRequestDTO(){}
    public UserRequestDTO(String name, LocalDate date, String email, String cpf) {
        this.name = name;
        this.date = date;
        this.email = email;
        this.cpf = cpf;
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

}

