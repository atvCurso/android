CREATE SCHEMA ComaBem;

CREATE TABLE ComaBem.Produtos (
cd_produto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
ds_produto VARCHAR(200) NOT NULL,
vl_produto DOUBLE NOT NULL,
qt_produto DOUBLE NOT NULL,
cd_unidade INT NOT NULL,
CONSTRAINT fk_produto_unidade FOREIGN KEY (cd_unidade) REFERENCES Unidades (cd_unidade)
);

CREATE TABLE ComaBem.Unidades (
cd_unidade INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
ds_unidade VARCHAR(200) NOT NULL
);







