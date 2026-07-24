# Write your MySQL query statement below
-- select name as customer 
-- from Customers c
-- left join Orders o
-- on c.id = o.customerId
-- -- where c.id != customerId;

select name as customers
from Customers
where id not in (
    select customerId
    from Orders
);