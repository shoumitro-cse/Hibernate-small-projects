

create table Authors (
   id integer not null auto_increment,
    name varchar(255),
    age integer,
    primary key (id)
);


create table books (
    id integer not null auto_increment,
    title varchar(255),
    genre varchar(255),
    author varchar(255),
    primary key (id)
);



select * from Authors;
select * from books;


DROP TABLE books;
DROP TABLE Authors;