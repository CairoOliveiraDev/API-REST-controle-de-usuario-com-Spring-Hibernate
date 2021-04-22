package com.orange.useraddress.mappers;

import com.orange.useraddress.dto.UserRequestDTO;
import com.orange.useraddress.dto.UserResponseDTO;
import com.orange.useraddress.entity.User;

import java.util.stream.Collectors;

public class UserMapper {

    public static User mapToUserEntity(UserRequestDTO userRequestDTO) {

        return new User(userRequestDTO.getName(), userRequestDTO.getDate(), userRequestDTO.getEmail(), userRequestDTO.getCpf());
    }

    public static UserResponseDTO mapToResponse(User user) {
        return new UserResponseDTO(user.getName(),user.getDate(), user.getEmail(), user.getAddressList().stream().map(AddressMapper::mapEntityToDto).collect(Collectors.toList()));
    }
}
