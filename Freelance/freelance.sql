DROP DATABASE freelance;
CREATE DATABASE freelance;
USE freelance;

CREATE TABLE perfil(
    name varchar(50) not null,
    birthday varchar(10),
    cpf_cnpj varchar(20) not null,
    cep varchar(9),
    cidade varchar(50),
    escolaridade varchar(30),
    anoFormacao int,
    especializacao varchar(50),
    areaAtuacao varchar(50),
    experiencias varchar(1000),
    motivacao varchar(1000),
    primary key (cpf_cnpj),
    university varchar(50),
    professionalDesc varchar(1000),
    estado varchar(2)
);

CREATE TABLE usuario(
     permission smallint unsigned not null,
     email varchar(50) not null,
     password varchar(200) not null,
     cpf_cnpj varchar(20) not null,
     FOREIGN KEY (cpf_cnpj) REFERENCES perfil(cpf_cnpj),
     primary key (email)
);

CREATE TABLE servico(
    descricao varchar(300),
    servico varchar(100) not null,
    dataAnuncio date,
    cidade varchar(20),
    estado char(2),
    emailEmpresa varchar(50) not null,
    valor float,
    entrega varchar(10),
    id int auto_increment,
    presenca boolean,
    transporte boolean,
    categorias varchar(1000),
    primary key (id),
    FOREIGN KEY (emailEmpresa) REFERENCES usuario(email)
);

CREATE TABLE proposta(
    id int not null auto_increment,
    fk_idServico int,
    FOREIGN KEY (fk_idServico) REFERENCES servico(id),
    emailDest varchar(50) not null,
    FOREIGN KEY (emailDest) REFERENCES usuario(email),
    primary key(id)
);

CREATE TABLE mensagem(
    idServico int,
    FOREIGN KEY (idServico) REFERENCES servico(id),
    emailUsuario varchar(50) not null,
    FOREIGN KEY (emailUsuario) REFERENCES usuario(email),
    mensagem varchar(500) not null,
    filePath varchar(128) not null 
);

INSERT INTO perfil(name, birthday, cpf_cnpj, university, professionalDesc) VALUES ('Daniel', '04/11/1998', '37855424881','USP' ,'student');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (1, 'aaa@aaa.com', 'aaa', '37855424881');

INSERT INTO perfil(name, cpf_cnpj) VALUES ('DB/Empresa1', '89423535135');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (2, 'bbb@bbb.com', 'aaa', '89423535135');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa1/Serviço1', 'bbb@bbb.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa1/Serviço2', 'bbb@bbb.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa1/Serviço3', 'bbb@bbb.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa1/Serviço4', 'bbb@bbb.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa1/Serviço5', 'bbb@bbb.com');

INSERT INTO perfil(name, cpf_cnpj) VALUES ('DB/Empresa2', '46456432434');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (2, 'ccc@ccc.com', 'aaa', '46456432434');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa2/Serviço1', 'ccc@ccc.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa2/Serviço2', 'ccc@ccc.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa2/Serviço3', 'ccc@ccc.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa2/Serviço4', 'ccc@ccc.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa2/Serviço5', 'ccc@ccc.com');

INSERT INTO perfil(name, cpf_cnpj) VALUES ('DB/Empresa3', '12323123123');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (2, 'ddd@ddd.com', 'aaa', '12323123123');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa3/Serviço1', 'ddd@ddd.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa3/Serviço2', 'ddd@ddd.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa3/Serviço3', 'ddd@ddd.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa3/Serviço4', 'ddd@ddd.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa3/Serviço5', 'ddd@ddd.com');

INSERT INTO perfil(name, cpf_cnpj) VALUES ('DB/Empresa4', '54353477455');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (2, 'eee@eee.com', 'aaa', '54353477455');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa4/Serviço1', 'eee@eee.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa4/Serviço2', 'eee@eee.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa4/Serviço3', 'eee@eee.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa4/Serviço4', 'eee@eee.com');
INSERT INTO servico(servico, emailEmpresa) VALUES ('DB/Empresa4/Serviço5', 'eee@eee.com');

USE freelance;

SELECT * from perfil;

/*
DELETE FROM mysql.user WHERE User = 'freelanceAdm';
CREATE USER 'freelanceAdm'@'localhost' IDENTIFIED BY 'Freelance!123'; 
GRANT ALL PRIVILEGES ON * . * TO 'freelanceAdm'@'localhost';
use freelance;
SELECT DATE_FORMAT(birthday, '%d/%m/%Y') FROM perfil;
SELECT * from usuario;
*/
