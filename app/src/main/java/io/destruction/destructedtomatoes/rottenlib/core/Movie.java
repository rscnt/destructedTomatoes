package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by r on 12-06-14.
 */
public class Movie implements Serializable {
    private Long id;
    private String year;
    private ArrayList<String> genres;
    private String mpaa_rating;
    private Integer runtime;
    private String critics_consensus;
    private HashMap<String, Date> release_dates;
    private Rating ratings;
    private String synopsis;
    private Poster posters;
    private ArrayList<CastMember> abridged_cast;
    private ArrayList<Director> abridged_directors;
    private String studio;
    private HashMap<String, String> alternate_ids;
    private Links links;

    public Movie(Long id, String year, ArrayList<String> genres, String mpaa_rating,
                 Integer runtime, String critics_consensus, HashMap<String, Date> release_dates,
                 Rating ratings, String synopsis, Poster posters,
                 ArrayList<CastMember> abridged_cast, ArrayList<Director> abridged_directors,
                 String studio, HashMap<String, String> alternate_ids, Links links) {
        this.id = id;
        this.year = year;
        this.genres = genres;
        this.mpaa_rating = mpaa_rating;
        this.runtime = runtime;
        this.critics_consensus = critics_consensus;
        this.release_dates = release_dates;
        this.ratings = ratings;
        this.synopsis = synopsis;
        this.posters = posters;
        this.abridged_cast = abridged_cast;
        this.abridged_directors = abridged_directors;
        this.studio = studio;
        this.alternate_ids = this.alternate_ids;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getMpaa_rating() {
        return mpaa_rating;
    }

    public void setMpaa_rating(String mpaa_rating) {
        this.mpaa_rating = mpaa_rating;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getCritics_consensus() {
        return critics_consensus;
    }

    public void setCritics_consensus(String critics_consensus) {
        this.critics_consensus = critics_consensus;
    }

    public HashMap<String, Date> getRelease_dates() {
        return release_dates;
    }

    public void setRelease_dates(HashMap<String, Date> release_dates) {
        this.release_dates = release_dates;
    }

    public Rating getRatings() {
        return ratings;
    }

    public void setRatings(Rating ratings) {
        this.ratings = ratings;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Poster getPosters() {
        return posters;
    }

    public void setPosters(Poster posters) {
        this.posters = posters;
    }

    public ArrayList<CastMember> getAbridged_cast() {
        return abridged_cast;
    }

    public void setAbridged_cast(ArrayList<CastMember> abridged_cast) {
        this.abridged_cast = abridged_cast;
    }

    public ArrayList<Director> getAbridged_directors() {
        return abridged_directors;
    }

    public void setAbridged_directors(ArrayList<Director> abridged_directors) {
        this.abridged_directors = abridged_directors;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public HashMap<String, String> getAlternate_ids() {
        return alternate_ids;
    }

    public void setAlternate_ids(HashMap<String, String> alternate_ids) {
        this.alternate_ids = alternate_ids;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
