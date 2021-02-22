package com.gardeng.clock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView current_time,switch_text;
    SwitchCompat time_switch;

    LinearLayout hor1, hor2, hor3, hor4, hor5, hor6, hor7, hor8, hor9, hor10, hor11, hor12, ver1, ver2, ver3, ver4, ver5, ver6, horline, verline;
    TextView hour2,hour4,hour6,hour8,hour10,hour12,min10,min20,min30,min40,min50,min60;
    float x,y;

    Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch_text = findViewById(R.id.switch_text);
        time_switch = findViewById(R.id.time_switch);
        current_time =findViewById(R.id.currnet_time);
        horline = findViewById(R.id.horline);
        verline = findViewById(R.id.verline);

        hor1 = findViewById(R.id.hor1);
        hor2 = findViewById(R.id.hor2);
        hor3 = findViewById(R.id.hor3);
        hor4 = findViewById(R.id.hor4);
        hor5 = findViewById(R.id.hor5);
        hor6 = findViewById(R.id.hor6);
        hor7 = findViewById(R.id.hor7);
        hor8 = findViewById(R.id.hor8);
        hor9 = findViewById(R.id.hor9);
        hor10 = findViewById(R.id.hor10);
        hor11 = findViewById(R.id.hor11);
        hor12 = findViewById(R.id.hor12);

        ver1 = findViewById(R.id.ver1);
        ver2 = findViewById(R.id.ver2);
        ver3 = findViewById(R.id.ver3);
        ver4 = findViewById(R.id.ver4);
        ver5 = findViewById(R.id.ver5);
        ver6 = findViewById(R.id.ver6);

        hour2 = findViewById(R.id.hour2);
        hour4 = findViewById(R.id.hour4);
        hour6 = findViewById(R.id.hour6);
        hour8 = findViewById(R.id.hour8);
        hour10 = findViewById(R.id.hour10);
        hour12 = findViewById(R.id.hour12);

        min10 = findViewById(R.id.min10);
        min20 = findViewById(R.id.min20);
        min30 = findViewById(R.id.min30);
        min40 = findViewById(R.id.min40);
        min50 = findViewById(R.id.min50);
        min60 = findViewById(R.id.min60);

        hor1.setY(60);
        hor2.setY(120);
        hor3.setY(180);
        hor4.setY(240);
        hor5.setY(300);
        hor6.setY(360);
        hor7.setY(420);
        hor8.setY(480);
        hor9.setY(540);
        hor10.setY(600);
        hor11.setY(660);
        hor12.setY(720);//시간 눈금

        hour2.setY(100);
        hour4.setY(220);
        hour6.setY(340);
        hour8.setY(460);
        hour10.setY(580);
        hour12.setY(700);//시간 눈금 숫자

        ver1.setX(120);
        ver2.setX(240);
        ver3.setX(360);
        ver4.setX(480);
        ver5.setX(600);
        ver6.setX(720);// 분 눈금

        min10.setX(100);
        min20.setX(220);
        min30.setX(340);
        min40.setX(460);
        min50.setX(580);
        min60.setX(700);//분 눈금 숫자

        time_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    hor1.setVisibility(View.VISIBLE);
                    hor2.setVisibility(View.VISIBLE);
                    hor3.setVisibility(View.VISIBLE);
                    hor4.setVisibility(View.VISIBLE);
                    hor5.setVisibility(View.VISIBLE);
                    hor6.setVisibility(View.VISIBLE);
                    hor7.setVisibility(View.VISIBLE);
                    hor8.setVisibility(View.VISIBLE);
                    hor9.setVisibility(View.VISIBLE);
                    hor10.setVisibility(View.VISIBLE);
                    hor11.setVisibility(View.VISIBLE);
                    hor12.setVisibility(View.VISIBLE);

                    hour2.setVisibility(View.VISIBLE);
                    hour4.setVisibility(View.VISIBLE);
                    hour6.setVisibility(View.VISIBLE);
                    hour8.setVisibility(View.VISIBLE);
                    hour10.setVisibility(View.VISIBLE);
                    hour12.setVisibility(View.VISIBLE);

                    ver1.setVisibility(View.VISIBLE);
                    ver2.setVisibility(View.VISIBLE);
                    ver3.setVisibility(View.VISIBLE);
                    ver4.setVisibility(View.VISIBLE);
                    ver5.setVisibility(View.VISIBLE);
                    ver6.setVisibility(View.VISIBLE);

                    min10.setVisibility(View.VISIBLE);
                    min20.setVisibility(View.VISIBLE);
                    min30.setVisibility(View.VISIBLE);
                    min40.setVisibility(View.VISIBLE);
                    min50.setVisibility(View.VISIBLE);
                    min60.setVisibility(View.VISIBLE);
                }else{
                    hor1.setVisibility(View.INVISIBLE);
                    hor2.setVisibility(View.INVISIBLE);
                    hor3.setVisibility(View.INVISIBLE);
                    hor4.setVisibility(View.INVISIBLE);
                    hor5.setVisibility(View.INVISIBLE);
                    hor6.setVisibility(View.INVISIBLE);
                    hor7.setVisibility(View.INVISIBLE);
                    hor8.setVisibility(View.INVISIBLE);
                    hor9.setVisibility(View.INVISIBLE);
                    hor10.setVisibility(View.INVISIBLE);
                    hor11.setVisibility(View.INVISIBLE);
                    hor12.setVisibility(View.INVISIBLE);

                    hour2.setVisibility(View.INVISIBLE);
                    hour4.setVisibility(View.INVISIBLE);
                    hour6.setVisibility(View.INVISIBLE);
                    hour8.setVisibility(View.INVISIBLE);
                    hour10.setVisibility(View.INVISIBLE);
                    hour12.setVisibility(View.INVISIBLE);

                    ver1.setVisibility(View.INVISIBLE);
                    ver2.setVisibility(View.INVISIBLE);
                    ver3.setVisibility(View.INVISIBLE);
                    ver4.setVisibility(View.INVISIBLE);
                    ver5.setVisibility(View.INVISIBLE);
                    ver6.setVisibility(View.INVISIBLE);

                    min10.setVisibility(View.INVISIBLE);
                    min20.setVisibility(View.INVISIBLE);
                    min30.setVisibility(View.INVISIBLE);
                    min40.setVisibility(View.INVISIBLE);
                    min50.setVisibility(View.INVISIBLE);
                    min60.setVisibility(View.INVISIBLE);
                }
            }
        });



        switch_text.setText("눈금,시간 ON/OFF");





        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                Calendar cal = Calendar.getInstance() ;

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                //y의 좌표 --> 시간+분 -->한시간에 120 1분당 2 26분이면 26*2+120*12
                //x의 좌표 --> 분 26분 -->17*26
                String strTime = simpleDateFormat.format(cal.getTime());

                current_time.setText("현재 시간 : "+strTime);

                String[] time = strTime.split(":");

                /*int hour = msg.arg1;
                int min = msg.arg2;*/
                int hour = Integer.parseInt(time[0]);
                int min = Integer.parseInt(time[1]);
                if(hour>=12){
                    hour -= 12;
                }

                x = min*12;
                y = (float) (hour*60+min*1);

                verline.setX(x);
                Log.d("hi", "verline  ----"+"X : "+ String.valueOf(verline.getX())+", Y :"+String.valueOf(verline.getY()));
                horline.setY(y);
                Log.d("hi", "horline  ----"+"X : "+ String.valueOf(horline.getX())+", Y :"+String.valueOf(horline.getY()));

            }
        } ;

        class NewRunnable implements Runnable {
           /* int hour = 0;
            int min = 0;*/
            @Override
            public void run() {
                while (true) {
                    /*min++;
                    if(min>=60){
                        min -= 60;
                        hour++;
                        if(hour>=24){
                            hour-=24;
                        }
                    }*/
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace() ;
                    }
                    //Message msg = Message.obtain(mHandler, 0, hour, min);
                    //mHandler.sendMessage(msg);
                    mHandler.sendEmptyMessage(0) ;
                }
            }
        }

        NewRunnable newRunnable = new NewRunnable() ;
        Thread thread = new Thread(newRunnable) ;
        thread.start() ;

    }

    @Override
    protected void onResume() {
        super.onResume();



    }
}