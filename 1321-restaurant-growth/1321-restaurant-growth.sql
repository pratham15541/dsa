select visited_on,amount,round(average_amount,2)average_amount
from 
	(select 
		visited_on, 
	 sum(amount) over (order by visited_on rows 6 preceding) amount,
	 avg(amount) over (order by visited_on rows 6 preceding) average_amount
	from (select visited_on, sum(amount) amount from Customer group by visited_on) a
	) b
where datediff(visited_on,(select min(visited_on) from Customer)) >= 6;