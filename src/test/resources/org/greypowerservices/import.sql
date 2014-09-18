/*Units Measure*/
insert into units_measure(name, abbreviation) values ('kilo',	'kg.');
insert into units_measure(name, abbreviation) values ('unidad',	'und.');
insert into units_measure(name, abbreviation) values ('tonelada',	'tonelada.');

/*Products*/
insert into products (id, name, description) values (1,'P1', 'P1 Description');
insert into products (id, name, description) values (100,'P100', 'P100 Description');
insert into products (id, name, description) values (101,'P101', 'P101 Description');

/*Chemical Products*/
insert into chemical_products (id, unitmeasure_id, price, image_path) values (1, 1, '11.11', '/root/images1');
insert into chemical_products (id, unitmeasure_id, price, image_path) values (100, 1, '100.100', '/root/images100');
insert into chemical_products (id, unitmeasure_id, price, image_path) values (101, 1, '101.101', '/root/images101');
