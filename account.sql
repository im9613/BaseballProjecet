create table account (
    id varchar2(100) primary key,
    pw varchar2(100) not null
);

create sequence account_seq;

insert into account (id, pw) values ('samsung', '1111');
insert into account (id, pw) values ('kia', '1111');
insert into account (id, pw) values ('lg', '1111');

commit;