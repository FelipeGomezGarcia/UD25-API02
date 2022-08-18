package com.example.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_rest.dto.Departamento;
import com.example.api_rest.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento departamentoXID(@PathVariable(name="codigo") int codigo) {
		return departamentoServiceImpl.departamentoXID(codigo);
	}
	
	@PostMapping("/departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDeparamento(departamento);
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo")int codigo, @RequestBody Departamento departamento) {
		Departamento departamentoActualizado = departamentoServiceImpl.departamentoXID(codigo);
		
		departamentoActualizado.setNombre(departamento.getNombre());
		departamentoActualizado.setPresupuesto(departamento.getPresupuesto());
		
		return departamentoServiceImpl.actualizarDepartamento(departamentoActualizado);
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento (@PathVariable(name="codigo")int codigo) {
		departamentoServiceImpl.eliminarDepartamento(codigo);
	}
}
