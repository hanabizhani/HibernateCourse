UPDATE film set rating = 'PG13'
WHERE rating = 'PG-13';

SELECT * FROM film 
WHERE rating = 'PG-13';

ALTER TABLE film_text ADD CONSTRAINT fk_film_text_film
 FOREIGN KEY (film_id) REFERENCES film(film_id);