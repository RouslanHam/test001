CREATE TABLE genre
(
    id          BIGINT      not null,
    name        VARCHAR(30) not null,
    description VARCHAR(256),
    created_at  DATETIME,
    updated_at  DATETIME,
    primary key (id)
);

CREATE TABLE book
(
    id         BIGINT       not null,
    name       VARCHAR(256) not null,
    ISBN       VARCHAR(50),
    genre_id   BIGINT,
    created_at DATETIME,
    updated_at DATETIME,
    primary key (id),
    foreign key (genre_id) references genre (id)
);

CREATE TABLE author
(
    id          BIGINT       not null,
    first_name  VARCHAR(256) not null,
    last_name   VARCHAR(256) not null,
    middle_name VARCHAR(256),
    dob         DATE,
    created_at  DATETIME,
    updated_at  DATETIME,
    primary key (id)
);

CREATE TABLE author_books
(
    book_id   BIGINT not null,
    author_id BIGINT not null,
    foreign key (book_id) references book (id),
    foreign key (author_id) references author (id)
);

