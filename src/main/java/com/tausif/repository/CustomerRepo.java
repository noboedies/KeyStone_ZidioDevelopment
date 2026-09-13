package com.tausif.repository;

import com.tausif.entity.Customer;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer findByEmail(@Email @NotBlank String email);

    Customer findByUsername(@NotBlank @Size(min=6, max = 10) String username);
}
