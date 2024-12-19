package com.iqac.iqacnewsletter.Messages;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.iqac.iqacnewsletter.IQAC_Activities.IQAC_activities;
import com.iqac.iqacnewsletter.ImageActivity.ImageActivity;
import com.iqac.iqacnewsletter.MainActivity;
import com.iqac.iqacnewsletter.R;

import java.io.ByteArrayOutputStream;

public class Messages extends AppCompatActivity {

    CardView chairman,vc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        chairman = findViewById(R.id.chairman);
        vc = findViewById(R.id.vc);

        chairman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Convert drawable resource to Bitmap
//                Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.chairman_message);
//                startActivity(new Intent(Messages.this,ImageActivity.class));
//                ImageActivity.BITMAP = bitmap1;

                startActivity(new Intent(Messages.this, MainActivity.class));
                int One [] = {R.drawable.chairman_message};
                MainActivity.mBitmapIds = One;

            }
        });

        vc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Messages.this, MainActivity.class));
                int One [] = {R.drawable.vc_message};
                MainActivity.mBitmapIds = One;
            }
        });
    }


}