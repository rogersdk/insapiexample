/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package br.com.rogerio.instagramapiexample;

/**
 * Created by rogerio on 26/08/16.
 */
public class InstagramService {
    public static final String CLIENT_ID = "b59755503caf4d3cb375631b316dec10";
    public static final String EMAIL = "rogeriocnobrega@gmail.com";
    public static final String SECRET = "e21a906c37f841098810cb8ea6dea6d0";

    private static final String AUTH_URL = "https://api.instagram.com/oauth/authorize/?client_id=CLIENT-ID&redirect_uri=REDIRECT-URI&response_type=code";

    private static final String REDIRECT_URI = "http://www.insapiexample.com";


    public static String getAuthUrl() {
        String authUrl = AUTH_URL.replace("CLIENT-ID", CLIENT_ID);
        authUrl = authUrl.replace("REDIRECT-URI", REDIRECT_URI);

        return authUrl;
    }

}
