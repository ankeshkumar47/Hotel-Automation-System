Run the following SQL queries in the MySQL 8.0 Command Line Client to setup the database used in the project

create database projecthms;

use projecthms

create table customer( id varchar(20),number varchar(30),name varchar(30),gender varchar(15),country varchar(20),room varchar(15),status varchar(15),deposit varchar(20));

create table room( room_number varchar(20),available varchar(20),status varchar(20),price varchar(15),bed_type varchar(20));

create table driver( name varchar(30),age varchar(10),gender varchar(20),company varchar(25),brand varchar(25),available varchar(20),location varchar(30));

create table employee( name varchar(30),age varchar(10),gender varchar(20),job varchar(30),salary varchar(20),phone varchar(15),aadhar varchar(20),email varchar(40));

create table login(username varchar(30),password varchar(30));
insert into login values('admin','12345');              //test case login id values you can give other values if you want

create table department1(dept varchar(30),budget varchar(20));
insert into department1 values('Marketing','1,50,000');  //department values and budget can be only be inserted from here
