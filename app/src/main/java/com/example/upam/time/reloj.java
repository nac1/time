package com.example.upam.time;

import android.util.Log;

import java.util.Calendar;

/**
 * Created by upam on 12/02/16.
 */
public class reloj extends Thread{
    boolean  bandera=true;



    public void run(){

        int h=0,m=0,s=0;
        String tag="sms";
        Calendar ahora=Calendar.getInstance();
        h=ahora.get(Calendar.HOUR);
        m=ahora.get(Calendar.MINUTE);
        s=ahora.get(Calendar.SECOND);

        while(bandera==true)
        {
            Log.d(tag,String.valueOf(h)+":"+String.valueOf(m)+":"+String.valueOf(s));


            //bandera=false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s++;
            if(s==60)
            {
                s=0; m++;

            }


            if(m==60)
            {
                m=0; h++;
            }





        }


    }


    public void para(boolean banderaclick)
    {
        bandera=banderaclick;
    }

}
