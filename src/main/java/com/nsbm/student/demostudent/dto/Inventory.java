package com.nsbm.student.demostudent.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Inventory {
    private Integer ingredient_id;
    private String quantity;
    private LocalDate expiration_date;

}
