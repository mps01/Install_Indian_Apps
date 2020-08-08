package com.metapp.indianapps;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.codemybrainsout.ratingdialog.RatingDialog;

public class category extends AppCompatActivity {
        CardView openshop;
    CardView opensocial;
    CardView openpro;
    CardView opentiktok;
    ImageView shareb;
    TextView share;
    public boolean isAppInstalled(String package_name, String app_name)
    {
        try {
            PackageManager pm = getPackageManager();
            PackageInfo info = pm.getPackageInfo("" + package_name, PackageManager.GET_META_DATA);
            Toast.makeText(getApplicationContext(), "Your device has  installed " + app_name, Toast.LENGTH_SHORT)

                    .show();
            return true;

        }
        catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(getApplicationContext(), "Your device has not installed " + app_name, Toast.LENGTH_SHORT)
                    .show();
            return false;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);



        final RatingDialog ratingDialog = new RatingDialog.Builder(this)
                .threshold(3)
                .session(2)
                .onRatingBarFormSumbit(new RatingDialog.Builder.RatingDialogFormListener() {
                    @Override
                    public void onFormSubmitted(String feedback) {

                    }
                }).build();

        try {

            // Get the app's shared preferences
            SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);

            // Get the value for the run counter
            int counter = app_preferences.getInt("counter", 0);

            // Do every x times
            int RunEvery = 3;

            if(counter != 0  && counter % RunEvery == 0 )
            {
                //Toast.makeText(this, "This app has been started " + counter + " times.", Toast.LENGTH_SHORT).show();

                AlertDialog.Builder alert = new AlertDialog.Builder(
                        category.this);
                alert.setTitle("Please rate");
                alert.setIcon(R.mipmap.appicon1); //app icon here
                alert.setMessage("Thanks for using this app. Please take a moment to rate it.");

                alert.setPositiveButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int whichButton) {
                                //Do nothing
                            }
                        });

                alert.setNegativeButton("Rate it",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {

                                final String appName = getApplicationContext().getPackageName();
                                try {
                                    startActivity(new Intent(Intent.ACTION_VIEW,
                                            Uri.parse("market://details?id="
                                                    + appName)));
                                } catch (android.content.ActivityNotFoundException anfe) {
                                    startActivity(new Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("http://play.google.com/store/apps/details?id=com.metapp.indianapps"
                                                    + appName)));
                                }

                            }
                        });
                alert.show();
            }


            // Increment the counter
            SharedPreferences.Editor editor = app_preferences.edit();
            editor.putInt("counter", ++counter);
            editor.commit(); // Very important

        } catch (Exception e) {
            //Do nothing, don't run but don't break
        }
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
        openshop = findViewById(R.id.shopopen);
        openshop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),shoppin.class);
                startActivity(i);
            }
        });
        opensocial = findViewById(R.id.opensocialm);
        opensocial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),social.class);
                startActivity(i);
            }
        });

        openpro = findViewById(R.id.openproductivity);
        openpro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),productivity.class);
                startActivity(i);
            }
        });
        opentiktok = findViewById(R.id.openentertainment);
        opentiktok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),tiktok.class);
                startActivity(i);
            }
        });

    }


}