package com.geo.emui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button mPropertyAnumationBtn,mBaseCanvasPaint,mPaintShader,mPathBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPropertyAnumationBtn = (Button) findViewById(R.id.property_animation);
        mBaseCanvasPaint = (Button) findViewById(R.id.base_paint_canvas);
        mPaintShader = (Button) findViewById(R.id.paint_shader);
        mPathBtn = (Button) findViewById(R.id.path_paint_canvas);
        mPropertyAnumationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,PropertyActivity.class);
                startActivity(intent);
            }
        });
        mBaseCanvasPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BaseCanvasPaint.class);
                startActivity(intent);
            }
        });
        mPaintShader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PaintShaderActivity.class);
                startActivity(intent);
            }
        });
        mPathBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PathActivity.class);
                startActivity(intent);
            }
        });
    }
}
