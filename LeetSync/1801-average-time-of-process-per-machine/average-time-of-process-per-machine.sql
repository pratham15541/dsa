SELECT a.machine_id,round(avg(b.timestamp-a.timestamp),3) as processing_time
FROM Activity a,Activity b
WHERE a.machine_id=b.machine_id and a.activity_type='start' and b.activity_type='end'
GROUP BY a.machine_id