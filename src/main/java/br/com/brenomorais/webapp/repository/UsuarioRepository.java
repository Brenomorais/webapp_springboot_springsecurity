package br.com.brenomorais.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brenomorais.webapp.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByLogin(String login);
	
	default UsuarioEntity findOne(Long codigo) { 
        return (UsuarioEntity) findById(codigo).orElse(null); 
    } 
}
