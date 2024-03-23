CREATE DATABASE mydb;

CREATE USER 'rattu'@'localhost' IDENTIFIED BY "rattu"

GRANT ALL PRIVILEGES ON *.* TO 'rattu'@'localhost';

FLUSH PRIVILEGES;