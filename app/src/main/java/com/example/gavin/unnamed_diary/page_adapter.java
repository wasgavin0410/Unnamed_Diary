package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gavin on 2018/3/28.
 */

public class page_adapter extends PagerAdapter{

    /*
        設置List陣列，裡面可以存放
    */

    List<page_view> pageList;
    private Context copiedContext;

    public void getTheContext(Context context){

        //複製當下頁面的context名稱，用以做接下來的參數
        copiedContext = context;

    }

    public void initialData(){

        //將那些視為View的page存放在List陣列中

        pageList = new ArrayList<>();
        pageList.add(new for_showing(copiedContext));
        pageList.add(new for_transition().new adapting_activity(copiedContext));

    }

    @Override
    public int getCount() {
        return pageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object == view;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        container.addView(pageList.get(position));
        return pageList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((View)object);
    }
}
