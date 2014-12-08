package io.destruction.destructedtomatoes.rottenlib.core;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by r on 12-07-14.
 */
public class Review implements Serializable {

    private Long id;
    private String critic;
    private Date date;
    private String freshness;
    private String publication;
    private String quote;
    private HashMap<String, String> links;

}
