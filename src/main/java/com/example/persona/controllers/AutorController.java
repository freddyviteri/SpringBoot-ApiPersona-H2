package com.example.persona.controllers;

import com.example.persona.entities.Autor;
import com.example.persona.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/autores")
@CrossOrigin(origins = "*")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
