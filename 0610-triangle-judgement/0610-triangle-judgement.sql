# Write your MySQL query statement below
SELECT 
x,y,z,
    (CASE 
        WHEN x=y && y=z
            THEN 'Yes'
        WHEN x<=y && z<=y && x+z>y 
            THEN 'Yes'
        WHEN x<=z && y<=z && x+y>z
            THEN 'Yes'
        WHEN y<=x && z<=x && y+z>x
            THEN 'Yes'
        ELSE 'No'
    END) as triangle
FROM Triangle;