package com.nsbm.student.demostudent.controller;

import com.nsbm.student.demostudent.dto.Inventory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/storage")
    Inventory getMaterials(){

    Inventory materials = new Inventory();

    Inventory CoffeeBeans = new Inventory();
    CoffeeBeans.setIngredient_id(1);
    CoffeeBeans.setQuantity("78kg");

    return materials;

    }
}
