/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package br.com.rogerio.instagramapiexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by rogerio on 26/08/16.
 */
public class ConnectWithInstagramActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int INSTAGRAM_AUTH = 1;

    private Button mInstagramAuthBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_connect_with_instagram);

        mInstagramAuthBtn = (Button) findViewById(R.id.btn_connect);

        mInstagramAuthBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, DialogActivityWithWebview.class);
        startActivityForResult(i, INSTAGRAM_AUTH);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == INSTAGRAM_AUTH) {
            if(resultCode == RESULT_OK) {
                if(data != null) {
                    String token = data.getStringExtra("token");
                    Log.d("auth", String.format("Auth complete and the token is %s", token));

                    mInstagramAuthBtn.setText("You are connected with Instagram");
                    mInstagramAuthBtn.setEnabled(false);

                } else {
                    Log.d("auth", String.format("no data to show"));
                }

            }
        }

    }
}
