-- https://leetcode.com/problems/not-boring-movies/

Select * From cinema Where (id % 2) <> 0 AND description != 'boring' Order By rating DESC;