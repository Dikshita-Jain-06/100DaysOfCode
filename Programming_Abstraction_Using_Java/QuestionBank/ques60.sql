CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10,2)
);

INSERT INTO Employees
(employee_id, employee_name, department, salary)
VALUES
(101, 'Amit', 'CSE', 50000),
(102, 'Neha', 'ECE', 45000),
(103, 'Rahul', 'CSE', 60000),
(104, 'Simran', 'IT', 55000);

update Employees 
set salary = salary*1.10 
where department = 'CSE';

select employee_name,department, salary
from Employees
order by employee_id ASC;