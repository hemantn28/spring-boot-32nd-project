package com.example.demo.service;

import com.example.demo.model.Personality;
import com.example.demo.repository.PersonalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DBService {

    //Create
    @Autowired
    PersonalityRepository repository;


    public String add(Personality personality){
        repository.save(personality);
        return "personality added to db successfully...";

    }

    //Get


    public List<Personality> getAll(){
        return repository.findAll();

    }

    //Update


    public String update(@PathVariable String name,@PathVariable Integer id){
        Personality personality=repository.getById(id);
        personality.setName("Amitabh Bachchan");
        repository.save(personality);
        return "personality added in db successfully";


    }

    //Delete


    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "personality deleted in db successfully...";


    }

}
