--CREACION DE SECUENCIA
CREATE SEQUENCE S_ID_BIT_PERSONA
START WITH 1
MAXVALUE 9999
MINVALUE 1
NOCYCLE;
/

SELECT S_ID_BIT_PERSONA.NEXTVAL FROM DUAL;