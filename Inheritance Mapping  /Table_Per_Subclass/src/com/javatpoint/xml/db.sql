
desc regemp123;
desc contemp123;
desc emp123;

create table emp123 (
  id int auto_increment primary key,
  name varchar(200) null
);

create table regemp123 (
   bonus int null,
   salary float null,
   reg_id int not null primary key,
   constraint fk_constrain_reg foreign key (reg_id) references emp123(id)
);

create table contemp123 (
   contract_duration varchar(255) null,
   pay_per_hour      float        null,
   con_id int not null primary key,
   constraint fk_constrain_con foreign key (con_id) references emp123(id)
);




Hibernate: 
    select
        max(id) 
    from
        emp123

Hibernate: 
    insert 
    into
        emp123
        (name, id) 
    values
        (?, ?)

Hibernate: 
    insert 
    into
        emp123
        (name, id) 
    values
        (?, ?)

Hibernate: 
    insert 
    into
        regemp123
        (salary, bonus, eid) 
    values
        (?, ?, ?)

Hibernate: 
    insert 
    into
        emp123
        (name, id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        contemp123
        (pay_per_hour, contract_duration, eid) 
    values
        (?, ?, ?)


select * from emp123;
select * from regemp123;
select * from contemp123;


DROP TABLE regemp123;
DROP TABLE contemp123;
DROP TABLE emp123;

desc regemp123;
desc contemp123;
desc emp123;