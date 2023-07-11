package com.pcondori.nttdata.productomicroservice.repository;

import com.pcondori.nttdata.productomicroservice.model.dao.ClientProductDao;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ClientProductRepository extends ReactiveMongoRepository<ClientProductDao,String> {

    Flux<ClientProductDao> findByClient(String client);
    Flux<ClientProductDao> findByProduct(String product);
}
