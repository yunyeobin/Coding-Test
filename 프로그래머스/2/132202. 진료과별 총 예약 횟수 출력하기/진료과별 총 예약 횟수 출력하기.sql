-- 코드를 입력하세요
SELECT mcdp_cd '진료과코드', count(mcdp_cd) '5월예약건수' 
from appointment 
where date_format(apnt_ymd,'%m') = '05' 
group by mcdp_cd 
order by count(apnt_no) asc, mcdp_cd asc;