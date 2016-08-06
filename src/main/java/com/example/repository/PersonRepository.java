package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
	List<Person> findByNameLike(String name);

}
