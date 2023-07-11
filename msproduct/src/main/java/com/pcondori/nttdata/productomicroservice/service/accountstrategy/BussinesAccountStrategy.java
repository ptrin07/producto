package com.pcondori.nttdata.productomicroservice.service.accountstrategy;

import com.pcondori.nttdata.productomicroservice.exception.CustomException;
import com.pcondori.nttdata.productomicroservice.model.dao.AccountDao;
import com.pcondori.nttdata.productomicroservice.utils.AccountType;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class BussinesAccountStrategy implements  AccountStrategy{
    @Override
    public Mono<Boolean> verifyAccount(Flux<AccountDao> listAccount) {
        return listAccount
                .all(product -> product.getType().equals(AccountType.CC))
                .flatMap(exist -> exist.equals(Boolean.FALSE) ? Mono.error(new CustomException(HttpStatus.BAD_REQUEST, "No se cumplen las requisitos para cuentas bussines")) : Mono.just(Boolean.TRUE));
    }
}
