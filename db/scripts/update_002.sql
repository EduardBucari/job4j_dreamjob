create TABLE candidate
(
    id          SERIAL PRIMARY KEY,
    name        TEXT,
    position    varchar(200),
    create_date timestamp default localtimestamp,
    city_id     int references city (id)
);