package com.allstate.compozed.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")

public class Movie_API_Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String movieTitle;
    private int yearOfIssue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}


