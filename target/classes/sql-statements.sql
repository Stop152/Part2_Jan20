create schema db;
create table teacher (
Id        INT Auto_Increment primary key,
firstName    varchar (100) not null,
lastName    varchar (100) not null,
age        int);
 SELECT*FROM teacher;
 INSERT INTO teacher (firstname,lastname,age)
VALUES ("John", "Doe", 36);
INSERT INTO teacher (firstname,lastname,age)
VALUES ("Jane", "Doe", 32);
INSERT INTO teacher (id,firstname,lastname,age)
VALUES (900,"Mary", "Boo", 67);
INSERT INTO teacher (id,firstname,lastname,age)
VALUES (901,"Steave", "Wallace", 54);
UPDATE teacher
SET lastname = "Parker"
WHERE id = 900;
UPDATE teacher
SET firstname = "Steven"
WHERE id = 901;
ALTER TABLE teacher DROP COLUMN Age;
