

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT Id, Salary
		FROM
		(
		Select Id, Salary, ROW_NUMBER() OVER(Order by Salary Desc) as Salary_Order
		from   Employee
		) DT
		WHERE DT. Salary_Order = N ;
  );
END