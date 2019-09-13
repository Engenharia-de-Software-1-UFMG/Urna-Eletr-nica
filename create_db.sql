DROP DATABASE urna_eletronica;
CREATE DATABASE urna_eletronica;
USE urna_eletronica;

DROP TABLE IF EXISTS profissao;
CREATE TABLE profissao (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  senha_fiscal VARCHAR(255) NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS pessoas;
CREATE TABLE pessoas (
  id INT NOT NULL AUTO_INCREMENT,
  tipo INT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  cpf VARCHAR(255) NOT NULL,
  titulo_eleitor INT NOT NULL,
  telefone VARCHAR(255) NOT NULL,
  data_nascimento DATE NOT NULL,
  endereco VARCHAR(255) NOT NULL,
  id_profissao INT DEFAULT NULL,
  FOREIGN KEY (id_profissao) REFERENCES profissao(id),
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS urnas;
CREATE TABLE urnas (
  id INT NOT NULL AUTO_INCREMENT,
  local_voto VARCHAR(255) NOT NULL,
  id_pessoa INT DEFAULT NULL,
  id_profissao INT DEFAULT NULL,
  FOREIGN KEY (id_pessoa) REFERENCES pessoas(id),
  FOREIGN KEY (id_profissao) REFERENCES profissao(id),
  PRIMARY KEY (id)
);
