package io.destruction.destructedtomatoes.rottenlib.core.client;

import static io.destruction.destructedtomatoes.rottenlib.core.client.IRottenConstants.HOST_API;
import static io.destruction.destructedtomatoes.rottenlib.core.client.IRottenConstants.PROTOCOL_HTTP;
import static io.destruction.destructedtomatoes.rottenlib.core.client.IRottenConstants.SEGMENT_V1_API;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

import org.apache.http.NameValuePair;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by r on 12-07-14.
 */
public class RottenClient extends OkHttpClient {

    private String mBaseUri;
    private String mApiKey;
    private String mPrefix;
    private OkHttpClient mClient;

    /**
     * Create default client.
     * */
    public RottenClient() {
        this(HOST_API);
    }

    /**
     * Create client for hostname.
     *
     * @param hostname
     * */
    public RottenClient(final String hostname) {
        this(hostname, -1, PROTOCOL_HTTP);
    }

    /**
     * Create client for host, port and scheme.
     *
     * @param hostname
     * @param port
     * @param scheme
     * */
    public RottenClient(final String hostname, final int port, final String scheme) {
        final StringBuilder uri = new StringBuilder(scheme);
        uri.append("://");
        uri.append(hostname);
        if (port > 0) {
            uri.append(":").append(port);
        }
        mBaseUri = uri.toString();
        if (HOST_API.equals(hostname)) {
            mPrefix = null;
        } else {
            mPrefix = SEGMENT_V1_API;
        }
        mClient = new OkHttpClient();
    }

    protected Request createPost(String resource_uri, String mediaType, byte[] postBody) throws IOException {
        MediaType parsedMediaType = MediaType.parse(mediaType);
        Request request = new Request.Builder().url(buildUri(resource_uri))
                .post(RequestBody.create(parsedMediaType, postBody))
                .build();
        return request;
    }

    protected Request createGet(String resource_uri, List<NameValuePair> nameValuePairList) {
        Request request = new Request.Builder().url(resource_uri).get().build();
        return request;
    }

    protected Request createPut(String resource_uri, MediaType mediaType, byte[] requestBody) {
        Request request = new Request.Builder().url(resource_uri)
                .put(RequestBody.create(mediaType, requestBody)).build();
        return request;
    }

    protected Request createDelete(String resource_uri) {
        Request request = new Request.Builder().url(resource_uri).delete().build();
        return request;
    }

    public String buildUri(final String resource_uri) {
        return mBaseUri + configureUri(resource_uri);
    }

    private String configureUri(final String resource_uri) {
        if (mPrefix == null || resource_uri.startsWith(mPrefix)) {
            return resource_uri;
        } else {
            return mPrefix + resource_uri;
        }
    }



}

