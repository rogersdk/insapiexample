/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package br.com.rogerio.instagramapiexample;

/**
 * Created by rogerio on 26/08/16.
 */
public class InstagramService {

    public static String getAuthUrl() {
        String authUrl = InstagramApiValues.AUTH_URL.replace("CLIENT-ID", InstagramApiValues.CLIENT_ID);
        authUrl = authUrl.replace("REDIRECT-URI", InstagramApiValues.REDIRECT_URI);

        return authUrl;
    }

}
