CREATE TABLE TB_CLIENTE
(
    id               bigint       not null auto_increment,
    nome_cliente     varchar(100) not null,
    nome_solicitante varchar(100),
    telefone         varchar(15),
    email            varchar(100),

    primary key (id)
)