INSERT INTO genre (`id`, `name`, `description`) VALUES (0, 'genre1', 'desc1');
INSERT INTO genre (`id`, `name`, `description`) VALUES (1, 'genre2', 'desc2');


INSERT INTO book (`id`, `name`, `ISBN`, `genre_id`) VALUES (0, 'book1', 'isbn0001', 0);
INSERT INTO book (`id`, `name`, `ISBN`, `genre_id`) VALUES (1, 'book2', 'isbn0002', 0);
INSERT INTO book (`id`, `name`, `ISBN`, `genre_id`) VALUES (2, 'book3', 'isbn0003', 1);
--
INSERT INTO author (`id`, `first_name`, `last_name`, `middle_name`, `dob`) VALUES (0, 'author1', 'author1 lastname', null, null);
INSERT INTO author (`id`, `first_name`, `last_name`, `middle_name`, `dob`) VALUES (1, 'author2', 'author1 lastname', 'author1 middlename', '2023-09-13');

INSERT INTO author_books (`book_id`, `author_id`) VALUES (0, 0);
INSERT INTO author_books (`book_id`, `author_id`) VALUES (1, 0);
INSERT INTO author_books (`book_id`, `author_id`) VALUES (1, 1);
INSERT INTO author_books (`book_id`, `author_id`) VALUES (2, 1);