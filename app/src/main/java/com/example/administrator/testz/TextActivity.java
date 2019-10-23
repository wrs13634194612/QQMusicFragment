package com.example.administrator.testz;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;


public class TextActivity extends AppCompatActivity implements VerticalTabLayout.OnTabSelectedListener {
    VerticalTabLayout vTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        vTabLayout = (VerticalTabLayout) findViewById(R.id.tab_layout_4);
        viewPager=findViewById(R.id.myViewPager);

        for (int i = 0; i < 3; i++) {
            vTabLayout.addTab(vTabLayout.newTab().setText("界面 " + i).setIcon(R.drawable.ic_selector).setIconGravity(Gravity.LEFT));
        }
        vTabLayout.setOnTabSelectedListener(this);


         TabPagerAdapter tabPagerAdapter=new  TabPagerAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(tabPagerAdapter);
    }

    @Override
    public void onTabSelected(VerticalTabLayout.Tab tab, int position) {
        //Toast.makeText(getApplicationContext(), "onTabSelected: " + position, Toast.LENGTH_SHORT).show();
        viewPager.setCurrentItem(position);
    }

    @Override
    public void onTabReleased(VerticalTabLayout.Tab tab, int position) {

    }


    private class TabPagerAdapter extends FragmentPagerAdapter {

        private int tabCount;

        public TabPagerAdapter(FragmentManager fm, int tabCount) {
            super(fm);
            this.tabCount=tabCount;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i){
                case 0:
                    return  new ContactFragment();
                case 1:
                    return  new ContactHistoryFragment();
                case 2:
                    return  new FavoriteFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return tabCount;
        }
    }
}
