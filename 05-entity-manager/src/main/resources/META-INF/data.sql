insert into category (name) values ('Foods');
insert into category (name) values ('Drinks');
insert into category (name) values ('Fashion');
insert into category (name) values ('Electronics');
insert into category (name) values ('Furniture');
insert into category (name) values ('Mobile');
insert into category (name) values ('Laptop');

insert into product (name, price, size, stock, category_id) values ('Sushi', 10000, 'MEDIUM', 200, 1);
insert into product (name, price, size, stock, category_id) values ('Bacon', 15000, 'SMALL', 60, 1);
insert into product (name, price, size, stock, category_id) values ('Burn', 1000, 'MEDIUM', 500, 2);
insert into product (name, price, size, stock, category_id) values ('Shark', 1200, 'MEDIUM', 400, 2);
insert into product (name, price, size, stock, category_id) values ('IPhone 13 Pro', 2500000, 'MEDIUM', 20, 6);

insert into remarks (product_id, remark) values (1, 'Diet Food but not Fast Food');
insert into remarks (product_id, remark) values (1, 'Myanmar Foods, Chinese Foods and European Foods');
