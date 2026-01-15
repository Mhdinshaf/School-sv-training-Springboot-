package edu.icet.controller;

import edu.icet.service.StudetnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudetnService studetnService;

    @GetMapping
    public String addStudent(){
        return studetnService.getVersion();
    }

}
