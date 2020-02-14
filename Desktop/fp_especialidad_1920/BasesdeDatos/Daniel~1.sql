REM ******** TABLA DEPART: ***********

DROP TABLE DEPART cascade constraints; 

CREATE TABLE DEPART (
 DEPTNO  NUMBER(2) PRIMARY KEY,
 DNOMBRE  VARCHAR2(25), 
 LOC      VARCHAR2(25) );

INSERT INTO DEPART VALUES (10,'CONTABILIDAD','SEVILLA');
INSERT INTO DEPART VALUES (20,'INVESTIGACI�ON','MADRID');
INSERT INTO DEPART VALUES (30,'VENTAS','BARCELONA');
INSERT INTO DEPART VALUES (40,'PRODUCCI�N','BILBAO');
COMMIT;


REM ******** TABLA EMPLE: *************



DROP TABLE EMPLE cascade constraints; 

CREATE TABLE EMPLE (
 EMPNO    NUMBER(4) PRIMARY KEY,
 APELLIDO  VARCHAR2(10)  ,
 OFICIO    VARCHAR2(10)  ,
 DIR       NUMBER(4) ,
 FECHAALT DATE      ,
 SALARIO   NUMBER(10),
 COMISION  NUMBER(10),
 DEPTNO   NUMBER(2) REFERENCES DEPART);

INSERT INTO EMPLE VALUES (7369,'S�NCHEZ','EMPLEADO',7902,'17/12/2010', 650,NULL,20);
INSERT INTO EMPLE VALUES (7499,'ARROYO','VENDEDOR',7698,'20/02/2010', 1300,234,30);
INSERT INTO EMPLE VALUES (7521,'SALA','VENDEDOR',7698,'22/02/2011', 980,392,30);
INSERT INTO EMPLE VALUES (7566,'JIM�NEZ','DIRECTOR',7839,'02/04/2011',2400,NULL,20);
INSERT INTO EMPLE VALUES (7654,'MART�N','VENDEDOR',7698,'29/09/2011', 980,1096,30);
INSERT INTO EMPLE VALUES (7698,'NEGRO','DIRECTOR',7839,'01/05/2011',2240,NULL,30);
INSERT INTO EMPLE VALUES (7782,'CEREZO','DIRECTOR',7839,'09/06/2011',1920,NULL,10);
INSERT INTO EMPLE VALUES (7788,'GIL','ANALISTA',7566,'09/11/2011',2350,NULL,20);
INSERT INTO EMPLE VALUES (7839,'REY','PRESIDENTE',NULL,'17/11/2011',3950,NULL,10);
INSERT INTO EMPLE VALUES (7844,'TOVAR','VENDEDOR',7698,'08/09/2011',1190,0,30);
INSERT INTO EMPLE VALUES (7876,'ALONSO','EMPLEADO',7788,'23/09/2011',862,NULL,20);
INSERT INTO EMPLE VALUES (7900,'JIMENO','EMPLEADO',7698,'03/12/2011',750,NULL,30);
INSERT INTO EMPLE VALUES (7902,'FERN�NDEZ','ANALISTA',7566,'03/12/2011',2350,NULL,20);
INSERT INTO EMPLE VALUES (7934,'MU�OZ','EMPLEADO',7782,'23/01/2012',1020,NULL,10);

COMMIT;