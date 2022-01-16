create TABLE users
(
    id       SERIAL PRIMARY KEY,
    name     TEXT,
    email    TEXT unique,
    password TEXT
);