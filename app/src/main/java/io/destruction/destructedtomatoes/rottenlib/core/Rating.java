package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;

/**
 * Created by r on 12-06-14.
 */
public class Rating implements Serializable {

    private String critics_rating;
    private Integer critics_score;
    private String audience_rating;
    private Integer audience_score;

    public String getCritics_rating() {
        return critics_rating;
    }

    public void setCritics_rating(String critics_rating) {
        this.critics_rating = critics_rating;
    }

    public Integer getCritics_score() {
        return critics_score;
    }

    public void setCritics_score(Integer critics_score) {
        this.critics_score = critics_score;
    }

    public String getAudience_rating() {
        return audience_rating;
    }

    public void setAudience_rating(String audience_rating) {
        this.audience_rating = audience_rating;
    }

    public Integer getAudience_score() {
        return audience_score;
    }

    public void setAudience_score(Integer audience_score) {
        this.audience_score = audience_score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rating)) return false;

        Rating rating = (Rating) o;

        if (!audience_rating.equals(rating.audience_rating)) return false;
        if (!audience_score.equals(rating.audience_score)) return false;
        if (!critics_rating.equals(rating.critics_rating)) return false;
        if (!critics_score.equals(rating.critics_score)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = critics_rating.hashCode();
        result = 31 * result + critics_score.hashCode();
        result = 31 * result + audience_rating.hashCode();
        result = 31 * result + audience_score.hashCode();
        return result;
    }
}
