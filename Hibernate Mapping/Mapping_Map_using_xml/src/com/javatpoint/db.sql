
create table question736 (
   id integer not null,
    name varchar(255),
    username varchar(255),
    primary key (id)
);

create table answer736 (
    questionid integer not null,
    answer varchar(255) not null,
    username varchar(255),
    primary key (questionid, answer)
);



alter table answer736 add constraint fk_const_answer foreign key (questionid) references question736 (id)


select * from question736;
select * from answer736;

drop table answer736;
drop table question736;

-----------------------other ....................
Hibernate: 
    select
        max(id) 
    from
        question736
Hibernate: 
    insert 
    into
        question736
        (name, username, id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        question736
        (name, username, id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer736
        (questionid, answer, username) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer736
        (questionid, answer, username) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer736
        (questionid, answer, username) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer736
        (questionid, answer, username) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer736
        (questionid, answer, username) 
    values
        (?, ?, ?)



Hibernate: 
    select
        question0_.id as id1_1_,
        question0_.name as name2_1_,
        question0_.username as username3_1_ 
    from
        question736 question0_
question id:1
question name:What is Java?
question posted by:Alok
..............answers...............
Hibernate: 
    select
        answers0_.questionid as question1_0_0_,
        answers0_.username as username3_0_0_,
        answers0_.answer as answer2_0_ 
    from
        answer736 answers0_ 
    where
        answers0_.questionid=?
answer name:Java is a programming language
answer posted by:John Milton
answer name:Java is a platform
answer posted by:Ashok Kumar
question id:2
question name:What is Servlet?
question posted by:Jai Dixit
..............answers...............
Hibernate: 
    select
        answers0_.questionid as question1_0_0_,
        answers0_.username as username3_0_0_,
        answers0_.answer as answer2_0_ 
    from
        answer736 answers0_ 
    where
        answers0_.questionid=?
answer name:Servlet is a package
answer posted by:Rahul Kumar
answer name:Servlet technology is a server side programming
answer posted by:John Milton
answer name:Servlet is an Interface
answer posted by:Ashok Kumar