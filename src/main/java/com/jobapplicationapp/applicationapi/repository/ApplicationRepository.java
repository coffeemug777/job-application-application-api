package com.jobapplicationapp.applicationapi.repository;

import com.jobapplicationapp.applicationapi.model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ApplicationRepository extends MongoRepository<Application, BigInteger> {
}
