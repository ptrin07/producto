package com.pcondori.nttdata.productomicroservice.repository;

import com.pcondori.nttdata.productomicroservice.model.dao.CreditDao;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends ReactiveMongoRepository<CreditDao,String> {
}
