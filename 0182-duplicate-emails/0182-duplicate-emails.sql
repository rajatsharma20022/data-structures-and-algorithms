# Write your MySQL query statement below
select Distinct a.email as "Email"
from Person as a 
Inner join Person as b
on a.email=b.email
and a.id <> b.id;