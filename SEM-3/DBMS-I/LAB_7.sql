CREATE TABLE EMP(
	EID INT,
	EName VARCHAR(20),
	Department VARCHAR(20),
	Salary INT,
	JoiningDate	DATETIME,
	City VARCHAR(20)
);

INSERT INTO EMP VALUES
(101,'RAHUL','ADMIN',56000,'1990-01-01','RAJKOT'),
(102,'HARDIK','IT',18000,'1990-09-25','AHMEDABAD'),
(103,'BHAVIN','HR',25000,'1991-05-14','BARODA'),
(104,'BHOOMI','ADMIN',39000,'1991-02-08','RAJKOT'),
(105,'ROHIT','IT',17000,'1990-07-23','JAMNAGAR'),
(106,'PRIYA','IT',9000,'1990-10-18','AHMEDABAD'),
(107,'BHOOMI','HR',34000,'1991-12-25','RAJKOT');

SELECT * FROM EMP


----------PART-A (AGGREGATE FUNCTION)----------


--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
SELECT MAX(SALARY) AS MAXIMUM,MIN(SALARY) AS MINIMUM FROM EMP

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
SELECT SUM(SALARY) AS TOTAL_SAL,AVG(SALARY) AS AVERAGE_SAL FROM EMP

--3. Find total number of employees of EMPLOYEE table.
SELECT COUNT(EID) AS TOTAL_EMP FROM EMP

--4. Find highest salary from Rajkot city.
SELECT MAX(SALARY) AS MAXIMUM FROM EMP
WHERE CITY = 'RAJKOT'

--5. Give maximum salary from IT department.
SELECT MAX(SALARY) AS MAXIMUM FROM EMP
WHERE DEPARTMENT = 'IT'

--6. Count employee whose joining date is after 8-feb-91.
SELECT COUNT(EID) AS TOTAL_EMP FROM EMP
WHERE JoiningDate > '1991-02-08'

--7. Display average salary of Admin department.
SELECT AVG(SALARY) AS AVERAGE_SAL FROM EMP
WHERE DEPARTMENT = 'ADMIN'

--8. Display total salary of HR department.
SELECT SUM(SALARY) AS TOTAL_SAL FROM EMP
WHERE DEPARTMENT = 'HR'

--9. Count total number of cities of employee without duplication.
--10. Count unique departments.
--11. Give minimum salary of employee who belongs to Ahmedabad.
SELECT MIN(SALARY) AS MIN_SAL FROM EMP
WHERE CITY = 'AHMEDABAD'

--12. Find city wise highest salary.
--13. Find department wise lowest salary.
--14. Display city with the total number of employees belonging to each city.
--15. Give total salary of each department of EMP table.
--16. Give average salary of each department of EMP table without displaying the respective department
--name.