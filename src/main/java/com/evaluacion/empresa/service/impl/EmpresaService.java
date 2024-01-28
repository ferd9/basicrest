/**
 * 
 */
package com.evaluacion.empresa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evaluacion.empresa.Entity.Empresa;
import com.evaluacion.empresa.repository.EmpresaRepository;
import com.evaluacion.empresa.service.interfaces.IEmpresaService;


/**
 * @author Lynkos
 *
 */
@Component
public class EmpresaService implements IEmpresaService {

	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public Empresa createEmpresa(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	public Empresa getEmpresabyId(Long id) {
		Optional<Empresa> empresas = empresaRepository.findById(id);
		if(empresas.isPresent()) {
			return empresaRepository.findById(id).get();
		}			
		return null;
	}
	
	public List<Empresa> get3UltimasEmpresas() {
		Optional<List<Empresa>> empresas = empresaRepository.find3UltimasEmpresas();
		if(empresas.isPresent() && !empresas.get().isEmpty()) {
			return empresas.get();
		}
		return null;
	}
	
	public List<Empresa> getAllEmpresas() {
		List<Empresa> empresas = empresaRepository.findAll();
		if(!empresas.isEmpty()) {
			return empresas;
		}
		return null;
	}
	
	public void deleteEmpresa(Long id) {
		empresaRepository.deleteById(id);
	}
}
