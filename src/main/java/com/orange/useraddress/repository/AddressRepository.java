package com.orange.useraddress.repository;

import com.orange.useraddress.entity.Address;
import com.orange.useraddress.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
