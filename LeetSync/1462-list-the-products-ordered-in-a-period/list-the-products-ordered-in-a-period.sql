# Write your MySQL query statement below
with tmp as (
    select product_id, sum(unit) as sumu
    from orders where MONTH(order_date) = 2 and YEAR(order_date) = 2020 
    group by product_id 
    having sumu >= 100
)
select p.product_name, t.sumu as unit 
from Products p join tmp t 
on p.product_id = t.product_id;