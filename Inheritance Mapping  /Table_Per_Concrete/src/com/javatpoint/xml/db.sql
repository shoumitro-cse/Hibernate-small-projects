
create table emp122 (
      id integer not null,
       name varchar(255),
       primary key (id)
   ) ;


create table regemp122 (
   id integer not null,
    name varchar(255),
    salary float,
    bonus integer,
    primary key (id)
); 

create table contemp122 (
       id integer not null,
        name varchar(255),
        pay_per_hour float,
        contract_duration varchar(255),
        primary key (id)
    ) ;


Hibernate: 
    select
        max(ids_.mx) 
    from
        ( select
            max(id) as mx 
        from
            emp122 
        union
        select
            max(id) as mx 
        from
            contemp122 
        union
        select
            max(id) as mx 
        from
            regemp122 
    ) ids_
Hibernate: 
    insert 
    into
        emp122
        (name, id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        regemp122
        (name, salary, bonus, id) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        contemp122
        (name, pay_per_hour, contract_duration, id) 
    values
        (?, ?, ?, ?)

select * from emp122;
select * from regemp122;
select * from contemp122;
