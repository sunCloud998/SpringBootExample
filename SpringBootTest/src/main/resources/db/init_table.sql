-- create table if not exists users (id int not null primary key auto_increment,username varchar(100),password varchar(100),status int);

create TABLE game_play_config
(
  id bigserial primary key,
  game_play_title VARCHAR (256),
  destination_id text,
  destination_name text,
  show_id text,
  show_name text,
  status int,
  create_time TIMESTAMP DEFAULT now()
);
