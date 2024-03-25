USE assignment_project;
CREATE DATABASE assignment_project;
USE assignment_project;
-- Câu 1
cREATE tABLE employee (
	employee_id iNT aUTO_INCREMENT pRIMARY kEY,
    employee_last_name vARCHAR(255),
    employee_first_name vARCHAR(255),
    employee_hire_date dATE,
    employee_status tINYINT(1),
    supervisor_id iNT,
    social_security_number iNT
);

cREATE tABLE project (
	project_id iNT aUTO_INCREMENT pRIMARY kEY,
    manager_id iNT,
    project_name vARCHAR(255),
    project_start_date dATE,
    project_description tEXT,
    project_detail tEXT,
    project_completed_on dATE,
    fOREIGN kEY(Manager_id) rEFERENCES employee(Employee_id) oN dELETE cASCADE oN uPDATE cASCADE
);

cREATE tABLE project_modules (
	module_id iNT aUTO_INCREMENT pRIMARY kEY,
    project_id iNT,
    employee_id iNT,
    project_modules_date dATE,
    project_modules_completed_on dATE,
    project_modules_description tEXT,
    fOREIGN kEY(Project_id) rEFERENCES project(Project_id) oN dELETE cASCADE oN uPDATE cASCADE,
    fOREIGN kEY(Employee_id) rEFERENCES employee(Employee_id) oN dELETE cASCADE oN uPDATE cASCADE
);

cREATE tABLE work_done (
	work_done_id iNT aUTO_INCREMENT pRIMARY kEY,
    employee_id iNT,
    module_id iNT,
    work_done_date dATE,
    work_done_description tEXT,
    work_done_status tINYINT(1),
    fOREIGN kEY(Employee_id) rEFERENCES employee(Employee_id) oN dELETE cASCADE oN uPDATE cASCADE,
    fOREIGN kEY(Module_id) rEFERENCES project_modules(Module_id) oN dELETE cASCADE oN uPDATE cASCADE
);


sELECT * fROM employee;
sELECT * fROM project;
sELECT * fROM project_modules;
sELECT * fROM work_done;


iNSERT iNTO employee(Employee_last_name, employee_first_name, employee_hire_date, employee_status, supervisor_id, social_security_number)
			  vALUES('Nguyen', 'Duy', '2024-01-01', 1, 1, 1001),
					('Tran', 'Giang', '2023-01-01', 1, 2, 1002),
					('Vu', 'Hieu', '2023-05-01', 0, 1, 1003);
                    
iNSERT iNTO project(Manager_id, project_name, project_start_date, project_description, project_detail, project_completed_on)
	vALUES(1, 'book store', '2023-01-01', 'This is website sell book', 'book', '2023-05-22'),
		  (2, 'clothes store', '2023-06-01', 'This is website sell clothes', 'clothes', '2023-12-24'),
		  (3, 'pen store', '2023-07-03', 'This is website sell pen', 'pen', '2024-01-22');
          
iNSERT iNTO project_modules(Project_id, employee_id, project_modules_date, project_modules_completed_on, project_modules_description)
	vALUES(1, 1, '2023-01-01', '2023-01-22', 'Design'),
		  (2, 2, '2023-06-01', '2023-6-24', 'Code'),
		  (3, 3, '2023-07-03', '2023-07-12', 'Test');
          
iNSERT iNTO work_done(Employee_id, module_id, work_done_date, work_done_description, work_done_status)
	vALUES(1, 1, '2023-01-01', 'Design', 1),
		  (2, 2, '2023-06-01', 'Code', 0),
		  (3, 3, '2023-07-03', 'Test', 1);
          
          
-- Câu 2
DELIMITER $$ 
	CREATE PROCEDURE Remove_project()
		BEGIN
			deLETE FrOM Project
            whERE Project_completed_on < '2023-12-25';
        END $$
DELIMITER ;

CALL Remove_project();


-- Câu 3
DELIMITER $$ 
	CREATE PROCEDURE get_module(OUT p_module_id int)
		BEGIN
			SELECT module_id into p_module_id
			FROM project_modules AS PM
			JOIN project AS P ON PM.prOject_id = p.prOject_id
			where project_start_date < curdate()
				and project_modules_completed_on > curdate();
        END $$
DELIMITER ;

set @get_module = '';
call get_module(@get_module);
select @get_module;
