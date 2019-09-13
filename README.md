# Urna-Eletronica

Sistema de Urna eletrônica desenvolvido para a matéria de Engenharia de Software 1 (UFMG)

## Instalação

- Instale o banco de dados mariadb:
```shell
$ sudo apt-get install mariadb
```

- Clone o repositório utilizando o comando:
```shell
$ git clone https://github.com/Engenharia-de-Software-1-UFMG/Urna-Eletronica.git
```

- Entre na pasta do repositório e execute o script para criar o banco:
```shell
$ mysql -u root < create_db.sql
```
*Obs 1: Esse script remove o banco e o cria novamente.*

*Obs 2: Você pode executar esse script várias vezes, porém perderá os seus dados do banco.*

- Adicione o projeto no NetBeans. Não testei em outra IDE, mas acredito que você não vai ter problemas se tentar.
