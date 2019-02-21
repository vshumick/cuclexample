package com.cuckooclock.cucl.controller;


import com.cuckooclock.cucl.model.Consumer;
import com.cuckooclock.cucl.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping
    public List<Consumer> allСonsumers(){
        return consumerService.getAllConsumers();
    }

    @GetMapping("/{id}")
    public Consumer getСonsumer(@PathVariable Integer id){
        return consumerService.getConsumer(id);
    }

    @PostMapping
    public void addСonsumer(@RequestBody Consumer consumer){
        consumerService.addConsumer(consumer);
    }

    @PutMapping("/{id}")
    public void updateConsumer(@RequestBody Consumer consumer, @PathVariable String id){
        consumerService.updateConsumer(id,consumer);
    }

    @DeleteMapping("/{id}")
    public void deleteСonsumer(@PathVariable Integer id){
        consumerService.deleteConsumer(id);
    }

}
