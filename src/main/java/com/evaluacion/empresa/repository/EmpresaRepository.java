/**
 * 
 */
package com.evaluacion.empresa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.evaluacion.empresa.Entity.Empresa;


/**
 * @author Fernando
 *
 */
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	@Query(value = "SELECT * FROM EMPRESAS ORDER BY idEmpresa DESC LIMIT 3", nativeQuery = true)
	Optional<List<Empresa>> find3UltimasEmpresas();
}
