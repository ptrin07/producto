package com.pcondori.nttdata.productomicroservice.service.accountstrategy;

import com.pcondori.nttdata.productomicroservice.model.dao.AccountDao;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountStrategy {
    Mono<Boolean> verifyAccount(Flux<AccountDao> listAccount);
}
