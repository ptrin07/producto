package com.pcondori.nttdata.productomicroservice.repository;

import com.pcondori.nttdata.productomicroservice.model.dao.AccountDao;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<AccountDao,String> {
}
