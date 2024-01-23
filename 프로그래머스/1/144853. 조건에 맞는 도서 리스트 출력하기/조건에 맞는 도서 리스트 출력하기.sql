-- 코드를 입력하세요

SELECT book_id, date_format(published_date, '%Y-%m-%d') from book where category like '인문' group by published_date having published_date between '2021-01-01'and'2021-12-31' order by published_date;
