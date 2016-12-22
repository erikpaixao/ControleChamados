package paixao.erik.modal;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import paixao.erik.beans.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	
	List<Pessoa> findByNome(String nome);
	
}
