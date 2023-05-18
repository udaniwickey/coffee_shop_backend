package com.nsbm.student.demostudent.repository;

import com.nsbm.student.demostudent.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
