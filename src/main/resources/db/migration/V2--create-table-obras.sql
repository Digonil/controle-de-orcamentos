CREATE TABLE TB_OBRAS
(
    id                  bigint       not null auto_increment,
    nome_obra           varchar(100) not null,
    data_de_solicitacao date,
    data_de_entrega     date,
    status              varchar(100),

    primary key (id)
)