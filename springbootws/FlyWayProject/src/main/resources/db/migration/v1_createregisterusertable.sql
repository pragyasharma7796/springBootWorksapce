CREATE TABLE register_user(
id BIGINT(20) NOT NULL AUTO_INCREMENT,
firstname VARCHAR(100),
		lastname VARCHAR(250),
		address VARCHAR (250),
PRIMARY KEY (id))
ENGINE=INNODB DEFAULT CHARSET = UTF8;