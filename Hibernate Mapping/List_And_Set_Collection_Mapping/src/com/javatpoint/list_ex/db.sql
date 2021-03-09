-- for list and bag both
create table question (
    id integer not null,
    qname varchar(255),
    primary key (id)
);

  ---for bag
create table answar (
    qid integer not null,
    answar varchar(255)
);

---for list
create table answar (
    qid integer not null,
    type integer not null,
    answar varchar(255),
    primary key (qid, type)
);

alter table answar add constraint fk_constrain_name foreign key (qid) references question (id)

DROP TABLE answar;
DROP TABLE question;

select * from answar;
select * from question;

-- Hibernate: 
--     select
--         max(id) 
--     from
--         question
-- Hibernate: 
--     insert 
--     into
--         question
--         (qname, id) 
--     values
--         (?, ?)
-- Hibernate: 
--     insert 
--     into
--         question
--         (qname, id) 
--     values
--         (?, ?)
-- Hibernate: 
--     insert 
--     into
--         answar
--         (qid, type, answar) 
--     values
--         (?, ?, ?)
-- Hibernate: 
--     insert 
--     into
--         answar
--         (qid, type, answar) 
--     values
--         (?, ?, ?)
-- Hibernate: 
--     insert 
--     into
--         answar
--         (qid, type, answar) 
--     values
--         (?, ?, ?)
-- Hibernate: 
--     insert 
--     into
--         answar
--         (qid, type, answar) 
--     values
--         (?, ?, ?)
-- 
-- 
-- 
-- 
-- 
-- 
-- 
-- 
-- 
-- 
-- 
-- Hibernate: 
--     select
--         question0_.id as id1_1_,
--         question0_.qname as qname2_1_ 
--     from
--         question question0_
-- 
-- .......... Question .........
-- Question  : What is Java?
-- Id : 1
-- .......... Answar .........
-- Hibernate: 
--     select
--         answar0_.qid as qid1_0_0_,
--         answar0_.answar as answar3_0_0_,
--         answar0_.type as type2_0_ 
--     from
--         answar answar0_ 
--     where
--         answar0_.qid=?
-- ans : Java is a programming language
-- ans : Java is a platform
-- ans : Java is a Popular Language
-- ans : Java is a Fun
-- .......................
-- 
-- 
-- 
-- .......... Question .........
-- Question  : What is Servlet?
-- Id : 2
-- .......... Answar .........
-- Hibernate: 
--     select
--         answar0_.qid as qid1_0_0_,
--         answar0_.answar as answar3_0_0_,
--         answar0_.type as type2_0_ 
--     from
--         answar answar0_ 
--     where
--         answar0_.qid=?
-- ans : Servlet is an Interface
-- ans : Servlet is an API
-- ans : Servlet is a Web API
-- ans : Servlet is Fun
-- .......................