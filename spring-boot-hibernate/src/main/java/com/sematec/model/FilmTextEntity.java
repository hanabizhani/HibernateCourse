package com.sematec.model;

import javax.persistence.*;

@Entity
@Table(name = "film_text", schema = "sakila", catalog = "")
public class FilmTextEntity {
    private short filmId;
    private String title;
    private String description;

    //fk_film_text_film(TBL:film_text onetoone TBL:film)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    private FilmEntity filmEntity;

    @Id
    @Column(name = "film_id")
    public short getFilmId() {
        return filmId;
    }

    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmTextEntity that = (FilmTextEntity) o;

        if (filmId != that.filmId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) filmId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
