package com.cuckooclock.cucl.repository;

import com.cuckooclock.cucl.model.Clock;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClocksRepository extends CrudRepository<Clock, Integer> {
    //List<Clock> findAll();

    //Optional<Clock> findById(Integer id);
}
