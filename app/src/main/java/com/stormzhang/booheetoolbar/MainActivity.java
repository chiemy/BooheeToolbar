package com.stormzhang.booheetoolbar;

import android.os.Bundle;

import com.stormzhang.toolbardemo.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("薄荷");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        // TODO: your setting
    }
}
