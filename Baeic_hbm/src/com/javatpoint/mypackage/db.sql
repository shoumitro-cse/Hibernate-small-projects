-- create table Employee  
-- (  
--     id int ,  
--     firstName varchar (255),  
--     lastName varchar (255)
-- ); 
-- 
-- INSERT INTO Employee VALUES (101, 'Gaurav', 'Gopa');  
-- INSERT INTO Employee VALUES (102, 'Ronit', 'Rajon');  
-- INSERT INTO Employee VALUES (103, 'Rahul', 'Rubi'); 

-- create table Employee (
--    id integer not null,
--     firstName varchar(255),
--     lastName varchar(255),
--     primary key (id)
-- );
-- DROP TABLE Employee;


-- alter table CUSTOMERS add (CUSTOMER_DEP varchar2(50),CUSTOMER_SUB varchar2(50));
-- alter table CUSTOMERS modify (CUSTOMER_AGE number(10),CUSTOMER_DEP varchar2(100));
-- alter table CUSTOMERS drop column CUSTOMER_SUB;
-- alter table Employee drop column lastName_hhhhh;
-- alter table CUSTOMERS rename column CUSTOMER_SUB_DEP  to CUSTOMER_SUB ;
-- alter table CUS  rename to CUSTOMERS ;

create table Employee  
(  
    id int 
); 

 create table hibernate_sequence (
       next_val bigint
    );
    
 insert into hibernate_sequence values ( 1 )