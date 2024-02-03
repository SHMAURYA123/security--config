package com.example.mongodbconnection;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepository extends MongoRepository<Employee,Integer> {

}
