--CURSORES: SN HERRAMIENTAS PARA REALIZAR PERACINES SOBRE RESULTADOS DE MANERA SECEUNCIAL
--ES UNA ESTRUCTURA QUW PERMITE PROCESAR FILAS DE UN CONJUNTO DE RESULTADOS EN UNA CONSULTA SQL DENTRO DE 
--UN BLOQUE PL/SQL. SE PUEDEN UTILIZAR OPERACIONES DE LEXTURA, ACTUALIZACION O ELIMIINACION DE UN REGISTRO DE UNA TABLA
/*

DECLARE
   -- 1. Declarar el cursor
   CURSOR cursor_nombre IS
      SELECT columna1, columna2 
      FROM tabla
      WHERE condición;
   
   -- Variables para almacenar datos
   var1 tabla.columna1%TYPE;
   var2 tabla.columna2%TYPE;
BEGIN
   -- 2. Abrir el cursor
   OPEN cursor_nombre;
   
   -- 3. Recorrer los registros
   LOOP
      -- Leer una fila
      FETCH cursor_nombre INTO var1, var2;
      
      -- Salir del bucle si no hay más filas
      EXIT WHEN cursor_nombre%NOTFOUND;
      
      -- Procesar los datos (ejemplo: imprimir)
      DBMS_OUTPUT.PUT_LINE('Valor 1: ' || var1 || ', Valor 2: ' || var2);
   END LOOP;
   
   -- 4. Cerrar el cursor
   CLOSE cursor_nombre;
END;

*/
SELECT * FROM LIBRO;

CREATE OR REPLACE PROCEDURE PR_DETALLE_LIBRO
IS
    --CURSOR
    CURSOR LIBRO_INFO IS
        SELECT NOMBRE, 
            (CASE GENERO
                WHEN 1 THEN 'DRAMA'
                WHEN 2 THEN 'TERROR'
                WHEN 3 THEN 'CIENCIA FICCION'
                WHEN 4 THEN 'NOVELA'
                WHEN 5 THEN 'THRILLER'
                WHEN 6 THEN 'COMEDIA'
                ELSE 'SIN GENERO'
            END
            ) AS GENERO,PRECIO FROM LIBRO;
            
        --VARIABLES LOCALES
        LV_NOMBRE LIBRO.NOMBRE%TYPE;
        LV_GENERO NVARCHAR2(100);
        LV_PRECIO NUMBER;
BEGIN
    OPEN LIBRO_INFO;
    
        LOOP
        --POR CADA FILA RECORRIDA SE TOMAN
            FETCH LIBRO_INFO INTO LV_NOMBRE,LV_GENERO,LV_PRECIO;
            --CONDICIOON PARA SALIR CUANDO EL CURSOR YA NO TENGA REGISTROS
            EXIT WHEN LIBRO_INFO%NOTFOUND;
            
            DBMS_OUTPUT.PUT_LINE('NOMBRE DEL LIBRO' ||LV_NOMBRE||' , DE GENERO: '||LV_GENERO||' , SU COSTO ES: '||LV_PRECIO);
        END LOOP;
        --CERRAMOS EL CURSOR
        CLOSE LIBRO_INFO;
END;
/
BEGIN
    PR_DETALLE_LIBRO;
END;
/
/****************************************/
--PRODUCTO
SELECT * FROM PRODUCTO;

CREATE OR REPLACE PROCEDURE PR_DETALLE_PRODUCTO
IS
    --CURSOR
    CURSOR PRODUCTO_INFO IS
        SELECT NOMBRE, 
            (CASE CATEGORIA_ID
                WHEN 1 THEN 'TECNOLOGIA'
                WHEN 2 THEN 'HOGAR'
                WHEN 3 THEN 'ROPA'
                WHEN 4 THEN 'JUGUETERIA'
                WHEN 5 THEN 'FARMACIA'
                ELSE 'NO CLASIFICADO'    
            END
            ) AS CATEGORIA,PRECIO,STOCK, MARCA
            FROM PRODUCTO;
            
        --VARIABLES LOCALES
        LV_NOMBRE PRODUCTO.NOMBRE%TYPE;
        LV_CATEGORIA NVARCHAR2(100);
        LV_PRECIO PRODUCTO.PRECIO%TYPE;
        LV_STOCK NUMBER;
        LV_MARCA NVARCHAR2(100);
BEGIN
    OPEN PRODUCTO_INFO;
    
        LOOP
        --POR CADA FILA RECORRIDA SE TOMAN
            FETCH PRODUCTO_INFO INTO LV_NOMBRE,LV_CATEGORIA,LV_PRECIO,LV_STOCK,LV_MARCA;
            --CONDICIOON PARA SALIR CUANDO EL CURSOR YA NO TENGA REGISTROS
            EXIT WHEN PRODUCTO_INFO%NOTFOUND;
            
            DBMS_OUTPUT.PUT_LINE('NOMBRE DEL PRODUCTO: ' ||LV_NOMBRE||
                                ' ,DE CATEGORIA: '||LV_CATEGORIA||
                                ', SU COSTO ES: '|| TO_CHAR(LV_PRECIO,'$999,999.00')||
                                ', NUMERO DE STOCK: '||LV_STOCK||
                                ', MARCA: '||LV_MARCA);
        END LOOP;
        --CERRAMOS EL CURSOR
        CLOSE PRODUCTO_INFO;
END;
/


BEGIN
    PR_DETALLE_PRODUCTO;
END;
/











