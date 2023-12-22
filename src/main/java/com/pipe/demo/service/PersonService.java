package com.pipe.demo.service;

import com.pipe.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {




    //change codeeee
    public String setPerson(String name, String name2){
        Person person = new Person(name, name2);
        return "Nome: "+person.getNome()+" Sobrenome: "+person.getSobrenome();

    }


}
