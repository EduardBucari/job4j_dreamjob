create TABLE if not exists post
(
    id          SERIAL PRIMARY KEY,
    name        TEXT,
    description TEXT,
    create_date timestamp default localtimestamp
);