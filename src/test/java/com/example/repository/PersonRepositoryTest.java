package com.example.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.example.domain.Person;


@RunWith(SpringRunner.class)
@DataJpaTest()
public class PersonRepositoryTest {
	
	@Autowired
    private TestEntityManager entityManager;

	@Autowired
	private PersonRepository personRepository;
	
	@Test
	@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:insert.sql")
	public void testFindAll(){
	
		List<Person> persons = personRepository.findAll();
		Assert.notEmpty(persons);
	}
	
	@Test
	@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:insert.sql")
	public void testFindByNameLike(){
		List<Person> persons = personRepository.findByNameLike("Person name");
		Assert.notEmpty(persons);
	}
	

}
