package com.example.administrator.testz;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListTestActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    private boolean c_init_menufocus = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] name = {"Farhan", "Akash", "Rahat"};
        listView = findViewById(R.id.listView_id);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ListTestActivity.this, android.R.layout.simple_list_item_1, name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment;

        if (position == 0) {
            fragment = new ContactFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();

        } else if (position == 1) {
            fragment = new ContactHistoryFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();
        } else if (position == 2) {
            fragment = new FavoriteFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus && !c_init_menufocus) {
            listView.performItemClick(listView.getChildAt(0), 0, listView.getItemIdAtPosition(0));

            c_init_menufocus = true;
        }
    }
}
