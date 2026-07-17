# Write your MySQL query statement below
select 
    CASE 
        WHEN id%2=1 && id=(select max(id) from seat) THEN id
        WHEN id%2=1 THEN id+1
        ELSE id-1
    END AS id,
    student
FROM seat
Order by id;