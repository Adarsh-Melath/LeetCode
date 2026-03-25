CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N=N-1;
  RETURN (
    SELECT Distinct salary from Employee ORDER BY salary DESC LIMIT 1 offset  N
  );
END