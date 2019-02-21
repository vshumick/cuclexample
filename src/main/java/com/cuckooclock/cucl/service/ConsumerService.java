package com.cuckooclock.cucl.service;

import com.cuckooclock.cucl.model.Consumer;
import com.cuckooclock.cucl.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public List<Consumer> getAllConsumers(){
        List<Consumer> consumers = new ArrayList<>();
        consumerRepository.findAll().forEach(consumers::add);
        return consumers;
    }

    public Consumer getConsumer(Integer id){
        return  consumerRepository.findById(id).get();
    }

    public void addConsumer(Consumer clock) {
        consumerRepository.save(clock);
    }

    public void updateConsumer(String id, Consumer consumer) {
        consumerRepository.save(consumer);
    }

    public void deleteConsumer(Integer id) {
        consumerRepository.deleteById(id);
    }
}
