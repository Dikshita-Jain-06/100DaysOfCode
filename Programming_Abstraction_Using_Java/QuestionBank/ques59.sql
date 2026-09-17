create table Students(
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK(age BETWEEN 17 and 60),
    course varchar(50) 
);


INSERT INTO Students(student_id,student_name,email,age,course)
VALUES
(101, 'Amit', 'amit@gmail.com', 20, 'CSE'),
(102, 'Neha', 'neha@gmail.com', 21, 'ECE'),
(103, 'Rahul', 'rahul@gmail.com', 22, 'CSE');

select * from students order by student_id ASC;
