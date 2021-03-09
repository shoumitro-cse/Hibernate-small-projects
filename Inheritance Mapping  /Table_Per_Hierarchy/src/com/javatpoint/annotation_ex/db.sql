 
    create table employee101 (
       type varchar(31) not null,
        id integer not null ,
        name varchar(255),
        bonus integer,
        salary float,
        contract_duration varchar(255),
        pay_per_hour float,
        primary key (id)
    ) ;

--  create table hibernate_sequence (
--        next_val bigint
--     )
drop table employee101;
--drop table hibernate_sequence;


Hibernate: 
    insert 
    into
        employee101
        (name, type, id) 
    values
        (?, 'employee', ?)
Hibernate: 
    insert 
    into
        employee101
        (name, bonus, salary, type, id) 
    values
        (?, ?, ?, 'regularemployee', ?)
Hibernate: 
    insert 
    into
        employee101
        (name, contract_duration, pay_per_hour, type, id) 
    values
        (?, ?, ?, 'contractemployee', ?)