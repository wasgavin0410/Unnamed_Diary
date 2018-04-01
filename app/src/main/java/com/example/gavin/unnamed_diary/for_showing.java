package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Gavin on 2018/3/28.
 */

public class for_showing extends page_view{

    //用來連接entrance_page以及picture_show

    public for_showing(Context context){

        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.picture_show,null);

        //將picture_show視為一個View來存放

        addView(view);

    }
}
