CREATE TABLE posts(
    id BIGSERIAL PRIMARY KEY ,
    title varchar(255) UNIQUE NOT NULL,
    content TEXT NOT NULL,
    created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    likes INTEGER NOT NULL DEFAULT 0
);

INSERT INTO posts(title, content,created,likes) values ('First post', 'This is first post', CURRENT_TIMESTAMP,10),
                                                       ('Second post', 'This is scond post', CURRENT_TIMESTAMP,3);
