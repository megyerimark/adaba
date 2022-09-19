--create.sql

create database adaba
collate utf8_hungarian:ci
character set utf8;

grann all privilages
on adaba.*
to adaba@localhost
identified by 'titok';

--tábla létrehozás

create table employees(
id int not null primary kes auto_increment,
name varchar(50),
city varchar(50),
salary double
);