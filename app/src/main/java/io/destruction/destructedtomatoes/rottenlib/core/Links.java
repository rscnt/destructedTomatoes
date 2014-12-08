package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;
import java.net.URI;

/**
 * Created by r on 12-06-14.
 */
public class Links implements Serializable {
    private URI self;
    private URI alternate;
    private URI cast;
    private URI clips;
    private URI reviews;
    private URI similar;

    public Links(URI self, URI alternate, URI cast, URI clips,
                 URI reviews, URI similar) {
        this.self = self;
        this.alternate = alternate;
        this.cast = cast;
        this.clips = clips;
        this.reviews = reviews;
        this.similar = similar;
    }

    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    public URI getAlternate() {
        return alternate;
    }

    public void setAlternate(URI alternate) {
        this.alternate = alternate;
    }

    public URI getCast() {
        return cast;
    }

    public void setCast(URI cast) {
        this.cast = cast;
    }

    public URI getClips() {
        return clips;
    }

    public void setClips(URI clips) {
        this.clips = clips;
    }

    public URI getReviews() {
        return reviews;
    }

    public void setReviews(URI reviews) {
        this.reviews = reviews;
    }

    public URI getSimilar() {
        return similar;
    }

    public void setSimilar(URI similar) {
        this.similar = similar;
    }
}
