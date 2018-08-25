package br.com.brenomorais.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brenomorais.webapp.entity.GrupoEntity;
import br.com.brenomorais.webapp.entity.UsuarioEntity;

@Repository
public interface GrupoRepository  extends JpaRepository<GrupoEntity, Long>{
	
	List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);
	
	default GrupoEntity findOne(Long codigo) { 
        return (GrupoEntity) findById(codigo).orElse(null); 
    } 

}
