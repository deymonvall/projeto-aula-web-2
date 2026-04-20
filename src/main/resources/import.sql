-- =========================
-- PRODUTOS
-- =========================
INSERT INTO produto (id, preco, descricao) VALUES (1, 20, 'lapis');
INSERT INTO produto (id, preco, descricao) VALUES (2, 25, 'caderno');
INSERT INTO produto (id, preco, descricao) VALUES (3, 30, 'livro');
INSERT INTO produto (id, preco, descricao) VALUES (4, 15, 'borracha');
INSERT INTO produto (id, preco, descricao) VALUES (5, 50, 'mochila');
INSERT INTO produto (id, preco, descricao) VALUES (6, 10, 'caneta azul');
INSERT INTO produto (id, preco, descricao) VALUES (7, 12, 'caneta preta');
INSERT INTO produto (id, preco, descricao) VALUES (8, 40, 'agenda');
INSERT INTO produto (id, preco, descricao) VALUES (9, 35, 'estojo');
INSERT INTO produto (id, preco, descricao) VALUES (10, 60, 'calculadora');

-- =========================
-- PESSOAS
-- =========================
INSERT INTO pessoa (id, email, telefone) VALUES (1,'a@aaa.com','11111111111');
INSERT INTO pessoa (id, email, telefone) VALUES (2,'b@bbb.com','22222222222');
INSERT INTO pessoa (id, email, telefone) VALUES (3,'c@ccc.com','33333333333');
INSERT INTO pessoa (id, email, telefone) VALUES (4,'d@ddd.com','44444444444');
INSERT INTO pessoa (id, email, telefone) VALUES (5,'e@eee.com','55555555555');
INSERT INTO pessoa (id, email, telefone) VALUES (6,'f@fff.com','66666666666');
INSERT INTO pessoa (id, email, telefone) VALUES (7,'g@ggg.com','77777777777');
INSERT INTO pessoa (id, email, telefone) VALUES (8,'h@hhh.com','88888888888');

-- =========================
-- PESSOA FISICA
-- =========================
INSERT INTO pessoa_fisica (id, cpf, nome) VALUES (1, '11111111111', 'joao');
INSERT INTO pessoa_fisica (id, cpf, nome) VALUES (2, '22222222222', 'lucas');
INSERT INTO pessoa_fisica (id, cpf, nome) VALUES (5, '55555555555', 'maria');
INSERT INTO pessoa_fisica (id, cpf, nome) VALUES (6, '66666666666', 'ana');

-- =========================
-- PESSOA JURIDICA
-- =========================
INSERT INTO pessoa_juridica (id, cnpj, razao_social) VALUES (3, '11111111111111', 'dubairro');
INSERT INTO pessoa_juridica (id, cnpj, razao_social) VALUES (4, '22222222222222', 'acougue');
INSERT INTO pessoa_juridica (id, cnpj, razao_social) VALUES (7, '33333333333333', 'papelaria central');
INSERT INTO pessoa_juridica (id, cnpj, razao_social) VALUES (8, '44444444444444', 'mercado bom preco');

-- =========================
-- VENDAS
-- =========================
INSERT INTO venda (id, pessoa_id, data) VALUES (1,2, '2026-03-22 10:00:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (2,3, '2026-03-21 11:30:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (3,1, '2026-03-20 09:15:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (4,5, '2026-03-19 14:45:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (5,6, '2026-03-18 16:20:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (6,7, '2026-03-17 12:10:00');

-- =========================
-- ITENS
-- =========================

-- venda 1
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (1, 1, 1, 1);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (2, 2, 2, 1);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (3, 1, 5, 1);

-- venda 2
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (4, 1, 1, 2);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (5, 3, 2, 2);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (6, 2, 3, 2);

-- venda 3
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (7, 4, 6, 3);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (8, 1, 10, 3);

-- venda 4
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (9, 2, 7, 4);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (10, 1, 8, 4);

-- venda 5
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (11, 5, 4, 5);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (12, 2, 9, 5);

-- venda 6
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (13, 1, 3, 6);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (14, 3, 5, 6);
-- =========================
-- MAIS VENDAS
-- =========================
INSERT INTO venda (id, pessoa_id, data) VALUES (7, 2, '2026-03-16 10:30:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (8, 3, '2026-03-15 11:00:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (9, 4, '2026-03-14 09:45:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (10, 1, '2026-03-13 15:20:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (11, 5, '2026-03-12 17:10:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (12, 6, '2026-03-11 13:50:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (13, 7, '2026-03-10 08:40:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (14, 8, '2026-03-09 18:00:00');
INSERT INTO venda (id, pessoa_id, data) VALUES (15, 2, '2026-03-08 14:25:00');

-- =========================
-- ITENS DAS NOVAS VENDAS
-- =========================

-- venda 7
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (15, 2, 1, 7);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (16, 1, 4, 7);

-- venda 8
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (17, 3, 2, 8);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (18, 2, 6, 8);

-- venda 9
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (19, 1, 10, 9);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (20, 2, 3, 9);

-- venda 10
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (21, 5, 1, 10);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (22, 1, 8, 10);

-- venda 11
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (23, 2, 5, 11);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (24, 4, 7, 11);

-- venda 12
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (25, 3, 6, 12);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (26, 2, 9, 12);

-- venda 13
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (27, 1, 2, 13);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (28, 2, 3, 13);

-- venda 14
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (29, 3, 4, 14);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (30, 1, 10, 14);

-- venda 15
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (31, 2, 8, 15);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (32, 1, 5, 15);

-- =========================
-- VENDAS COM DATAS REPETIDAS
-- =========================

-- mesma data da venda 1
INSERT INTO venda (id, pessoa_id, data) VALUES (16, 3, '2026-03-22 10:00:00');

-- mesma data da venda 2
INSERT INTO venda (id, pessoa_id, data) VALUES (17, 4, '2026-03-21 11:30:00');

-- repetindo outra data
INSERT INTO venda (id, pessoa_id, data) VALUES (18, 2, '2026-03-20 09:15:00');

INSERT INTO venda (id, pessoa_id, data) VALUES (19, 5, '2026-03-20 09:15:00');

-- mais repetições
INSERT INTO venda (id, pessoa_id, data) VALUES (20, 6, '2026-03-18 16:20:00');

INSERT INTO venda (id, pessoa_id, data) VALUES (21, 1, '2026-03-18 16:20:00');

-- =========================
-- ITENS
-- =========================

-- venda 16
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (33, 1, 1, 16);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (34, 2, 3, 16);

-- venda 17
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (35, 3, 2, 17);

-- venda 18
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (36, 2, 4, 18);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (37, 1, 10, 18);

-- venda 19
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (38, 5, 6, 19);

-- venda 20
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (39, 1, 8, 20);
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (40, 2, 9, 20);

-- venda 21
INSERT INTO item (id, quantidade, produto_id, venda_id) VALUES (41, 2, 5, 21);