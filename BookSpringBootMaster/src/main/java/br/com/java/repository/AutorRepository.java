package br.com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

	

}
