/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  David
 * Created: 20/11/2018
 */


create database redsis;

create table usuarios(
    id int primary key auto_increment,
    nome varchar(30) not null,
    prontuario varchar(10) not null,
    senha varchar(30) not null
);

create table alunos(
    id int auto_increment primary key ,
    nome varchar(150) not null,
    prontuario varchar(20) not null,
    data_inicio date not null,
    data_fim date not null
);

create table disciplinas(
  id int auto_increment primary key ,
  nome varchar(30) not null,
  sigla varchar(10) not null,
  professor varchar(30) not null,
  semestre varchar(1) not null,
  ano varchar(4),
  aluno_id int not null,
   foreign key(aluno_id) REFERENCES alunos(id) ON DELETE CASCADE;
);
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  David
 * Created: 20/11/2018
 */


create database redsis;

create table usuarios(
    id int primary key auto_increment,
    nome varchar(30) not null,
    prontuario varchar(10) not null,
    senha varchar(30) not null
);

create table alunos(
    id int auto_increment primary key ,
    nome varchar(150) not null,
    prontuario varchar(20) not null,
    data_inicio date not null,
    data_fim date not null
);

create table disciplinas(
  id int auto_increment primary key ,
  nome varchar(30) not null,
  sigla varchar(10) not null,
  professor varchar(30) not null,
  semestre varchar(1) not null,
  ano varchar(4),
  aluno_id int not null,
   foreign key(aluno_id) REFERENCES alunos(id) ON DELETE CASCADE;
);
