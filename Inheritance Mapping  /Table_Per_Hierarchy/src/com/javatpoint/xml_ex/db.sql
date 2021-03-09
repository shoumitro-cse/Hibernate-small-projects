create table emp121 (
    id integer not null,
    type varchar(255) not null,
    name varchar(255),
    salary float,
    bonus integer,
    pay_per_hours float,
    contract_duration varchar(255),
    primary key (id)
);


-- --Hibernate: 
--     select max(id) from emp121
-- --Hibernate: 
--     insert into emp121 (name, type, id) values (?, 'emp', ?)
-- 
-- --Hibernate: 
--     insert 
--     into
--         emp121
--         (name, salary, bonus, type, id) 
--     values
--         (?, ?, ?, 'reg_emp', ?)
-- --Hibernate: 
--     insert 
--     into
--         emp121
--         (name, pay_per_hours, contract_duration, type, id) 
--     values
--         (?, ?, ?, 'con_emp', ?)