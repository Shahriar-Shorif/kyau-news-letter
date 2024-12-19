package com.iqac.iqacnewsletter.ImageActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.iqac.iqacnewsletter.R;

public class ImageActivity extends AppCompatActivity {

    ImageView img;
    CardView card;

    public static Bitmap BITMAP = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        img = findViewById(R.id.img);
        card = findViewById(R.id.card);

        card.setBackgroundResource(R.drawable.bbb);

        if (BITMAP != null){
            img.setImageBitmap(BITMAP);
        }


    }

}