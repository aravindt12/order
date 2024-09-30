package com.order.controller;

import com.netflix.discovery.converters.Auto;
import com.order.dto.OrderDTO;
import com.order.dto.OrderDTOFromFE;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDTOFromFE){
        OrderDTO orderSavedInDB = orderService.saveOrderInDB(orderDTOFromFE);
        return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
    }
}
