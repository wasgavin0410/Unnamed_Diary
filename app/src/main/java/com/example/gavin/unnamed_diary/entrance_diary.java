package com.example.gavin.unnamed_diary;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class entrance_diary extends AppCompatActivity {

    //開頭頁面
    //其實硬要說開頭畫面跟下怡個頁面都是同一個layout，只是view內容不同
    //至於裡面的功能還是要透過activity來控制，所以不用擔心版面功能會撞到

    private ViewPager mPager;
    private page_adapter thePageAdapter = new page_adapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrance_page);

        //讓Adapter取得當下頁面之context及初始化adapter資料
        thePageAdapter.getTheContext(this);
        thePageAdapter.initialData();
        initialView();

    }

    private void initialView(){

        //初始化View及Adapter
        mPager = findViewById(R.id.page1st);
        mPager.setAdapter(thePageAdapter);

    }

}
