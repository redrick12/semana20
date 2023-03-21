USE estudante;

CREATE TABLE Clientes (
	codigo INT,
    nome VARCHAR(100) NOT NULL,
    PRIMARY KEY (codigo)
);
INSERT INTO Clientes VALUES (1, 'Maria Silva');
INSERT INTO Clientes VALUES (2, 'João Campos');

SELECT * FROM Clientes;

CREATE TABLE Compras (
	codigo INT,
    codigo_Cliente INT,
    data DATE NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (codigo_Cliente) REFERENCES Clientes(codigo)
);

SELECT * FROM Compras;

INSERT INTO Compras VALUES (1,1,'2023-03-06');
INSERT INTO Compras VALUES (2,1,'2023-03-06');
INSERT INTO Compras VALUES (3,1,'2023-03-06');
INSERT INTO Compras VALUES (4,2,'2023-03-06');

select * from Compras where codigo_Cliente = 1;

select * from Compras where codigo_Cliente = 2;

select * from Compras where data >= '2023-01-01' and data <= '2023-01-31';

select * from Compras where data >= '2023-03-01' and data <= '2023-03-31';

select * from Compras where month(data)=3;