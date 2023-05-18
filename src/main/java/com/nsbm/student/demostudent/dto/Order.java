package com.nsbm.student.demostudent.dto;

import com.nsbm.student.demostudent.entity.Coffee;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Order {

    private String orderId;
    private List<Coffee> orderList;
}
