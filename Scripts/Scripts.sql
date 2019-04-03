create table rest_user(
  user_id varchar(30) NOT NULL,
  user_pwd varchar(255) NOT NULL,
  PRIMARY KEY(USER_ID)
  
);

create table food_type(
  type_code varchar(30) NOT NULL,
  type_desc varchar(255) NOT NULL,
  PRIMARY KEY(TYPE_CODE)
);

create table food_menu(
  menu_code varchar(30) NOT NULL,
  menu_desc varchar(255) NOT NULL,
  menu_lvl_code int,
  menu_type_code varchar(30),
  menu_parent_code int,
CONSTRAINT PK_FOOD_MENU  PRIMARY KEY(menu_code,menu_lvl_code)
);

