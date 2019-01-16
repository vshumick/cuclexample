package com.cuckooclock.cucl.service;

import com.cuckooclock.cucl.model.Clock;
import com.cuckooclock.cucl.repository.ClocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClockService {

    @Autowired
    private ClocksRepository clocksRepository;
    //private List<Clock> clocks = repository.findAll();
    /*private List<Clock> clocks = new ArrayList<>(Arrays.asList(
            new Clock(111,"TestClock1","Description for TestClock1"),
            new Clock(222,"TestClock2","Description for TestClock2"),
            new Clock(333,"TestClock3","Description for TestClock3")
    ));*/

    /*public  ClockService(ClocksRepository repository){
        this.repository = repository;
    }*/

    public List<Clock> getAllClocks(){
        //return clocks;
        List<Clock> clocks = new ArrayList<>();
        clocksRepository.findAll().forEach(clocks::add);
        return clocks;
    }

    public Clock getClock(Integer id){
        //return clocks.stream().filter(t -> t.getId() == Integer.valueOf(id)).findFirst().get();
        //return  clocksRepository.findById(id);
        return  clocksRepository.findById(id).get();
    }

    public void addClock(Clock clock) {
        //clocks.add(clock);
        clocksRepository.save(clock);
    }

    public void updateClock(String id, Clock clock) {
        /*for (int i = 0; i < clocks.size(); i++){
            Clock c = clocks.get(i);
            if (c.getId() == Integer.valueOf(id)){
                clocks.set(i, clock);
                return;
            }
        }*/
        clocksRepository.save(clock);
    }

    public void deleteClock(Integer id) {
        //clocks.removeIf(t -> t.getId() == Integer.valueOf(id));
        clocksRepository.deleteById(id);
    }
}
