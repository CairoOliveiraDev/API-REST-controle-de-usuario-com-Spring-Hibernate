package com.orange.useraddress.service;

import com.orange.useraddress.dto.AddressDTO;
import com.orange.useraddress.dto.UserRequestDTO;
import com.orange.useraddress.dto.UserResponseDTO;
import com.orange.useraddress.entity.User;
import com.orange.useraddress.exception.GenericError;
import com.orange.useraddress.exception.UserNotFoundException;
import com.orange.useraddress.mappers.UserMapper;
import com.orange.useraddress.repository.AddressRepository;
import com.orange.useraddress.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressService addressService;

    public ResponseEntity<UserResponseDTO> saveUser(UserRequestDTO user) {
        try {
            User userEntity = UserMapper.mapToUserEntity(user);
            UserResponseDTO userResponseDTO = UserMapper.mapToResponse(userRepository.save(userEntity));
            return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);

        } catch (Exception error) {

           throw new GenericError(error.getMessage());
        }
    }

    public ResponseEntity<UserResponseDTO> getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            UserResponseDTO userResponseDTO = UserMapper.mapToResponse(user.get());
            return ResponseEntity.ok().body(userResponseDTO);
        } else
            throw new UserNotFoundException("Usuario não encontrado");
    }

}
