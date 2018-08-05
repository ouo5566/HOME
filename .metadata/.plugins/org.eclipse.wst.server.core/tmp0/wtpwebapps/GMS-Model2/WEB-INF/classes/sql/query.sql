CREATE TABLE PROJECT_TEAM(
    TEAM_ID VARCHAR2(20) PRIMARY KEY,
    TEAM_NAME VARCHAR2(20)
);

CREATE TABLE MEMBER(
    MEMBER_ID VARCHAR2(20) PRIMARY KEY,
    TEAM_ID VARCHAR2(20),
    NAME VARCHAR2(20),
    AGE DECIMAL
);

ALTER TABLE MEMBER ADD CONSTRAINT MEMBER_FK_TEAM_ID FOREIGN KEY (TEAM_ID)
REFERENCES PROJECT_TEAM (TEAM_ID);

INSERT INTO PROJECT_TEAM VALUES('NOLJA','놀자');
INSERT INTO PROJECT_TEAM VALUES('JIEUN_HOUSE','지은이네');
INSERT INTO PROJECT_TEAM VALUES('CODDING_ZZANG','코딩짱');
INSERT INTO PROJECT_TEAM VALUES('TURTLE_KING','거북왕');

INSERT INTO MEMBER VALUES('HJ34','NOLJA','형준',34);
INSERT INTO MEMBER VALUES('SI35','NOLJA','세인',35);
INSERT INTO MEMBER VALUES('HT21','NOLJA','희태',21);
INSERT INTO MEMBER VALUES('SH29','NOLJA','상훈',29);
INSERT INTO MEMBER VALUES('TH25','NOLJA','태형',25);
INSERT INTO MEMBER VALUES('HR26','JIEUN_HOUSE','혜리',26);
INSERT INTO MEMBER VALUES('JE26','JIEUN_HOUSE','지은',26);
INSERT INTO MEMBER VALUES('J27','JIEUN_HOUSE','준',27);
INSERT INTO MEMBER VALUES('JK30','JIEUN_HOUSE','재경',30);
INSERT INTO MEMBER VALUES('DA26','JIEUN_HOUSE','단아',26);
INSERT INTO MEMBER VALUES('JH32','CODDING_ZZANG','정훈',32);
INSERT INTO MEMBER VALUES('YH31','CODDING_ZZANG','윤호',31);
INSERT INTO MEMBER VALUES('KE29','CODDING_ZZANG','가은',29);
INSERT INTO MEMBER VALUES('JH23','CODDING_ZZANG','정훈',23);
INSERT INTO MEMBER VALUES('ST30','CODDING_ZZANG','승태',30);
INSERT INTO MEMBER VALUES('SH27','TURTLE_KING','승호',27);
INSERT INTO MEMBER VALUES('SJ26','TURTLE_KING','소진',26);
INSERT INTO MEMBER VALUES('S29','TURTLE_KING','슬',29);
INSERT INTO MEMBER VALUES('JT26','TURTLE_KING','진태',26);
INSERT INTO MEMBER VALUES('NR30','TURTLE_KING','누리',30);

ALTER TABLE MEMBER ADD (ROLL VARCHAR2(20));
ALTER TABLE MEMBER ADD (PASSWORD VARCHAR2(20));

UPDATE MEMBER SET ROLL =
	CASE
		WHEN NAME IN ('형준','최정훈','혜리','승호') THEN 'LEADER'
		ELSE 'NORMAL'
	END;

UPDATE MEMBER SET PASSWORD = MEMBER_ID;

CREATE TABLE EXAM(
    EXAM_SEQ DECIMAL PRIMARY KEY,
    MEMBER_ID VARCHAR2(20),
    SUBJECT_SEQ DECIMAL,
    MONTH VARCHAR2(20),
    SCORE VARCHAR2(20),
    RECORD_SEQ DECIMAL
);

CREATE TABLE RECORD(
    RECORD_SEQ DECIMAL PRIMARY KEY,
    AVERAGE VARCHAR2(20),
    GRADE VARCHAR2(20)
);

CREATE TABLE SUBJECT(
    SUBJECT_SEQ DECIMAL PRIMARY KEY,
    SUBJECT_NAME VARCHAR2(20)
);

CREATE SEQUENCE EXAM_SEQ;
CREATE SEQUENCE RECORD_SEQ;
CREATE SEQUENCE SUBJECT_SEQ;

ALTER TABLE EXAM ADD CONSTRAINT MEMBER_FK_MEMBER_ID FOREIGN KEY (MEMBER_ID)
REFERENCES MEMBER(MEMBER_ID);
ALTER TABLE EXAM ADD CONSTRAINT SUBJECT_FK_SUBJECT_SEQ FOREIGN KEY (SUBJECT_SEQ)
REFERENCES SUBJECT(SUBJECT_SEQ);
ALTER TABLE EXAM ADD CONSTRAINT RECORD_FK_RECORD_SEQ FOREIGN KEY (RECORD_SEQ)
REFERENCES RECORD(RECORD_SEQ);

INSERT INTO SUBJECT VALUES (SUBJECT_SEQ.NEXTVAL, 'JAVA');
INSERT INTO SUBJECT VALUES (SUBJECT_SEQ.NEXTVAL, 'SQL');
INSERT INTO SUBJECT VALUES (SUBJECT_SEQ.NEXTVAL, 'HTML5');
INSERT INTO SUBJECT VALUES (SUBJECT_SEQ.NEXTVAL, 'R');
INSERT INTO SUBJECT VALUES (SUBJECT_SEQ.NEXTVAL, 'PYTHON');

ALTER TABLE MEMBER ADD (SUBJECT VARCHAR2(20));
ALTER TABLE MEMBER ADD (SSN VARCHAR2(20));
ALTER TABLE MEMBER ADD (GENDER VARCHAR2(20));

UPDATE MEMBER SET SSN = SUBSTR(2019 - AGE,3,2) || '0101-';
UPDATE MEMBER SET SSN = 
	CASE
		WHEN NAME NOT IN('혜리', '지은', '가은', '누리', '단아', '소진', '이슬') THEN SSN || '1'
		ELSE SSN || '2'
	END;

UPDATE MEMBER SET GENDER = 
    CASE
        WHEN SUBSTR(SSN,8,1) LIKE '1' THEN '남'
        ELSE '여'
    END;

SELECT * FROM MEMBER;