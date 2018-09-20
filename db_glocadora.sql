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
select * from t_admin;

create table t_locatario (
	id int unique auto_increment,
    idAdmin int,
	nomeCompleto varchar(255) not null,
    dataNasc varchar(11) not null,
    cnh int not null,
    endereco varchar(255) not null,
    email varchar(255) not null,
    cpf varchar(14) not null,
    telefone varchar(15) not null,
    primary key(id),
    foreign key(idAdmin) references t_admin(id)
);


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
drop table t_veiculo;



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


