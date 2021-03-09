
create table emp (
     employeeId integer auto_increment,
     email varchar(255),
     name varchar(255),
     addr_join integer,
     primary key (employeeId)
 );

create table address (
     addressId integer auto_increment,
     addressLine1 varchar(255),
     city varchar(255),
     country varchar(255),
     pincode integer not null,
     state varchar(255),
     emp_join integer,
     primary key (addressId)
 );

alter table emp add constraint fk_emp foreign key (addr_join) references address (addressId);
alter table address add constraint fk_addr foreign key (emp_join) references emp (employeeId);


alter table emp drop foreign key fk_emp;
alter table address drop foreign key fk_addr;


..........................................................

#alter table tablename drop primary key;

#alter table tablename drop foreign key

# temporary disable all foregin key
SET FOREIGN_KEY_CHECKS=0;

#  enable all foregin key
SET FOREIGN_KEY_CHECKS=1;


drop table emp;
drop table address;

select * from emp;
select * from address;



............................
Hibernate: 
    
--     alter table address 
--        add constraint fk_addr 
--        foreign key (emp_join) 
--        references emp (employeeId)
Hibernate: 
    select
        max(employeeId) 
    from
        emp

Hibernate: 
    select
        max(addressId) 
    from
        address
....................................................
Hibernate: 
    insert 
    into
        address
        (addressLine1, city, country, emp_join, pincode, state, addressId) 
    values
        (?, ?, ?, ?, ?, ?, ?)
.......................................................................
Hibernate: 
    insert 
    into
        emp
        (addr_join, email, name, employeeId) 
    values
        (?, ?, ?, ?)
.......................................................
Hibernate: 
    update
        address 
    set
        addressLine1=?,
        city=?,
        country=?,
        emp_join=?,
        pincode=?,
        state=? 
    where
        addressId=?


#####################################################
Hibernate: 
    select
        employee0_.employeeId as employee1_1_,
        employee0_.addr_join as addr_joi4_1_,
        employee0_.email as email2_1_,
        employee0_.name as name3_1_ 
    from
        emp employee0_
...............................................
Hibernate: 
    select
        address0_.addressId as addressI1_0_0_,
        address0_.addressLine1 as addressL2_0_0_,
        address0_.city as city3_0_0_,
        address0_.country as country4_0_0_,
        address0_.emp_join as emp_join7_0_0_,
        address0_.pincode as pincode5_0_0_,
        address0_.state as state6_0_0_,
        employee1_.employeeId as employee1_1_1_,
        employee1_.addr_join as addr_joi4_1_1_,
        employee1_.email as email2_1_1_,
        employee1_.name as name3_1_1_,
        address2_.addressId as addressI1_0_2_,
        address2_.addressLine1 as addressL2_0_2_,
        address2_.city as city3_0_2_,
        address2_.country as country4_0_2_,
        address2_.emp_join as emp_join7_0_2_,
        address2_.pincode as pincode5_0_2_,
        address2_.state as state6_0_2_ 
    from
        address address0_ 
    left outer join
        emp employee1_ 
            on address0_.emp_join=employee1_.employeeId 
    left outer join
        address address2_ 
            on employee1_.addr_join=address2_.addressId 
    where
        address0_.addressId=1


1 Rahim aaa@gmail.com
1 G-21,Lohia nagar Jessore UP BD 201301
