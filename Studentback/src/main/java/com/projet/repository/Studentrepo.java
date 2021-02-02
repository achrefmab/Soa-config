package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.Model.Student;

@Repository

public interface Studentrepo extends JpaRepository<Student,Integer> {

}

