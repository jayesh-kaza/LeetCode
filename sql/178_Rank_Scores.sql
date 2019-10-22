
SELECT [Score]      
      ,DENSE_RANK() OVER (ORDER BY [Score] DESC) AS [RANK]      
FROM [Scores]
