package com.yc.roundelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yc.rclayout.RCConstraintLayout;
import com.yc.rclayout.ShadowsSide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RCConstraintLayout layout = findViewById(R.id.rcc_layout);
//        layout.setPadding(32, 32, 32, 32);
//        layout.setShadowSides(ShadowsSide.SIDE_LEFT|ShadowsSide.SIDE_BOTTOM);
    }
}
