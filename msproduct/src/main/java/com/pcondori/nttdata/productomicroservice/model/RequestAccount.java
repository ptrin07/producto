package com.pcondori.nttdata.productomicroservice.model;

import com.pcondori.nttdata.productomicroservice.utils.AccountType;
import lombok.Data;

@Data
public class RequestAccount {
    private AccountType type;
    private Double balance;
}
