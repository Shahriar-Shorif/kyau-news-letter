package com.iqac.iqacnewsletter.DeptActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.iqac.iqacnewsletter.MainActivity;
import com.iqac.iqacnewsletter.R;

public class DeptActivities extends AppCompatActivity {

    CardView bctb,pharmacy1,microbiology1,cse1,bba1,mechatronic1,eee1,english1,law1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept_activities);

        bctb = findViewById(R.id.bcbt);
        pharmacy1 = findViewById(R.id.pharmacy);
        microbiology1 = findViewById(R.id.microbiology);
        cse1 = findViewById(R.id.cse);
        bba1 = findViewById(R.id.bba);
        mechatronic1 = findViewById(R.id.mechatronic);
        eee1 = findViewById(R.id.eee);
        english1 = findViewById(R.id.english);
        law1 = findViewById(R.id.law);



        int bcbt[] = {R.drawable.bcbt_1,R.drawable.bctbt_2};
        int pharmacy[] = {R.drawable.pharmacy_1,R.drawable.pharmacy_2};
        int microbiology[] = {R.drawable.microbiology_1,R.drawable.microbiology_2};
        int cse[] = {R.drawable.cse_1,R.drawable.cse_2};
        int bba[] = {R.drawable.bba_1,R.drawable.bba_2};
        int mechatronic[] = {R.drawable.mechatronics_1,R.drawable.mechatronics_2};
        int eee[] = {R.drawable.eee_1};
        int English[] = {R.drawable.english_1,R.drawable.english_2};
        int law[] = {R.drawable.law_1,R.drawable.law_2};

        bctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = bcbt;
            }
        });

        pharmacy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = pharmacy;
            }
        });

        microbiology1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = microbiology;
            }
        });

        cse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = cse;
            }
        });

        bba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = bba;
            }
        });

        mechatronic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = mechatronic;
            }
        });

        eee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = eee;
            }
        });

        english1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = English;
            }
        });

        law1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeptActivities.this, MainActivity.class));
                MainActivity.mBitmapIds = law;
            }
        });



    }





}