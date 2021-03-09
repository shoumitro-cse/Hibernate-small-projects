

-- auto-generated definition
create table employee103
(
  id   int auto_increment primary key,
  name varchar(255) null
);


create table regularemployee103
(
  bonus      int   null,
  salary     float null,
  ID_foregin int   not null primary key,
  constraint FK_4ase48t1754shpnwdx0yiqrxg foreign key (ID_foregin) references employee103 (id)
);

-- auto-generated definition
create table contractemployee103
(
  contract_duration varchar(255) null,
  pay_per_hour      float        null,
  ID_foregin_con    int  not null primary key,
  constraint FK_q3hd2st7cgv11248gto2ji91e foreign key (ID_foregin_con) references employee103 (id)
);



Hibernate: 
    insert 
    into
        employee103
        (name) 
    values
        (?)
Hibernate: 
    insert 
    into
        employee103
        (name) 
    values
        (?)
Hibernate: 
    insert 
    into
        regularemployee103
        (bonus, salary, ID) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        employee103
        (name) 
    values
        (?)
Hibernate: 
    insert 
    into
        contractemployee103
        (contract_duration, pay_per_hour, ID) 
    values
        (?, ?, 


select * from contractemployee103;
select * from regularemployee103;
select * from employee103;


DROP TABLE contractemployee103;
DROP TABLE regularemployee103;
DROP TABLE employee103;

desc contractemployee103;
desc regularemployee103;
desc employee103;