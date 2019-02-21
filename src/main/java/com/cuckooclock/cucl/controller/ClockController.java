package com.cuckooclock.cucl.controller;


import com.cuckooclock.cucl.model.Clock;
import com.cuckooclock.cucl.repository.ClockRepository;
import com.cuckooclock.cucl.service.ClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clocks")
public class ClockController {

    //private ClockRepository repository;
    @Autowired
    private ClockService clockService;

    //public  ClockController(ClockRepository repository){
    //    this.repository = repository;
        /*Clock clock = new Clock();
        clock.setName("AnyClock");
        repository.save(clock);*/
    //}



    @GetMapping
    /*public List<ClockДто> allClocks(){
        *//*return Collections.singletonList(new ClockДто(){{
            setId(1);
            setName("Clock1");
            setDescription("Description");
        }});*//*
        return repository.findAll().stream().map(user -> new ClockДто() {{
            setId(user.getId());
            setName("***" + user.getName() + "***");
        }}).collect(Collectors.toList());
    }*/
    public List<Clock> allClocks(){
        //return repository.findAll();
        return clockService.getAllClocks();
    }

    @GetMapping("/{id}")
    public Clock getClock(@PathVariable Integer id){
        return clockService.getClock(id);
    }

    @PostMapping
    public void addClock(@RequestBody Clock clock){
        clockService.addClock(clock);
    }

    @PutMapping("/{id}")
    public void updateClock(@RequestBody Clock clock, @PathVariable String id){
        clockService.updateClock(id,clock);
    }

    @DeleteMapping("/{id}")
    public void deleteClock(@PathVariable Integer id){
        clockService.deleteClock(id);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/add")
    //@RequestMapping("/add")
    public String add(@RequestParam String name, @RequestParam String description){
        Clock clock = new Clock(name, description);
        //repository.save(clock);
        clockService.addClock(clock);
        return "Saved";
    }
}
