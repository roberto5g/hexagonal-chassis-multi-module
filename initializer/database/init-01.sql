-- DO $$
-- BEGIN
--     -- Verificar e criar usuário 'myapp' se não existir
--     IF NOT EXISTS (SELECT FROM pg_catalog.pg_user WHERE usename = 'myapp') THEN
--         CREATE USER myapp WITH PASSWORD 'myapp';
-- END IF;
--     -- Verificar e criar banco de dados 'boardservice' se não existir
--     IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'boardservice') THEN
--         CREATE DATABASE boardservice;
-- END IF;
-- END $$;

DROP SCHEMA IF EXISTS myapp CASCADE;
CREATE SCHEMA myapp;

--GRANT ALL PRIVILEGES ON DATABASE boardservice TO myapp;

--\c boardservice;

-- CREATE SCHEMA IF NOT EXISTS myapp AUTHORIZATION myapp;
-- GRANT ALL ON SCHEMA myapp TO myapp;

DROP TABLE IF EXISTS myapp.boardservice;
CREATE TABLE myapp.boards (
    id serial4 NOT NULL,
    owner_id BIGINT NULL,
    title varchar(255) NULL,
    description varchar(255) NULL,
    created_at timestamp(6) NULL,
    updated_at timestamp(6) NULL,
    CONSTRAINT pk_boards PRIMARY KEY (id)
    );
--
-- ALTER TABLE IF EXISTS myapp.boards OWNER TO myapp;
-- GRANT ALL ON TABLE myapp.boards TO myapp;