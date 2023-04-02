package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Subject;

//3 repos for 3 entity classes
//JpaRepository<object we want to use in repo, ID of object>

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
