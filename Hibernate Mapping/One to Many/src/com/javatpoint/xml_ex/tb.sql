
create table question (
     id integer not null,
      qname varchar(255),
      primary key (id)
  );

create table answer (
   id integer not null,
    answername varchar(255),
    postedBy varchar(255),
    qid integer,
    type integer,
    primary key (id)
);

alter table answer 
   add constraint fk_const_answer 
   foreign key (eid) 
   references question (id);


drop  table answer;
drop  table question;

select * from question;
select * from answer;


Hibernate: 
    select
        max(id) 
    from
        question

Hibernate: 
    select
        max(id) 
    from
        answer

Hibernate: 
    insert 
    into
        question
        (qname, id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        question
        (qname, id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, id) 
    values
        (?, ?, ?)
Hibernate: 
    update
        answer 
    set
        eid=?,
        type=? 
    where
        id=?
Hibernate: 
    update
        answer 
    set
        eid=?,
        type=? 
    where
        id=?
Hibernate: 
    update
        answer 
    set
        eid=?,
        type=? 
    where
        id=?
Hibernate: 
    update
        answer 
    set
        eid=?,
        type=? 
    where
        id=?



Hibernate: 
    select
        question0_.id as id1_1_,
        question0_.qname as qname2_1_ 
    from
        question question0_
Question Name: What is Java?

Hibernate: 
    select
        answers0_.eid as eid4_0_0_,
        answers0_.id as id1_0_0_,
        answers0_.type as type5_0_,
        answers0_.id as id1_0_1_,
        answers0_.answername as answerna2_0_1_,
        answers0_.postedBy as postedBy3_0_1_ 
    from
        answer answers0_ 
    where
        answers0_.eid=?
Java is a programming language:Ravi Malik
Java is a platform:Sudhir Kumar


Question Name: What is Servlet?

Hibernate: 
    select
        answers0_.eid as eid4_0_0_,
        answers0_.id as id1_0_0_,
        answers0_.type as type5_0_,
        answers0_.id as id1_0_1_,
        answers0_.answername as answerna2_0_1_,
        answers0_.postedBy as postedBy3_0_1_ 
    from
        answer answers0_ 
    where
        answers0_.eid=?

