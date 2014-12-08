package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by r on 12-06-14.
 */
public class CastMember implements Serializable {

    private Long id;
    private String name;
    private ArrayList<String> characters;

    public CastMember(Long id, String name, ArrayList<String> characters) {
        this.id = id;
        this.name = name;
        this.characters = characters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<String> characters) {
        this.characters = characters;
    }
}
