package com.edu.miu.cs.cs425.mystudentmgmtapp.repository;

import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
