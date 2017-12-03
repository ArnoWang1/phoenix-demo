CREATE TABLE IF NOT EXISTS user_db.user (
  id BIGINT PRIMARY KEY,
  username VARCHAR,
  password VARCHAR,
  create_date DATE
);

CREATE TABLE IF NOT EXISTS user_db.user_detail (
  username VARCHAR PRIMARY KEY ,
  nickname VARCHAR,
  email VARCHAR,
  blog VARCHAR,
  create_date DATE
);

CREATE SEQUENCE IF NOT EXISTS user_db.user_seq CACHE 10;