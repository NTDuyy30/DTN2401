drop database if exists final_exam_java;
create database if not exists final_exam_java;

use final_exam_java;

drop table if exists users;
create table if not exists users (
	id int auto_increment primary key,
    fullname varchar(255),
    email varchar(255),
    password varchar(255),
    exp_in_year tinyint,
    pro_skill enum('DEV', 'TEST', 'JAVA', 'SQL'),
    project_id int,
    role enum('MANAGER', 'EMPLOYEE')
);

insert into users(fullname, email, `password`, exp_in_year, pro_skill, project_id, `role`)
values ('Nguyễn Tiến Duy', 'ntd@gmail.com', '123456', 5, null, 1, 'MANAGER'),
	   ('Nguyễn Thành Đạt', 'ntdat@gmail.com', '654321', null, 'JAVA', 2, 'EMPLOYEE'),
	   ('Nguyễn Hoàng Giang', 'nhg@gmail.com', '111111', null, 'TEST', 3, 'EMPLOYEE'),
	   ('Vũ Hữu Hiếu', 'vhh@gmail.com', '222222', null, 'SQL', 1, 'EMPLOYEE'),
	   ('Nguyễn Đình Hoàng', 'ndh@gmail.com', '111111', 4, null, 2, 'MANAGER'),
	   ('Phạm Quang Khải', 'pqk@gmail.com', '111111', null, 'DEV', 3, 'EMPLOYEE'),
	   ('Stephen Curry', 'curry@gmail.com', '111111', 7, null, 4, 'MANAGER');
       
select * from users;

SELECT * FROM `users` where project_id = 2 and role = 'EMPLOYEE';