-- Create table difficulty
CREATE TABLE region (
    ID UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    code VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    regionimageurl VARCHAR(255) NULL
);