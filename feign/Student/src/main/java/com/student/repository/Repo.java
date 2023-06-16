package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface Repo extends JpaRepository<Student,Long> {

}
