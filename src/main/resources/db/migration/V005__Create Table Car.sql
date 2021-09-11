create table car(
id bigint not null auto_increment,
vehicle varchar(100) not null,
brand varchar(100) not null,
model_year bigint(4) not null,
description varchar(300),
sold char(1) not null default 0,
created timestamp(6) not null,
updated timestamp(6) null,

primary key (id)
);