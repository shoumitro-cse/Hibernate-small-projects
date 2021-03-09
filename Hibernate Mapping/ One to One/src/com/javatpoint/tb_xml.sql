
create table emp (
        employeeId integer not null,
        name varchar(255),
        email varchar(255),
        primary key (employeeId)
);


create table address (
        addressId integer not null,
        addressLine1 varchar(255),
        city varchar(255),
        state varchar(255),
        country varchar(255),
        pincode integer,
        primary key (addressId)
 );

drop table emp;
drop table address;

select * from emp;
select * from address;







Hibernate: 
    select
        max(employeeId) 
    from
        emp
---------------------
Hibernate: 
    insert 
    into
        emp
        (name, email, employeeId) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        address
        (addressLine1, city, state, country, pincode, addressId) 
    values
        (?, ?, ?, ?, ?, ?)


Hibernate: 
    select
        employee0_.employeeId as employee1_1_,
        employee0_.name as name2_1_,
        employee0_.email as email3_1_ 
    from
        emp employee0_
---------------------------------
Hibernate: 
    select
        address0_.addressId as addressI1_0_0_,
        address0_.addressLine1 as addressL2_0_0_,
        address0_.city as city3_0_0_,
        address0_.state as state4_0_0_,
        address0_.country as country5_0_0_,
        address0_.pincode as pincode6_0_0_,
        employee1_.employeeId as employee1_1_1_,
        employee1_.name as name2_1_1_,
        employee1_.email as email3_1_1_ 
    from
        address address0_ 
    left outer join
        emp employee1_ 
            on address0_.addressId=employee1_.employeeId 
    where
        address0_.addressId=?
..............................................................
Hibernate: 
    select
        address0_.addressId as addressI1_0_0_,
        address0_.addressLine1 as addressL2_0_0_,
        address0_.city as city3_0_0_,
        address0_.state as state4_0_0_,
        address0_.country as country5_0_0_,
        address0_.pincode as pincode6_0_0_,
        employee1_.employeeId as employee1_1_1_,
        employee1_.name as name2_1_1_,
        employee1_.email as email3_1_1_ 
    from
        address address0_ 
    left outer join
        emp employee1_ 
            on address0_.addressId=employee1_.employeeId 
    where
        address0_.addressId=?
.............................................................
Hibernate: 
    select
        address0_.addressId as addressI1_0_0_,
        address0_.addressLine1 as addressL2_0_0_,
        address0_.city as city3_0_0_,
        address0_.state as state4_0_0_,
        address0_.country as country5_0_0_,
        address0_.pincode as pincode6_0_0_,
        employee1_.employeeId as employee1_1_1_,
        employee1_.name as name2_1_1_,
        employee1_.email as email3_1_1_ 
    from
        address address0_ 
    left outer join
        emp employee1_ 
            on address0_.addressId=employee1_.employeeId 
    where
        address0_.addressId=?
.............................................................
Hibernate: 
    select
        address0_.addressId as addressI1_0_0_,
        address0_.addressLine1 as addressL2_0_0_,
        address0_.city as city3_0_0_,
        address0_.state as state4_0_0_,
        address0_.country as country5_0_0_,
        address0_.pincode as pincode6_0_0_,
        employee1_.employeeId as employee1_1_1_,
        employee1_.name as name2_1_1_,
        employee1_.email as email3_1_1_ 
    from
        address address0_ 
    left outer join
        emp employee1_ 
            on address0_.addressId=employee1_.employeeId 
    where
        address0_.addressId=?
.............................................................
1 Rahim aaa@gmail.com
1 G-21,Lohia nagar Jessore UP BD 201301
2 Rahim aaa@gmail.com
2 G-21,Lohia nagar Jessore UP BD 201301
3 Rahim aaa@gmail.com
3 G-21,Lohia nagar Jessore UP BD 201301
4 Rahim aaa@gmail.com
4 G-21,Lohia nagar Jessore UP BD 201301
