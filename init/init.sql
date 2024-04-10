--サンプルテーブル
DROP TABLE IF EXISTS sample_tbl;
CREATE TABLE sample_tbl (
    id SERIAL PRIMARY KEY,
    text VARCHAR
);

--ユーザーテーブル
DROP TABLE IF EXISTS users_tbl;
CREATE TABLE users_tbl (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    bio TEXT,
    profile_picture VARCHAR(255),
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- ポストテーブル (Posts)
DROP TABLE IF EXISTS posts_tbl;
CREATE TABLE posts_tbl (
    post_id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users_tbl(user_id)
);

-- フォローテーブル (Follows)
DROP TABLE IF EXISTS follows_tbl;
CREATE TABLE follows_tbl (
    follow_id SERIAL PRIMARY KEY,
    follower_id INTEGER NOT NULL,
    followed_id INTEGER NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (follower_id) REFERENCES users_tbl(user_id),
    FOREIGN KEY (followed_id) REFERENCES users_tbl(user_id)
);

-- メッセージテーブル (Messages)
DROP TABLE IF EXISTS messages_tbl;
CREATE TABLE messages_tbl (
    message_id SERIAL PRIMARY KEY,
    sender_id INTEGER NOT NULL,
    receiver_id INTEGER NOT NULL,
    content TEXT NOT NULL,
    read BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES users_tbl(user_id),
    FOREIGN KEY (receiver_id) REFERENCES users_tbl(user_id)
);