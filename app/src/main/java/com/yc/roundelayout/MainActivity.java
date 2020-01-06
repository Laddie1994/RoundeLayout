package com.yc.roundelayout;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
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
//        RCConstraintLayout layout = findViewById(R.id.rcc_layout);
//        layout.setPadding(32, 32, 32, 32);
//        layout.setShadowSides(ShadowsSide.SIDE_LEFT|ShadowsSide.SIDE_BOTTOM);
        ImageView imageview = findViewById(R.id.iv_image);

        int size = dp2px(150);
        Bitmap bitmap = Bitmap.createBitmap(size, size, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(Color.parseColor("#FFC3C3C3"));
        Bitmap logBit = BitmapFactory.decodeResource(getResources(), R.mipmap.story_cover_default);
        int left = (int) ((size * .5f) - (logBit.getWidth() * .5f));
        int top = (int) ((size * .5f) - (logBit.getHeight() * .5f));
        canvas.drawBitmap(logBit, left, top, null);
        imageview.setImageBitmap(bitmap);

    }

    public static int dp2px(final float dpValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}
