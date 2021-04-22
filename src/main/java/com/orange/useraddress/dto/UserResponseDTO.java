package com.orange.useraddress.dto;

import com.orange.useraddress.entity.Address;
import java.time.LocalDate;
import java.util.List;

public class UserResponseDTO {
    private String name;
    private LocalDate date;
    private String email;
    private List<AddressDTO> addressList;


    public UserResponseDTO(String name, LocalDate date, String email, List<AddressDTO> addressList) {
        this.name = name;
        this.date = date;
        this.email = email;
        this.addressList = addressList;
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

    public List<AddressDTO> getAddressList() {
        return addressList;
    }

}


