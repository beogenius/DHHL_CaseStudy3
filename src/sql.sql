drop database real_estate;
create database real_estate;
use real_estate;

create table home
(
    id          int auto_increment primary key not null,
        idSpecies int not null

);

create table villa
(
    id   int primary key auto_increment not null,
    idSpecies int not null ,
    address     varchar(255)                   not null,
    rooms       int                            not null,
    acreage     double                         not null,
    gara int not null,
    description varchar(255)                   not null,
    constraint `villa_idSpecies` foreign key (idSpecies) references `home` ( id)
);

create table apartment
(
    id     int not null primary key,
    idSpecies int not null ,
    address     varchar(255)                   not null,
    rooms       int                            not null,
    acreage     double                         not null,
    floors int not null,
    description varchar(255)                   not null,
    constraint `apartment` foreign key (idSpecies) references `home` (`id`)
);

create table customer
(
    id           int primary key        not null,
    name         varchar(50) not null,
    address      varchar(50) not null,
    phone_number varchar(50) not null,
    email        varchar(50) not null
#     constraint `customer` foreign key (id) references `oder` (i)i
);

create table oder
(
    id         int not null,
    idHome     int not null,
    idCusTomer int not null,
    constraint `oder_idHome` foreign key (idHome) references home (id),
    constraint `oder_idCusTomer` foreign key (idCusTomer) references customer (id)
)



