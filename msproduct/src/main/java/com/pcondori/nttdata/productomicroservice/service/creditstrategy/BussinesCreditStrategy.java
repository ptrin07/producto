package com.pcondori.nttdata.productomicroservice.service.creditstrategy;

import com.pcondori.nttdata.productomicroservice.exception.CustomException;
import com.pcondori.nttdata.productomicroservice.model.dao.CreditDao;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class BussinesCreditStrategy implements CreditStrategy{
    @Override
    public Mono<Boolean> verifyCredit(Flux<CreditDao> listCredit) {
        return listCredit
                .all(creditDao ->  creditDao.getBalance() <=10000)
                .flatMap(  exist -> exist ? Mono.just(Boolean.TRUE):Mono.error(new CustomException(HttpStatus.BAD_REQUEST,"El credito no debe pasar 10 000")));
    }
}
