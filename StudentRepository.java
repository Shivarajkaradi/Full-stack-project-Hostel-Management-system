package com.Spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.Spring.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
