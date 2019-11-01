package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_baogao);
        String str1,str2,str3,str4;
        Intent intent=getIntent();
        String ddf1=intent.getStringExtra("ddf1");
        String ddf2=intent.getStringExtra("ddf2");
        String ddf3=intent.getStringExtra("ddf3");
        String ddf4=intent.getStringExtra("ddf4");
        String ddf5=intent.getStringExtra("ddf5");
        String ddf6=intent.getStringExtra("ddf6");
        TextView baogao_1=findViewById(R.id.baogao_1);
        ddf1=ddf1.substring(0,ddf1.length()-1);

        ddf2=ddf2.substring(0,ddf2.length()-1);
        ddf3=ddf3.substring(0,ddf3.length()-1);
        float a1=Float.parseFloat(ddf1);
        float a2=Float.parseFloat(ddf2);
        float a3=Float.parseFloat(ddf3);
        float a4=Float.parseFloat(ddf4);
        float a5=Float.parseFloat(ddf5);
        float a6=Float.parseFloat(ddf6);

        if (a6>85)str1="优秀,请继续保持。";
        else if(a6>70)str1="良好，可继续努力。";
        else str1="较差，请做出调整。";

        if (a1>15&&a1<30)str2="";
        else str2="调整饮食。";

        if (a2<70)str3="多喝水。";
        else str3="";

        if (a3>55&&a4>-1&&a5>1300)str4="";
        else str4="加强锻炼。";
        baogao_1.setText("您的身体素质"+str1+str2+str3+str4);

    }
}
