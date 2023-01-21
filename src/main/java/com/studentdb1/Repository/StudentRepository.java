package com.studentdb1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.studentdb1.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
