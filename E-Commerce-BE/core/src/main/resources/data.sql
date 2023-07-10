--Categories
INSERT INTO categories (name) VALUES ('Giysi');
INSERT INTO categories (name) VALUES ('Elektronik');
INSERT INTO categories (name) VALUES ('Ev & Bahçe');

--Products
INSERT INTO products (code, name, brand, category_id, image)
VALUES
('001', 'Running Shoes', 'Nike', 1, 'running_shoes.jpg'),
('002', 'Sneakers', 'Adidas', 1, 'sneakers.jpg'),
('003', 'High Heels', 'Jimmy Choo', 1, 'high_heels.jpg'),
('004', 'Loafers', 'Gucci', 1, 'loafers.jpg'),
('005', 'Boots', 'Timberland', 1, 'boots.jpg');
--Products Elektronik
INSERT INTO products (code, name, brand, category_id, image)
VALUES
('001', 'Laptop', 'Dell', 2, 'laptop.jpg'),
('002', 'Smartphone', 'Samsung', 2, 'smartphone.jpg'),
('003', 'TV', 'LG', 2, 'tv.jpg'),
('004', 'Headphones', 'Sony', 2, 'headphones.jpg'),
('005', 'Smartwatch', 'Apple', 2, 'smartwatch.jpg');
