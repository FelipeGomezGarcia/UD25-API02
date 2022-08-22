# UD25-API02

## URL de la API

https://ud2502.herokuapp.com/

### Endpoints de EMPLEADOS

  1- Obtener una lista de los empleados
  - GET /api/empleados
  
  2- Obtener un empleado por su DNI
  - GET /api/empleados/{dni}
  
  3- Insertar un empleado nuevo desde un request body
  - POST /api/empleados
  
  4- Actualizar un empleado indicando su DNI y sus campos en el body
  - PUT /api/empleados/{dni}
  
  5- Borrar un empleado por su DNI 
  - DELETE /api/empleados/{dni}

### Endpoints de DEPARTAMENTOS

  1- Obtener una lista de los departamentos
  - GET /api/departamentos
  
  2- Obtener un departamento por su codigo
  - GET /api/departamentos/{codigo}
  
  3- Insertar un departamento nuevo desde un request body
  - POST /api/departamentos
  
  4- Actualizar un departamento indicando su codigo y sus campos en el body
  - PUT /api/departamentos/{codigo}
  
  5- Borrar un departamento por su codigo 
  - DELETE /api/departamentos/{codigo}
