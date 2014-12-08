package io.destruction.destructedtomatoes.rottenlib.core.client;

public interface IRottenConstants {

    /***/
    String CONTENT_TYPE_JSON = "application/json";


    /** */
    String CHARSET_UTF8 = "UTF-8"; //$NON-NLS-1$

    /***/
    String API_KEY = "apikey";

    /***/
    String SUBDOMAIN_API = "api";

    /***/
    String PROTOCOL_HTTP = "http";

    /***/
    String SUFFIX_JSON = ".json";

    /***/
    String SEGMENT_API = "/api";

    String SEGMENT_PUBLIC = "/public";

    /***/
    String SEGMENT_V1_API = "/api/public/v1.0";

    /***/
    String SEGMENT_LISTS = "/lists";

    /***/
    String SEGMENT_MOVIES = "/movies";

    /***/
    String SEGMENT_DVDS = "/dvds";

    /***/
    String SEGMENT_UPCOMING = "upcoming";

    /***/
    String SEGMENT_TOP_RENTALS = "top_rentals";

    /***/
    String SEGMENT_BOX_OFFICE = "box_office";

    /***/
    String SEGMENT_IN_THEATERS = "in_theaters";

    /***/
    String SEGMENT_CURRENT_RELEASES = "current_releases";

    /***/
    String SEGMENT_NEW_RELEASES = "new_releases";

    /***/
    String SEGMENT_CAST = "/cast";

    /***/
    String SEGMENT_CLIPS = "/clips";

    /***/
    String SEGMENT_REVIEWS = "/reviews";

    /***/
    String SEGMENT_SIMILAR = "/similar";

    /***/
    String SEGMENT_MOVIE_ALIAS = "/movie_alias";

    /***/
    String PARAM_API_KEY = "apikey";

    /***/
    String PARAM_SEARCH_QUERY = "q";

    /***/
    String PARAM_PAGE = "page";

    /***/
    String PARAM_PAGE_LIMIT = "page_limit";

    /***/
    String PARAM_COUNTRY = "country";

    /***/
    String PARAM_LIMIT = "limit";

    /***/
    String PARAM_Id = "id";

    /***/
    String PARAM_TYPE = "type";

    /***/
    String PARAM_REVIEW_TYPE = "review_type";

    /***/
    String HEADER_ORIGINATING_IP = "X-Originating-Ip";

    /***/
    String HEADER_CONTENT_LANGUAGE = "Content-Language";

    /***/
    String HEADER_CONTENT_TYPE = "Content-Type";

    /***/
    String HEADER_DATE = "Date";

    /***/
    String HEADER_FLX_BUILD_DATE = "Flx-Build-Date";

    /***/
    String HEADER_FLX_COMMIT = "Flx-Commit";

    /***/
    String HEADER_FLX_SERVER = "Flx-Server";

    /****/
    String HEADER_RT_COMMIT = "Rt-Commit";

    /***/
    String HEADER_SERVER = "Server";

    /***/
    String HEADER_VARY = "Vary";

    /***/
    String HEADER_MASHERY_RESPONDER = "X-Mashery-Responder";

    /***/
    String HEADER_CONTENT_LENGHT = "Content-Length";

    /***/
    String HEADER_CONNECTION = "Connection";


    /***/
    String HOST_API = "api.rottentomatoes.com" + SEGMENT_V1_API;

    /***/
    String HOST_DEFAULT = "rottentomatoes.com";

    /***/
    String URL_API = PROTOCOL_HTTP + "://" + HOST_API;
}