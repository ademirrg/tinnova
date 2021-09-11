create table vote(
id bigint not null auto_increment,
total_voters bigint not null,
valid_votes bigint not null,
blank_votes bigint not null,
null_votes bigint not null,

primary key (id)
);