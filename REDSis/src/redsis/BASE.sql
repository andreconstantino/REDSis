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
