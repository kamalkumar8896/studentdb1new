package com.studentdb1;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentdb1.Repository.StudentRepository;
import com.studentdb1.entity.Student;

@SpringBootTest
class Studentdb1ApplicationTests {
	
	@Autowired
  private StudentRepository studentRepo;
	@Test
	void saveOneStudent() {
		Student s= new Student();
		s.setName("shyam");
		s.setCourse("dev");
		s.setFee(1300);
		
		studentRepo.save(s);
	}
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(2L);
	}
	@Test
	 void getOneStudent() {
		 Optional<Student> findById = studentRepo.findById(3L);
		 Student s = findById.get();
		 System.out.println(s.getName());
		System.out.println( s.getCourse());
		System.out.println(s.getFee());
		 
		 System.out.println(s);
	 }
	 @Test
	   void updateOneStudent() {
		   
		   Optional<Student> findById = studentRepo.findById(4L);
		   Student s = findById.get();
		   
		   s.setCourse("developer");
		   s.setFee(1234);
		   studentRepo.save(s);
		   
	}

}
