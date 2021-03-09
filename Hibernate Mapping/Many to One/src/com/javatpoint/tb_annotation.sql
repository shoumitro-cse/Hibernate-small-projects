   
create table address12 (
       addressId integer auto_increment,
        addressLine1 varchar(255),
        city varchar(255),
        country varchar(255),
        pincode integer not null,
        state varchar(255),
        employee integer,
        primary key (addressId)
);


create table emp (
    employeeId integer auto_increment,
    email varchar(255),
    name varchar(255),
    address integer,
    primary key (employeeId)
);


alter table emp add constraint fk_emp foreign key (address) references address12 (addressId);


-- not require this line
-- alter table address12 add constraint fk_addr foreign key (employee) references emp (employeeId);



alter table emp drop foreign key fk_emp;
alter table address12 drop foreign key fk_addr;

drop  table emp;
drop  table address12;

select * from address12;
select * from emp;
