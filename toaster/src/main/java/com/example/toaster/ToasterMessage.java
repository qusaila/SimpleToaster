package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {



    public static void ToastMsg(String msg, Context context){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
