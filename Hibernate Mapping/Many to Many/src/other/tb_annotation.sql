create table question (
    id integer not null,
     qname varchar(255),
     primary key (id)
 );

 create table question_answer (
    qa_id integer not null,
     ans_id integer not null
 );

create table answer (
    ans_id integer not null,
     answername varchar(255),
     postedBy varchar(255),
     primary key (ans_id)
 );

 alter table question_answer 
    add constraint fk_ans 
    foreign key (ans_id) 
    references answer (ans_id);

 alter table question_answer 
    add constraint fk_qa 
    foreign key (qa_id) 
    references question (id);


select * from question;
select * from question_answer;
select * from answer;

drop table question_answer;
drop table question;
drop table answer;





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
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, ans_id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, ans_id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, ans_id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        question_answer
        (qa_id, ans_id) 
    values
        (?, ?)