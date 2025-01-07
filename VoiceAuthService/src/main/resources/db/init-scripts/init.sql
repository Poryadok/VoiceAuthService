-- Создание таблицы roles, если она не существует
CREATE TABLE IF NOT EXISTS roles (
                                     id SERIAL PRIMARY KEY,
                                     name VARCHAR(50) NOT NULL
);

-- Вставка данных в таблицу roles
INSERT INTO roles (id, name) VALUES (1, 'ADMIN')
ON CONFLICT (id) DO NOTHING;  -- Чтобы избежать дублирования, если данные уже существуют

INSERT INTO roles (id, name) VALUES (2, 'USER')
ON CONFLICT (id) DO NOTHING;  -- Чтобы избежать дублирования