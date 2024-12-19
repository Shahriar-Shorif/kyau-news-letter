package com.iqac.iqacnewsletter;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.iqac.iqacnewsletter.DeptActivities.DeptActivities;
import com.iqac.iqacnewsletter.IQAC_Activities.IQAC_activities;
import com.iqac.iqacnewsletter.ImageActivity.ImageActivity;
import com.iqac.iqacnewsletter.Messages.Messages;

public class TableOfContent extends AppCompatActivity {

    CardView messages,iqacActivities,deptactivities,iqac_glance,kyau_glance,observance_death,tableofcontent,convocation;

//obervance image list
    int observance_death_anniversary[] = {R.drawable.death_1,R.drawable.death_2,R.drawable.death_3,R.drawable.death_4,R.drawable.death_5};

    //All image list to view curlView of table of content page......
    int allImage[] = {
            R.drawable.founder,
            R.drawable.chairman_message,
            R.drawable.vc_message,
            R.drawable.university_at_glance,
            R.drawable.iqac_at_a_glance,
            R.drawable.death_1,
            R.drawable.death_2,
            R.drawable.death_3,
            R.drawable.death_4,
            R.drawable.death_5,
            R.drawable.iqac_activities_1,
            R.drawable.iqac_activities_2,
            R.drawable.iqac_activities_3_4,
            R.drawable.iqac_activities_5_6,
            R.drawable.iqac_activities_7_8,
            R.drawable.iqac_activities_9_10,
            R.drawable.iqac_activities_11_12,
            R.drawable.iqac_activities_13_14,
            R.drawable.iqac_activities_15_16,
            R.drawable.iqac_activities_17_18,
            R.drawable.iqac_activities_19_20,
            R.drawable.iqac_activities_21_22,
            R.drawable.iqac_activities_23_24,
            R.drawable.iqac_activities_25,
            R.drawable.iqac_activities_26_27,
            R.drawable.iqac_activities_28_29,
            R.drawable.iqac_activities_30,
            R.drawable.bcbt_1,
            R.drawable.bctbt_2,
            R.drawable.pharmacy_1,
            R.drawable.pharmacy_2,
            R.drawable.microbiology_1,
            R.drawable.microbiology_2,
            R.drawable.cse_1,
            R.drawable.cse_2,
            R.drawable.bba_1,
            R.drawable.bba_2,
            R.drawable.mechatronics_1,
            R.drawable.mechatronics_2,
            R.drawable.eee_1,
            R.drawable.english_1,
            R.drawable.english_2,
            R.drawable.law_1,
            R.drawable.law_2,
            R.drawable.convocation_1,
            R.drawable.convocation_2,
            R.drawable.thankyou

    };


    int Convocation[] = {R.drawable.convocation_1,R.drawable.convocation_2,R.drawable.thankyou};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_content);

        messages = findViewById(R.id.messages);
        iqacActivities = findViewById(R.id.iqacActivities);
        deptactivities = findViewById(R.id.deptactivities);
        iqac_glance = findViewById(R.id.iqac_glance);
        kyau_glance = findViewById(R.id.kyau_glance);
        observance_death = findViewById(R.id.observance_death);
        tableofcontent = findViewById(R.id.tableofcontent);
        convocation = findViewById(R.id.convocation);




        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContent.this, Messages.class));
            }
        });

        iqacActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContent.this, IQAC_activities.class));
            }
        });

        deptactivities.setOnClickListener(v ->{
            startActivity(new Intent(TableOfContent.this, DeptActivities.class));
        });

        iqac_glance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContent.this, MainActivity.class));
                int One [] = {R.drawable.iqac_at_a_glance};
                MainActivity.mBitmapIds = One;
            }
        });

        kyau_glance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContent.this, MainActivity.class));
                int One [] = {R.drawable.university_at_glance};
                MainActivity.mBitmapIds = One;
            }
        });


        observance_death.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableOfContent.this,MainActivity.class));
                MainActivity.mBitmapIds = observance_death_anniversary;
            }
        });

        tableofcontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(TableOfContent.this,MainActivity.class));
                MainActivity.mBitmapIds = allImage;

            }
        });

        convocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(TableOfContent.this,MainActivity.class));
                MainActivity.mBitmapIds = Convocation;


            }
        });


    }



    //==========================================================================================//
    //==========================================================================================//
    //==========================================================================================//


}