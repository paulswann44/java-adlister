USE paul_adlister_db;

    INSERT INTO users(username, email, password) VALUES
    ('paulswann44', 'paulswann44@gmail.com', 'Password123!!' );

insert INTO ads(user_id, title, description) VALUES
  (1, 'Test Ad 1', 'This is a description of test ad 1.')
  (2, 'Test Ad 2', 'This is a description of test ad 2.')
  (3, 'Test Ad 3', 'This is a description of test ad 3.')
  (4, 'Test Ad 4', 'This is a description of test ad 4.')
  (5, 'Test Ad 5', 'This is a description of test ad 5.');