-- 코드를 입력하세요
SELECT animal_id, animal_type, name from animal_outs where sex_upon_outcome = 'Neutered Male' or(sex_upon_outcome = 'Spayed Female') group by animal_id having animal_id = any
(select animal_id from animal_ins 
 where sex_upon_intake = 'Intact Male' or(sex_upon_intake = 'Intact Female'))
 order by animal_id;