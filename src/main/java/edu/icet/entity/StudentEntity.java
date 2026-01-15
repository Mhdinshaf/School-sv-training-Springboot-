package edu.icet.entity;

import edu.icet.util.Gender;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class StudentEntity {

        private Integer id;
        private  String name;
        private String address;
        private Gender gender;

    }

