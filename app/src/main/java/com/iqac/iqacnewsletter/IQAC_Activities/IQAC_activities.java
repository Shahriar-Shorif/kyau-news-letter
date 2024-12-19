package com.iqac.iqacnewsletter.IQAC_Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.iqac.iqacnewsletter.ImageActivity.ImageActivity;
import com.iqac.iqacnewsletter.MainActivity;
import com.iqac.iqacnewsletter.Messages.Messages;
import com.iqac.iqacnewsletter.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IQAC_activities extends AppCompatActivity {

    CardView one, two, three, four,five,six,seven,eight,nine,ten,eleven, twelve,
            thirteen,fourteen,fifteen, sixteen,seventeen,eighteen,nineteen,twenty,
    twentyone,twentytwo,twentythree,twentyfour,twentyfive,twentysix,twentyseven,
    twentyeight,twentynine,thirty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqac_activities);

        // Initialize each view using findViewById
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);

        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);
        twenty = findViewById(R.id.twenty);

        twentyone = findViewById(R.id.twentyone);
        twentytwo = findViewById(R.id.twentytwo);
        twentythree = findViewById(R.id.twentythree);
        twentyfour = findViewById(R.id.twentyfour);
        twentyfive = findViewById(R.id.twentyfive);
        twentysix = findViewById(R.id.twentysix);
        twentyseven = findViewById(R.id.twentyseven);
        twentyeight = findViewById(R.id.twentyeight);
        twentynine = findViewById(R.id.twentynine);
        thirty = findViewById(R.id.thirty);


        // Set the click listeners
        setClickListener(one);
        setClickListener(two);
        setClickListener(three);
        setClickListener(four);
        setClickListener(five);
        setClickListener(six);
        setClickListener(seven);
        setClickListener(eight);
        setClickListener(nine);
        setClickListener(ten);
        setClickListener(eleven);
        setClickListener(twelve);
        setClickListener(thirteen);
        setClickListener(fourteen);
        setClickListener(fifteen);
        setClickListener(sixteen);
        setClickListener(seventeen);
        setClickListener(eighteen);
        setClickListener(nineteen);
        setClickListener(twenty);
        setClickListener(twentyone);
        setClickListener(twentytwo);
        setClickListener(twentythree);
        setClickListener(twentyfour);
        setClickListener(twentyfive);
        setClickListener(twentysix);
        setClickListener(twentyseven);
        setClickListener(twentyeight);
        setClickListener(twentynine);
        setClickListener(thirty);
    }

    /**
     * Sets the custom click listener to a view.
     */
    private void setClickListener(View view) {
        // Setting an OnClickListener for the view to handle clicks
        view.setOnClickListener(v -> onItemClick(v.getId()));
    }

    /**
     * Handles the click events for all views.
     * This method is triggered by the custom interface.
     */
    public void onItemClick(int viewId) {
        // Use if-else statements to handle each case.
        if (viewId == R.id.one) {
            // Load the bitmap
            //Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.iqac_activities_1);
            //startActivity(new Intent(IQAC_activities.this,ImageActivity.class));
            //ImageActivity.BITMAP = bitmap;

            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_1};
            MainActivity.mBitmapIds = One;

        } else if (viewId == R.id.two) {
            // Load the bitmap
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_2};
            MainActivity.mBitmapIds = One;

        } else if (viewId == R.id.three) {

            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_3_4};
            MainActivity.mBitmapIds = One;

        }else if (viewId == R.id.four) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_3_4};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.five) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_5_6};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.six) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_5_6};
            MainActivity.mBitmapIds = One;

        }else if (viewId == R.id.seven) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_7_8};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.eight) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_7_8};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.nine) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_9_10};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.ten) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_9_10};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.eleven) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_11_12};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twelve) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_11_12};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.thirteen) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_13_14};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.fourteen) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_13_14};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.fifteen) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_15_16};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.sixteen) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_15_16};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.seventeen) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_17_18};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.eighteen) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_17_18};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.nineteen) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_19_20};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twenty) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_19_20};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentyone) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_21_22};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentytwo) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_21_22};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentythree) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_23_24};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentyfour) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_23_24};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentyfive) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_25};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentysix) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_26_27};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentyseven) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_26_27};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentyeight) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_28_29};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.twentynine) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_28_29};
            MainActivity.mBitmapIds = One;
        }else if (viewId == R.id.thirty) {
            startActivity(new Intent(IQAC_activities.this,MainActivity.class));
            int One [] = {R.drawable.iqac_activities_30};
            MainActivity.mBitmapIds = One;
        }else {
            Toast.makeText(this, "Updating...", Toast.LENGTH_SHORT).show();
        }
    }




}
