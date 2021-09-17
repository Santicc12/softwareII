package net.software.backendcursojava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.software.backendcursojava.Model.request.UserDetailRequestModel;
import net.software.backendcursojava.Model.responses.UserRest;

@RestController
@RequestMapping("/users") //localhost/users:8080/users

public class UserController {

    @GetMapping //Obtener, Consultar informacion.
    public String getUser(){
        return "Obtener usuarios";
        
    }
    @PostMapping //Creando Informacion
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetailRequestModel){
        //return "Creando Usuarios";
        return null;
        






    }
}

