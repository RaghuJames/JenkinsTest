create table rest_user(
  user_id varchar(30) NOT NULL,
  user_pwd varchar(255) NOT NULL,
  PRIMARY KEY(USER_ID)
  
);


CREATE TABLE main_menu
(
   menu_code  VARCHAR(30)    NOT NULL,
   menu_desc  VARCHAR(255)   NOT NULL,
   PRIMARY KEY (menu_code)
);

insert into main_menu values ('SO','Soups');
insert into main_menu values ('ST','Starters');
insert into main_menu values ('MC','Main Course');
insert into main_menu values ('BR','Breads');
insert into main_menu values ('RB','Rice and Biryani');
insert into main_menu values ('FN','Fried Rice and Noodles');
insert into main_menu values ('ED','Egg Dishes');
insert into main_menu values ('BG','Beverages');



CREATE TABLE sub_menu
(
   sub_menu_code  VARCHAR(30)    NOT NULL,
   sub_menu_desc  VARCHAR(255)   NOT NULL,
   main_menu_code VARCHAR(30)    NOT NULL,
   PRIMARY KEY (sub_menu_code),
   FOREIGN KEY (main_menu_code) references main_menu(menu_code)
);


insert into sub_menu values ('VSO','VEG SOUPS','SO');
insert into sub_menu values ('NVSO','NON VEG SOUPS','SO');

insert into sub_menu values ('VST','VEG STARTERS','ST');
insert into sub_menu values ('NVST','NON VEG STARTERS','ST');
insert into sub_menu values ('NVMT','MUTTON STARTERS','ST');
insert into sub_menu values ('NVSF','SEAFOOD STARTERS','ST');
insert into sub_menu values ('NVSI','SOUTH INDIAN STARTERS','ST');

insert into sub_menu values ('VMC','VEG MAIN COURSE','MC');
insert into sub_menu values ('NVMC','NON VEG MAIN COURSE','MC');

insert into sub_menu values ('FR','FRIED RICE','FN');
insert into sub_menu values ('NO','NOODLES','FN');

insert into sub_menu values ('RI','RICE','RB');
insert into sub_menu values ('BI','BIRYANI','RB');
insert into sub_menu values ('BBI','BUCKET BIRYANI','RB');

insert into sub_menu values ('JU','JUICES','BG');
insert into sub_menu values ('MS','MILKSHAKES','BG');


CREATE TABLE food_type
(
   type_code  VARCHAR(3)    NOT NULL,
   type_desc  VARCHAR(10)   NOT NULL,
   PRIMARY KEY (type_code)
);

insert into food_type values ('VG','VEG');
insert into food_type values ('NVG','NON VEG');


CREATE TABLE items
(
   item_code  VARCHAR(5)    NOT NULL,
   item_desc  VARCHAR(255)   NOT NULL,
   item_type  VARCHAR(3)    NOT NULL,
   item_sub_menu_code VARCHAR(5)NOT NULL,
   
   
   PRIMARY KEY (item_code),
   FOREIGN KEY (item_sub_menu_code) references sub_menu(sub_menu_code),
   FOREIGN KEY (item_type) references food_type(type_code)
);

