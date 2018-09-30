create database db_glocadora;
use db_glocadora;



create table t_admin (
	id int unique auto_increment,
	nomeCompleto varchar(255) not null,
    cnpj varchar(255) not null,
    dataNasc varchar(11) not null,
	companhia varchar(255) not null,
    enderecoCompanhia varchar(255) not null,
    email varchar(255) not null,
    senha varchar(255) not null,
    
    primary key(id)
);
select * from t_admin, t_locatario, t_veiculo WHERE t_admin.id=7 AND t_locatario.idAdmin=7 AND t_veiculo.id=2 AND t_veiculo.idAdmin=7;


create table t_locatario (
	id int unique auto_increment,
    idAdmin int,
	nomeCompleto varchar(255) not null,
    dataNasc varchar(11) not null,
    cnh varchar(255),
    endereco varchar(255) not null,
    email varchar(255) not null,
    cpf varchar(14) not null,
    telefone varchar(15) not null,
    primary key(id),
    foreign key(idAdmin) references t_admin(id)
);
select * from t_locatario;

create table t_veiculo (
	id int unique auto_increment,
    idAdmin int,
    marca varchar(255) not null,
    modelo varchar(255) not null,
    placa varchar(255) not null,
    cor varchar(255) not null,
    anoLancamento varchar(255) not null,
    anoAquisicao varchar(255) not null,
    tipoCombustivel varchar(255) not null,
    capacidadeTanque double not null,
    quantCombustivel double not null,
    acessorios varchar(255) not null,
    locado boolean not null,
    observacao text not null,
    primary key(id),
    foreign key(idAdmin) references t_admin(id)
);
select * from t_veiculo;

SELECT 
    t_admin.companhia,
    t_admin.cnpj,
    t_admin.enderecoCompanhia,
    t_admin.email as emailAdmin,
    t_locatario.nomeCompleto as nomeLocatario,
    t_locatario.dataNasc,
    t_locatario.cnh,
    t_locatario.email AS emailLocatario,
    t_locatario.cpf,
    t_locatario.telefone,
    t_locatario.endereco,
    t_veiculo.marca,
    t_veiculo.modelo,
    t_veiculo.cor,
    t_veiculo.anoLancamento,
    t_veiculo.capacidadeTanque,
    t_veiculo.quantCombustivel
FROM
    t_admin, t_locatario, t_veiculo 
WHERE
	t_admin.id = 7 AND t_locatario.idAdmin = 7 AND t_veiculo.id = 1 AND t_veiculo.idAdmin = 7;

/*

create table t_locacao (
	id int unique auto_increment,
    idLocatario int,
    idAdmin int,
    dataSaida varchar(11) not null,
    dataDevolucao varchar(11) not null,
    horarioLocacao varchar(255) not null,
	nomeLocador varchar(255) not null,
    sobrenome varchar(255) not null,
    dataNasc varchar(11) not null,
    cnh varchar(255) not null,
    endereco varchar(255) not null,
    email varchar(255) not null,
    cpf varchar(11) not null,
    marca varchar(255) not null,
    modelo varchar(255) not null,
    placa varchar(255) not null,
    cor varchar(255) not null,
    anoLancamento varchar(255) not null,
    anoAquisicao varchar(255) not null,
    tipoCombustivel varchar(255) not null,
    quantCombustivel double not null,
    acessorios varchar(255) not null,
    
    primary key(id),
    foreign key(idLocatario) references t_locatario(id),
    foreign key(idAdmin) references t_admin(id)
);
*/


