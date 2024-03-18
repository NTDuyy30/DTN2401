use testingsystem;

-- Câu 1
insert into question(title, Question_Category_ID, type, status, level_ID, version, author_ID, create_time)
			 values ('OOP là gì', 1, 'Multiple-Choice', 0, 1, 1, 16, '2024-03-17'),
					('Hibernate là gì', 2, 'Essay', 1, 2, 1, 8, '2024-03-17'),
					('.Net là gì', 3, 'Multiple-Choice', 0, 4, 1, 15, '2024-03-17'),
					('C# basic là gì', 4, 'Essay', 1, 3, 1, 11, '2024-03-17'),
					('Học tiếng anh chuyên ngành như thế nào', 5, 'Multiple-Choice', 1, 3, 1, 10, '2024-03-17'),
					('SQL là gì', 6, 'Essay', 1, 4, 1, 7, '2024-03-17'),
					('OOP Có mấy tính chất', 1, 'Multiple-Choice', 1, 3, 1, 5, '2024-03-17'),
					('String trong sql là kiểu dữ liệu nào', 6, 'Multiple-Choice', 0, 2, 1, 9, '2024-03-17'),
					('Tính kế thừa là gì', 1, 'Essay', 0, 7, 1, 2, '2024-03-17'),
					('Tính đa hình là gì', 1, 'Multiple-Choice', 1, 1, 1, 6, '2024-03-17');
 
 
 -- Câu 2
 -- Cách 1
select level_id, count(level_id) 
from question
group by level_id
having level_id = 3;

-- Cách 2
select level_id, count(level_id) from question where level_id = 3;


-- Câu 3
select * from question
where status = 1;


-- Câu 4
select * from user
where gender = 'M' and (date_of_birth between '1981-01-15' and '1997-10-20');