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

import com.example.api_rest.dto.Empleado;
import com.example.api_rest.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@GetMapping("/empleados/{dni}")
	public Empleado empleadoXID(@PathVariable(name="dni") String dni) {
		return empleadoServiceImpl.empleadoXID(dni);
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni")String dni, @RequestBody Empleado empleado) {
		Empleado empleadoActualizado = empleadoServiceImpl.empleadoXID(dni);
		
		empleadoActualizado.setNombre(empleado.getNombre());
		empleadoActualizado.setApellidos(empleado.getApellidos());
		empleadoActualizado.setDepartamento(empleado.getDepartamento());
		
		return empleadoServiceImpl.actualizarEmpleado(empleadoActualizado);
	}
	
	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado (@PathVariable(name="dni")String codigo) {
		empleadoServiceImpl.eliminarEmpleado(codigo);
	}
}
