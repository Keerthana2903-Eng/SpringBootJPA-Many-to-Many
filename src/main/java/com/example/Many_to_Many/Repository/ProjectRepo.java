package com.example.Many_to_Many.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Many_to_Many.Entity.Project;

public interface ProjectRepo extends JpaRepository<Project,Integer> {

}
