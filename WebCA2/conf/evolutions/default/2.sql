# --- Sample dataset

# --- !Ups

insert into venues (id,name,country,city,capacity) values ( 1,'Aviva Stadium','Ireland','Dublin',50000 );
insert into venues (id,name,country,city,capacity) values ( 2,'The O2','England','London',20000 );
insert into venues (id,name,country,city,capacity) values ( 3,'Madison Square Garden','America','New York',19000 );
insert into venues (id,name,country,city,capacity) values ( 4,'Rod Laver Arena','Australia','Melbourne',15000 );
insert into venues (id,name,country,city,capacity) values ( 5,'Staples Center','America','Los Angeles',19000 );
insert into venues (id,name,country,city,capacity) values ( 6,'Barclays Center','America','Brooklyn',18000 );
insert into venues (id,name,country,city,capacity) values ( 7,'Allphones Arena','Australia','Sydney',21000 );
insert into venues (id,name,country,city,capacity) values ( 8,'Manchester Arena','England','Manchester',21000 );
insert into venues (id,name,country,city,capacity) values ( 9,'The Forum','America','Los Angeles',17500 );
insert into venues (id,name,country,city,capacity) values (10,'Wells Fargo Center','America','Philadelphia',17000 );

insert into category (id,name) values ( 1,'Music Artist');
insert into category (id,name) values ( 2,'Comedy Show');
insert into category (id,name) values ( 3,'Other');

insert into events (id,category_id,name,venue,date,price) values ( 1,1,'Danny Brown','The Forum','20-12-2017', 60);
insert into events (id,category_id,name,venue,date,price) values ( 2,1,'Gorillaz','The O2','04-01-2018', 75);
insert into events (id,category_id,name,venue,date,price) values ( 3,2,'Lee Evans','Wells Fargo Center','07-02-2018', 50);
insert into events (id,category_id,name,venue,date,price) values ( 4,2,'Jeff Dunham','Manchester Arena','08-01-2018', 65);
insert into events (id,category_id,name,venue,date,price) values ( 5,3,'Keith Barry','The O2','14-DEC-2017', 80);
insert into events (id,category_id,name,venue,date,price) values ( 6,2,'Michael McIntyre','Aviva Stadium','26-12-2017', 45);
insert into events (id,category_id,name,venue,date,price) values ( 7,1,'Kanye West','Staples Center','17-01-2018', 90);
insert into events (id,category_id,name,venue,date,price) values ( 8,1,'Darude','The Forum','11-12-2017', 60);
insert into events (id,category_id,name,venue,date,price) values ( 9,1,'Rich Chigga','The O2','02-01-2018', 75);
insert into events (id,category_id,name,venue,date,price) values (10,1,'Logic','Madison Square Garden','24-12-2017', 85);
insert into events (id,category_id,name,venue,date,price) values (11,1,'Major Lazer','Madison Square Garden','10-01-2018', 95);
insert into events (id,category_id,name,venue,date,price) values (12,2,'Jimmy Carr','Allphones Arena','18-01-2018', 75);
insert into events (id,category_id,name,venue,date,price) values (13,1,'21 Savage','Staples Center','01-02-2018', 80);
insert into events (id,category_id,name,venue,date,price) values (14,3,'Chris Angel','Rod Laver Arena','26-01-2018', 75);
insert into events (id,category_id,name,venue,date,price) values (15,1,'Kanye West','The O2','23-12-2017', 100);