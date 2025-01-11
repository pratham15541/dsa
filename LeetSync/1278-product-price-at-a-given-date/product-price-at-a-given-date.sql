
select distinct
  product_id,
  coalesce((select 
              new_price 
            from products p2 
            where p2.change_date<='2019-08-16'
              and p2.product_id=p1.product_id
            order by change_date desc limit 1),
            10) price
from products p1



