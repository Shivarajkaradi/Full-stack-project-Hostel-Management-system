package com.Spring;

import java.util.List;

import org.springframework.data.domain.Page;

//import com.Spring.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(int id);
	void deleteStudentById(int id);
	Page<Student> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
