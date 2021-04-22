package com.orange.useraddress.controller;

import com.orange.useraddress.dto.AddressDTO;
import com.orange.useraddress.dto.UserRequestDTO;
import com.orange.useraddress.dto.UserResponseDTO;
import com.orange.useraddress.entity.Address;
import com.orange.useraddress.repository.AddressRepository;
import com.orange.useraddress.service.AddressService;
import com.orange.useraddress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;


    @PostMapping(value = "/address/register/{userId}")
    public ResponseEntity<AddressDTO> saveAddress(@PathVariable Long userId, @RequestBody AddressDTO address) {
        return addressService.saveAddress(userId, address);
    }
}

