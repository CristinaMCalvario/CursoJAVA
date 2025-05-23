--CREAR UNA IDENTIDAD CON DDL
--LA TABLA EMPLEADO

/*
CHAR ALMACENA DATOS DE LONGITUD
CHARACTER
VARCHAR
VARCHAR
VARCHAR2: SOLO ES DE ORACLE
NVARCHAR2: ESPECIFICO DE ORACLE, SE UTILIZA PARA ALMACENAR CARACTERES DE LONGITUD VARIABLE 
DE CARACTER UNICO
*/

CREATE TABLE EMPLEADO(
    ID_EMPLEADO NUMBER,
    NOMBRE NVARCHAR2(100),
    APELLIDO_P NVARCHAR2(100),
    EDAD NUMBER,
    PUESTO NVARCHAR2(100),
    DEPARTAMENTO NVARCHAR2(100)
);

--DML
INSERT INTO EMPLEADO VALUES(1,'JULIAN','RODRIGUEZ',39,'ENCARGADO DE NOMINAS','RH');
COMMIT;--UNA VEZ QUE UNA SETENCIA DML, DEBEMOS CONFIRMAR LOS CAMBIOS PARA TERMINAR CON LA
--TRANSACCION REALIZADA, SI UNA TRANSACICCION  SE QUEDA SIN CONFIRMAR, LA DB SE QUEDARA BLOQUEADA
--

SELECT * FROM EMPLEADO;

--EJECUTAR UN DML PARA ELIMINAR LOS REGISTROS DE UNA TABLA
DELETE FROM EMPLEADO;--SOLO ELIMINA MIS REGISTROS

--EJECUTAR DDL PARA ELIMINAR LA TABLA
DROP TABLE EMPLEADO; --ELIMINA TODA LA TABLA DE MI BASE DE DATOS

--USO DE LOS CONSTRAINTS
-- CREAR ENTIDAD CON PRIMARY KEY --> PRIMERA FORMA
CREATE TABLE EMPLEADO(
    ID_EMPLEADO NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    APELLIDO_P NVARCHAR2(100),
    EDAD NUMBER,
    PUESTO NVARCHAR2(100),
    DEPARTAMENTO NVARCHAR2(100)
);

--DDL CON PRIMARY KEY --> SEGUNDA FORMA
CREATE TABLE EMPLEADO(
    ID_EMPLEADO NUMBER,
    NOMBRE NVARCHAR2(100),
    APELLIDO_P NVARCHAR2(110),
    EDAD NUMBER,
    PUESTO NVARCHAR2(100),
    DEPARTAMENTO NVARCHAR2(100),
    PRIMARY KEY(ID_EMPLEADO)

);

--TERCERA FORMA 
CREATE TABLE EMPLEADO(
    ID_EMPLEADO NUMBER,
    NOMBRE NVARCHAR2(100),
    APELLIDO_P NVARCHAR2(100),
    EDAD NUMBER,
    PUESTO NVARCHAR2(100),
    DEPARTAMENTO NVARCHAR2(100),
    CONSTRAINT EMPLEADO_PK PRIMARY KEY (ID_EMPLEADO)
);



