package com.csphere.sonique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.csphere.sonique.model.Customer;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByUserName(String username);
}
