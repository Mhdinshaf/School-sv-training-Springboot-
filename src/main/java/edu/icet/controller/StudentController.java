package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudetnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {


@Autowired
StudetnService studetnService;



    @PostMapping("/Add")
    public void addStudent(@RequestBody StudentDto studentDto){
        studetnService.addStudent(studentDto);
    }

    @PutMapping("/Update")
    public  void updateStudent(@RequestBody StudentDto  studentDto){
        studetnService.updateStudent(studentDto);
    }

    @DeleteMapping("/Delete-by-id/{id}")
    public void deleteById(@PathVariable Integer Id){
        studetnService.deleteStudent(Id);
    }

    @GetMapping("/GetAll")
    public List<StudentDto> getAll(){
        return  studetnService.getAll();
    }

    @GetMapping("/search-by-id/{id}")
    public  void  searchById(@PathVariable Integer id){
        studetnService.searchById(id);
    }

}
