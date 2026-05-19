use jdbc_mhs;

create table mahasiswa (
id INT(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
nama VARCHAR(20)
);

create user 'mahasiswa'@'localhost' identified by '12345678';
grant all privileges on jdbc_mhs.* to 'mahasiswa'@'localhost';

