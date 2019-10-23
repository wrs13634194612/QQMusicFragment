package com.example.administrator.testz;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import androidx.fragment.app.Fragment;


/**
 */
public class ContactHistoryFragment extends Fragment {

    private static final String IMG_URL="https://images-na.ssl-images-amazon.com/images/I/81UY%2B3cl7-L._SX425_.jpg";
    ImageView imageView;

    public ContactHistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_contact_history, container, false);
        return view;
    }




}
