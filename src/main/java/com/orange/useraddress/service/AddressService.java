package com.orange.useraddress.service;

import com.orange.useraddress.dto.AddressDTO;
import com.orange.useraddress.entity.Address;
import com.orange.useraddress.entity.User;
import com.orange.useraddress.exception.UserNotFoundException;
import com.orange.useraddress.mappers.AddressMapper;
import com.orange.useraddress.repository.AddressRepository;
import com.orange.useraddress.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<AddressDTO> saveAddress(Long userId, AddressDTO address) {
        try {
            User user = userRepository.findById(userId).get();
            Address addressEntity = AddressMapper.mapToAddressEntity(user, address);
            user = userRepository.findById(userId).get();
            user.addAddress(addressEntity);
            userRepository.save(user);
            return ResponseEntity.ok().body(AddressMapper.mapEntityToDto(addressEntity));
        } catch (Exception error) {
            throw new UserNotFoundException("Usuario não encontrado");
        }
    }

}
