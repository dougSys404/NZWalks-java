-- Create table difficulty
CREATE TABLE DIFFICULTY (
    ID UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    NAME VARCHAR(255) NOT NULL
);