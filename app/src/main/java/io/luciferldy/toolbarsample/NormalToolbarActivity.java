package io.luciferldy.toolbarsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Lucifer on 2017/3/23.
 */

public class NormalToolbarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_normal);
//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
