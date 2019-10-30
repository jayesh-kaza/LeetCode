select s1.* from stadium as s1, stadium as s2, stadium as s3
where ((s2.id = s1.id + 1 and s3.id =s1.id + 2)
or (s2.id = s1.id - 1 and s3.id = s1.id + 1)
or (s2.id = s1.id - 2 and s3.id = s1.id - 1))
and s1.people >= 100
and s2.people >= 100
and s3.people >= 100
Group by(s1.id);