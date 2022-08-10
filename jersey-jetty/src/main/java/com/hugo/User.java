package com.hugo;

import java.util.List;

public class User {

    private int id;
    String name;
    List<Film> film_list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilm_list() {
        return film_list;
    }

    public void setFilm_list(List<Film> film_list) {
        this.film_list = film_list;
    }
}
