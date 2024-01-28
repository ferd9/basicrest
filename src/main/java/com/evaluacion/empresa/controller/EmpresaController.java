/**
 * 
 */
package com.evaluacion.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.empresa.Entity.Empresa;
import com.evaluacion.empresa.service.interfaces.IEmpresaService;



/**
 * @author Lynkos
 *
 */
@RestController
@RequestMapping("api/empresas")
public class EmpresaController {

	@Autowired
	private IEmpresaService empresaService;

	@PostMapping
	public Empresa createEmpresa(@RequestBody Empresa empresa) {
		return empresaService.createEmpresa(empresa);
	}
	
	@GetMapping(value = "/ultimas-empresas")
	public List<Empresa> get3ultimasEmpresa() {
		return empresaService.get3UltimasEmpresas();
	}
	
	@GetMapping
	public List<Empresa> getAllEmpresa() {
		return empresaService.getAllEmpresas();
	}
	
	@GetMapping("{id}")
	public Empresa searchEmpresaByID(@PathVariable("id") long id) {
		return empresaService.getEmpresabyId(id);
	}
	
	@DeleteMapping
	public void deleteEmpresaById(@PathVariable("id") long id) {
		empresaService.deleteEmpresa(id);
	}
}
