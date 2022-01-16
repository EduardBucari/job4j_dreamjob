create TABLE if not exists post
(
    id          SERIAL PRIMARY KEY,
    name        TEXT,
    description TEXT,
    create_date timestamp default localtimestamp
);

create TABLE if not exists candidate
(
    id          SERIAL PRIMARY KEY,
    name        TEXT,
    position    varchar(200),
    create_date timestamp default localtimestamp,
    city_id     int references city (id)
);