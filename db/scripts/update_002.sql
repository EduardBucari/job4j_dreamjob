create TABLE candidates
(
    id     SERIAL PRIMARY KEY,
    name   TEXT,
    cityId int references cities (id),
    create timestamp
);