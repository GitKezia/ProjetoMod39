package br.com.kezia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.kezia.domain.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
