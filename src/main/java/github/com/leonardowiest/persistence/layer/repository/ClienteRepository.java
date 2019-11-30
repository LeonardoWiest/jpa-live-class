package github.com.leonardowiest.persistence.layer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import github.com.leonardowiest.persistence.layer.domain.Cliente;
import github.com.leonardowiest.persistence.layer.repository.custom.ClienteRepositoryCustom;

@Repository
public interface ClienteRepository extends ClienteRepositoryCustom, CrudRepository<Cliente, Long> {

}
