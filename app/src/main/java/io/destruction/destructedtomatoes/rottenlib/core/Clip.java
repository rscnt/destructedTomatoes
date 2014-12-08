package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;

/**
 * Created by r on 12-07-14.
 */
public class Clip implements Serializable {

    private Long id;
    private String title;
    private Integer duration;
    private String thumbnail;
    private Links links;

    public Clip(Long id, String title, Integer duration, String thumbnail, Links links) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
