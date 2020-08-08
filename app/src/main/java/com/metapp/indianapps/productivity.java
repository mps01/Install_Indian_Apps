package com.metapp.indianapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.codemybrainsout.ratingdialog.RatingDialog;

public class productivity extends AppCompatActivity {

    ImageView shareb;
    TextView share;
    CardView shareit;
    CardView ucbrowser;
    CardView camscanner;

    CardView uber;

    CardView truecaller;
    CardView udictionary;

    CardView beautyplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productivity);
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

        shareit = findViewById(R.id.shareit);
        shareit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.reliance.jio.jioswitch&hl=en_IN"));
                startActivity(roposoLink);

            }
        });
        ucbrowser = findViewById(R.id.ucbrowser);
        ucbrowser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.epic.browser&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
        camscanner = findViewById(R.id.camscanner);
        camscanner.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=net.doc.scanner&hl=en"));
                startActivity(roposoLink);
            }
        });

        truecaller = findViewById(R.id.truecaller);
        truecaller.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.hike.chat.stickers&hl=en_IN"));
                startActivity(roposoLink);
            }
        });

        uber = findViewById(R.id.uber);
        uber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.olacabs.customer&hl=en_IN"));
                startActivity(roposoLink);
            }
        });

        udictionary = findViewById(R.id.udictionay);
        udictionary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=HinKhoj.Dictionary&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
        beautyplus = findViewById(R.id.beautyplus);
        beautyplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent roposoLink = new Intent(android.content.Intent.ACTION_VIEW);
                roposoLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lightx&hl=en_IN"));
                startActivity(roposoLink);
            }
        });
    }}