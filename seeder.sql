USE paul_adlister_db;

    INSERT INTO users (username, email, password) VALUES
 ('bob123', 'bob@gmaul.com', 'letmein');

INSERT ads(user_id, title, description) VALUES
    (1, 'Test Ad 1', 'Test Ad Description 1')
    (2, 'Test Ad 2', 'Test Ad Description 2')
    (3, 'Test Ad 3', 'Test Ad Description 3')
    (4, 'Test Ad 4', 'Test Ad Description 4')