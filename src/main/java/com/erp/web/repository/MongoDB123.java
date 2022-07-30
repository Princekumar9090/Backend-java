package com.erp.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.erp.web.model.Model123;

@Repository
public interface MongoDB123 extends MongoRepository<Model123,String> {

}


//
//class Goal {
//	@Autowired
//	MongoDB123 mongoDB123;
//	Goal(){
//	//mongoDB123.findAll();
//	}
	
	

