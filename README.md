## Behsazan HibernateCourse
![Behsazan HibernateCourse](https://hibernate.org/images/hibernate-logo.svg)

#### Excersise 1:  hibernate bidirectional association

List of relations in database:

- Table film has `one to many` relation with  film_actor (fk name: fk_film_actor_film)
        ![film_actor_film](https://github.com/hanabizhani/HibernateCourse/blob/main/sakila-db/relations/film_actor_film.jpg?raw=true)

  **Change List:**
  - [FilmActorEntity.java](https://github.com/hanabizhani/HibernateCourse/blob/main/spring-boot-hibernate/src/main/java/com/sematec/model/FilmActorEntity.java)
  - [FilmEntity.java](https://github.com/hanabizhani/HibernateCourse/blob/main/spring-boot-hibernate/src/main/java/com/sematec/model/FilmEntity.java)



- Table actor ha `one to many` relation with  film_actor (fk name: fk_film_actor_actor)
  ![film_actor_actor](https://github.com/hanabizhani/HibernateCourse/blob/main/sakila-db/relations/film_actor_actor.jpg?raw=true)

  **Change List:**
  - [FilmActorEntity.java](https://github.com/hanabizhani/HibernateCourse/blob/main/spring-boot-hibernate/src/main/java/com/sematec/model/FilmActorEntity.java)
  - [ActorEntity.java](https://github.com/hanabizhani/HibernateCourse/blob/main/spring-boot-hibernate/src/main/java/com/sematec/model/ActorEntity.java)

- Table film_text ha `one to one` relation with  film (fk name: fk_film_text_film)
  ![film_text_film](https://github.com/hanabizhani/HibernateCourse/blob/main/sakila-db/relations/film_text_film.jpg?raw=true)

  **Change List:**
  - [FilmEntity.java](https://github.com/hanabizhani/HibernateCourse/blob/main/spring-boot-hibernate/src/main/java/com/sematec/model/FilmEntity.java)
  - [FilmTextEntity.java](https://github.com/hanabizhani/HibernateCourse/blob/main/spring-boot-hibernate/src/main/java/com/sematec/model/FilmTextEntity.java)


