-- PRODUTOS
INSERT INTO produto (id, preco, descricao)VALUES (1, 20, 'lapis');

INSERT INTO produto (id, preco, descricao)VALUES (2, 25, 'caderno');
INSERT INTO produto (id, preco, descricao)VALUES (3, 30, 'livro');

INSERT into  pessoa (id, email, telefone) VALUES (1,'@aaaaaaaaaa','11111111111');
INSERT into  pessoa (id, email, telefone) VALUES (2,'@bbbbbbbbbb','22222222222');
INSERT into  pessoa (id, email, telefone) VALUES (3,'@cccccccccc','33333333333');
INSERT into  pessoa (id, email, telefone) VALUES (4,'@dddddddddd','44444444444');

INSERT INTO pessoa_fisica (id, cpf, nome) VALUES (1, '111111', 'Joao');
INSERT INTO pessoa_fisica (id, cpf, nome) VALUES (2, '222222', 'Lucas');
INSERT INTO pessoa_juridica (id, cnpj, razao_social) VALUES (3, '111111111111', 'DuBairro');
INSERT INTO pessoa_juridica (id, cnpj, razao_social) VALUES (4, '222222222222', 'Acouque');


-- VENDAS
INSERT INTO venda (id,pessoa_id, data)VALUES (1,2, '2026-03-21 10:00:00');

INSERT INTO venda (id,pessoa_id, data)VALUES (2,3, '2026-03-21 11:30:00');

-- ITENS (nome da tabela é "item", não item_venda)
-- venda 1
INSERT INTO item (id, quantidade, produto_id, venda_id)VALUES (1, 1, 1, 1);

INSERT INTO item (id, quantidade, produto_id, venda_id)VALUES (2, 2, 2, 1);

-- venda 2
INSERT INTO item (id, quantidade, produto_id, venda_id)VALUES (3, 1, 1, 2);

INSERT INTO item (id, quantidade, produto_id, venda_id)VALUES (4, 3, 2, 2);
