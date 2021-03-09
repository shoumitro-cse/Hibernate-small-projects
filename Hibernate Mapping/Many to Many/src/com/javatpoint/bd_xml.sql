create table answer (
    ans_id integer not null,
    answername varchar(255),
    postedBy varchar(255),
    primary key (ans_id)
);

create table answer_question (
    ans_id integer not null,
    type integer not null,
    id integer not null,
    primary key (ans_id, type)
);

create table question (
   id integer not null,
    qname varchar(255),
    primary key (id)
);

create table question_answer (
   qa_id integer not null,
    type integer not null,
    ans_id integer not null,
    primary key (qa_id, type)
) ;

alter table answer_question 
   add constraint fk_qa_ans 
   foreign key (id) 
   references question (id);


alter table answer_question 
   add constraint fk_ans_id 
   foreign key (ans_id) 
   references answer (ans_id);


alter table question_answer 
   add constraint fk_ans 
   foreign key (ans_id) 
   references answer (ans_id);


alter table question_answer 
   add constraint fk_qa 
   foreign key (qa_id) 
   references question (id);



drop table answer_question;
drop table question_answer;
drop table answer;
drop table question;

select * from answer_question;
select * from question_answer;
select * from answer;
select * from question;







Hibernate: 
    select
        max(ans_id) 
    from
        answer
Hibernate: 

    select
        max(id) 
    from
        question


-------------------
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, ans_id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, ans_id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, ans_id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, ans_id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        answer
        (answername, postedBy, ans_id) 
    values
        (?, ?, ?)

------------------------
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
        question
        (qname, id) 
    values
        (?, ?)
-----------------------------
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, type, ans_id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, type, ans_id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, type, ans_id) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, type, ans_id) 
    values
        (?, ?, ?)
