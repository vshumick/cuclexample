package com.cuckooclock.cucl.service;

import com.cuckooclock.cucl.model.Clock;
import com.cuckooclock.cucl.repository.ClockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClockService {

    @Autowired
    private ClockRepository clockRepository;
    //private List<Clock> clocks = repository.findAll();
    /*private List<Clock> clocks = new ArrayList<>(Arrays.asList(
            new Clock(111,"TestClock1","Description for TestClock1"),
            new Clock(222,"TestClock2","Description for TestClock2"),
            new Clock(333,"TestClock3","Description for TestClock3")
    ));*/

    /*public  ClockService(ClockRepository repository){
        this.repository = repository;
    }*/

    public List<Clock> getAllClocks(){
        //return clocks;
        List<Clock> clocks = new ArrayList<>();
        clockRepository.findAll().forEach(clocks::add);
        return clocks;
    }

    public Clock getClock(Integer id){
        //return clocks.stream().filter(t -> t.getId() == Integer.valueOf(id)).findFirst().get();
        //return  clockRepository.findById(id);
        return  clockRepository.findById(id).get();
    }

    public void addClock(Clock clock) {
        //clocks.add(clock);
        clockRepository.save(clock);
    }

    public void updateClock(String id, Clock clock) {
        /*for (int i = 0; i < clocks.size(); i++){
            Clock c = clocks.get(i);
            if (c.getId() == Integer.valueOf(id)){
                clocks.set(i, clock);
                return;
            }
        }*/
        clockRepository.save(clock);
    }

    public void deleteClock(Integer id) {
        //clocks.removeIf(t -> t.getId() == Integer.valueOf(id));
        clockRepository.deleteById(id);
    }
}
