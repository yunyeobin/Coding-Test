-- 코드를 입력하세요
SELECT DATE_FORMAT(datetime, '%H') HOUR, count(*) COUNT FROM ANIMAL_OUTS WHERE DATE_FORMAT(datetime, '%H')>=9 AND DATE_FORMAT(datetime, '%H')<20 GROUP BY DATE_FORMAT(datetime, '%H') ORDER BY DATE_FORMAT(datetime, '%H');