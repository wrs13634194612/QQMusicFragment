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
public class ContactFragment extends Fragment {

    private static final String IMG_URL="https://lafeber.com/pet-birds/wp-content/uploads/2018/06/Eclectus-300x300.jpg";
    ImageView imageView;

    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_contact, container, false);
        return view;
    }



}
