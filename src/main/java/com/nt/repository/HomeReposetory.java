package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.StudentEntity;
@Repository
public interface HomeReposetory extends JpaRepository<StudentEntity, Integer> {

}
