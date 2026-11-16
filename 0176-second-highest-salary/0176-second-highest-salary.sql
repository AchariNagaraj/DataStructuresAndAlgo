# Write your MySQL query statement below
WITH ranking AS(
    SELECT *,
        DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
    FROM Employee
)
SELECT(
    SELECT DISTINCT salary
    From ranking
    where rnk=2
) as SecondHighestSalary;

    

