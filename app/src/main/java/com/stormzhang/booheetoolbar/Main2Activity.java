package com.stormzhang.booheetoolbar;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.stormzhang.toolbardemo.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        //setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        BlankFragment fragment = new BlankFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

}
