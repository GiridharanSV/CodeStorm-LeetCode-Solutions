# Write your MySQL query statement below
select person.firstName,person.lastName,Address.city,Address.state
from person
left join Address
on person.personId=Address.personId;