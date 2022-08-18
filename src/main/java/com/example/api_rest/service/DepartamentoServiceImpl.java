package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IDepartamentoDAO;
import com.example.api_rest.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDeparamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(int codigo) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int codigo) {
		// TODO Auto-generated method stub
		iDepartamentoDAO.deleteById(codigo);
	}

}
