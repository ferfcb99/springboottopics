-- =============================================================================
-- INSERTAR AUTORES
-- Campos: name, last_name, age, street
-- =============================================================================

-- ID 1
INSERT INTO authors (name, last_name, age, street) 
VALUES ('John Ronald Reuel', 'Tolkien', 81, 'Bournemouth Road');

-- ID 2
INSERT INTO authors (name, last_name, age, street) 
VALUES ('George Raymond Richard', 'Martin', 77, 'Santa Fe Ave');

-- ID 3
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Joanne', 'Rowling', 60, 'Church Street');

-- ID 4
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Brandon', 'Sanderson', 50, 'Lincoln Lane');

-- ID 5
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Stephen', 'King', 78, 'West Broadway');

-- ID 6
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Isaac', 'Asimov', 72, 'West End Avenue');

-- ID 7
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Agatha', 'Christie', 85, 'Winterbrook Lane');

-- ID 8
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Neil', 'Gaiman', 65, 'Portsmouth Road');

-- ID 9
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Terry', 'Pratchett', 66, 'Beaconsfield Way');

-- ID 10
INSERT INTO authors (name, last_name, age, street) 
VALUES ('Arthur', 'Conan Doyle', 71, 'Baker Street');


-- =============================================================================
-- INSERTAR LIBROS
-- Campos: title, pages, editorial, size, is_best_seller, is_multilanguage, author_id
-- =============================================================================

-- Author 1: J.R.R. Tolkien
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Hobbit', 310, 'George Allen & Unwin', 'Medium', true, true, 1);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Fellowship of the Ring', 423, 'George Allen & Unwin', 'Large', true, true, 1);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Two Towers', 352, 'George Allen & Unwin', 'Large', true, true, 1);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Return of the King', 416, 'George Allen & Unwin', 'Large', true, true, 1);

-- Author 2: George R.R. Martin
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('A Game of Thrones', 694, 'Bantam Books', 'Large', true, true, 2);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('A Clash of Kings', 768, 'Bantam Books', 'Large', true, true, 2);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('A Storm of Swords', 973, 'Bantam Books', 'Large', true, true, 2);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('A Feast for Crows', 753, 'Bantam Books', 'Large', false, true, 2);

-- Author 3: J.K. Rowling
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Harry Potter and the Sorcerer''s Stone', 309, 'Scholastic', 'Medium', true, true, 3);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Harry Potter and the Chamber of Secrets', 341, 'Scholastic', 'Medium', true, true, 3);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Harry Potter and the Prisoner of Azkaban', 435, 'Scholastic', 'Medium', true, true, 3);

-- Author 4: Brandon Sanderson
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Final Empire', 541, 'Tor Books', 'Large', true, false, 4);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Well of Ascension', 590, 'Tor Books', 'Large', false, false, 4);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Hero of Ages', 724, 'Tor Books', 'Large', true, false, 4);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Way of Kings', 1007, 'Tor Books', 'Pocket', true, true, 4);

-- Author 5: Stephen King
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Shining', 447, 'Doubleday', 'Medium', true, true, 5);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('It', 1138, 'Viking', 'Large', true, true, 5);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Carrie', 199, 'Doubleday', 'Small', false, true, 5);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Misery', 310, 'Viking', 'Medium', true, false, 5);

-- Author 6: Isaac Asimov
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Foundation', 255, 'Gnome Press', 'Small', true, true, 6);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Foundation and Empire', 247, 'Gnome Press', 'Small', false, true, 6);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Second Foundation', 250, 'Gnome Press', 'Small', false, true, 6);

-- Author 7: Agatha Christie
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('And Then There Were None', 272, 'Collins Crime Club', 'Small', true, true, 7);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Murder on the Orient Express', 256, 'Collins Crime Club', 'Small', true, true, 7);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Murder of Roger Ackroyd', 312, 'Collins Crime Club', 'Medium', false, false, 7);

-- Author 8: Neil Gaiman
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('American Gods', 465, 'HarperTorch', 'Large', true, true, 8);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Coraline', 163, 'HarperCollins', 'Small', true, true, 8);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Neverwhere', 370, 'BBC Books', 'Medium', false, false, 8);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Ocean at the End of the Lane', 181, 'William Morrow', 'Small', true, false, 8);

-- Author 9: Terry Pratchett
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Color of Magic', 206, 'Colin Smythe', 'Small', false, true, 9);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Mort', 304, 'Gollancz', 'Medium', true, false, 9);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('Guards! Guards!', 416, 'Gollancz', 'Medium', true, true, 9);

-- Author 10: Arthur Conan Doyle
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('A Study in Scarlet', 144, 'Ward Lock & Co', 'Small', true, true, 10);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Sign of the Four', 128, 'Spencer Blackett', 'Small', false, true, 10);
INSERT INTO books (title, pages, editorial, size, is_best_seller, is_multilanguage, author_id) 
VALUES ('The Hound of the Baskervilles', 256, 'George Newnes', 'Medium', true, true, 10);



INSERT INTO category (name) VALUES ('Electronics');
INSERT INTO category (name) VALUES ('Clothing');
INSERT INTO category (name) VALUES ('Home & Kitchen');
INSERT INTO category (name) VALUES ('Sports & Outdoors');
INSERT INTO category (name) VALUES ('Books & Media');

INSERT INTO product_size (name) VALUES ('Small');
INSERT INTO product_size (name) VALUES ('Medium');
INSERT INTO product_size (name) VALUES ('Large');
INSERT INTO product_size (name) VALUES ('Extra Large');
INSERT INTO product_size (name) VALUES ('Standard');
INSERT INTO product_size (name) VALUES ('One Size');

INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Smartphone X', 'TechCorp', 699.99, 10, 50, 1, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Running Shoes', 'SpeedFit', 89.50, 0, 120, 4, 3);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Cotton T-Shirt', 'BasicWear', 15.00, 5, 200, 2, 2);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Coffee Maker', 'BrewMaster', 45.99, 15, 30, 3, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Fantasy Novel', 'PaperPress', 12.99, 0, 85, 5, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Winter Jacket', 'ChillGear', 120.00, 20, 45, 2, 4);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Yoga Mat', 'ZenCore', 25.50, 5, 100, 4, 6);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Bluetooth Speaker', 'SoundWave', 55.00, 10, 75, 1, 1);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Blender Pro', 'MixIt', 89.99, 0, 40, 3, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Graphic Novel', 'PaperPress', 18.50, 2, 60, 5, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Wireless Mouse', 'ClickTech', 22.99, 5, 150, 1, 1);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Denim Jeans', 'StyleCo', 49.99, 10, 90, 2, 2);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Tennis Racket', 'CourtKing', 110.00, 15, 25, 4, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Microwave Oven', 'HeatWave', 150.00, 25, 15, 3, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Chef Cookbook', 'CulinaryArts', 30.00, 0, 40, 5, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Smart Watch', 'TechCorp', 199.99, 10, 65, 1, 1);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Sweatpants', 'BasicWear', 29.50, 0, 110, 2, 3);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Dumbbell Set', 'IronGym', 45.00, 5, 55, 4, 6);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('Toaster', 'BrewMaster', 24.99, 0, 80, 3, 5);
INSERT INTO product (name, brand, price, discount, quantity_available, category_id, product_size_id) VALUES ('History Encyclopedia', 'EduBooks', 45.00, 20, 20, 5, 5);