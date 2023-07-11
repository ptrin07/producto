package com.pcondori.nttdata.productomicroservice.utils;

import com.pcondori.nttdata.productomicroservice.model.RequestAccount;
import com.pcondori.nttdata.productomicroservice.model.RequestCredit;
import com.atorres.nttdata.productomicroservice.model.dao.*;
import com.pcondori.nttdata.productomicroservice.model.dao.AccountDao;
import com.pcondori.nttdata.productomicroservice.model.dao.ClientDao;
import com.pcondori.nttdata.productomicroservice.model.dao.ClientProductDao;
import com.pcondori.nttdata.productomicroservice.model.dao.CreditDao;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {
    public AccountDao accountToDao(RequestAccount requestAccount){
        return AccountDao.builder()
                .id(generateId())
                .type(requestAccount.getType())
                .balance(requestAccount.getBalance())
                .build();
    }

    public ClientProductDao cpToDaoAccount(ClientDao client, AccountDao product){
        return ClientProductDao.builder()
                .id(generateId())
                .category("account")
                .client(client.getId())
                .product(product.getId())
                .build();
    }

    public ClientProductDao cpToDaoCredit(ClientDao client, CreditDao creditDao){
        return ClientProductDao.builder()
                .id(generateId())
                .category("credit")
                .client(client.getId())
                .product(creditDao.getId())
                .build();
    }

    public CreditDao requestToDao(RequestCredit requestCredit){
        return CreditDao.builder()
                .id(generateId())
                .balance(requestCredit.getBalance())
                .debt(requestCredit.getBalance())
                .build();
    }

    private String generateId(){
        return java.util.UUID.randomUUID().toString().replaceAll("-","");
    }
}
