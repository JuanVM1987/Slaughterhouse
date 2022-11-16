DROP SCHEMA IF EXISTS assignment3 CASCADE;
CREATE SCHEMA assignment3;

SET SCHEMA 'assignment3';
/*create or replace function  total()
returns integer as $total$
    declare
        total integer;
        begin
        select sum(weight) into total from part e join tray t on t.id = e.tray_id
        where t.id=e.id;
        return total;
    end;

$total$ language plpgsql;

create or replace function  intserValue()
returns trigger as $value$
    begin
      insert into tray(max_weight) values (total());
    end;

$value$ language plpgsql;
*/


create table "animal"(

                         id SERIAL PRIMARY KEY,
                         origen VARCHAR(50) not null ,
                         weight DECIMAL(3) not null ,
                         arrived_date DATE not null
);

create table "tray"(
                       id SERIAL PRIMARY KEY ,
                       name VARCHAR(50) not null ,
                       max_weight INTEGER not null

);
create table "part"(
                       id SERIAL PRIMARY KEY,
                       name varchar(50) not null ,
                       weight DECIMAL(3) not null ,
                       animal_id INTEGER REFERENCES animal(id) not null ,
                       tray_id INTEGER REFERENCES tray(id) not null
);
create table "product"(
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(50) not null ,
                          weight DECIMAL(3)
);
create table "part_in_product"(
                                  id serial primary key,
                                  part_id INTEGER REFERENCES part(id) not null ,
                                  product_id INTEGER REFERENCES product(id) not null
);





-- insert Animal
insert into animal(origen,weight,arrived_date)
values ('Spain','200','2022-09-01');
insert into animal(origen,weight,arrived_date)
values ('Denmark','220','2022-09-01');
insert into animal(origen,weight,arrived_date)
values ('Spain','230','2022-09-02');
insert into animal(id,origen,weight,arrived_date)
values ('Italy','150','2022-09-02');
insert into animal(id,origen,weight,arrived_date)
values ('Spain','170','2022-09-02');

--insert tray
insert into tray(name, max_weight)
VALUES('wings','200');
insert into tray(name, max_weight)
VALUES('brest','200');
insert into tray(name, max_weight)
VALUES('leg','200');

--insert parts

insert into part(name, weight, animal_id, tray_id)
values ('wing',30,1,1);
insert into part(name, weight, animal_id, tray_id)
values ('brest',30,1,2);
insert into part(name, weight, animal_id, tray_id)
values ('leg',30,1,3);
insert into part(name, weight, animal_id, tray_id)
values ('wing',30,2,1);

insert into part(name, weight, animal_id, tray_id)
values ('wing',30,3,1);
insert into part(name, weight, animal_id, tray_id)
values ('brest',30,2,2);
insert into part(name, weight, animal_id, tray_id)
values ('leg',30,2,3);
insert into part(name, weight, animal_id, tray_id)
values ('wing',30,2,1);

--insert to package product

insert into product(name, weight)
VALUES ('wings','120');
insert into product(name, weight)
VALUES ('brest','130');
insert into product(name, weight)
VALUES ('mix',140);

--insert to join table

insert into part_in_product(part_id, product_id)
VALUES(1,1);
insert into part_in_product(part_id, product_id)
VALUES(2,2);
insert into part_in_product(part_id, product_id)
VALUES(3,3);
insert into part_in_product(part_id, product_id)
VALUES(4,1);
insert into part_in_product(part_id, product_id)
VALUES(5,3);
insert into part_in_product(part_id, product_id)
VALUES(6,1);
insert into part_in_product(part_id, product_id)
VALUES(1,3);
insert into part_in_product(part_id, product_id)
VALUES(4,1);



