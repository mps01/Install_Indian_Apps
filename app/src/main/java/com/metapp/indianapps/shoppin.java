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

public class shoppin extends AppCompatActivity {

    CardView clubfactory;
    ImageView shareb;
    CardView shein;
    TextView share;
    CardView roomwe;
    CardView aliexpress;
    CardView alibaba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppin);
        final RatingDialog ratingDialog = new RatingDialog.Builder(this)
                .threshold(3)
                .session(2)
                .onRatingBarFormSumbit(new RatingDialog.Builder.RatingDialogFormListener() {
                    @Override
                    public void onFormSubmitted(String feedback) {

                    }
                }).build();

        ratingDialog.show();
        clubfactory = findViewById(R.id.clubfactory);
        clubfactory.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.myntra.android&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
        roomwe = findViewById(R.id.roomwe);
        roomwe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.ril.ajio&hl=en_US"));
                startActivity(roposoLink);
            }
        });
        aliexpress = findViewById(R.id.aliexpress);
        aliexpress.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.tul.tatacliq&hl=en_US"));
                startActivity(roposoLink);
            }
        });
        alibaba = findViewById(R.id.alibaba);
        alibaba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.indiamart.m&hl=en"));
                startActivity(roposoLink);
            }
        });
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

        shein = findViewById(R.id.shein);
        shein.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.shopping.limeroad&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
    }
}