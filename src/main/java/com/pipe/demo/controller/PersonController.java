package com.pipe.demo.controller;

import com.pipe.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    //endpoint
    @RequestMapping(value="/names/{name}/{name2}", method= RequestMethod.GET)
    public String getFullName(@PathVariable("name") String name,
                      @PathVariable("name2") String name2) throws Exception {

        return service.setPerson(name, name2);
    }


}
