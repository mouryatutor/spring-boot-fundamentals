-- mysql -u root -h localhost -p
-- Run ALTER mysql command:
ALTER USER 'rattu'@'localhost' IDENTIFIED BY '';
-- Finally type SQL command to reload the grant tables in the mysql database:

GRANT ALL PRIVILEGES ON *.* TO 'rattu'@'localhost';

FLUSH PRIVILEGES;