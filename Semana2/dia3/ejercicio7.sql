--CON PL/SQL VAMOS A PODER CEAR
--BLOQUES PL/SQL: SON BLOQUES DE CODIGO QUE PUEDEN EJECUTAR SENTENCIAS BLOQUE ANONIMO
--SINTAXIS
/*
DECLARACION(OPCIONAL)->EN DONDE SE DECLARAN LAS CONSTANTES, VARIABLES Y CURSORES QUE UTILIZA EL BLOQUE
INSTRUCCINES-> CONTIENEN LAS SENTENCIAS A EJECUTAR
EXCEPCIONES->SE PUEDEN CAPTURAR EXCEPCIONES DEL SISTEMA  POR EL HORARIO


DECLARE | IS/AS
BEGIN(INICIO DE BLOQUE)
.........
EXCEPCIONES
END;

*/

DECLARE --DECLARACIONDE VARIABLES . CONSTANTES Y CURSORES
LV_VARIABLES NUMBER :=0;

BEGIN --
    DBMS_OUTPUT.PUT_LINE('HOLA DESDE BLOQUE ANONIMO PL/SQL');
END;--CIERRA EL BLOQUE
/--INIDICA QUE HASTA AQUI SE EJECUTA

--USO DE CICLOS CON PL/SQL
DECLARE 
LV_VARIABLES NUMBER :=0;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('VALOR: ' || LV_VARIABLES);
        LV_VARIABLES := LV_VARIABLES + 1;-- :=->ASIGNACION
        --EXIT WHEN LV_VARIABLES SEA 10
        IF LV_VARIABLES = 10
            THEN EXIT;
        END IF;
    END LOOP;
END;
/

--USO DEL CICLO FOR Y LOOP
DECLARE
BEGIN
    --FOR
    FOR i IN 1..10
        LOOP
            DBMS_OUTPUT.PUT_LINE('VALOR DE LA VARIABLE FOR: '|| i);
            EXIT WHEN i=6;
        END LOOP;
END;
/

--USO DE WHILE Y LOOP
DECLARE
LV_ITERADOR NUMBER := 1;
BEGIN
    WHILE LV_ITERADOR <= 6
        LOOP
            DBMS_OUTPUT.PUT_LINE('VALOR DEL ITERADOR CON WHILE: ' || LV_ITERADOR);
            LV_ITERADOR := LV_ITERADOR + 1;
        END LOOP;
END;
/
--USO DE VARIABLES BOOLEANAS
DECLARE 
LV_VALIDADOR BOOLEAN := FALSE;
BEGIN
    FOR i IN 1..20
        LOOP 
            DBMS_OUTPUT.PUT_LINE('VALOR DEL ITERADOR: ' || i);
            IF i = 9 THEN
             LV_VALIDADOR := TRUE;
            END IF;
            EXIT WHEN LV_VALIDADOR;
        END LOOP;
END;
/

--EJERCICIOS CON BLOQUES ANONIMOS
--NOMBRE COMPLETO, CARRERA, ESTADO DONDE VIVO
DECLARE --DECLARACIONDE VARIABLES . CONSTANTES Y CURSORES
LV_NOMBRE NVARCHAR2(50) := 'CRISTINA MARGARET';
LV_CARRERA NVARCHAR2(50) := 'ITI';
LV_ESTADO NVARCHAR2(50) := 'TLAXCALA';

BEGIN --
    DBMS_OUTPUT.PUT_LINE('HOLA SOY '|| LV_NOMBRE||'. '||'MI CARRERA ES '||
    LV_CARRERA||' '||'Y VIVO EN EL ESTADO DE '||LV_ESTADO);
END;--CIERRA EL BLOQUE
/
--IMPRIMIR LAS TABLAS DE MULTIPLICAR DEL 1 AL 10, EJEMPLO TABLA DEL 1. 1*1=1
DECLARE
BEGIN
    FOR i IN 1..10
    LOOP
        DBMS_OUTPUT.PUT_LINE('TABLA DEL '|| i);
        
        FOR j IN 1..10
        LOOP
        DBMS_OUTPUT.PUT_LINE(i||'*'|| j || ' = '|| (i * j));
        
        END LOOP;
        
    END LOOP;
END;--CIERRA EL BLOQUE
/

--IMPRIMIR SOLO LOS NUMEROS PARES DE 1 AL 20
DECLARE
BEGIN
    FOR i IN 1..20
    LOOP
        IF MOD(i,2) = 0 
        THEN
            DBMS_OUTPUT.PUT_LINE(i);
        END IF;
        
    END LOOP;
END;--CIERRA EL BLOQUE
/

--IMPRIMIR LA SUMA ACUMULADA DE LOOS PRIMEROS 10 NUMEROS, P/E 1:1, 2:3, 3:6

DECLARE
  LV_SUMA NUMBER := 0;
BEGIN
  FOR i IN 1..10 
  LOOP
    LV_SUMA := LV_SUMA + i;
    DBMS_OUTPUT.PUT_LINE(i|| ' : ' ||LV_SUMA);
  END LOOP;
END;


--IMPRIMIR LA CUENTA REGRESIVA DE 10 A 1
DECLARE
BEGIN
  FOR i IN REVERSE 1..10 
  LOOP
    DBMS_OUTPUT.PUT_LINE(i);
  END LOOP;
END;
/
--IMPRIMIR UNA SECUENCIA CON MULTIPLOS DE 5 HASTA EL 50
BEGIN
    FOR i IN 5..50
    LOOP
        IF MOD(i,5) = 0 
        THEN
            DBMS_OUTPUT.PUT_LINE(i);
        END IF;
        
    END LOOP;
END;--CIERRA EL BLOQUE
/
--








