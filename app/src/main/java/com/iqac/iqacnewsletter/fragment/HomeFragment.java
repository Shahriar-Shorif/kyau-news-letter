package com.iqac.iqacnewsletter.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iqac.iqacnewsletter.MainActivity;
import com.iqac.iqacnewsletter.R;
import com.iqac.iqacnewsletter.TableOfContent;

public class HomeFragment extends Fragment {

    CardView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        text = view.findViewById(R.id.text);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), TableOfContent.class));
            }
        });
        return view;
    }
}