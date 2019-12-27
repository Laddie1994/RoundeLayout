package com.yc.roundelayout;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
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
        ImageView imageview = findViewById(R.id.iv_image);

        imageview.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.test));
//        Glide.with(imageview)
//                .load("http://img4.imgtn.bdimg.com/it/u=3209370120,2008812818&fm=26&gp=0.jpg")
//                .into(imageview);
    }
}
