SELECT nombres, apellidos , edad , identificacion 
FROM Estudiantes e 
WHERE e.activo IS NULL AND edad >= 18 AND identificacion  LIKE "1%"