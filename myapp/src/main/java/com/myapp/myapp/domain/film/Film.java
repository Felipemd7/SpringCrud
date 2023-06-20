package com.myapp.myapp.domain.film;

public class Film {

    private String name;
    private Integer duration;
    private Integer yaer;
    private String gender;

    public Film(BaseDataFilm data){
        this.name = data.name();
        this.duration = data.duration();
        this.yaer = data.year();
        this.gender = data.gender();
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", yaer=" + yaer +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getYaer() {
        return yaer;
    }

    public String getGender() {
        return gender;
    }
}
