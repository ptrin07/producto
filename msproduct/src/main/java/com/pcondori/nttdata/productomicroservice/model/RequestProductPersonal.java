package com.pcondori.nttdata.productomicroservice.model;
import com.pcondori.nttdata.productomicroservice.model.dao.AccountDao;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class RequestProductPersonal {
    @NotBlank
    private String clientId;
    private List<AccountDao> accountList;
}
