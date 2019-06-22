DELETE FROM mysql.user WHERE User = 'freelanceAdm';
CREATE USER 'freelanceAdm'@'localhost' IDENTIFIED BY 'Freelance!123'; 
GRANT ALL PRIVILEGES ON * . * TO 'freelanceAdm'@'localhost';
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
    descricao varchar(300) not null,
    servico varchar(100) not null,
    dataAnuncio varchar(10) not null,
    cidade varchar(20) not null,
    estado char(2) not null,
    emailEmpresa varchar(50) not null,
    valor float not null,
    nomeEmpresa varchar(50) not null,
    entrega varchar(10) not null,
    id int auto_increment not null,
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
    primary key(id),
    emailEnvio varchar(50) not null,
    FOREIGN KEY (emailEnvio) REFERENCES usuario(email),
    visualizado boolean
);

CREATE TABLE mensagem(
    idServico int,
    FOREIGN KEY (idServico) REFERENCES servico(id),
    emailUsuario varchar(50) not null,
    FOREIGN KEY (emailUsuario) REFERENCES usuario(email),
    mensagem varchar(500) not null,
    filePath varchar(128) not null 
);

CREATE TABLE areaDeAtuacao(
    id smallint auto_increment not null,
    nome varchar(200),
    primary key (id)
);

INSERT INTO perfil (name, birthday, cpf_cnpj, university, professionalDesc) VALUES ('Daniel', '04/11/1998', '37855424881','USP' ,'student');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (1, 'aaa', 'aaa', '37855424881');


INSERT INTO perfil (name, birthday, cpf_cnpj, university, professionalDesc) VALUES ('Teste1', '04/11/1998', '22222222222','-' ,'Criar Panos');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (2, 'empresa1', 'd6f644b19812e97b5d871658d6d3400ecd4787faeb9b8990c1e7608288664be77257104a58d033bcf1a0e0945ff06468ebe53e2dff36e248424c7273117dac09', '22222222222');

INSERT INTO perfil (name, birthday, cpf_cnpj, university, professionalDesc) VALUES ('Teste2', '04/11/1998', '33333333333','-' ,'Cerâmica');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (2, 'empresa2', 'd6f644b19812e97b5d871658d6d3400ecd4787faeb9b8990c1e7608288664be77257104a58d033bcf1a0e0945ff06468ebe53e2dff36e248424c7273117dac09', '22222222222');

INSERT INTO perfil (name, birthday, cpf_cnpj, university, professionalDesc) VALUES ('Teste3', '04/11/1998', '44444444444','-' ,'Padaria');
INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES (2, 'empresa3', 'd6f644b19812e97b5d871658d6d3400ecd4787faeb9b8990c1e7608288664be77257104a58d033bcf1a0e0945ff06468ebe53e2dff36e248424c7273117dac09', '33333333333');

INSERT INTO servico(descricao,valor,nomeEmpresa, servico, dataAnuncio, cidade, estado, emailEmpresa, entrega, presenca, transporte, categorias)
VALUES ('Cortar pano',5000.00,'Teste1', 'Cortador de Pano', '2019-02-02', 'são carlos', 'SP', 'empresa1', '07/07/2019', 1, 1, 'tudo');

INSERT INTO servico(descricao,valor,nomeEmpresa, servico, dataAnuncio, cidade, estado, emailEmpresa, entrega, presenca, transporte, categorias)
VALUES ('Fazer Pote',10000.00,'Teste2', 'Fazedor de Pote', '2019-02-02', 'são carlos', 'SP', 'empresa2', '07/07/2019', 1, 1, 'tudo');

INSERT INTO servico(descricao,valor,nomeEmpresa, servico, dataAnuncio, cidade, estado, emailEmpresa, entrega, presenca, transporte, categorias)
VALUES ('Fazer pão',10000.00,'Teste3', 'Padeiro', '2019-02-02', 'são carlos', 'SP', 'empresa3', '07/07/2019', 1, 1, 'tudo');

INSERT INTO proposta(fk_idServico, emailDest,visualizado, emailEnvio) VALUES (1, 'da',0, 'aaa');
INSERT INTO proposta(fk_idServico, emailDest,visualizado, emailEnvio) VALUES (2, 'da',0, 'aaa');






