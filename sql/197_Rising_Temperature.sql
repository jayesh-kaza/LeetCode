# Write your MySQL query statement below
SELECT
    Weather.Id
FROM
    Weather
        JOIN
    Weather w ON DATEDIFF(weather.RecordDate, w.RecordDate) = 1
        AND weather.Temperature > w.Temperature
;
