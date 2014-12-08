package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;

/**
 * Created by r on 12-06-14.
 */
public class Director implements Serializable {

    private String name;

    public Director(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
