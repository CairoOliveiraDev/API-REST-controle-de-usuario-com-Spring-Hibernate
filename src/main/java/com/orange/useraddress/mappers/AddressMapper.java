package com.orange.useraddress.mappers;

import com.orange.useraddress.dto.AddressDTO;
import com.orange.useraddress.dto.UserResponseDTO;
import com.orange.useraddress.entity.Address;
import com.orange.useraddress.entity.User;

public class AddressMapper {

    public static Address mapToAddressEntity(User user, AddressDTO addressDTO) {
        return new Address(
                user,
                addressDTO.getLogradouro(),
                addressDTO.getNumero(),
                addressDTO.getComplemento(),
                addressDTO.getBairro(),
                addressDTO.getCidade(),
                addressDTO.getEstado(),
                addressDTO.getCep()
        );
    }

    public static AddressDTO mapEntityToDto(Address address) {
        return new AddressDTO(
                address.getUser().getId(),
                address.getId(),
                address.getLogradouro(),
                address.getNumero(),
                address.getComplemento(),
                address.getBairro(),
                address.getCidade(),
                address.getEstado(),
                address.getCep()
        );
    }

}
