package com.evaluacion.empresa.service.interfaces;

import java.util.List;

import com.evaluacion.empresa.Entity.Empresa;

public interface IEmpresaService {
	
	public Empresa createEmpresa(Empresa empresa);
	
	public Empresa getEmpresabyId(Long id);
	
	public List<Empresa> get3UltimasEmpresas();
	
	public List<Empresa> getAllEmpresas();
	
	public void deleteEmpresa(Long id);
}
