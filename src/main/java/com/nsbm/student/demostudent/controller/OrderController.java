package com.nsbm.student.demostudent.controller;

import com.nsbm.student.demostudent.dto.Order;
import com.nsbm.student.demostudent.entity.Coffee;
import com.nsbm.student.demostudent.repository.CoffeeRepository;
import com.nsbm.student.demostudent.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @GetMapping("/purchases")
    public Order getOrder(){

        Order order = new Order();

//        Coffee c1 = new Coffee();
//        c1.setName("capaccno");
//        c1.setPrice("100");
//
//        Coffee c2 = new Coffee();
//        c1.setName("Lathe");
//        c1.setPrice("200");
//
//        List<Coffee> coffeeList = new ArrayList<>();
//        coffeeList.add(c1);
//        coffeeList.add(c2);
//

        List<Coffee> coffeeList = orderService.getOrderList();
        System.out.println("list of objects" + coffeeList);

        order.setOrderId("1");
        order.setOrderList(coffeeList);

        return order;

    }

}
