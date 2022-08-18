package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Departamento;

public interface IDepartamentoService {

	public List<Departamento> listarDepartamentos();
	
	public Departamento guardarDeparamento(Departamento departamento);
	
	public Departamento departamentoXID(int codigo);
	
	public Departamento actualizarDepartamento(Departamento departamento);
	
	public void eliminarDepartamento(int codigo);
}
