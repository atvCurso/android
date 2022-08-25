use ComaBem;

/*INSERÇÃO DE DADOS NAS TABELAS*/
INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (1, "Kilo");
INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (2, "Unidade");
INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (3, "Litro");
INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (4, "Metro");
INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (5, "Duzia");

INSERT INTO Produtos (cd_produto, ds_produto, vl_produto, qt_produto, cd_unidade) VALUES (1, "Carne", 30.00, 2, 1);
INSERT INTO Produtos (cd_produto, ds_produto, vl_produto, qt_produto, cd_unidade) VALUES (2, "Oleo", 10.00, 1, 2);
INSERT INTO Produtos (cd_produto, ds_produto, vl_produto, qt_produto, cd_unidade) VALUES (3, "Leite", 5.00, 1.5, 3);
INSERT INTO Produtos (cd_produto, ds_produto, vl_produto, qt_produto, cd_unidade) VALUES (4, "Alface", 3.00, 1, 2);
INSERT INTO Produtos (cd_produto, ds_produto, vl_produto, qt_produto, cd_unidade) VALUES (5, "Laranja", 8.00, 10, 5);

/*ATUALIZAÇÃO DE DADOS NAS TABELAS*/
UPDATE Produtos set ds_produto = "Frango" where cd_produto = 1;
UPDATE Produtos set ds_produto = "Oleo de Soja" where cd_produto = 2;
UPDATE Produtos set vl_produto = 20.00 where cd_produto = 1;
UPDATE Produtos set cd_unidade = 1 where cd_produto = 1;
UPDATE Unidades set ds_unidade = "und" where cd_unidade = 2;

/*SELEÇÃO DE DADOS NAS TABELAS*/
SELECT * FROM Produtos;
SELECT * FROM Unidades;
SELECT ds_produto, vl_produto, qt_produto FROM Produtos ORDER BY ds_produto;

SELECT p.ds_produto AS 'Produto', u.ds_unidade AS 'Unidade' FROM Produtos AS p
JOIN Unidades AS u ON p.cd_unidade = u.cd_unidade;

select ds_unidade FROM Unidades  order by ds_unidade ASC;

/*EXCLUSÃO DE DADOS NAS TABELAS*/
DELETE FROM Produtos WHERE cd_produto = 1;
DELETE FROM Unidades WHERE cd_unidade = 1;







