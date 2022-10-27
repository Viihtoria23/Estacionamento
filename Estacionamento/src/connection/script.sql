/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  04801167098
 * Created: 06/10/2022
 */

CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga(
idVaga  int NOT NULL AUTO_INCREMENT,
numero  int NOT NULL,
rua     varchar(100) NOT NULL,
obliqua boolean NOT NULL,
PRIMARY KEY (idVaga));

CREATE TABLE motorista(
idMotorista  int NOT NULL AUTO_INCREMENT,
nomeCompleto  varchar(77) NOT NULL,
genero    varchar(22) NOT NULL,
rg  varchar(9) NOT NULL,
cpf  varchar(10) NOT NULL,
celular  varchar(9) NOT NULL,
email  varchar(33) NOT NULL,
senha  varchar(8) NOT NULL,
PRIMARY KEY (idMotorista));


