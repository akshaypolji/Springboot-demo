package com.caveman.demo.repository;


import com.caveman.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional methods for querying can be added here if needed
    Student findByName(String name);
}

