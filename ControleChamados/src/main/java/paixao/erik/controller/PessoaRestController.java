package paixao.erik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import paixao.erik.beans.Pessoa;
import paixao.erik.modal.PessoaRepository;
import paixao.erik.util.PATH;

@CrossOrigin
@RestController
@RequestMapping(value = PATH.PUBLIC_PATH + "/pessoa")
public class PessoaRestController {
	private PessoaRepository pessoaRepository;
	private List<Pessoa> pessoa;

	@Autowired
	public PessoaRestController(PessoaRepository pessoaRepository) {
		super();
		this.pessoaRepository = pessoaRepository;
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = "/{nome}")
	public List<Pessoa> findByNome(@PathVariable String nome){
		pessoa = pessoaRepository.findByNome(nome);
		return pessoa;
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public List<Pessoa> list(){
		pessoa = pessoaRepository.findAll();
		return pessoa;
	}
	
	public ResponseEntity<?> add(@PathVariable String pessoaId, @RequestBody Pessoa input){
		this.validateUser(pessoaId);
		
		return null;
		
	}

	private boolean validateUser(String pessoaId) {
		if(pessoaId != null){
			return true;
		} else {
			return false;
		}
		
	}
	
}
