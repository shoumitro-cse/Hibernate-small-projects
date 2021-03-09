
create table address12 (
    addressId integer not null,
    addressLine1 varchar(255),
    city varchar(255),
    state varchar(255),
    country varchar(255),
    pincode integer,
    primary key (addressId)
);

create table emp (
    employeeId integer not null,
    name varchar(255),
    email varchar(255),
    address integer,
    primary key (employeeId)
);

alter table emp add constraint fk_emp foreign key (address) references address12 (addressId);

drop  table emp;
drop  table address12;

select * from address12;
select * from emp;






Hibernate: 
    select
        employee0_.employeeId as employee1_1_,
        employee0_.name as name2_1_,
        employee0_.email as email3_1_,
        employee0_.address as address4_1_ 
    from
        emp employee0_

1 Ravi Malik ravi@gmail.com

Hibernate: 
    select
        address0_.addressId as addressI1_0_0_,
        address0_.addressLine1 as addressL2_0_0_,
        address0_.city as city3_0_0_,
        address0_.state as state4_0_0_,
        address0_.country as country5_0_0_,
        address0_.pincode as pincode6_0_0_ 
    from
        address12 address0_ 
    where
        address0_.addressId=?
1 R.k-13,Sector 3 Jessore R.B Bangladesh 7440
2 Anuj Verma anuj@gmail.com
1 R.k-13,Sector 3 Jessore R.B Bangladesh 7440
