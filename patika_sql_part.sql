-- ÖDEV 1

-- film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.
SELECT title, description FROM film;

-- film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.
SELECT * FROM film
WHERE length > 60 AND length < 75;

-- film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.
SELECT * FROM film
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);

-- customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?
SELECT last_name FROM customer
WHERE first_name = 'Mary';

-- film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.
SELECT * FROM film
WHERE length <= 50 AND NOT(rental_rate = 2.99 OR rental_rate = 4.99);



-- ÖDEV 2

-- film tablosunda bulunan tüm sütunlardaki verileri replacement cost değeri 12.99 dan büyük eşit ve 16.99 küçük olma koşuluyla sıralayınız ( BETWEEN - AND yapısını kullanınız.)
SELECT * FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.99;

-- actor tablosunda bulunan first_name ve last_name sütunlardaki verileri first_name 'Penelope' veya 'Nick' veya 'Ed' değerleri olması koşuluyla sıralayınız. ( IN operatörünü kullanınız.)
SELECT first_name, last_name FROM actor
WHERE first_name IN('Penelope', 'Nick', 'Ed');

-- film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99, 2.99, 4.99 VE replacement_cost 12.99, 15.99, 28.99 olma koşullarıyla sıralayınız. ( IN operatörünü kullanınız.)
SELECT * FROM film
WHERE rental_rate IN(0.99, 2.99, 4.99) AND replacement_cost IN(12.99, 15.99, 28.99);



-- ÖDEV 3

-- country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.
SELECT country FROM country
WHERE country LIKE 'A%a';

-- country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.
SELECT country FROM country
WHERE country LIKE '_____%n';

-- film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.
SELECT title FROM film
WHERE title ILIKE '%T%T%T%T%';

-- film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.
SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;



-- ÖDEV 4

-- film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
SELECT DISTINCT replacement_cost FROM film;

-- film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
SELECT COUNT(DISTINCT replacement_cost) FROM film;

-- film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%' AND rating = 'G';

-- country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
SELECT COUNT(country) FROM country
WHERE LENGTH(country) = 5;  -- WHERE country LIKE '_____';

-- city tablosundaki şehir isimlerinin kaçtanesi 'R' veya r karakteri ile biter?
SELECT COUNT(city) FROM city
WHERE city ILIKE '%R';



-- ÖDEV 5 

-- film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız.
SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;

-- film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci 5 filmi sıralayınız.
SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length
OFFSET 5
LIMIT 5;

-- customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız.
SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;



-- ÖDEV 6

-- film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
SELECT ROUND(AVG(rental_rate), 2) FROM film;

-- film tablosunda bulunan filmlerden kaç tanesi 'C' karekteri ile başlar?
SELECT COUNT(title) FROM film
WHERE title LIKE 'C%';

-- film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;

-- film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;



-- ÖDEV 7

-- film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
SELECT rating FROM film
GROUP BY rating;

-- film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;

-- customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?
SELECT store_id, COUNT(customer) FROM customer
GROUP BY store_id;

-- city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıra country_id bilgisini ve şehir sayısını paylaşınız.
SELECT country_id, COUNT(city) FROM city
GROUP BY country_id
ORDER BY COUNT(city) DESC
LIMIT 1;



-- ÖDEV 8

-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100) NOT NULL
);

-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, birthday, email) values ('Claudian Wetter', '1967-12-10', 'cwetter0@aol.com');
insert into employee (name, birthday, email) values ('Wilbur Housbie', null, 'whousbie1@macromedia.com');
insert into employee (name, birthday, email) values ('Jodie Deekes', '1964-07-02', 'jdeekes2@samsung.com');
insert into employee (name, birthday, email) values ('Karissa Scholer', '1981-12-01', 'kscholer3@reference.com');
insert into employee (name, birthday, email) values ('Auguste Sheridan', '1977-06-24', 'asheridan4@utexas.edu');
insert into employee (name, birthday, email) values ('Jerry Ruggen', '1957-04-19', 'jruggen5@accuweather.com');
insert into employee (name, birthday, email) values ('Vania Lebbern', '1985-02-10', 'vlebbern6@simplemachines.org');
insert into employee (name, birthday, email) values ('Redd Synan', '1989-02-28', 'rsynan7@howstuffworks.com');
insert into employee (name, birthday, email) values ('Charlton Zanre', '1982-07-19', 'czanre8@a8.net');
insert into employee (name, birthday, email) values ('Parrnell Backhouse', '1962-06-25', 'pbackhouse9@princeton.edu');
insert into employee (name, birthday, email) values ('Brig Thurber', '1956-03-09', 'bthurbera@photobucket.com');
insert into employee (name, birthday, email) values ('Miguelita Saffin', '1966-08-19', 'msaffinb@bloglines.com');
insert into employee (name, birthday, email) values ('Harley Thackham', '1990-03-27', 'hthackhamc@intel.com');
insert into employee (name, birthday, email) values ('Archie Pawelke', '1974-09-09', 'apawelked@forbes.com');
insert into employee (name, birthday, email) values ('Cathrine Sogg', '1987-10-16', 'csogge@salon.com');
insert into employee (name, birthday, email) values ('Grant Flinders', null, 'gflindersf@mac.com');
insert into employee (name, birthday, email) values ('Nester Stafford', '1981-11-03', 'nstaffordg@marketwatch.com');
insert into employee (name, birthday, email) values ('Kala Bartlomiejczyk', '1972-08-31', 'kbartlomiejczykh@vistaprint.com');
insert into employee (name, birthday, email) values ('Mar Dekeyser', '1989-06-30', 'mdekeyseri@alexa.com');
insert into employee (name, birthday, email) values ('Bartie Drain', '1969-08-04', 'bdrainj@marketwatch.com');
insert into employee (name, birthday, email) values ('Nataniel Founds', '1974-05-06', 'nfoundsk@hao123.com');
insert into employee (name, birthday, email) values ('Rodolfo Renihan', '1954-01-12', 'rrenihanl@gov.uk');
insert into employee (name, birthday, email) values ('Rafa Blackster', '1967-07-15', 'rblacksterm@buzzfeed.com');
insert into employee (name, birthday, email) values ('Ruthie Groucock', '1985-08-24', 'rgroucockn@nydailynews.com');
insert into employee (name, birthday, email) values ('Broddie Edler', '1962-04-13', 'bedlero@engadget.com');
insert into employee (name, birthday, email) values ('Daniela Costain', '1988-06-07', 'dcostainp@mediafire.com');
insert into employee (name, birthday, email) values ('Ole Ryal', null, 'oryalq@smh.com.au');
insert into employee (name, birthday, email) values ('Mellicent Carlson', '1969-06-18', 'mcarlsonr@ihg.com');
insert into employee (name, birthday, email) values ('Ian Wallwood', null, 'iwallwoods@amazonaws.com');
insert into employee (name, birthday, email) values ('Halie Thoumas', null, 'hthoumast@hostgator.com');
insert into employee (name, birthday, email) values ('Horton Paule', '1966-04-15', 'hpauleu@noaa.gov');
insert into employee (name, birthday, email) values ('Sherlock Aickin', '1960-02-07', 'saickinv@amazon.com');
insert into employee (name, birthday, email) values ('Robin MacGragh', '1958-10-25', 'rmacgraghw@msu.edu');
insert into employee (name, birthday, email) values ('Wells Fellibrand', null, 'wfellibrandx@meetup.com');
insert into employee (name, birthday, email) values ('Lemmie Nell', '1984-03-18', 'lnelly@mapquest.com');
insert into employee (name, birthday, email) values ('Iorgo Hayesman', '1990-12-01', 'ihayesmanz@ucoz.com');
insert into employee (name, birthday, email) values ('Westleigh Ower', '1956-09-23', 'wower10@ebay.co.uk');
insert into employee (name, birthday, email) values ('Batsheva Finnis', null, 'bfinnis11@accuweather.com');
insert into employee (name, birthday, email) values ('Shaylah Valentine', '1980-02-13', 'svalentine12@netvibes.com');
insert into employee (name, birthday, email) values ('Lexine Oxenham', '1988-08-30', 'loxenham13@newsvine.com');
insert into employee (name, birthday, email) values ('Flemming Santen', '1984-02-24', 'fsanten14@hc360.com');
insert into employee (name, birthday, email) values ('Julie Pennigar', '1968-07-21', 'jpennigar15@cbc.ca');
insert into employee (name, birthday, email) values ('Mattias Mougel', '1970-04-25', 'mmougel16@tinypic.com');
insert into employee (name, birthday, email) values ('Ertha Conford', '1987-08-06', 'econford17@wikipedia.org');
insert into employee (name, birthday, email) values ('Marybeth Daye', '1972-01-23', 'mdaye18@ted.com');
insert into employee (name, birthday, email) values ('Valma Berwick', '1967-07-12', 'vberwick19@youku.com');
insert into employee (name, birthday, email) values ('Hobart Rolinson', '1988-08-21', 'hrolinson1a@drupal.org');
insert into employee (name, birthday, email) values ('Nevin McAllan', '1981-12-03', 'nmcallan1b@issuu.com');
insert into employee (name, birthday, email) values ('Johnette Dykes', '1989-02-04', 'jdykes1c@nasa.gov');
insert into employee (name, birthday, email) values ('Lovell Snelle', '1960-12-23', 'lsnelle1d@java.com');

-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET birthday = '1987-05-06'
WHERE id = 2;

UPDATE employee
SET name = 'Karissa Bob',
	email = 'kbob@hotmail.com'
WHERE name = 'Karissa Scholer';

UPDATE employee
SET birthday = '1975-05-06'
WHERE birthday = '1974-05-06';

UPDATE employee
SET birthday = '1985-04-07',
	email = 'jodiedeekes@gmail.com'
WHERE email = 'jdeekes2@samsung.com';

UPDATE employee
SET name = 'Auguste Mitchy',
	email = 'mitchy@outlook.com'
WHERE id = 5;

-- Sütunların her birine göre  ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id = 7;

DELETE FROM employee
WHERE name = 'Cathrine Sogg'
RETURNING *;

DELETE FROM employee
WHERE birthday = '1989-06-30'
RETURNING name;

DELETE FROM employee
WHERE email = 'mdaye18@ted.com'
RETURNING id, name;

DELETE FROM employee
WHERE name = 'Charlton Zanre' AND email = 'czanre8@a8.net';



-- ÖDEV 9

-- city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT city.city, country.country FROM city
INNER JOIN country ON city.country_id = country.country_id;

-- customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT payment.payment_id, customer.first_name, customer.last_name FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id;

-- customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
INNER JOIN rental ON customer.customer_id = rental.customer_id;



-- ÖDEV 10

-- city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
SELECT city.city, country.country FROM city
LEFT JOIN country ON city.country_id = country.country_id;

-- customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
SELECT payment.payment_id, customer.first_name, customer.last_name FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.customer_id;

-- customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
FULL JOIN rental ON customer.customer_id = rental.customer_id;
