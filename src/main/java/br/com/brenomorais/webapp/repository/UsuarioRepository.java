package br.com.brenomorais.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.brenomorais.webapp.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByLogin(String login);
	
	default UsuarioEntity findOne(Long codigo) { 
        return (UsuarioEntity) findById(codigo).orElse(null); 
    } 
	
	@Override
	@Query
	public List<UsuarioEntity> findAll();
	
}
