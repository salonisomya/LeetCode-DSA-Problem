# Write your MySQL query statement below
SELECT t.firstName, t.lastName, a.city, a.state
FROM Person t LEFT JOIN Address a on t.personId = a.personId;