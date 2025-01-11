# Write your MySQL query statement below
select activity_date as day,count(user_id) as active_users from Activity group by activity_date having activity_type = 'open_session'