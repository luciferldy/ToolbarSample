package io.luciferldy.toolbarsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Lucifer on 2017/3/23.
 */

public class TabLayoutToolbarLayout extends AppCompatActivity {

    public static final String TITLE = "title";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_tablayout);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
    }


    class SimpleFragment extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            TextView tv = new TextView(container.getContext());
            container.addView(tv, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            return tv;
        }
    }

    class SimpleFragmentApdater extends FragmentPagerAdapter {

        String[] titles = {"ONE", "TWO", "THREE", "FOUR"};

        public SimpleFragmentApdater(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            SimpleFragment fragment = new SimpleFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TITLE, titles[position]);
            fragment.setArguments(bundle);
            return fragment;
        }

        @Override
        public int getCount() {
            return titles.length;
        }
    }


}
