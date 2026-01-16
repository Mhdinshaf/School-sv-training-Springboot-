package edu.icet.service;

import edu.icet.dto.StudentDto;

import java.util.List;

public interface StudetnService {
   void addStudent(StudentDto student);
   void updateStudent(StudentDto student);
   void deleteStudent(Integer id);
   StudentDto searchById(Integer id);
   List<StudentDto> getAll();

}
