package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Integer>{

}
