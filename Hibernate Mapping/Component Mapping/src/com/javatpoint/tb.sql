

create table emp (
    id integer not null,
    name varchar(255),
    city varchar(255),
    country varchar(255),
    pincode integer,
    primary key (id)
)

select * from emp;

drop table emp;




#####################################
Hibernate: 
    select
        max(id) 
    from
        emp
Hibernate: 
    insert 
    into
        emp
        (name, city, country, pincode, id) 
    values
        (?, ?, ?, ?, ?)
