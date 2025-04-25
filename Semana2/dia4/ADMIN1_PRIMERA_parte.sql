/**
Parte 2: Consultas SQL
2. Consultas con Funciones de Agregación
Escribe una consulta SQL para obtener:
El salario promedio de los empleados en cada departamento.
El número total de proyectos asignados a cada empleado.
La duración total de cada proyecto (diferencia entre la fecha de inicio y la fecha de fin).
3. Consultas con JOINs
Escribe una consulta SQL para obtener:
Los nombres de los empleados junto con el nombre del departamento al que pertenecen.
Los nombres de los proyectos junto con los nombres de los empleados asignados a esos proyectos y las horas trabajadas.
4. Consultas con CASE
Escribe una consulta SQL para:
Mostrar el salario de los empleados junto con una etiqueta que indique si el salario es "Alto" (> 5000), "Medio" (2000-5000) o "Bajo" (< 2000).
Mostrar el nombre del proyecto y la duración del proyecto, junto con una etiqueta que indique si el proyecto está "Activo" (si la fecha actual está dentro del rango) o "Inactivo".


*/

--2. Consultas con Funciones de Agregación
--El salario promedio de los empleados en cada departamento.
SELECT D.NOMBRE AS DEPARTAMENTO, COUNT(E.ID_EMPLEADO) AS NO_EMPLEADOS,TO_CHAR(ROUND(AVG(E.SALARIO),2),'$999,999') AS PROMEDIO 
FROM DEPARTAMENTO D
RIGHT JOIN EMPLEADO E
ON D.ID_DEPARTAMENTO = E.DEPARTAMENTO_ID
GROUP BY D.NOMBRE;
SELECT * FROM DEPARTAMENTO;

--El número total de proyectos asignados a cada empleado.
SELECT 
    E.ID_EMPLEADO,
    E.NOMBRE AS EMPLEADO,
    D.NOMBRE AS DEPARTAMENTO,
    COUNT(A.PROYECTO_ID) AS TOTAL_PROYECTOS_ASIGNADOS,
    SUM(A.HORAS_TRABAJADAS) AS TOTAL_HORAS_TRABAJADAS
FROM 
    EMPLEADO E
LEFT JOIN 
    ASIGNACION A ON E.ID_EMPLEADO = A.EMPLEADO_ID
LEFT JOIN 
    DEPARTAMENTO D ON E.DEPARTAMENTO_ID = D.ID_DEPARTAMENTO
GROUP BY 
    E.ID_EMPLEADO, E.NOMBRE, D.NOMBRE
ORDER BY 
    TOTAL_PROYECTOS_ASIGNADOS DESC, E.NOMBRE; 

--La duración total de cada proyecto (diferencia entre la fecha de inicio y la fecha de fin).
SELECT 
    ID_PROYECTO,
    NOMBRE AS PROYECTO,
    TO_CHAR(FECHA_INICIO, 'DD/MM/YYYY') AS INICIO,
    TO_CHAR(FECHA_FIN, 'DD/MM/YYYY') AS FIN,
    CASE 
        WHEN FECHA_FIN IS NULL THEN 'EN CURSO'
        ELSE 
            FLOOR((FECHA_FIN - FECHA_INICIO)/30) || ' meses y ' ||
            MOD(FECHA_FIN - FECHA_INICIO, 30) || ' días'
    END AS DURACION
FROM 
    PROYECTO
ORDER BY 
    CASE WHEN FECHA_FIN IS NULL THEN 1 ELSE 0 END,
    (FECHA_FIN - FECHA_INICIO) DESC;

/********************************************************************************/
/*
3. Consultas con JOINs
Escribe una consulta SQL para obtener:
Los nombres de los empleados junto con el nombre del departamento al que pertenecen.
Los nombres de los proyectos junto con los nombres de los empleados asignados a esos proyectos y las horas trabajadas.

*/
--Los nombres de los empleados junto con el nombre del departamento al que pertenecen.
SELECT E.NOMBRE, NVL(D.NOMBRE,'SIN DEPARTAMENTO') AS DEPARTAMENTO
FROM EMPLEADO E
LEFT JOIN DEPARTAMENTO D
ON E.DEPARTAMENTO_ID = D.ID_DEPARTAMENTO;

--Los nombres de los proyectos junto con los nombres de los empleados asignados a esos proyectos y las horas trabajadas.

SELECT 
    NVL(P.NOMBRE,'SIN PROYECTO') AS NOMBRE_PROYECTO,
    E.NOMBRE AS NOMBRE_EMPLEADO,
    NVL(A.HORAS_TRABAJADAS,0) AS HORAS_TRABAJADAS
FROM
    PROYECTO P
    LEFT JOIN ASIGNACION A
    ON P.ID_PROYECTO = A.PROYECTO_ID
    RIGHT JOIN 
    EMPLEADO E ON A.EMPLEADO_ID = E.ID_EMPLEADO;
/******************************************************************************/
/*
4. Consultas con CASE
Escribe una consulta SQL para:
Mostrar el salario de los empleados junto con una etiqueta que indique si el salario es "Alto" (> 5000), "Medio" (2000-5000) o "Bajo" (< 2000).
Mostrar el nombre del proyecto y la duración del proyecto, junto con una etiqueta que indique si el proyecto está "Activo" (si la fecha actual está dentro del rango) o "Inactivo".

*/

--Mostrar el salario de los empleados junto con una etiqueta que indique si el 
--salario es "Alto" (> 5000), "Medio" (2000-5000) o "Bajo" (< 2000).
SELECT * FROM EMPLEADO;
SELECT ID_EMPLEADO,
       NOMBRE,
       TO_CHAR(SALARIO,'$999,999') AS SALARIO,
       (CASE 
            WHEN SALARIO > 5000 THEN 'ALTO'
            WHEN SALARIO BETWEEN 2000 AND 5000 THEN 'MEDIO'
            WHEN SALARIO < 2000 THEN 'BAJO'
            ELSE 'SIN SALARIO ASIGNADO'
            END) AS SALARIO_E,
       FECHA_INGRESO
FROM EMPLEADO
ORDER BY SALARIO DESC;



--Mostrar el nombre del proyecto y la duración del proyecto, 
--junto con una etiqueta que indique si el proyecto está "Activo"
--(si la fecha actual está dentro del rango) o "Inactivo".
SELECT NOMBRE,
       FECHA_INICIO,
       FECHA_FIN,
       (NVL(FECHA_FIN, SYSDATE) - FECHA_INICIO) || ' días'AS DURACION,
       (CASE
            WHEN FECHA_FIN IS NULL THEN 'ACTIVO (Sin fecha final)'
            WHEN SYSDATE BETWEEN FECHA_INICIO AND FECHA_FIN THEN 'ACTIVO'
            WHEN SYSDATE < FECHA_INICIO THEN 'PENDIENTE'
            ELSE 'INACTIVO'
        END) AS ESTADO
FROM PROYECTO;
/********************************************************************/
SELECT D.ID_DEPARTAMENTO,D.NOMBRE,E.NOMBRE,E.SALARIO
        FROM DEPARTAMENTO D
        RIGHT JOIN EMPLEADO E
        ON D.ID_DEPARTAMENTO = E.DEPARTAMENTO_ID; 
/*
Parte 3: Procedimientos PL/SQL
5. Crear un Procedimiento PL/SQL
Crea un procedimiento que:
Tome como parámetro el ID_DEPARTAMENTO.
Imprima los nombres y salarios de todos los empleados en ese departamento.
Si el departamento no tiene empleados, imprima un mensaje indicando que no hay empleados en ese departamento.
*/
SELECT 

SELECT * FROM DEPARTAMENTO;
SELECT * FROM EMPLEADO;
--
/*****************************************/

CREATE OR REPLACE PROCEDURE LISTAR_EMPLEADOS_DEPTO (
    P_ID_DEPARTAMENTO IN NUMBER
)
IS
    -- Cursor para obtener empleados del departamento
    CURSOR c_empleados IS
        SELECT NOMBRE, SALARIO
        FROM EMPLEADO
        WHERE DEPARTAMENTO_ID = P_ID_DEPARTAMENTO
        ORDER BY NOMBRE;
        

    v_contador NUMBER := 0;
    v_nombre_depto DEPARTAMENTO.NOMBRE%TYPE;
BEGIN
    -- Obtener nombre del departamento
    BEGIN
        SELECT NOMBRE INTO v_nombre_depto
        FROM DEPARTAMENTO
        WHERE ID_DEPARTAMENTO = P_ID_DEPARTAMENTO;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Error: No existe un departamento con ID ' || P_ID_DEPARTAMENTO);
            RETURN;
    END;
    
    DBMS_OUTPUT.PUT_LINE('Empleados del departamento: ' || v_nombre_depto );
    
    -- Recorrer empleados del departamento
    FOR emp IN c_empleados LOOP
        DBMS_OUTPUT.PUT_LINE('Nombre: ' || RPAD(emp.NOMBRE, 30) || 
                            'Salario: ' || TO_CHAR(emp.SALARIO, '$999,999.00'));
        v_contador := v_contador + 1;
    END LOOP;
    
    -- Verificar si no hay empleados
    IF v_contador = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No hay empleados asignados a este departamento.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Total de empleados: ' || v_contador);
    END IF;
    
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error inesperado: ' || SQLERRM);
END LISTAR_EMPLEADOS_DEPTO;
/
EXECUTE LISTAR_EMPLEADOS_DEPTO(4);

/***********************************************************/
/*
6. Ejercicio Completo
Escribe un procedimiento PL/SQL que:
Calcule el total de horas trabajadas por cada empleado en todos los proyectos.
Actualice la tabla EMPLEADO con un nuevo campo TOTAL_HORAS que almacene este total.
Imprima un mensaje para cada empleado indicando el total de horas trabajadas.

*/
ALTER TABLE EMPLEADO
DROP COLUMN TOTAL_HORAS;

ALTER TABLE EMPLEADO 
ADD (TOTAL_HORAS NUMBER DEFAULT 0);

CREATE OR REPLACE PROCEDURE ACTUALIZAR_HORAS
IS  
BEGIN
    FOR i IN (
        SELECT E.ID_EMPLEADO, E.NOMBRE, NVL(SUM(A.HORAS_TRABAJADAS),0) AS TOTAL_HRS 
        FROM  EMPLEADO E
        LEFT JOIN ASIGNACION A
        ON  E.ID_EMPLEADO = A.EMPLEADO_ID
        GROUP BY E.ID_EMPLEADO, E.NOMBRE
    ) LOOP
        UPDATE EMPLEADO SET TOTAL_HORAS = i.TOTAL_HRS 
        WHERE ID_EMPLEADO = i.ID_EMPLEADO;
        
        DBMS_OUTPUT.PUT_LINE('Empleado: ' || i.NOMBRE ||'-->'|| 'Horas totales: ' || i.TOTAL_HRS);
    END LOOP;
    
    COMMIT;

END ACTUALIZAR_HORAS;
/
EXECUTE ACTUALIZAR_HORAS;

/*ALTER TABLE EMPLEADO ADD TOTAL_HORAS NUMBER DEFAULT 0;*/
    
/*********************************************************************/
/*

*/
SELECT * FROM PROYECTO;
SELECT * FROM EMPLEADO;
SELECT * FROM ASIGNACION;

CREATE OR REPLACE VIEW V_MOSTRAR
AS
    SELECT
        E.ID_EMPLEADO,
        E.NOMBRE AS NOMBRE_EMPLEADO,
        D.NOMBRE AS NOMBRE_DEPARTAMENTO,
        NVL(SUM(A.HORAS_TRABAJADAS),0) AS HORAS_TRABAJADAS
    FROM EMPLEADO E
    LEFT JOIN DEPARTAMENTO D 
    ON E.DEPARTAMENTO_ID = D.ID_DEPARTAMENTO
    LEFT JOIN ASIGNACION A
    ON E.ID_EMPLEADO = A.EMPLEADO_ID
    GROUP BY E.ID_EMPLEADO, E.NOMBRE, D.NOMBRE
    ORDER BY E.ID_EMPLEADO;
        
SELECT * FROM V_MOSTRAR;
/**********************************************/
SELECT 
    ID_EMPLEADO,
    NOMBRE_EMPLEADO,
    NOMBRE_DEPARTAMENTO,
    HORAS_TRABAJADAS
FROM V_MOSTRAR
WHERE 
    HORAS_TRABAJADAS > 100
    AND NOMBRE_EMPLEADO LIKE '%A%';


