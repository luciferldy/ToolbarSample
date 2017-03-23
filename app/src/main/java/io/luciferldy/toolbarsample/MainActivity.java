package io.luciferldy.toolbarsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()) {
                    case R.id.toolbar_normal:
                        intent = new Intent(MainActivity.this, NormalToolbarActivity.class);
                        break;
                    case R.id.toolbar_image:
                        intent = new Intent(MainActivity.this, ImageToolbarActivity.class);
                        break;
                    case R.id.toolbar_tablayout:
                        intent = new Intent(MainActivity.this, TabLayoutToolbarActivity.class);
                        break;
                    default:
                        return;
                }
                startActivity(intent);
            }

        };

        findViewById(R.id.toolbar_normal).setOnClickListener(listener);
        findViewById(R.id.toolbar_image).setOnClickListener(listener);
        findViewById(R.id.toolbar_tablayout).setOnClickListener(listener);
    }
}
