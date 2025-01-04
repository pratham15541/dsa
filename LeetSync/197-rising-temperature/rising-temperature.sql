# Write your MySQL query statement below
select t.id from Weather y join Weather t where DATEDIFF(t.recordDate,y.recordDate) = 1 and t.temperature > y.temperature;