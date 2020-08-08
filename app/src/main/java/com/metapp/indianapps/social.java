package com.metapp.indianapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.codemybrainsout.ratingdialog.RatingDialog;

public class social extends AppCompatActivity {

    CardView whatsapp;
    ImageView shareb;
    CardView zoom;
    TextView share;
    CardView helo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
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
        });
        share = findViewById(R.id.share);
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
        helo = findViewById(R.id.helo);
        helo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.mohalla.sharechat"));
                startActivity(roposoLink);
            }
        });
        whatsapp = findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.hike.chat.stickers&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
        zoom = findViewById(R.id.zoom);
        zoom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.inscripts.namaste&hl=en_IN"));
                startActivity(roposoLink);

            }
        });
    }}