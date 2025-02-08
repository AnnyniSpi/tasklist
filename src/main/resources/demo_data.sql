insert into users (name, username, password)
values ('John Doe', 'johndoe@gmail.com', '$2y$10$D4xSS0v88qRTyWPAujS30.fj7O8SxId3dU9nFF8aAIjMZ9hl/TKwG'),
       ('Mark Smith', 'marksmith@gmail.com', '$2y$10$8Zdoog3XxmwNKlaoq.A2xeUFPl9jZTuIY/YNx3PjfRCJuQG89/Zg6');

insert into tasks (title, description, status, expiration_date)
values ('Bue cheese', null, 'TODO', '2023-01-29 12:00:00'),
       ('Do homework', 'Math, Literature', 'IN_PROGRESS', '2023-02-01 00:00:00'),
       ('Clean room', null, 'DONE', null),
       ('Call Mike', 'Ask about meeting', 'TODO', '2023-02-03 10:30:00');

insert into users_tasks(user_id, task_id)
values (2, 1),
       (2, 2),
       (2, 3),
       (1, 4);

insert into users_roles(user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');
