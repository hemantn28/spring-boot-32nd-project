package com.example.demo.controller;

import com.example.demo.model.Personality;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {

    //Create
    @Autowired
    DBService service;

    @RequestMapping(value = "add_personality_db", method = RequestMethod.POST)
    public String add(@RequestBody Personality personality){
        return service.add(personality);

    }


    //Get

    @RequestMapping(value = "get_personality_db", method = RequestMethod.GET)
    public List<Personality> getAll(){
        return service.getAll();
    }

    //Update

    @RequestMapping(value = "update_personality_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name,@PathVariable Integer id){
        service.update("Amitabh Bachchan",136);
        return "personality updated in db successfully...";

    }


    //Delete

    @RequestMapping(value = "delete_personality_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        service.delete(135);
        return "personality deleted in db successfully...";

    }
}
