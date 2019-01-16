package com.cuckooclock.cucl.controller;


import com.cuckooclock.cucl.model.Clock;
import com.cuckooclock.cucl.repository.ClocksRepository;
import com.cuckooclock.cucl.service.ClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/clock")
public class ClocksController {

    //private ClocksRepository repository;
    @Autowired
    private ClockService clockService;

    //public  ClocksController(ClocksRepository repository){
    //    this.repository = repository;
        /*Clock clock = new Clock();
        clock.setName("AnyClock");
        repository.save(clock);*/
    //}



    @GetMapping("/clocks")
    /*public List<ClockDto> allClocks(){
        *//*return Collections.singletonList(new ClockDto(){{
            setId(1);
            setName("Clock1");
            setDescription("Description");
        }});*//*
        return repository.findAll().stream().map(user -> new ClockDto() {{
            setId(user.getId());
            setName("***" + user.getName() + "***");
        }}).collect(Collectors.toList());
    }*/
    public List<Clock> allClocks(){
        //return repository.findAll();
        return clockService.getAllClocks();
    }

    @GetMapping("/clocks/{id}")
    public Clock getClock(@PathVariable Integer id){
        return clockService.getClock(id);
    }

    @PostMapping("/clocks")
    public void addClock(@RequestBody Clock clock){
        clockService.addClock(clock);
    }

    @PutMapping("/clocks/{id}")
    public void updateClock(@RequestBody Clock clock, @PathVariable String id){
        clockService.updateClock(id,clock);
    }

    @DeleteMapping("/clocks/{id}")
    public void deleteClock(@PathVariable Integer id){
        clockService.deleteClock(id);
    }

    //@GetMapping("/add")
    /*@RequestMapping("/add")
    public String add(@RequestParam String name, @RequestParam String description){
        Clock clock = new Clock(name, description);
        repository.save(clock);
        return "Saved";
    }*/
}
