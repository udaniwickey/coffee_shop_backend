package com.nsbm.student.demostudent.service;

import com.nsbm.student.demostudent.entity.Coffee;
import com.nsbm.student.demostudent.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public OrderService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> getOrderList(){
        return coffeeRepository.findAll();
    }
}
