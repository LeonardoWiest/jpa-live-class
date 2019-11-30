package github.com.leonardowiest.persistence.layer.repository.impl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import github.com.leonardowiest.persistence.layer.domain.Cliente;
import github.com.leonardowiest.persistence.layer.repository.custom.ClienteRepositoryCustom;

@Repository
public class ClienteRepositoryImpl extends QuerydslRepositorySupport implements ClienteRepositoryCustom {

    public ClienteRepositoryImpl() {
        super(Cliente.class);
    }

}
