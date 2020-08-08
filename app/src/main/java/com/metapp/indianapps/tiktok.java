package com.metapp.indianapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.codemybrainsout.ratingdialog.RatingDialog;

public class tiktok extends AppCompatActivity {
    CardView tiktok;
    CardView vivavideo;
    CardView spotify;
    CardView amusic;

        ImageView shareb;
    TextView share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiktok);
        final RatingDialog ratingDialog = new RatingDialog.Builder(this)
                .threshold(3)
                .session(2)
                .onRatingBarFormSumbit(new RatingDialog.Builder.RatingDialogFormListener() {
                    @Override
                    public void onFormSubmitted(String feedback) {

                    }
                }).build();

        ratingDialog.show();
        shareb = findViewById(R.id.shareb);
        shareb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Support IndianApps By downloading this app at: https://play.google.com/store/apps/details?id=com.metapp.indianapps" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Support IndianApps By downloading this app at: https://play.google.com/store/apps/details?id=com.metapp.indianapps" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
        tiktok = findViewById(R.id.tiktok);
        tiktok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.roposo.android&hl=en_IN"));
                startActivity(roposoLink);

            }
        });

        spotify = findViewById(R.id.spotify);
        spotify.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.jio.media.jiobeats&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
        vivavideo = findViewById(R.id.vivavideo);
        vivavideo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=videomedia.photovideomaker&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
        amusic = findViewById(R.id.amazonmusic);
        amusic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.bsbportal.music&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
    }

}