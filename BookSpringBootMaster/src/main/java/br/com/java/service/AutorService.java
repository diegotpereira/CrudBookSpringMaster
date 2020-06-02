package br.com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.model.Autor;
import br.com.java.repository.AutorRepository;

@Service
public class AutorService {
	
	@Autowired
	private AutorRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos posts inseridos
	public List<Autor> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um post a partir do ID
	public Autor findOne(Long id) {
		return repository.getOne(id);
	}
	
	//Salva ou atualiza um post
	public Autor save(Autor autor) {
		return repository.saveAndFlush(autor);
	}
	
	//Exclui um post
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
