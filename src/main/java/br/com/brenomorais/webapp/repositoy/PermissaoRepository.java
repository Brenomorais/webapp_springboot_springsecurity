package br.com.brenomorais.webapp.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brenomorais.webapp.entity.GrupoEntity;
import br.com.brenomorais.webapp.entity.PermissaoEntity;

@Repository
public interface PermissaoRepository  extends JpaRepository<PermissaoEntity, Long>{
	
	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);

}
