CREATE DATABASE studentDB;
use studentDB;


create table student(
id int auto_increment PRIMARY KEY,
name varchar(20),
testscore decimal(8,3) 
);

select * from student;