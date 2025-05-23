CREATE TABLE EQUIPOS(
    NOMBRE NVARCHAR2(100),
    CIUDAD NVARCHAR2(100),
    CONFERENCIA NVARCHAR2(100),
    DIVISION NVARCHAR2(100),
    CONSTRAINT EQUIPOS_PK PRIMARY KEY(NOMBRE)
);

CREATE TABLE JUGADORES(
    CODIGO NUMBER(*,0),
    NOMBRE NVARCHAR2(100),
    PROCEDENCIA NVARCHAR2(100),
    ALTURA NVARCHAR2(100),
    PESO NUMBER(*,0),
    POSICION NVARCHAR2(100),
    NOMBRE_EQUIPO NVARCHAR2(100),
    CONSTRAINT JUGADORES_PK PRIMARY KEY(CODIGO),
    CONSTRAINT EQUIPOS_FK FOREIGN KEY(NOMBRE_EQUIPO) REFERENCES EQUIPOS(NOMBRE)
);
DROP TABLE ESTADISTICAS;
CREATE TABLE ESTADISTICAS(
    TEMPORADA VARCHAR2(5 BYTE),
    JUGADOR NUMBER(*,0),
    PUNTOS_POR_PARTIDO FLOAT(126),
    ASISTENCIAS_POR_PARTIDO FLOAT(126),
    TAPONES_POR_PARTIDO FLOAT(126),
    REBOTES_POR_PARTIDO FLOAT(126),
    CONSTRAINT ESTADISTICAS_PK PRIMARY KEY(TEMPORADA,JUGADOR),
    CONSTRAINT JUGADORES_FK FOREIGN KEY(JUGADOR) REFERENCES JUGADORES(CODIGO)
);

CREATE TABLE PARTIDOS(
    CODIGO NUMBER(*,0),
    EQUIPO_LOCAL NVARCHAR2(100),
    EQUIPO_VISITANTE NVARCHAR2(100),
    PUNTOS_LOCAL NUMBER(*,0),
    PUNTOS_VISITANTE NUMBER(*,0),
    TEMPORADA NVARCHAR2(100),
    CONSTRAINT PARTIDOS_PK PRIMARY KEY(CODIGO),
    CONSTRAINT EQUIPOS_LOCAL_FK FOREIGN KEY(EQUIPO_LOCAL) REFERENCES EQUIPOS(NOMBRE),
    CONSTRAINT EQUIPOS_VISITANTE_FK FOREIGN KEY(EQUIPO_VISITANTE) REFERENCES EQUIPOS(NOMBRE)
);