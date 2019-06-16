/* Create and use database */
create database Accolite;
use Accolite;

/* Creating Tables */
create table Department(department_id int primary key,department_name varchar(30));
create table Employee(employee_id int primary key ,employee_name varchar(30), employee_age int ,department_id int);
create table EmployeeAudit(employee_id int ,employee_name varchar(30), employee_age int ,department_id int,date Date,action varchar(20));
create table EmployeeDuplicate(employee_id int primary key ,employee_name varchar(30), employee_age int ,department_id int);

/* insertions into tables */
insert into Employee values(2,"srujan",27,3);
insert into Department values(3,"cse");

/* Checking the content of tables */
select * from Department;
select * from Employee;

/* Adding a foreign key constraint */
alter table Employee add  foreign key(department_id) references Department(department_id);


/* Trigger for Before insert*/
delimiter $$
CREATE TRIGGER  befor_insert_check_age  BEFORE INSERT ON Employee 
FOR EACH ROW
BEGIN
IF NEW.employee_age < 25 THEN
SIGNAL SQLSTATE '45000'
SET MESSAGE_TEXT = 'ERROR: 
         AGE MUST BE MORE THAN 25 YEARS!';
END IF;
END $$
delimiter ;

/* Checking insertion trigger */
insert into Employee values(8,"kodrtharg",30,3);

/* Trigger for before delete*/
delimiter $$
CREATE TRIGGER save_before_delete BEFORE DELETE ON Employee
FOR EACH ROW
BEGIN
INSERT INTO EmployeeDuplicate
VALUES (OLD.employee_id, OLD.employee_name, 
        OLD.employee_age, OLD.department_id);
END $$
delimiter ; 

/* Checking deletion trigger*/
delete from Employee where employee_id=1;

/* Checking the contenets of EmployeeDuplicate*/
select * from EmployeeDuplicate;

/* Trigger for before update*/
delimiter $$
create trigger before_update_employee
Before update on Employee
for each row
begin
insert into employeeAudit
set action='before_update',
employee_id=old.employee_id,
employee_name=old.employee_name,
date=now();
end $$
delimiter ;

/* Trigger for after inser Employee */
delimiter $$
create trigger after_insert_employee
after insert on Employee
for each row
begin
insert into EmployeeAudit
set action='after_insert',
employee_id=new.employee_id,
employee_name=new.employee_name,
date=now();
end $$
delimiter ;

/* Trigger for after update Employee*/
delimiter $$
create trigger after_update_employee
after update on Employee
for each row
begin
insert into EmployeeAudit
set action='after update',
employee_id=new.employee_id,
employee_name=new.employee_name,
date=now();
end $$
delimiter ;

/* Trigger for after delete Employee*/
delimiter $$
create trigger after_delete_employee
after delete on Employee
for each row
begin
insert into EmployeeAudit
set action='after delete',
employee_id=old.employee_id,
employee_name=old.employee_name,
date=now();
end $$
delimiter ;

/* Checking content of tables*/
select * from Employee;
select * from  EmployeeAudit;
select * from EmployeeDuplicate;

SET SQL_SAFE_UPDATES = 0;

/* Updation for checking trigger */
update Employee set employee_name="Deepa" where employee_id=2;

/* Checking delete trigger */
delete from Employee where employee_id=3;

/* Checking content of tables */
select * from  EmployeeAudit;
select * from EmployeeDuplicate;