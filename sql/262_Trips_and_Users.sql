select 
    T.Request_at as Day,
    round((sum(if(T.status!='completed',1,0))/sum(1)),2) as 'Cancellation Rate'
from 
    Trips T
join
    Users U ON T.Client_id=U.Users_Id
where
    U.Banned='No'
    AND T.Request_at between '2013-10-01' and '2013-10-03'
group by
    T.Request_at;
