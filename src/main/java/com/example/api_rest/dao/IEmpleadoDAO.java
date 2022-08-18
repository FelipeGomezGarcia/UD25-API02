package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String>{

}
