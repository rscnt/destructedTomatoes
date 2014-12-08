package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;
import java.net.URI;

/**
 * Created by r on 12-06-14.
 */
public class Poster implements Serializable {

    private URI thumbnail;
    private URI profile;
    private URI detailed;
    private URI original;

    public Poster(URI thumbnail, URI profile, URI detailed, URI original) {
        this.thumbnail = thumbnail;
        this.profile = profile;
        this.detailed = detailed;
        this.original = original;
    }

    public URI getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(URI thumbnail) {
        this.thumbnail = thumbnail;
    }

    public URI getProfile() {
        return profile;
    }

    public void setProfile(URI profile) {
        this.profile = profile;
    }

    public URI getDetailed() {
        return detailed;
    }

    public void setDetailed(URI detailed) {
        this.detailed = detailed;
    }

    public URI getOriginal() {
        return original;
    }

    public void setOriginal(URI original) {
        this.original = original;
    }
}
