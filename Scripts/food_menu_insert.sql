INSERT INTO food_menu (menu_code,menu_desc,menu_lvl_code,menu_type_code,menu_parent_code) 
VALUES
  ('BF','Breakfast',1,'',NULL),
  ('DR','Dinner',1,'',NULL),
  ('ID','Idly',2,'VG','BF'),
  ('ID','Idly',3,'VG','LH'),
  ('KDS','Kal Dosai',2,'VG','BF'),
  ('KDS','Kal Dosai',3,'VG','LH'),
  ('LH','Lunch',1,'',NULL),
  ('NDS','Nice Dosai',2,'VG','BF'),
  ('NDS','Nice Dosai',3,'VG','LH'),
  ('NDSR','Nei Rost',2,'VG','BF'),
  ('NDSR','Nei Rost',3,'VG','LH'),
  ('PG','Pongal',2,'VG','BF'),
  ('PG','Pongal',3,'VG','LH'),
  ('PRI','Poori',2,'VG','BF'),
  ('PRI','Poori',3,'VG','LH');

